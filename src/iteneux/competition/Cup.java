package iteneux.competition;

import iteneux.team.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cup extends Competition {
	private Schedule schedule;
	private List<Team> byeTeams;
	private int byeNumber;
	private int roundsNumber;

	public Cup() {
		this.teams = new ArrayList<Team>();
		this.byeTeams = new ArrayList<Team>();
	}

	public List<Team> getByeTeams() {
		return byeTeams;
	}

	public void setByeTeams(List<Team> byeTeams) {
		this.byeTeams = byeTeams;
	}

	public Cup(List<Team> teams) {
		super();
		this.teams = teams;
		this.byeTeams = new ArrayList<Team>();
		this.schedule = new Schedule(teams);

		calculateRoundsNumber();
		if (isCupWithBye()) {
			createFirstRound();
		} else {
			createRound();
		}

	}

	public void createFirstRound() {
		int temp = (int) Math.pow(2.0, (double) this.roundsNumber);
		byeNumber = temp - teams.size();

		for (int i = 0; i < byeNumber; i++) {
			byeTeams.add(teams.get(0));
			teams.remove(0);
		}

		createRound();

	}

	public void createRound() {

		if (teams.size() > 1) {
			Round r = new Round();
			for (int i = 0; i < teams.size() / 2; i++) {
				Match m = new Match();

				m.setHomeTeam(teams.get(i));
				m.setAwayTeam(teams.get(teams.size() - i - 1));

				r.addGame(m);
			}
			schedule.getSchedule().add(r);
		}

	}
	
	
	//Obliczanie liczby rund
	private int calculateRoundsNumber() {
		int i = 1;
		while (i < teams.size()) {
			i = i * 2;
			roundsNumber++;
		}

		return roundsNumber;
	}

	public void playCup() {

		for (int i = 0; i < roundsNumber; i++) {
			teams = new ArrayList<Team>();
			for (Match m : schedule.getSchedule().get(i).getMatches()) {

				Random rnd = new Random();

				boolean isHomeWinner = Simulation.getWinner(m.getHomeTeam(), m.getAwayTeam());
				int homeScore = 0;
				int awayScore = 0;

				if (isHomeWinner) {
					homeScore = rnd.nextInt(6) + 1;
					awayScore = rnd.nextInt(homeScore);
				} else {
					awayScore = rnd.nextInt(6) + 1;
					homeScore = rnd.nextInt(awayScore);
				}
				m.setHomeTeamScore(homeScore);
				m.setAwayTeamScore(awayScore);

				if (m.getHomeTeamScore() > m.getAwayTeamScore()) {
					teams.add(m.getHomeTeam());
				} else {
					teams.add(m.getAwayTeam());
				}

			}

			if (isCupWithBye() && i == 0) {
				for (int b = 0; b < byeNumber; b++) {
					teams.add(byeTeams.get(0));
					byeTeams.remove(0);
				}
			}

			createRound();

		}

	}

	//Sprawdzenie czy puchar z wolnymi losami
	private boolean isCupWithBye() {
		if (Math.pow(2.0, (double) this.roundsNumber) > teams.size()) {
			return true;
		} else {
			return false;
		}
	}

	public void show() {
		int i = 0;
		for (Round r : schedule.getSchedule()) {
			i++;
			System.out.println(r.toString(i));
		}
	}
}
