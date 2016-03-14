package iteneux.competition;

import iteneux.team.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Schedule {
	private List<Round> schedule;

	public Schedule(List<Team> teams) {
		this.schedule = new ArrayList<Round>();
	}

	public List<Round> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Round> schedule) {
		this.schedule = schedule;
	}

	public void create(List<Team> teams, int roundsNumber) {
		Random rand = new Random();
		int roundsCount = 0;

		if (teams.size() % 2 == 0) {
			roundsCount = teams.size() - 1;
		} else {
			roundsCount = teams.size();
		}

		int matchesPerRound = teams.size() / 2;
		this.schedule = new ArrayList<Round>();

		for (int i = 0; i < roundsCount; i++) {
			ArrayList<Match> matches = new ArrayList<Match>();

			for (int j = 0; j < matchesPerRound; j++) {
				if (rand.nextInt(2) == 0) {
					Match match = new Match(teams.get(j), teams.get(teams.size() - j - 1));
					matches.add(match);
				} else {
					Match match = new Match(teams.get(teams.size() - j - 1), teams.get(j));
					matches.add(match);
				}

			}

			if (teams.size() % 2 == 0) {
				Team lastTeam = teams.get(teams.size() - 1);
				teams.remove(teams.size() - 1);
				teams.add(1, lastTeam);
			} else {
				Team lastTeam = teams.get(teams.size() - 1);
				teams.remove(teams.size() - 1);
				teams.add(0, lastTeam);
			}

			Round round = new Round(matches);
			Collections.shuffle(round.getMatches());
			schedule.add(round);
			Collections.shuffle(schedule);
		}
		if (roundsNumber > 1) {
			List<Round> revengeSchedule = new ArrayList<Round>();

			for (int i = 1; i < roundsNumber; i++) {
				for (Round r : schedule) {
					Round revengeRound = new Round();
					for (Match m : r.getMatches()) {
						Match revangeMatch = new Match(m.getHomeTeam(), m.getAwayTeam());

						revengeRound.addGame(revangeMatch);
					}
					revengeSchedule.add(revengeRound);
				}

				Collections.shuffle(revengeSchedule);

				for (Round r : revengeSchedule) {
					for (Match m : r.getMatches()) {
						Team awayToHome = m.getAwayTeam();
						Team homeToAway = m.getHomeTeam();

						m.setHomeTeam(awayToHome);
						m.setAwayTeam(homeToAway);
					}
				}
			}

			schedule.addAll(revengeSchedule);

		}
	}

	public void playMatches() {
		for (Round r : schedule) {
			for (Match m : r.getMatches()) {
				Random rnd = new Random();

				Result result = Simulation.getResult(m.getHomeTeam(), m.getAwayTeam());

				if (Result.HOME == result) {
					m.setHomeTeamScore(rnd.nextInt(6) + 1);
					m.setAwayTeamScore(rnd.nextInt(m.getHomeTeamScore()));
				} else if (Result.AWAY == result) {
					m.setAwayTeamScore(rnd.nextInt(6) + 1);
					m.setHomeTeamScore(rnd.nextInt(m.getAwayTeamScore()));
				} else {
					int drawScore = rnd.nextInt(6);
					m.setHomeTeamScore(drawScore);
					m.setAwayTeamScore(drawScore);
				}

			}
		}
	}

	public void createTable(List<TeamTable> teamTable) {
		for (Round r : schedule) {
			for (Match m : r.getMatches()) {

				for (TeamTable t : teamTable) {
					if (t.getTeam().equals(m.getHomeTeam())) {
						t.setMatches(t.getMatches() + 1);

						if (m.getHomeTeamScore() > m.getAwayTeamScore()) {
							t.setPoints(t.getPoints() + 3);
							t.setWins(t.getWins() + 1);
						} else if (m.getHomeTeamScore() == m.getAwayTeamScore()) {
							t.setPoints(t.getPoints() + 1);
							t.setDraws(t.getDraws() + 1);
						} else {
							t.setLoses(t.getLoses() + 1);
						}

						t.setGoalsFor(t.getGoalsFor() + m.getHomeTeamScore());
						t.setGoalsAgainst(t.getGoalsAgainst() + m.getAwayTeamScore());
						t.setGoalsDiff(t.getGoalsFor() - t.getGoalsAgainst());
					}
					if (t.getTeam().equals(m.getAwayTeam())) {
						t.setMatches(t.getMatches() + 1);

						if (m.getAwayTeamScore() > m.getHomeTeamScore()) {
							t.setPoints(t.getPoints() + 3);
							t.setWins(t.getWins() + 1);
						} else if (m.getAwayTeamScore() == m.getHomeTeamScore()) {
							t.setPoints(t.getPoints() + 1);
							t.setDraws(t.getDraws() + 1);
						} else {
							t.setLoses(t.getLoses() + 1);
						}

						t.setGoalsFor(t.getGoalsFor() + m.getAwayTeamScore());
						t.setGoalsAgainst(t.getGoalsAgainst() + m.getHomeTeamScore());
						t.setGoalsDiff(t.getGoalsFor() - t.getGoalsAgainst());
					}
				}
			}
		}
		Collections.sort(teamTable);

	}

	public String toString() {
		String s = "\nSchedule for tournament\n";
		int roundNumber = 0;
		for (Round r : schedule) {
			roundNumber++;
			s += r.toString(roundNumber);
		}
		return s;
	}

}
