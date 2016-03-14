package iteneux.team;

import iteneux.enums.Association;

public class ClubTeam extends Team {
	private double coefficient;
	private Association association;

	public ClubTeam() {
		super();
	}

	public ClubTeam(String name, int strength, double coefficient, Association association) {
		super(name, strength);
		this.coefficient = coefficient;
		this.association = association;
	}

	public double getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

	public Association getAssociation() {
		return association;
	}

	public void setAssociation(Association association) {
		this.association = association;
	}

}
