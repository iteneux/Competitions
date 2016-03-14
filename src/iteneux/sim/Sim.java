package iteneux.sim;

import iteneux.competition.Qualification;
import iteneux.competition.QualificationRule;
import iteneux.competition.Tournament;
import iteneux.enums.Association;
import iteneux.enums.Federation;
import iteneux.enums.Phase;
import iteneux.team.ClubTeam;
import iteneux.team.NationalTeam;
import iteneux.team.Team;
import iteneux.utils.logger.LoggerWrapper;

import java.util.ArrayList;
import java.util.List;

public class Sim {
	static final LoggerWrapper loggerWrapper = LoggerWrapper.getInstance();

	public static void main(String[] args) {
		List<Team> teams = new ArrayList<Team>();

		/* Test
		teams.add(new Team("Chelsea", 10));
		teams.add(new Team("Manchester City", 9));
		teams.add(new Team("Manchester United", 9));
		teams.add(new Team("Arsenal", 9));
		teams.add(new Team("Liverpool", 8));
		teams.add(new Team("Southampton", 6));
		teams.add(new Team("Tottenham", 7));
		teams.add(new Team("Everton", 5));
		teams.add(new Team("Swansea", 5));
		teams.add(new Team("Newcastle", 4));
		teams.add(new Team("Stoke", 4));
		teams.add(new Team("Sunderland", 4));
		teams.add(new Team("Queens Park Rangers", 2));
		teams.add(new Team("West Bromwich Albion", 2));
		teams.add(new Team("West Ham United", 4));
		teams.add(new Team("Leicester City", 2));
		teams.add(new Team("Burnley", 2));
		teams.add(new Team("Crystal Palace", 4));
		teams.add(new Team("Aston Villa", 3));
		teams.add(new Team("Hull", 3));
		
		League premierLeague = new League(teams, 2);
		premierLeague.runSimulation();
		premierLeague.showSchedule();
		premierLeague.showTable();
		*/

		/*teams.add(new ClubTeam("Real Madrid", 10, 171.885, Association.ESP));
		teams.add(new ClubTeam("Barcelona", 10, 162.885, Association.ESP));
		teams.add(new ClubTeam("Bayern Munich", 10, 154.883, Association.GER));
		teams.add(new ClubTeam("Chelsea", 9, 142.078, Association.ENG));
		teams.add(new ClubTeam("Benfica", 4, 118.276, Association.POR));
		teams.add(new ClubTeam("Atlético Madrid", 8, 120.885, Association.ESP));
		teams.add(new ClubTeam("Arsenal", 8, 110.078, Association.ENG));
		teams.add(new ClubTeam("Porto", 6, 111.276, Association.POR));
		teams.add(new ClubTeam("Schalke 04", 5, 111.883, Association.GER));
		teams.add(new ClubTeam("Borussia Dortmund", 6, 99.883, Association.GER));
		teams.add(new ClubTeam("Juventus", 8, 95.102, Association.ITA));
		teams.add(new ClubTeam("Paris Saint-Germain", 8, 100.483, Association.FRA));
		teams.add(new ClubTeam("Shakhtar Donetsk", 2, 86.033, Association.UKR));
		teams.add(new ClubTeam("Basel", 2, 84.875, Association.SUI));
		teams.add(new ClubTeam("Zenit Saint Petersburg", 4, 90.099, Association.RUS));
		teams.add(new ClubTeam("Manchester City", 7, 87.078, Association.ENG));
		teams.add(new ClubTeam("Bayer Leverkusen", 4, 87.883, Association.GER));
		teams.add(new ClubTeam("Olympiacos", 2, 62.380, Association.GRE));
		teams.add(new ClubTeam("CSKA Moscow", 2, 55.599, Association.RUS));
		teams.add(new ClubTeam("Ajax", 4, 66.195, Association.NED));
		teams.add(new ClubTeam("Liverpool", 7, 47.078, Association.ENG));
		teams.add(new ClubTeam("Sporting CP", 3, 56.276, Association.POR));
		teams.add(new ClubTeam("Galatasaray", 3, 50.020, Association.TUR));
		teams.add(new ClubTeam("Athletic Bilbao", 3, 56.885, Association.ESP));
		teams.add(new ClubTeam("Anderlecht", 3, 47.440, Association.BEL));
		teams.add(new ClubTeam("Roma", 5, 43.602, Association.ITA));
		teams.add(new ClubTeam("APOEL", 2, 35.460, Association.CYP));
		teams.add(new ClubTeam("BATE Borisov", 1, 35.150, Association.BLR));
		teams.add(new ClubTeam("Ludogorets Razgrad", 1, 25.350, Association.BUL));
		teams.add(new ClubTeam("Maribor", 1, 22.225, Association.SVN));
		teams.add(new ClubTeam("Monaco", 5, 31.483, Association.FRA));
		teams.add(new ClubTeam("Malmö FF", 1, 12.545, Association.SWE));
		
		Tournament tournament = new Tournament(teams, 8, 16, 2);
		tournament.playTournament();

		teams.add(new NationalTeam("Brazylia", 10, 162.885, Federation.CONMEBOL));
		teams.add(new NationalTeam("Argentyna", 10, 162.885, Federation.CONMEBOL));
		teams.add(new NationalTeam("Urugwaj", 10, 162.885, Federation.CONMEBOL));
		teams.add(new NationalTeam("Chile", 10, 162.885, Federation.CONMEBOL));
		teams.add(new NationalTeam("Paragwaj", 10, 162.885, Federation.CONMEBOL));
		teams.add(new NationalTeam("Wenezuela", 10, 162.885, Federation.CONMEBOL));
		teams.add(new NationalTeam("Boliwia", 10, 162.885, Federation.CONMEBOL));
		teams.add(new NationalTeam("Peru", 10, 162.885, Federation.CONMEBOL));
		teams.add(new NationalTeam("Kolumbia", 10, 162.885, Federation.CONMEBOL));
		teams.add(new NationalTeam("Meksyk", 10, 162.885, Federation.CONMEBOL));
		teams.add(new NationalTeam("Jamajka", 10, 162.885, Federation.CONMEBOL));
		teams.add(new NationalTeam("Ekwador", 10, 162.885, Federation.CONMEBOL));
		*/

		// teams.add(new NationalTeam("Francja", 10, 162.885, Federation.UEFA));
		/*teams.add(new NationalTeam("Islandia", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Czechy", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Turcja", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Holandia", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Łotwa", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Kazachstan", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Belgia", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Walia", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Bośnia i Hercegowina", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Izrael", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Cypr", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Andora", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Hiszpania", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Słowacja", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Ukraina", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Białoruś", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Luksemburg", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Macedonia", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Niemcy", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Polska", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Irlandia", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Szkocja", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Gruzja", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Gibraltar", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Anglia", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Szwajcaria", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Słowenia", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Estonia", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Litwa", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("San Marino", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Irlandia Północna", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Rumunia", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Węgry", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Finlandia", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Wyspy Owcze", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Grecja", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Austria", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Rosja", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Szwecja", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Czarnogóra", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Liechtenstein", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Mołdawia", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Włochy", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Norwegia", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Chorwacja", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Bułgaria", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Azerbejdżan", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Malta", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Portugalia", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Albania", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Dania", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Serbia", 10, 162.885, Federation.UEFA));
		teams.add(new NationalTeam("Armenia", 10, 162.885, Federation.UEFA));
		//Tournament tournament = new Tournament(teams, 9, 24, 2);
		//tournament.playTournament();
		 * 
		 */

		/*teams.add(new ClubTeam("Valencia CF", 10, 10, Association.ESP));
		teams.add(new ClubTeam("Bayer Leverkusen", 10, 10, Association.GER));
		teams.add(new ClubTeam("Sporting CP", 10, 10, Association.POR));
		teams.add(new ClubTeam("Manchester United", 10, 10, Association.ENG));
		teams.add(new ClubTeam("SS Lazio", 10, 10, Association.ITA));

		teams.add(new ClubTeam("AS Monaco", 10, 10, Association.FRA));
		teams.add(new ClubTeam("Club Brugge", 10, 10, Association.BEL));
		teams.add(new ClubTeam("Rapid Wiedeń", 10, 10, Association.AUT));
		teams.add(new ClubTeam("CSKA Moskwa", 10, 10, Association.RUS));
		teams.add(new ClubTeam("Fenerbahçe SK", 10, 10, Association.TUR));
		teams.add(new ClubTeam("Sparta Praga", 10, 10, Association.CZE));
		teams.add(new ClubTeam("Ajax", 10, 10, Association.NED));
		teams.add(new ClubTeam("Panathinaikos AO", 10, 10, Association.GRE));
		teams.add(new ClubTeam("Szachtar Donieck", 10, 10, Association.UKR));
		teams.add(new ClubTeam("BSC Young Boys", 10, 10, Association.SUI));*/
		
		
		
		//3 + 17 = 20 ->10
		teams.add(new ClubTeam("FC Basel", 10, 10, Association.SUI));
		teams.add(new ClubTeam("Viktoria Pilzno", 10, 10, Association.CZE));
		teams.add(new ClubTeam("Red Bull Salzburg", 10, 10, Association.AUT));

		//30 + 4 = 34 -> 17
		teams.add(new ClubTeam("Steaua Bukareszt", 10, 10, Association.ROU));
		teams.add(new ClubTeam("Malmö FF", 10, 10, Association.SWE));
		teams.add(new ClubTeam("Qarabağ Ağdam", 10, 10, Association.AZE));
		teams.add(new ClubTeam("Skënderbeu Korcza", 10, 10, Association.ALB));
		teams.add(new ClubTeam("Maccabi Tel Awiw", 10, 10, Association.ISR));
		teams.add(new ClubTeam("Łudogorec Razgrad", 10, 10, Association.BUL));
		teams.add(new ClubTeam("Žalgiris Wilno", 10, 10, Association.LTU));
		teams.add(new ClubTeam("APOEL Nikozja", 10, 10, Association.CYP));
		teams.add(new ClubTeam("Dila Gori", 10, 10, Association.GEO));
		teams.add(new ClubTeam("Molde FK", 10, 10, Association.NOR));
		teams.add(new ClubTeam("FK Astana", 10, 10, Association.KAZ));
		teams.add(new ClubTeam("Wardar Skopje", 10, 10, Association.MKD));
		teams.add(new ClubTeam("FC Midtjylland", 10, 10, Association.DEN));
		teams.add(new ClubTeam("Partizan Belgrad", 10, 10, Association.SRB));
		teams.add(new ClubTeam("Videoton FC", 10, 10, Association.HUN));
		teams.add(new ClubTeam("Milsami Orgiejów", 10, 10, Association.MDA));
		teams.add(new ClubTeam("FK Sarajevo", 10, 10, Association.BIH));
		teams.add(new ClubTeam("Dundalk F.C.", 10, 10, Association.IRL));
		teams.add(new ClubTeam("Dinamo Zagrzeb", 10, 10, Association.CRO));
		teams.add(new ClubTeam("HJK Helsinki", 10, 10, Association.FIN));
		teams.add(new ClubTeam("Fola Esch", 10, 10, Association.LUX));
		teams.add(new ClubTeam("Lech Poznań", 10, 10, Association.POL));
		teams.add(new ClubTeam("NK Maribor", 10, 10, Association.SVN));
		teams.add(new ClubTeam("Stjarnan", 10, 10, Association.ISL));
		teams.add(new ClubTeam("Hibernians", 10, 10, Association.MLT));
		teams.add(new ClubTeam("BATE Borysów", 10, 10, Association.BLR));
		teams.add(new ClubTeam("FK AS Trenčín", 10, 10, Association.SVK));
		teams.add(new ClubTeam("FK Ventspils", 10, 10, Association.LVA));
		teams.add(new ClubTeam("Rudar Pljevlja", 10, 10, Association.MNE));
		teams.add(new ClubTeam("Celtic", 10, 10, Association.SCO));

		
		//8 -> 4
		teams.add(new ClubTeam("Crusaders F.C", 10, 10, Association.NIR));
		teams.add(new ClubTeam("Piunik Erywań", 10, 10, Association.ARM));
		teams.add(new ClubTeam("B36 Tórshavn", 10, 10, Association.FRO));
		teams.add(new ClubTeam("FC Santa Coloma", 10, 10, Association.AND));
		teams.add(new ClubTeam("The New Saints F.C.", 10, 10, Association.WAL));
		teams.add(new ClubTeam("Levadia Tallinn", 10, 10, Association.EST));
		teams.add(new ClubTeam("SS Folgore/Falciano", 10, 10, Association.SMR));
		teams.add(new ClubTeam("Lincoln Red Imps", 10, 10, Association.GIB));
		
		System.out.println(teams);
		
		List<QualificationRule> rules = new ArrayList<QualificationRule>();
		
		rules.add(new QualificationRule(Phase.KNOCKOUT, 8));
		rules.add(new QualificationRule(Phase.KNOCKOUT, 34));
		rules.add(new QualificationRule(Phase.KNOCKOUT, 20));

		Qualification nonChampions = new Qualification(teams, rules);
		nonChampions.draw();
		nonChampions.playQualifications();
		//nonChampions.show();
	}
}
