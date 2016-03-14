package iteneux.team;

import iteneux.enums.Federation;

public class NationalTeam extends Team {
	private double rank;
	private Federation federation;

	public NationalTeam() {
		super();

	}

	public NationalTeam(String name, int strength, double rank, Federation fed) {
		super(name, strength);
		this.rank = rank;
		this.federation = fed;
	}

	public double getRank() {
		return rank;
	}

	public void setRank(double rank) {
		this.rank = rank;
	}

	public Federation getFederation() {
		return federation;
	}

	public void setFederation(Federation federation) {
		this.federation = federation;
	}

}
