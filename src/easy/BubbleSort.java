package easy;

public class BubbleSort {
    //Write a function that takes in an array of integers and returns a sorted version of that array.
    //Use the Bobble Sort algorithm to sort the array.
    public static int[] bubbleSort(int[] array) {
        int len = array.length;
        for(int i = 0; i<len;i++){
            for(int j = 0; j<len-1;j++){
                if(array[j+1]<array[j]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
