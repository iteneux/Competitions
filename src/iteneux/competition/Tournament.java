package iteneux.competition;

import iteneux.team.Team;
import iteneux.utils.logger.LoggerWrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tournament extends Competition {
	
	
	private List<League> groups;
	private Cup cup;

	private int groupsNumber;
	private int teamsPerGroup;
	private int teamsInCup;
	private int teamsModulo;
	private int groupMatches;

	/**
	 * 
	 * @param teams number of teams participating in tournament
	 * @param groupsNumber
	 * @param teamsInCup
	 * @param groupMatches
	 */
	public Tournament(List<Team> teams, int groupsNumber, int teamsInCup, int groupMatches) {
		super();
		
		loggerWrapper.logger.info("wewewe");
		
		this.teams = teams;
		this.groups = new ArrayList<League>();
		this.cup = new Cup();
		this.groupsNumber = groupsNumber;
		this.teamsPerGroup = teams.size() / groupsNumber;
		this.teamsInCup = teamsInCup;
		this.teamsModulo = teams.size() % groupsNumber;
		this.groupMatches = groupMatches;

		createAllGroups();
	}

	private void createAllGroups() {

		// Jezeli liczba zespolow jest podzielna przez liczbe grup
		if (teamsModulo != 0) {
			int irregularGroupsNumber = teamsModulo;
			int regularGroupsNumber = groupsNumber - irregularGroupsNumber;

			int irregularTeamsNumber = teamsPerGroup + 1;
			int regularTeamsNumber = irregularTeamsNumber - 1;

			createGroups(irregularGroupsNumber, irregularTeamsNumber);
			createGroups(regularGroupsNumber, regularTeamsNumber);

		} else {
			createGroups(groupsNumber, teamsPerGroup);
		}
	}
	
	private void createGroups(int groupsNumber, int teamsNumber) {
		int teamsLeft = teams.size();
		
		for (int i = 0; i < groupsNumber; i++) {
			List<Team> teamsGroup = new ArrayList<Team>();

			for (int j = 0; j < teamsNumber; j++) {
				teamsLeft = createGroup(teamsGroup, teamsLeft);
			}

			League group = new League(teamsGroup, groupMatches);
			groups.add(group);
		}
	}

	private int createGroup(List<Team> teamsGroup, int teamsLeft) {
		Random rand = new Random();
		int index = rand.nextInt(teamsLeft);

		teamsGroup.add(teams.get(index));
		teams.remove(index);
		
		return --teamsLeft;
	}

	public void playTournament() {
		for (League group : groups) {
			group.runSimulation();
			group.showSchedule();
			group.showTable();
		}

		if (teamsInCup % groupsNumber == 0) {
			List<Team> cupTeams = new ArrayList<Team>();
			addCupTeamRegular(cupTeams);
			createCup(cupTeams);
		} else {
			List<Team> cupTeams = new ArrayList<Team>();
			addCupTeamRegular(cupTeams);
			addCupTeamIrregular(cupTeams);
			createCup(cupTeams);
		}

	}
	
	private void createCup(List<Team> cupTeams) {
		cup = new Cup(cupTeams);
		cup.playCup();
		cup.show();
	}
	
	private void addCupTeamRegular(List<Team> cupTeams) {
		for (int i = 0; i < (teamsInCup / groupsNumber); i++) {
			for (League group : groups) {
				cupTeams.add(group.getTable().getTeamTables().get(i).getTeam());
			}
		}
	}
	
	private void addCupTeamIrregular(List<Team> cupTeams) {
		for (int i = 0; i < teamsInCup % groupsNumber; i++) {
			League g = groups.get(i);
			cupTeams.add(g.getTable().getTeamTables().get(teamsInCup / groupsNumber).getTeam());
		}
	}

}
