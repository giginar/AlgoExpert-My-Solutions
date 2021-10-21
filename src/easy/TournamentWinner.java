package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TournamentWinner {
    //Given an array of pairs representing the teams that have competed against each other and an array containing the results of each competition,
    //write a function that returns the winner of the tournament.
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        System.out.println(competitions.size());
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < competitions.size(); i++) {
            List<String> match = competitions.get(i);
            String winner = "";

            if(results.get(i) == 0) {
                winner = match.get(1);
                System.out.println("winner ==>> " + winner + " loser ==> " + match.get(0));
            }else {
                winner = match.get(0);
                System.out.println("winner ==>> " + winner + " loser ==> " + match.get(1));
            }
            if(map.containsKey(winner)) {
                map.put(winner, map.get(winner)+1);
            }else {
                map.put(winner, 0);
            }
        }

        int constant = 0;
        String nameWinner = "";

        for (String string : map.keySet()) {
            if(map.get(string)>constant) {
                constant = map.get(string);
            }
        }

        for (String string : map.keySet()) {
            if(map.get(string)==constant) {
                nameWinner = string;
            }
        }
        return nameWinner;
    }
}
