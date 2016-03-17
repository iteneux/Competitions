package iteneux.sim;

import java.util.ArrayList;
import java.util.List;

import iteneux.competition.Qualification;
import iteneux.competition.QualificationRule;
import iteneux.enums.Association;
import iteneux.enums.Phase;
import iteneux.team.ClubTeam;
import iteneux.team.Team;
import iteneux.utils.logger.LoggerWrapper;

public class ChampionsLeagueSim2 {
	static final LoggerWrapper loggerWrapper = LoggerWrapper.getInstance();

	public static void main(String[] args) {
		List<Team> clNonChampionsTeams = new ArrayList<Team>();

		clNonChampionsTeams.add(new ClubTeam("Valencia CF", 10, 10, Association.ESP));
		clNonChampionsTeams.add(new ClubTeam("Bayer Leverkusen", 10, 10, Association.GER));
		clNonChampionsTeams.add(new ClubTeam("Sporting CP", 10, 10, Association.POR));
		clNonChampionsTeams.add(new ClubTeam("Manchester United", 10, 10, Association.ENG));
		clNonChampionsTeams.add(new ClubTeam("SS Lazio", 10, 10, Association.ITA));

		clNonChampionsTeams.add(new ClubTeam("AS Monaco", 10, 10, Association.FRA));
		clNonChampionsTeams.add(new ClubTeam("Club Brugge", 10, 10, Association.BEL));
		clNonChampionsTeams.add(new ClubTeam("Rapid Wien", 10, 10, Association.AUT));
		clNonChampionsTeams.add(new ClubTeam("CSKA Moscow", 10, 10, Association.RUS));
		clNonChampionsTeams.add(new ClubTeam("Fenerbahçe SK", 10, 10, Association.TUR));
		clNonChampionsTeams.add(new ClubTeam("Sparta Praga", 10, 10, Association.CZE));
		clNonChampionsTeams.add(new ClubTeam("Ajax", 10, 10, Association.NED));
		clNonChampionsTeams.add(new ClubTeam("Panathinaikos AO", 10, 10, Association.GRE));
		clNonChampionsTeams.add(new ClubTeam("Shakhtar Donetsk", 10, 10, Association.UKR));
		clNonChampionsTeams.add(new ClubTeam("BSC Young Boys", 10, 10, Association.SUI));

		List<QualificationRule> rulesNC = new ArrayList<QualificationRule>();

		rulesNC.add(new QualificationRule(Phase.KNOCKOUT, 10));
		rulesNC.add(new QualificationRule(Phase.KNOCKOUT, 10));

		Qualification nonChampionsRoute = new Qualification(clNonChampionsTeams, rulesNC);
		clNonChampionsTeams = nonChampionsRoute.playAndDraw();
		System.out.println(clNonChampionsTeams);
		
		
		
		
		List<Team> ulTeams1 = new ArrayList<Team>();
		List<Team> ulTeams2 = new ArrayList<Team>();
		
		ulTeams1.add(new ClubTeam("Botoșani",10,10, Association.ROU));
		ulTeams1.add(new ClubTeam("Debrecen",10,10, Association.HUN));
		ulTeams1.add(new ClubTeam("FH",10,10, Association.ISL));
		ulTeams1.add(new ClubTeam("Vaduz",10,10, Association.LIE));
		ulTeams1.add(new ClubTeam("Beitar Jerusalem",10,10, Association.ISR));
		ulTeams1.add(new ClubTeam("Koper",10,10, Association.SVN));	
		ulTeams1.add(new ClubTeam("Víkingur Reykjavík",10,10, Association.ISL));
		ulTeams1.add(new ClubTeam("Glentoran",10,10, Association.NIR));
		ulTeams1.add(new ClubTeam("Apollon Limassol",10,10, Association.CYP));
		ulTeams1.add(new ClubTeam("Celje",10,10, Association.SVN));
		ulTeams1.add(new ClubTeam("Jelgava",10,10, Association.LVA));
		ulTeams1.add(new ClubTeam("Linfield",10,10, Association.NIR));
		ulTeams1.add(new ClubTeam("Omonia",10,10, Association.CYP));
		ulTeams1.add(new ClubTeam("Domžale",10,10, Association.SVN));
		ulTeams1.add(new ClubTeam("Skonto",10,10, Association.LVA));
		ulTeams1.add(new ClubTeam("Glenavon",10,10, Association.NIR));
		ulTeams1.add(new ClubTeam("Brøndby",10,10, Association.DEN));
		ulTeams1.add(new ClubTeam("Žilina",10,10, Association.SVK));
		ulTeams1.add(new ClubTeam("Spartaks",10,10, Association.LVA));
		ulTeams1.add(new ClubTeam("Bala Town",10,10, Association.WAL));
		ulTeams1.add(new ClubTeam("Randers",10,10, Association.DEN));
		ulTeams1.add(new ClubTeam("Slovan Bratislava",10,10, Association.SVK));
		ulTeams1.add(new ClubTeam("Mladost Podgorica",10,10, Association.MNE));
		ulTeams1.add(new ClubTeam("Airbus UK Broughton",10,10, Association.WAL));
		ulTeams1.add(new ClubTeam("Hajduk Split",10,10, Association.CRO));
		ulTeams1.add(new ClubTeam("Spartak Trnava",10,10, Association.SVK));
		ulTeams1.add(new ClubTeam("Sutjeska Nikšić",10,10, Association.MNE));
		ulTeams1.add(new ClubTeam("Newtown",10,10, Association.WAL));
		ulTeams1.add(new ClubTeam("Lokomotiva",10,10, Association.CRO));
		ulTeams1.add(new ClubTeam("Sheriff Tiraspol",10,10, Association.MDA));
		ulTeams1.add(new ClubTeam("Budućnost Podgorica",10,10, Association.MNE));
		ulTeams1.add(new ClubTeam("Ulisses",10,10, Association.ARM));
		ulTeams1.add(new ClubTeam("Jagiellonia Białystok",10,10, Association.POL));
		ulTeams1.add(new ClubTeam("Dacia Chișinău",10,10, Association.MDA));
		ulTeams1.add(new ClubTeam("Laçi",10,10, Association.ALB));
		ulTeams1.add(new ClubTeam("Shirak",10,10, Association.ARM));
		ulTeams1.add(new ClubTeam("Śląsk Wrocław",10,10, Association.POL));
		ulTeams1.add(new ClubTeam("Saxan",10,10, Association.MDA));
		ulTeams1.add(new ClubTeam("Kukësi",10,10, Association.ALB));
		ulTeams1.add(new ClubTeam("Alashkert",10,10, Association.ARM));
		ulTeams1.add(new ClubTeam("Shakhtyor Soligorsk",10,10, Association.BLR));
		ulTeams1.add(new ClubTeam("Inter Baku",10,10, Association.AZE));
		ulTeams1.add(new ClubTeam("Partizani Tirana",10,10, Association.ALB));
		ulTeams1.add(new ClubTeam("Nõmme Kalju",10,10, Association.EST));
		ulTeams1.add(new ClubTeam("Torpedo-BelAZ Zhodino",10,10, Association.BLR));
		ulTeams1.add(new ClubTeam("Gabala",10,10, Association.AZE));
		ulTeams1.add(new ClubTeam("Kruoja Pakruojis",10,10, Association.LTU));
		ulTeams1.add(new ClubTeam("Sillamäe Kalev",10,10, Association.EST));
		ulTeams1.add(new ClubTeam("Aberdeen",10,10, Association.SCO));
		ulTeams1.add(new ClubTeam("Neftchi Baku",10,10, Association.AZE));
		ulTeams1.add(new ClubTeam("Atlantas",10,10, Association.LTU));
		ulTeams1.add(new ClubTeam("Flora Tallinn",10,10, Association.EST));
		ulTeams1.add(new ClubTeam("St Johnstone",10,10, Association.SCO));
		ulTeams1.add(new ClubTeam("Dinamo Tbilisi",10,10, Association.GEO));
		ulTeams1.add(new ClubTeam("Trakai",10,10, Association.LTU));
		ulTeams1.add(new ClubTeam("Víkingur Gøta",10,10, Association.FRO));
		ulTeams1.add(new ClubTeam("AIK",10,10, Association.SWE));
		ulTeams1.add(new ClubTeam("Dinamo Batumi",10,10, Association.GEO));
		ulTeams1.add(new ClubTeam("Rabotnički",10,10, Association.MKD));
		ulTeams1.add(new ClubTeam("HB",10,10, Association.FRO));
		ulTeams1.add(new ClubTeam("Elfsborg",10,10, Association.SWE));
		ulTeams1.add(new ClubTeam("Tskhinvali",10,10, Association.GEO));
		ulTeams1.add(new ClubTeam("Shkëndija",10,10, Association.MKD));
		ulTeams1.add(new ClubTeam("NSÍ Runavík",10,10, Association.FRO));
		ulTeams1.add(new ClubTeam("Stara Zagora",10,10, Association.BUL));
		ulTeams1.add(new ClubTeam("Kairat",10,10, Association.KAZ));
		ulTeams1.add(new ClubTeam("Renova",10,10, Association.MKD));
		ulTeams1.add(new ClubTeam("Juvenes/Dogana",10,10, Association.SMR));
		ulTeams1.add(new ClubTeam("Litex Lovech",10,10, Association.BUL));
		ulTeams1.add(new ClubTeam("Aktobe",10,10, Association.KAZ));
		ulTeams1.add(new ClubTeam("St Patrick's Athletic",10,10, Association.IRL));
		ulTeams1.add(new ClubTeam("La Fiorita",10,10, Association.SMR));
		ulTeams1.add(new ClubTeam("Rosenborg",10,10, Association.NOR));
		ulTeams1.add(new ClubTeam("Ordabasy",10,10, Association.KAZ));
		ulTeams1.add(new ClubTeam("Cork City",10,10, Association.IRL));
		ulTeams1.add(new ClubTeam("Sant Julià",10,10, Association.AND));
		ulTeams1.add(new ClubTeam("Odd",10,10, Association.NOR));
		ulTeams1.add(new ClubTeam("Olimpic",10,10, Association.BIH));
		ulTeams1.add(new ClubTeam("Shamrock Rovers",10,10, Association.IRL));
		ulTeams1.add(new ClubTeam("Lusitanos",10,10, Association.AND));
		ulTeams1.add(new ClubTeam("Strømsgodset",10,10, Association.NOR));
		ulTeams1.add(new ClubTeam("Željezničar",10,10, Association.BIH));
		ulTeams1.add(new ClubTeam("Differdange 03",10,10, Association.LUX));
		ulTeams1.add(new ClubTeam("Europa FC",10,10, Association.GIB));
		ulTeams1.add(new ClubTeam("Čukarički",10,10, Association.SRB));
		ulTeams1.add(new ClubTeam("Zrinjski Mostar",10,10, Association.BIH));
		ulTeams1.add(new ClubTeam("F91 Dudelange",10,10, Association.LUX));
		ulTeams1.add(new ClubTeam("Go Ahead Eagles",10,10, Association.NED));
		ulTeams1.add(new ClubTeam("Red Star Belgrade",10,10, Association.SRB));
		ulTeams1.add(new ClubTeam("SJK",10,10, Association.FIN));
		ulTeams1.add(new ClubTeam("Progrès Niederkorn",10,10, Association.LUX));
		ulTeams1.add(new ClubTeam("West Ham United",10,10, Association.ENG));
		ulTeams1.add(new ClubTeam("Vojvodina",10,10, Association.SRB));
		ulTeams1.add(new ClubTeam("Lahti",10,10, Association.FIN));
		ulTeams1.add(new ClubTeam("Birkirkara",10,10, Association.MLT));
		ulTeams1.add(new ClubTeam("UCD",10,10, Association.IRL));
		ulTeams1.add(new ClubTeam("Ferencváros",10,10, Association.HUN));
		ulTeams1.add(new ClubTeam("VPS",10,10, Association.FIN));
		ulTeams1.add(new ClubTeam("Valletta",10,10, Association.MLT));
		ulTeams1.add(new ClubTeam("MTK Budapest",10,10, Association.HUN));
		ulTeams1.add(new ClubTeam("KR",10,10, Association.ISL));
		ulTeams1.add(new ClubTeam("Balzan",10,10, Association.MLT));
		
		List<QualificationRule> rulesEL1 = new ArrayList<QualificationRule>();
		rulesEL1.add(new QualificationRule(Phase.KNOCKOUT, ulTeams1.size()));

		Qualification el1 = new Qualification(ulTeams1, rulesEL1);
		
		List<Team> advanced = el1.playAndDraw();
		ulTeams2.addAll(advanced);
		
		ulTeams1.removeAll(advanced);
		
		//ulTeams1Losers
		System.out.println(advanced);
		System.out.println(ulTeams1);

		//
		List<Team> clChampionsTeams1 = new ArrayList<Team>();
		List<Team> clChampionsTeams2 = new ArrayList<Team>();
		List<Team> clChampionsTeams34 = new ArrayList<Team>();

		// 8 + 0-> 4
		clChampionsTeams1.add(new ClubTeam("Crusaders F.C", 10, 10, Association.NIR));
		clChampionsTeams1.add(new ClubTeam("Piunik Erywań", 10, 10, Association.ARM));
		clChampionsTeams1.add(new ClubTeam("B36 Tórshavn", 10, 10, Association.FRO));
		clChampionsTeams1.add(new ClubTeam("FC Santa Coloma", 10, 10, Association.AND));
		clChampionsTeams1.add(new ClubTeam("The New Saints F.C.", 10, 10, Association.WAL));
		clChampionsTeams1.add(new ClubTeam("Levadia Tallinn", 10, 10, Association.EST));
		clChampionsTeams1.add(new ClubTeam("SS Folgore/Falciano", 10, 10, Association.SMR));
		clChampionsTeams1.add(new ClubTeam("Lincoln Red Imps", 10, 10, Association.GIB));

		List<QualificationRule> rulesCL1 = new ArrayList<QualificationRule>();
		rulesCL1.add(new QualificationRule(Phase.KNOCKOUT, clChampionsTeams1.size()));

		Qualification championsRoute1 = new Qualification(clChampionsTeams1, rulesCL1);
		clChampionsTeams2.addAll(championsRoute1.playAndDraw());

		// 30 + 4 = 34 -> 17
		clChampionsTeams2.add(new ClubTeam("Steaua Bukareszt", 10, 10, Association.ROU));
		clChampionsTeams2.add(new ClubTeam("Malmö FF", 10, 10, Association.SWE));
		clChampionsTeams2.add(new ClubTeam("Qarabağ Ağdam", 10, 10, Association.AZE));
		clChampionsTeams2.add(new ClubTeam("Skënderbeu Korcza", 10, 10, Association.ALB));
		clChampionsTeams2.add(new ClubTeam("Maccabi Tel Awiw", 10, 10, Association.ISR));
		clChampionsTeams2.add(new ClubTeam("Łudogorec Razgrad", 10, 10, Association.BUL));
		clChampionsTeams2.add(new ClubTeam("Žalgiris Wilno", 10, 10, Association.LTU));
		clChampionsTeams2.add(new ClubTeam("APOEL Nikozja", 10, 10, Association.CYP));
		clChampionsTeams2.add(new ClubTeam("Dila Gori", 10, 10, Association.GEO));
		clChampionsTeams2.add(new ClubTeam("Molde FK", 10, 10, Association.NOR));
		clChampionsTeams2.add(new ClubTeam("FK Astana", 10, 10, Association.KAZ));
		clChampionsTeams2.add(new ClubTeam("Wardar Skopje", 10, 10, Association.MKD));
		clChampionsTeams2.add(new ClubTeam("FC Midtjylland", 10, 10, Association.DEN));
		clChampionsTeams2.add(new ClubTeam("Partizan Belgrad", 10, 10, Association.SRB));
		clChampionsTeams2.add(new ClubTeam("Videoton FC", 10, 10, Association.HUN));
		clChampionsTeams2.add(new ClubTeam("Milsami Orgiejów", 10, 10, Association.MDA));
		clChampionsTeams2.add(new ClubTeam("FK Sarajevo", 10, 10, Association.BIH));
		clChampionsTeams2.add(new ClubTeam("Dundalk F.C.", 10, 10, Association.IRL));
		clChampionsTeams2.add(new ClubTeam("Dinamo Zagrzeb", 10, 10, Association.CRO));
		clChampionsTeams2.add(new ClubTeam("HJK Helsinki", 10, 10, Association.FIN));
		clChampionsTeams2.add(new ClubTeam("Fola Esch", 10, 10, Association.LUX));
		clChampionsTeams2.add(new ClubTeam("Lech Poznań", 10, 10, Association.POL));
		clChampionsTeams2.add(new ClubTeam("NK Maribor", 10, 10, Association.SVN));
		clChampionsTeams2.add(new ClubTeam("Stjarnan", 10, 10, Association.ISL));
		clChampionsTeams2.add(new ClubTeam("Hibernians", 10, 10, Association.MLT));
		clChampionsTeams2.add(new ClubTeam("BATE Borysów", 10, 10, Association.BLR));
		clChampionsTeams2.add(new ClubTeam("FK AS Trenčín", 10, 10, Association.SVK));
		clChampionsTeams2.add(new ClubTeam("FK Ventspils", 10, 10, Association.LVA));
		clChampionsTeams2.add(new ClubTeam("Rudar Pljevlja", 10, 10, Association.MNE));
		clChampionsTeams2.add(new ClubTeam("Celtic", 10, 10, Association.SCO));

		List<QualificationRule> rulesCL2 = new ArrayList<QualificationRule>();
		rulesCL2.add(new QualificationRule(Phase.KNOCKOUT, clChampionsTeams2.size()));

		Qualification championsRoute2 = new Qualification(clChampionsTeams2, rulesCL2);
		clChampionsTeams34.addAll(championsRoute2.playAndDraw());
		
		

		// 3 + 17 = 20 ->10
		clChampionsTeams34.add(new ClubTeam("FC Basel", 10, 10, Association.SUI));
		clChampionsTeams34.add(new ClubTeam("Viktoria Pilzno", 10, 10, Association.CZE));
		clChampionsTeams34.add(new ClubTeam("Red Bull Salzburg", 10, 10, Association.AUT));

		List<QualificationRule> rulesCL34 = new ArrayList<QualificationRule>();
		rulesCL34.add(new QualificationRule(Phase.KNOCKOUT, 20));
		rulesCL34.add(new QualificationRule(Phase.KNOCKOUT, 10));
		Qualification championsRoute = new Qualification(clChampionsTeams34, rulesCL34);
		clChampionsTeams34 = championsRoute.playAndDraw();

		System.out.println(clChampionsTeams34);

		// nonChampions.show();
	}
}
