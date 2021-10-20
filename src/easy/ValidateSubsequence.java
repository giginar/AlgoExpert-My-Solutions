package easy;

import java.util.List;

public class ValidateSubsequence {
    //Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence of the first one.
    public static boolean isValidSubsequenceSolution1(List<Integer> array, List<Integer> sequence) {
        if(sequence.size()>array.size()){
            return false;
        }
        int counter = 0;
        for(int i : sequence){
            for(int j : array){
                if(i==j){
                    counter++;
                }
            }
        }
        if(counter == sequence.size()){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isValidSubsequenceSolution2(List<Integer> array, List<Integer> sequence) {
        if (sequence.size() > array.size()) {
            return false;
        }
        int counter = 0;
        for (int i = 0; i < array.size(); i++) {
            inner:
            for (int j = 0; j < sequence.size(); j++) {
                if(array.get(i)==sequence.get(j) && i>=j) {
                    counter++;
                    break inner;
                }
            }
        }

        if (counter >= sequence.size()) {
            return true;
        } else {
            return false;
        }
    }
}
