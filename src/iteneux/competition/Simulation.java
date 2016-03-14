package iteneux.competition;

import iteneux.team.Team;

import java.util.Random;

public class Simulation {
	public static boolean getWinner(Team home, Team away) {
		int sum = home.getStrength() + home.getStrength();

		Random rand = new Random();

		if (rand.nextInt(sum) < home.getStrength()) {
			return true;
		} else {
			return false;
		}
	}

	public static Result getResult(Team home, Team away) {

		double homeStrength = home.getStrength();
		double awayStrength = away.getStrength();
		double drawStrength = 0;

		double sum = away.getStrength() + home.getStrength();

		if (home.getStrength() >= away.getStrength()) {
			double difference = home.getStrength() - away.getStrength();

			double factor = difference / homeStrength;

			drawStrength = sum / 2;
			drawStrength = drawStrength * (awayStrength / homeStrength);
			drawStrength = drawStrength + (factor * awayStrength);
		} else {
			double difference = away.getStrength() - home.getStrength();

			double factor = difference / awayStrength;

			drawStrength = sum / 2;
			drawStrength = drawStrength * (homeStrength / awayStrength);
			drawStrength = drawStrength + (factor * homeStrength);
		}

		sum = homeStrength + awayStrength + drawStrength;

		double homeChances = homeStrength / sum * 100;
		double drawChances = drawStrength / sum * 100;

		Random rand = new Random();

		double randResult = rand.nextDouble() * 100;

		if (randResult < homeChances) {
			return Result.HOME;
		} else if (randResult > homeChances + drawChances) {
			return Result.AWAY;
		} else {
			return Result.DRAW;
		}

	}
}
