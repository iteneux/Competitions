package iteneux.sim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import iteneux.competition.Qualification;
import iteneux.competition.QualificationRule;
import iteneux.enums.Association;
import iteneux.enums.Phase;
import iteneux.team.ClubTeam;
import iteneux.team.Team;
import iteneux.utils.logger.LoggerWrapper;

public class ChampionsLeagueSim {
	static final LoggerWrapper loggerWrapper = LoggerWrapper.getInstance();

	public static void main(String[] args) {
		List<Team> championsTeams = new ArrayList<Team>();
		List<Team> nonChampionsTeams = new ArrayList<Team>();

		nonChampionsTeams.add(new ClubTeam("Valencia CF", 10, 10, Association.ESP));
		nonChampionsTeams.add(new ClubTeam("Bayer Leverkusen", 10, 10, Association.GER));
		nonChampionsTeams.add(new ClubTeam("Sporting CP", 10, 10, Association.POR));
		nonChampionsTeams.add(new ClubTeam("Manchester United", 10, 10, Association.ENG));
		nonChampionsTeams.add(new ClubTeam("SS Lazio", 10, 10, Association.ITA));

		nonChampionsTeams.add(new ClubTeam("AS Monaco", 10, 10, Association.FRA));
		nonChampionsTeams.add(new ClubTeam("Club Brugge", 10, 10, Association.BEL));
		nonChampionsTeams.add(new ClubTeam("Rapid Wiedeń", 10, 10, Association.AUT));
		nonChampionsTeams.add(new ClubTeam("CSKA Moskwa", 10, 10, Association.RUS));
		nonChampionsTeams.add(new ClubTeam("Fenerbahçe SK", 10, 10, Association.TUR));
		nonChampionsTeams.add(new ClubTeam("Sparta Praga", 10, 10, Association.CZE));
		nonChampionsTeams.add(new ClubTeam("Ajax", 10, 10, Association.NED));
		nonChampionsTeams.add(new ClubTeam("Panathinaikos AO", 10, 10, Association.GRE));
		nonChampionsTeams.add(new ClubTeam("Szachtar Donieck", 10, 10, Association.UKR));
		nonChampionsTeams.add(new ClubTeam("BSC Young Boys", 10, 10, Association.SUI));

		// 3 + 17 = 20 ->10
		championsTeams.add(new ClubTeam("FC Basel", 10, 10, Association.SUI));
		championsTeams.add(new ClubTeam("Viktoria Pilzno", 10, 10, Association.CZE));
		championsTeams.add(new ClubTeam("Red Bull Salzburg", 10, 10, Association.AUT));

		// 30 + 4 = 34 -> 17
		championsTeams.add(new ClubTeam("Steaua Bukareszt", 10, 10, Association.ROU));
		championsTeams.add(new ClubTeam("Malmö FF", 10, 10, Association.SWE));
		championsTeams.add(new ClubTeam("Qarabağ Ağdam", 10, 10, Association.AZE));
		championsTeams.add(new ClubTeam("Skënderbeu Korcza", 10, 10, Association.ALB));
		championsTeams.add(new ClubTeam("Maccabi Tel Awiw", 10, 10, Association.ISR));
		championsTeams.add(new ClubTeam("Łudogorec Razgrad", 10, 10, Association.BUL));
		championsTeams.add(new ClubTeam("Žalgiris Wilno", 10, 10, Association.LTU));
		championsTeams.add(new ClubTeam("APOEL Nikozja", 10, 10, Association.CYP));
		championsTeams.add(new ClubTeam("Dila Gori", 10, 10, Association.GEO));
		championsTeams.add(new ClubTeam("Molde FK", 10, 10, Association.NOR));
		championsTeams.add(new ClubTeam("FK Astana", 10, 10, Association.KAZ));
		championsTeams.add(new ClubTeam("Wardar Skopje", 10, 10, Association.MKD));
		championsTeams.add(new ClubTeam("FC Midtjylland", 10, 10, Association.DEN));
		championsTeams.add(new ClubTeam("Partizan Belgrad", 10, 10, Association.SRB));
		championsTeams.add(new ClubTeam("Videoton FC", 10, 10, Association.HUN));
		championsTeams.add(new ClubTeam("Milsami Orgiejów", 10, 10, Association.MDA));
		championsTeams.add(new ClubTeam("FK Sarajevo", 10, 10, Association.BIH));
		championsTeams.add(new ClubTeam("Dundalk F.C.", 10, 10, Association.IRL));
		championsTeams.add(new ClubTeam("Dinamo Zagrzeb", 10, 10, Association.CRO));
		championsTeams.add(new ClubTeam("HJK Helsinki", 10, 10, Association.FIN));
		championsTeams.add(new ClubTeam("Fola Esch", 10, 10, Association.LUX));
		championsTeams.add(new ClubTeam("Lech Poznań", 10, 10, Association.POL));
		championsTeams.add(new ClubTeam("NK Maribor", 10, 10, Association.SVN));
		championsTeams.add(new ClubTeam("Stjarnan", 10, 10, Association.ISL));
		championsTeams.add(new ClubTeam("Hibernians", 10, 10, Association.MLT));
		championsTeams.add(new ClubTeam("BATE Borysów", 10, 10, Association.BLR));
		championsTeams.add(new ClubTeam("FK AS Trenčín", 10, 10, Association.SVK));
		championsTeams.add(new ClubTeam("FK Ventspils", 10, 10, Association.LVA));
		championsTeams.add(new ClubTeam("Rudar Pljevlja", 10, 10, Association.MNE));
		championsTeams.add(new ClubTeam("Celtic", 10, 10, Association.SCO));

		// 8 + 0-> 4
		championsTeams.add(new ClubTeam("Crusaders F.C", 10, 10, Association.NIR));
		championsTeams.add(new ClubTeam("Piunik Erywań", 10, 10, Association.ARM));
		championsTeams.add(new ClubTeam("B36 Tórshavn", 10, 10, Association.FRO));
		championsTeams.add(new ClubTeam("FC Santa Coloma", 10, 10, Association.AND));
		championsTeams.add(new ClubTeam("The New Saints F.C.", 10, 10, Association.WAL));
		championsTeams.add(new ClubTeam("Levadia Tallinn", 10, 10, Association.EST));
		championsTeams.add(new ClubTeam("SS Folgore/Falciano", 10, 10, Association.SMR));
		championsTeams.add(new ClubTeam("Lincoln Red Imps", 10, 10, Association.GIB));

		Collections.reverse(championsTeams);

		System.out.println(championsTeams.size());

		List<QualificationRule> rulesC = new ArrayList<QualificationRule>();

		rulesC.add(new QualificationRule(Phase.KNOCKOUT, 8));
		rulesC.add(new QualificationRule(Phase.KNOCKOUT, 34));
		rulesC.add(new QualificationRule(Phase.KNOCKOUT, 20));
		rulesC.add(new QualificationRule(Phase.KNOCKOUT, 10));

		Qualification championsRoute = new Qualification(championsTeams, rulesC);
		championsTeams = championsRoute.playAndDraw();
		System.out.println(championsTeams);

		List<QualificationRule> rulesNC = new ArrayList<QualificationRule>();

		rulesNC.add(new QualificationRule(Phase.KNOCKOUT, 10));
		rulesNC.add(new QualificationRule(Phase.KNOCKOUT, 10));

		Qualification nonChampionsRoute = new Qualification(nonChampionsTeams, rulesNC);
		nonChampionsTeams = nonChampionsRoute.playAndDraw();
		System.out.println(nonChampionsTeams);
		// nonChampions.show();
	}
}
