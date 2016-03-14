package iteneux.competition;

import iteneux.enums.Phase;

public class QualificationRule {
	Phase phase;
	int teamNumber;
	
	public QualificationRule(Phase phase, int teamNumber) {
		super();
		this.phase = phase;
		this.teamNumber = teamNumber;
	}
	public Phase getPhase() {
		return phase;
	}
	public void setPhase(Phase phase) {
		this.phase = phase;
	}
	public int getTeamNumber() {
		return teamNumber;
	}
	public void setTeamNumber(int teamNumber) {
		this.teamNumber = teamNumber;
	}
	
	
}
