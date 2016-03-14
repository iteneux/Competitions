package iteneux.competition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import iteneux.team.Team;

public class Qualification extends Competition {
	private List<Round> rounds;
	private List<QualificationRule> rules;

	public Qualification(List<Team> teams, List<QualificationRule> rules) {
		this.teams = teams;
		this.rounds = new ArrayList<Round>();
		this.setRules(rules);
	}

	public void draw() {
		/*if (teams.size() > 1) {
			for (int i = 0; i < teams.size() / 2; i++) {
				Match m = new Match();
		
				m.setHomeTeam(teams.get(i));
				m.setAwayTeam(teams.get(teams.size() - i - 1));
		
				round.addGame(m);
			}
		
		}*/
	}

	public void playQualifications() {

		/*for (Match m : round.getMatches()) {
		
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
		}*/
	}

	public void playAndDraw() {
		for (QualificationRule rule : rules) {
			Round round = new Round();

			List<Team> roundTeams = teams.subList(0, rule.getTeamNumber());
			System.out.println("roundTeams: " + roundTeams.size());

			for (int i = 0; i < rule.getTeamNumber(); i = i + 2) {
				round.addGame(new Match(roundTeams.get(i), roundTeams.get(i+1)));
			}
			
			rounds.add(round);
			List<Team> outTeams = new ArrayList<Team>();
			for (Match m : round.getMatches()) {
				
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
					outTeams.add(m.getHomeTeam());
				} else {
					outTeams.add(m.getAwayTeam());
				}
			}
			
			List<Team> inTeams = teams.subList(rule.getTeamNumber(), teams.size());
			System.out.println("outTeams: " + outTeams.size());
			
			teams = new ArrayList<Team>();
			teams.addAll(outTeams);
			teams.addAll(inTeams);
			
			System.out.println(teams.size());
			
		}
	}

	/*public void show() {
		int i = 0;
		for (Match m : round.getMatches()) {
			i++;
			System.out.print(i + ": " + m.toString());
		}
	}*/

	public List<QualificationRule> getRules() {
		return rules;
	}

	public void setRules(List<QualificationRule> rules) {
		this.rules = rules;
	}
}
