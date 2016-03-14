package iteneux.competition;

import iteneux.team.Team;

import java.util.List;

public class League extends Competition {
	private Schedule schedule;
	private Table table;
	private int roundsNumber;
	private boolean homeAdventage;

	public League() {
		super();
	}

	public League(List<Team> teams, int roundsNumber, boolean homeAdventage) {
		this.teams = teams;
		this.schedule = new Schedule(teams);
		this.table = new Table();
		for (Team t : teams) {
			this.table.getTeamTables().add(new TeamTable(t));
		}
		this.roundsNumber = roundsNumber;
		this.setHomeAdventage(homeAdventage);
	}

	public League(List<Team> teams, int roundsNumber) {
		this.teams = teams;
		this.schedule = new Schedule(teams);
		this.table = new Table();
		for (Team t : teams) {
			this.table.getTeamTables().add(new TeamTable(t));
		}
		this.roundsNumber = roundsNumber;

		if (roundsNumber > 1) {
			this.setHomeAdventage(true);
		} else {
			this.setHomeAdventage(false);
		}

	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public void runSimulation() {
		schedule.create(teams, roundsNumber);
		schedule.playMatches();
		schedule.createTable(table.getTeamTables());
	}

	public void showSchedule() {
		System.out.println(schedule);
	}

	public void showTable() {
		table.show();
	}

	public int getRoundsNumber() {
		return roundsNumber;
	}

	public void setRoundsNumber(int roundsNumber) {
		this.roundsNumber = roundsNumber;
	}

	public boolean isHomeAdventage() {
		return homeAdventage;
	}

	public void setHomeAdventage(boolean homeAdventage) {
		this.homeAdventage = homeAdventage;
	}

}
