package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    //Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> result = new ArrayList<>();
        int sum = 0;
        outer:
        for(int i = 0 ; i < array.length ; i ++){
            int left = i+1;
            int right = array.length-1;
            while(left<right){
                Integer[] sums = new Integer[3];
                sum = array[i] + array[left] + array[right];
                if(sum == targetSum){
                    sums[0] = array[i];
                    sums[1] = array[left];
                    sums[2] = array[right];
                    result.add(sums);
                    right--;
                    left++;
                }else if(sum>targetSum){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return result;
    }
}
