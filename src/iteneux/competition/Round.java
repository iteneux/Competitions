package iteneux.competition;

import java.util.ArrayList;
import java.util.List;

public class Round {
	private List<Match> matches;

	public Round() {
		this.matches = new ArrayList<Match>();
	}

	public Round(List<Match> matches) {
		this.matches = matches;
	}

	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

	public void addGame(Match match) {
		matches.add(match);
	}
	
	public String toString(int roundNumber) {
		String s = "\nRound "+roundNumber+"\n";
		for(Match m : matches) {
			s += m;
		}
		return s;
	}

}
