package iteneux.competition;

import java.util.ArrayList;
import java.util.List;

public class Table {
	private List<TeamTable> teamTables;

	public Table() {
		this.teamTables = new ArrayList<TeamTable>();

	}

	public void show() {
		System.out.printf("|%-25s| %3s| %3s| %3s| %3s| %3s| %3s| %3s| %3s|", "TEAM", "M", "PTS", "W", "D", "L", "GF", "GA", "GD");
		System.out.println();
		System.out.println("-------------------------------------------------------------------");
		for (TeamTable t : teamTables) {
			t.printTable();
		}
	}

	public List<TeamTable> getTeamTables() {
		return teamTables;
	}

	public void setTeamTables(List<TeamTable> teamTables) {
		this.teamTables = teamTables;
	}

}
