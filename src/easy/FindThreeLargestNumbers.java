package easy;

import java.util.Arrays;

public class FindThreeLargestNumbers {
    public static int[] findThreeLargestNumbers(int[] array) {
        //Write a function that takes in an array of at least three integers and,
        //without sorting the input array, returns a sorted array of the three
        //largest integers in the input array.
        int[] result = new int[3];
        int counter = 0;
        while(counter<3){
            int number = array[0];
            for(int i = 0 ; i < array.length; i++){
                if(array[i] >= number){
                    number = array[i];
                }
            }
            result[counter] = number;

            for(int i = 0 ; i < array.length; i++){
                if(array[i] == number && array[i]<0){
                    array[i] = array[i] * 100;
                    break;
                }
                if(array[i] == number && array[i]>0){
                    array[i] = array[i] * -100;
                    break;
                }

            }
            counter++;
        }
        Arrays.sort(result);
        return result;
    }
}
