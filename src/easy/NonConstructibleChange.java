package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NonConstructibleChange {

    //Given an array of positive integers representing the values of coins in your possession,
    // write a function that returns the minimum amount of change (the minimum sum of money)
    // that you can not create.

    public int nonConstructibleChange(int[] coins) {
        if (coins.length == 0) {
            return 1;
        }
        List<Integer> sortedCoins = new ArrayList<>();
        for (Integer integer : coins) {
            sortedCoins.add(integer);
        }
        Collections.sort(sortedCoins);
        int change = 0;
        for (int i = 0; i < sortedCoins.size(); i++) {
            if (sortedCoins.get(i)>change+1) {
                return change + 1;
            } else {
                change += sortedCoins.get(i);
            }
        }
        return change+1;
    }
}
