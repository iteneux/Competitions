package iteneux.sim;

import java.util.ArrayList;
import java.util.List;

import iteneux.competition.Cup;
import iteneux.competition.League;
import iteneux.competition.TeamTable;
import iteneux.distribution.Distribution;
import iteneux.enums.Association;
import iteneux.enums.DistributionType;
import iteneux.team.ClubTeam;
import iteneux.team.Team;

public class DistributionSim {

	public static void main(String[] args) {

		List<Team> englishTeams = new ArrayList<Team>();
		
		englishTeams.add(new Team("Chelsea", 10));
		englishTeams.add(new Team("Manchester City", 9));
		englishTeams.add(new Team("Manchester United", 9));
		englishTeams.add(new Team("Arsenal", 9));
		englishTeams.add(new Team("Liverpool", 8));
		englishTeams.add(new Team("Southampton", 6));
		englishTeams.add(new Team("Tottenham", 7));
		englishTeams.add(new Team("Everton", 5));
		englishTeams.add(new Team("Swansea", 5));
		englishTeams.add(new Team("Newcastle", 4));
		englishTeams.add(new Team("Stoke", 4));
		englishTeams.add(new Team("Sunderland", 4));
		englishTeams.add(new Team("Queens Park Rangers", 2));
		englishTeams.add(new Team("West Bromwich Albion", 2));
		englishTeams.add(new Team("West Ham United", 4));
		englishTeams.add(new Team("Leicester City", 2));
		englishTeams.add(new Team("Burnley", 2));
		englishTeams.add(new Team("Crystal Palace", 4));
		englishTeams.add(new Team("Aston Villa", 3));
		englishTeams.add(new Team("Hull", 3));
		
		League premierLeague = new League(englishTeams, 2);
		premierLeague.runSimulation();
		premierLeague.showSchedule();
		premierLeague.showTable();
		

		
		
		Cup englishCup = new Cup(englishTeams);
		englishCup.playCup();
		englishCup.show();
		
		List<TeamTable> teamTable = premierLeague.getTable().getTeamTables();
		Team champion = teamTable.get(0).getTeam();
		Team cupWinner = englishCup.getTeams().get(0);
		
		List<Team> england = new ArrayList<Team>(8);
		england.add(new ClubTeam("Chelsea", 10, 10, Association.ENG));
		england.add(new ClubTeam("Manchester City", 10, 10, Association.ENG));
		england.add(new ClubTeam("Arsenal", 10, 10, Association.ENG));
		england.add(new ClubTeam("Manchester United", 10, 10, Association.ENG));
		england.add(new ClubTeam("Tottenham", 10, 10, Association.ENG));
		england.add(new ClubTeam("Liverpool", 10, 10, Association.ENG));
		england.add(new ClubTeam("West Ham United", 10, 10, Association.ENG));
		england.add(new ClubTeam("Southampton", 10, 10, Association.ENG));
		
		

		List<Distribution> distributions = new ArrayList<Distribution>();

		Distribution d = new Distribution();
		d.add(DistributionType.CLG);
		d.add(DistributionType.CLG);
		d.add(DistributionType.CLG);
		d.add(DistributionType.NCLQ4);
		d.add(DistributionType.ELG);
		d.add(DistributionType.ELQ3);
		d.add(DistributionType.ELQ1);
		d.add(DistributionType.ELG);
		distributions.add(d);


		

		

		List<List<Team>> teamsQualified = new ArrayList<>(0);
		teamsQualified.add(england);

		List<Team> clGS = new ArrayList<Team>();
		List<Team> clNCQ4 = new ArrayList<Team>();
		List<Team> clNCQ3 = new ArrayList<Team>();
		List<Team> clCQ4 = new ArrayList<Team>();
		List<Team> clCQ3 = new ArrayList<Team>();
		List<Team> clCQ2 = new ArrayList<Team>();
		List<Team> clCQ1 = new ArrayList<Team>();

		List<Team> elGS = new ArrayList<Team>();
		List<Team> elQ4 = new ArrayList<Team>();
		List<Team> elQ3 = new ArrayList<Team>();
		List<Team> elQ2 = new ArrayList<Team>();
		List<Team> elQ1 = new ArrayList<Team>();

		int i = 0;
		for (Distribution dis : distributions) {

			int j = 0;

			for (DistributionType dt : dis.getTypes()) {
				List<Team> teams = teamsQualified.get(i);
				Team team = teams.get(j);


				if (dt != null) {
					switch (dt) {
					case CLG:
						clGS.add(team);
						break;
					case NCLQ4:
						clNCQ4.add(team);
						break;
					case NCLQ3:
						clNCQ3.add(team);
						break;
					case CCLQ4:
						clCQ4.add(team);
						break;
					case CCLQ3:
						clCQ3.add(team);
						break;
					case CCLQ2:
						clCQ2.add(team);
						break;
					case CCLQ1:
						clCQ1.add(team);
						break;
					case ELG:
						elGS.add(team);
						break;
					case ELQ4:
						elQ4.add(team);
						break;
					case ELQ3:
						elQ3.add(team);
						break;
					case ELQ2:
						elQ2.add(team);
						break;
					case ELQ1:
						elQ1.add(team);
						break;
					}
				}

				j++;
			}
			i++;
		}

		/*System.out.println(clGS);
		System.out.println(clNCQ4);
		System.out.println(clNCQ3);
		System.out.println(clCQ4);
		System.out.println(clCQ3);
		System.out.println(clCQ2);
		System.out.println(clCQ1);
		System.out.println(elGS);
		System.out.println(elQ4);
		System.out.println(elQ3);
		System.out.println(elQ2);
		System.out.println(elQ1);*/

	}

}