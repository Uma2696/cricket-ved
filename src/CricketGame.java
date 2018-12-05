import model.Team;

public class CricketGame implements Game {
    int totalscoreofteam1 ;
    int totalscoreofteam2 = 0;
    int noofwickets1 = 0;
    int noofwickets2 =0;
    int currentscore = 0;
    int previousscore = 0;
    int innings =1;
    int overs1 =1;
    int overs2 =1;
    String playertype;


        MatchController m;
        Team p;

    public void startGame() {
        m = new MatchController();
        p = new Team();

        m.setupTeams();
        p.addNamesInTeam();
        System.out.println(m.t1 + " players =" + p.Player);
        for (int i = 0; overs1!=50; i++) {
            playertype=Utils.playerRole();
            currentscore = Utils.playBall(playertype);
            if (currentscore == 0) {
                System.out.println("player " + p.getEachPlayer(noofwickets1)+"("+Utils.playerRole()+")" + " got out from team  " + m.t1);
                System.out.println(p.getEachPlayer(noofwickets1) + " score is " + (totalscoreofteam1 - previousscore));
                previousscore = totalscoreofteam1;
                noofwickets1++;
                if (noofwickets1 == 11) {
                    System.out.println(m.t1 + " all out");
                    break;
                }
            } else {
                totalscoreofteam1 += currentscore;
            }
            if((overs1 * 6) == i) {
                overs1++;
            }
            ScoreBoard.addScoreBoard(totalscoreofteam1,totalscoreofteam2,noofwickets1,noofwickets2,innings,overs1,overs2);
        }

        previousscore = 0;
        innings++;

        System.out.println(m.t2 + " players =" + p.Player);
        for (int i = 0; overs2!=50; i++) {
            playertype=Utils.playerRole();
            currentscore = Utils.playBall(playertype);
            if (currentscore == 0) {
                System.out.println("player " + p.getEachPlayer(noofwickets2)+"("+Utils.playerRole()+")" + " got out from team  " + m.t2);
                System.out.println(p.getEachPlayer(noofwickets2) + " score is " + (totalscoreofteam2 - previousscore));
                previousscore = totalscoreofteam2;
                noofwickets2++;
                if (noofwickets2 == 11) {
                    System.out.println(m.t2 + " all out");
                    break;
                }
            } else {
                totalscoreofteam2 += currentscore;
                if (totalscoreofteam2 > totalscoreofteam1) {
                    System.out.println("\nMatch got over...");
                    ScoreBoard.addScoreBoard(totalscoreofteam1,totalscoreofteam2,noofwickets1,noofwickets2,innings,overs1,overs2);
                    ScoreBoard.displayScoreBoard(m);
                    System.out.println(m.t2 + "  won the match ");
                    break;
                }
            }
            if (i == (6 * overs2)) {
                overs2++;
            }
            ScoreBoard.addScoreBoard(totalscoreofteam1,totalscoreofteam2,noofwickets1,noofwickets2,innings,overs1,overs2);
        }

        if (totalscoreofteam2 == totalscoreofteam1) {
            System.out.println("\nMatch got over...");
            ScoreBoard.addScoreBoard(totalscoreofteam1,totalscoreofteam2,noofwickets1,noofwickets2,innings,overs1,overs2);
            ScoreBoard.displayScoreBoard(m);
            System.out.println("Match is tied");
        }
        if (totalscoreofteam2 < totalscoreofteam1) {
            System.out.println("\nMatch got over...");
            ScoreBoard.addScoreBoard(totalscoreofteam1,totalscoreofteam2,noofwickets1,noofwickets2,innings,overs1,overs2);
            ScoreBoard.displayScoreBoard(m);
            System.out.println(m.t1 + " won the match");
        }


    }


}









