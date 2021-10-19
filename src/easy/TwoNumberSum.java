package easy;

import java.util.ArrayList;
import java.util.List;

public class TwoNumberSum {

    //Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.

    public static int[] twoNumberSum(int[] array, int targetSum) {
        List<Integer> sums = new ArrayList<>();
        for(int i = 0; i<array.length; i++){
            for(int j = i+1; j<array.length; j++){
                if(i == j){
                    continue;
                }
                if(array[i] + array[j] == targetSum){
                    sums.add(array[i]);
                    sums.add(array[j]);
                }
            }
        }
        int[] newArray = new int[sums.size()];
        for(int i = 0; i < sums.size(); i++){
            newArray[i] = sums.get(i);
        }
        return newArray;
    }
}
