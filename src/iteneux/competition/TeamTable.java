package iteneux.competition;

import iteneux.team.Team;

import java.util.Random;

public class TeamTable implements Comparable<TeamTable> {
	private Team team;
	private Integer matches;
	private Integer points;
	private Integer goalsFor;
	private Integer goalsAgainst;
	private Integer goalsDiff;
	private Integer wins;
	private Integer draws;
	private Integer loses;

	public TeamTable() {
		this.team = new Team("", 0);
		this.matches = 0;
		this.points = 0;
		this.goalsFor = 0;
		this.goalsAgainst = 0;
		this.goalsDiff = 0;
		this.wins = 0;
		this.draws = 0;
		this.loses = 0;
	}

	public Integer getWins() {
		return wins;
	}

	public void setWins(Integer wins) {
		this.wins = wins;
	}

	public Integer getDraws() {
		return draws;
	}

	public void setDraws(Integer draws) {
		this.draws = draws;
	}

	public Integer getLoses() {
		return loses;
	}

	public void setLoses(Integer loses) {
		this.loses = loses;
	}

	public TeamTable(Team team) {
		this.team = team;
		this.matches = 0;
		this.points = 0;
		this.goalsFor = 0;
		this.goalsAgainst = 0;
		this.goalsDiff = 0;
		this.wins = 0;
		this.draws = 0;
		this.loses = 0;
	}

	public TeamTable(Team team, Integer matches, Integer points, Integer goalsFor, Integer goalsAgainst, Integer goalsDiff) {
		super();
		this.team = team;
		this.matches = matches;
		this.points = points;
		this.goalsFor = goalsFor;
		this.goalsAgainst = goalsAgainst;
		this.goalsDiff = goalsDiff;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Integer getMatches() {
		return matches;
	}

	public void setMatches(Integer matches) {
		this.matches = matches;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Integer getGoalsFor() {
		return goalsFor;
	}

	public void setGoalsFor(Integer goalsFor) {
		this.goalsFor = goalsFor;
	}

	public Integer getGoalsAgainst() {
		return goalsAgainst;
	}

	public void setGoalsAgainst(Integer goalsAgainst) {
		this.goalsAgainst = goalsAgainst;
	}

	public Integer getGoalsDiff() {
		return goalsDiff;
	}

	public void setGoalsDiff(Integer goalsDiff) {
		this.goalsDiff = goalsDiff;
	}

	public void printTable() {
		System.out.printf("|%-25s| %3s| %3s| %3s| %3s| %3s| %3s| %3s| %3s|", team.getName(), matches, points, wins, draws, loses, goalsFor,
				goalsAgainst, goalsDiff);
		System.out.println("");
	}

	@Override
	public int compareTo(TeamTable t) {
		Random r = new Random();
		if (t.getPoints().compareTo(points) == 0) {
			if (t.getGoalsDiff().compareTo(goalsDiff) == 0) {
				if (t.getGoalsFor().compareTo(goalsFor) == 0) {
					return r.nextInt(3) - 1;
				}
				return t.getGoalsFor().compareTo(goalsFor);
			}
			return t.getGoalsDiff().compareTo(goalsDiff);
		}
		return t.getPoints().compareTo(points);
	}

}
