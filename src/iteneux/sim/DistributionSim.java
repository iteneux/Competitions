package iteneux.sim;

import java.util.ArrayList;
import java.util.List;

import iteneux.distribution.Distribution;
import iteneux.enums.Association;
import iteneux.enums.DistributionType;
import iteneux.team.ClubTeam;
import iteneux.team.Team;

public class DistributionSim {

	public static void main(String[] args) {

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

		d = new Distribution();
		d.add(DistributionType.CLG);
		d.add(DistributionType.CLG);
		d.add(DistributionType.CLG);
		d.add(DistributionType.NCLQ4);
		d.add(DistributionType.ELG);
		d.add(DistributionType.ELQ3);
		d.add(null);
		d.add(DistributionType.ELG);
		distributions.add(d);

		d = new Distribution();
		d.add(DistributionType.CLG);
		d.add(DistributionType.NCLQ3);
		d.add(DistributionType.ELQ3);
		d.add(DistributionType.ELQ3);
		d.add(null);
		d.add(null);
		d.add(null);
		d.add(DistributionType.ELG);

		distributions.add(d);

		List<Team> england = new ArrayList<Team>(8);
		england.add(new ClubTeam("Chelsea", 10, 10, Association.ENG));
		england.add(new ClubTeam("Manchester City", 10, 10, Association.ENG));
		england.add(new ClubTeam("Arsenal", 10, 10, Association.ENG));
		england.add(new ClubTeam("Manchester United", 10, 10, Association.ENG));
		england.add(new ClubTeam("Tottenham", 10, 10, Association.ENG));
		england.add(new ClubTeam("Liverpool", 10, 10, Association.ENG));
		england.add(new ClubTeam("West Ham United", 10, 10, Association.ENG));
		england.add(new ClubTeam("Southampton", 10, 10, Association.ENG));

		List<Team> spain = new ArrayList<Team>(8);
		spain.add(new ClubTeam("Barcelona", 10, 10, Association.ENG));
		spain.add(new ClubTeam("Real", 10, 10, Association.ENG));
		spain.add(new ClubTeam("Atletico", 10, 10, Association.ENG));
		spain.add(new ClubTeam("Valencia", 10, 10, Association.ENG));
		spain.add(new ClubTeam("Sevilla", 10, 10, Association.ENG));
		spain.add(new ClubTeam("Villareal", 10, 10, Association.ENG));
		spain.add(null);
		spain.add(new ClubTeam("Athletic Bilbao", 10, 10, Association.ENG));

		List<Team> russia = new ArrayList<Team>(8);
		russia.add(new ClubTeam("Zenit", 10, 10, Association.ENG));
		russia.add(new ClubTeam("CSKA", 10, 10, Association.ENG));
		russia.add(new ClubTeam("Lokomotiv", 10, 10, Association.ENG));
		russia.add(new ClubTeam("Dynamo", 10, 10, Association.ENG));
		russia.add(null);
		russia.add(null);
		russia.add(null);
		russia.add(new ClubTeam("Rubin", 10, 10, Association.ENG));

		List<List<Team>> teamsQualified = new ArrayList<>(0);
		teamsQualified.add(england);
		teamsQualified.add(spain);
		teamsQualified.add(russia);

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

				System.out.println(i + ", " + j + ": " + team + " " + dt);

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

		System.out.println(clGS);
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
		System.out.println(elQ1);

	}

}