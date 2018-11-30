package model;

import java.util.*;

public class Team {

    String name;

    public ArrayList<String> Player = new ArrayList<String>();

    public void addNamesInTeam() {
        // ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        Player.add("p1");//Adding object in arraylist
        Player.add("p2");
        Player.add("p3");
        Player.add("p4");
        Player.add("p5");
        Player.add("p6");
        Player.add("p7");
        Player.add("p8");
        Player.add("p9");
        Player.add("p10");
        Player.add("p11");


    }

    public String getEachPlayer(int noofwickets) {
        return Player.get(noofwickets);
    }
}


