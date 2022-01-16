package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        //Write a function that takes in an array of integers and returns a boolean representing whether the array is monotonic.
        //An array is said to be monotonic if its elements, from left to right, are entirely non-increasing or entirely non-decreasing.
        boolean isTrue = false;
        List<Integer> differences = new ArrayList<>();
        int counter = 0;
        Arrays.sort(array);
        for(int i = 0; i < array.length-1; i++){
            int diff = array[i+1] - array[i];
            differences.add(diff);
            for(Integer diffs : differences){
                if(diffs>=0){
                    counter++;
                }
            }
        }
        if(counter == differences.size()){
            isTrue=false;
        }else{
            isTrue = true;
        }
        return isTrue;
    }
}
