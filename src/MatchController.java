import model.Team;

import java.util.Scanner;



class MatchController {


    String t1 ;
    String t2 ;

    public void setupTeams(){


        Scanner in = new Scanner(System.in);

        System.out.println("Enter the team1..");
        t1 = in.nextLine();
        System.out.println("You choose "+t1);
        System.out.println("Enter opponent team..");
        t2 = in.nextLine();
        System.out.println("You choose opponent as "+t2);
        System.out.println("Now Match is going to start between "+t1+" and "+t2);


    }
}

