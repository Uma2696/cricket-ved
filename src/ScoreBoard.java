
public
class ScoreBoard {
    static int totalscoreofteam1 = 0;
    static int totalscoreofteam2 = 0;
    static int totalwicketsofteam1 = 0;
    static int totalwicketsofteam2 = 0;
    static int innings = 0;
    static int totaloversofteam1 = 0;
    static int totaloversofteam2 = 0;


    public static
    void addScoreBoard ( int scoreofteam1, int scoreofteam2, int noofwickets1, int noofwickets2, int inning, int overs1, int overs2 ) {
        totalscoreofteam1 = scoreofteam1;
        totalwicketsofteam1 = noofwickets1;
        totaloversofteam1 = overs1;
        totalscoreofteam2 = scoreofteam2;
        totalwicketsofteam2 = noofwickets2;
        totaloversofteam2 = overs2;
        innings = inning;

    }

    public static
    void displayScoreBoard ( MatchController m ) {
        System.out.println("\nScore : ");
        System.out.println(m.t1 + " = " + totalscoreofteam1 + "  " + m.t2 + " = " + totalscoreofteam2);
        System.out.println("\nOvers  :");
        System.out.println(m.t1 + " = " + totaloversofteam1 + "  " + m.t2 + " = " + totaloversofteam2);
        System.out.println("\nWickets  :  ");
        System.out.println(m.t1 + " =  " + totalwicketsofteam1 + "  " + m.t2 + " = " + totalwicketsofteam2);
        System.out.println("\nInnings  =  " + innings);
    }

}
