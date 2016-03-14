package iteneux.competition;

import iteneux.team.Team;

public class Match {
	private Team homeTeam;
	private Team awayTeam;
	private Integer homeTeamScore;
	private Integer awayTeamScore;

	public Match() {
		this.homeTeam = new Team();
		this.awayTeam = new Team();
	}
	
	public Match(Team homeTeam, Team awayTeam) {
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}

	public Team getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Team getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}

	public Integer getHomeTeamScore() {
		return homeTeamScore;
	}

	public void setHomeTeamScore(Integer homeTeamScore) {
		this.homeTeamScore = homeTeamScore;
	}

	public Integer getAwayTeamScore() {
		return awayTeamScore;
	}

	public void setAwayTeamScore(Integer awayTeamScore) {
		this.awayTeamScore = awayTeamScore;
	}
	
	public String toString() {
		String s = homeTeam+" - "+awayTeam+" ";
		if (homeTeamScore != null && awayTeamScore != null) {
			s += homeTeamScore+":"+awayTeamScore;
		}
		
		return s+"\n";
	}

}
