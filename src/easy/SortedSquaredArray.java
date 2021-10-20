package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedSquaredArray {
    //Write a function that takes in a non-empty array of integers that are sorted in ascending order
    //and returns a new array of the same length with squares of the original integers also sorted in ascending order.
    public int[] sortedSquaredArray(int[] array) {
        List<Integer> squared = new ArrayList<>();
        int squaredList[] = new int[array.length];
        for (Integer integer : array) {
            squared.add(integer*integer);
        }
        for (int i = 0; i < squared.size(); i++) {
            squaredList[i] = squared.get(i);
        }
        Arrays.sort(squaredList);
        return squaredList;
    }
}
