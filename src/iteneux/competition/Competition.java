package iteneux.competition;

import iteneux.team.Team;
import iteneux.utils.logger.LoggerWrapper;

import java.util.List;

public abstract class Competition {
	static final LoggerWrapper loggerWrapper = LoggerWrapper.getInstance();
	
	protected List<Team> teams;

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	
	
}
