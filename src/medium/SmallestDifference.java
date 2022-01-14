package medium;

public class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        //Write a function that takes in two non-empty arrays of integers, finds the pair of numbers (one from each array)
        //whose absolute difference is closest to zero, and returns an array containing these two numbers, with
        // the number from the first array in the first position.
        int[] intArr = new int[2];
        int minDifference = Math.abs(arrayOne[0] - arrayTwo[0]);
        for(int i = 0; i < arrayOne.length; i++){
            for(int j = 0; j < arrayTwo.length; j++){
                int tempDifference = Math.abs(arrayOne[i]-arrayTwo[j]);
                if(tempDifference<minDifference){
                    minDifference = tempDifference;
                    intArr[0] = arrayOne[i];
                    intArr[1] = arrayTwo[j];
                }
            }
        }
        return intArr;
    }
}
