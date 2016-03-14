package iteneux.team;

public class Team {
	protected String name;
	protected int strength;

	public Team(String name, int strength) {
		super();
		this.name = name;
		this.strength = strength;
	}

	public Team() {
		this.name = "";
		this.strength = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

}
