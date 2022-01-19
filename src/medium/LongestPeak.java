package medium;

public class LongestPeak {
    //Write a function that takes in an array of integers and returns the length of the longest peak in the array.
    public static int longestPeak(int[] array) {
        int len = array.length;
        int peak = 0;
        int i = 1;
        while(i < len - 1){
            if(array[i]<=array[i+1] || array[i]<=array[i-1]){
                i++;
                continue;
            }
            int leftSide = i - 2;
            while(leftSide >= 0 && array[leftSide] < array[leftSide + 1]){
                leftSide--;
            }
            int rightSide = i + 2;
            while(array[rightSide - 1] > array[rightSide] && rightSide < len){
                rightSide++;
            }
            int currentPeak = rightSide - leftSide - 1;
            if(currentPeak > peak){
                peak = currentPeak;
            }
            i = rightSide;
        }
        return peak;
    }
}
