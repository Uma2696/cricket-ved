import model.Team;

public class CricketGame implements Game {
    int totalscoreofteam1 = 0;
    int totalscoreofteam2 = 0;
    int noofwickets = 0;
    int currentscore = 0;
    int previousscore = 0;

        MatchController m;
        Team p;

    public void startGame() {
        m = new MatchController();
        p = new Team();

        m.setupTeams();
        p.addNamesInTeam();
        System.out.println(m.t1 + " players =" + p.Player);
        for (int i = 0; i < (20 * 6); i++) {
            currentscore = Utils.playBall();
            if (currentscore == 0) {
                System.out.println("player " + p.getEachPlayer(noofwickets) + " got out from team  " + m.t1);
                System.out.println(p.getEachPlayer(noofwickets) + " score is " + (totalscoreofteam1 - previousscore));
                previousscore = totalscoreofteam1;
                noofwickets++;
                if (noofwickets == 11) {
                    System.out.println(m.t1 + " all out");
                    break;
                }
            } else {
                totalscoreofteam1 += currentscore;
            }
        }

        System.out.println("Score of " + m.t1 + " = " + totalscoreofteam1);

        noofwickets = 0;
        previousscore = 0;

        System.out.println(m.t2 + " players =" + p.Player);
        for (int i = 0; i < (20 * 6); i++) {
            currentscore = Utils.playBall();
            if (currentscore == 0) {
                System.out.println("player " + p.getEachPlayer(noofwickets) + " got out from team  " + m.t2);
                System.out.println(p.getEachPlayer(noofwickets) + " score is " + (totalscoreofteam2 - previousscore));
                previousscore = totalscoreofteam2;
                noofwickets++;
                if (noofwickets == 11) {
                    System.out.println(m.t2 + " all out");
                    break;
                }
            } else {
                totalscoreofteam2 += currentscore;
                if (totalscoreofteam2 > totalscoreofteam1) {
                    System.out.println("Match got over...");
                    System.out.println(m.t2 + "  won the match ");
                    System.out.println("score of " + m.t2 + " is = " + totalscoreofteam2);
                    break;
                }
            }
        }
        if (totalscoreofteam2 < totalscoreofteam1) {
            System.out.println("Match got over...");
            System.out.println("Score of " + m.t2 + " = " + totalscoreofteam2);
            System.out.println(m.t1 + " won the match");
        }


    }


}









