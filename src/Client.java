public class Client {
    public static void main(String args[]) {
        Team OlympicsTeam = new OlympicTeam("OlympicsTeam", 100, 50);
        Team Europe = new ContinentsTeam("Europe", 30, 25);
        Team Germany = new CountriesTeam("Germany", 10, 11);
        Team MenGER = new GendersTeam("MenGER", 5, 4);
        Team FootballGER = new SportsTeam("FootballGER", 4, 4);

        Team TableTennis = new SportsTeam("TableTennis", 3, 1);

        Team WomenGER = new GendersTeam("WomenGER", 3, 6);
        Team Cycling = new SportsTeam("Cycling", 6, 4);

        Team Tennis = new SportsTeam("Tennis", 5, 5);

        Team Italy = new CountriesTeam("Italy", 12, 1);
        Team WomenITA = new GendersTeam("WomenITA", 4, 0);
        Team AlpineSki = new SportsTeam("AlpineSki", 3, 0);

        Team MenITA = new GendersTeam("MenITA", 10, 1);
        Team FootballITA = new SportsTeam("FootballITA", 3, 1);

        Team SwimmingTeam = new SportsTeam("SwimmingTeam", 2, 0);

        Team Asia = new ContinentsTeam("Asia", 33, 10);
        Team China = new CountriesTeam("China", 20, 8);
        Team MenCHN = new GendersTeam("MenCHN", 15, 6);
        Team Shooting = new SportsTeam("Shooting", 3, 1);



        OlympicsTeam.addTeam(Europe);
        Europe.addTeam(Germany);
        Germany.addTeam(MenGER);
        MenGer.addTeam(FootballGER);

        MenGER.addTeam(TableTennis);

        Germany.addTeam(WomenGER);
        WomenGER.addTeam(Cycling);

        WomenGER.addTeam(Tennis);

        Europe.addTeam(Italy);
        Italy.addTeam(WomenITA);
        WomenITA.addTeam(AlpineSki);

        Italy.addTeam(MenITA);
        MenITA.addTeam(FootballITA);

        MenITA.addTeam(SwimmingTeam);

        OlympicsTeam.addTeam(Asia);
        Asia.addTeam(China);
        China.addTeam(MenCHN);
        MenCHN.addTeam(Shooting);

        // 3.a.
        MenGER.printTeamName();
        MenGER.printTeamNoAthletes();
        // 3.b.
        Germany.printTeamName();
        Germany.printTeamNoGold();
        // 3.c.
        Asia.printTeamName();
        Asia.printTeamNoGold();
        // 3.d.
        OlympicsTeam.printTeamName();
        OlympicsTeam.printTeamNoAthletes();

    }
}
