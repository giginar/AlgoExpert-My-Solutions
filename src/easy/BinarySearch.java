package easy;

public class BinarySearch {
    //Write a function that takes in a sorted array of integers as well as a target integer.
    //The function should use the binary search algorithm to determine if the target integer is contained in tha array
    //and should return its index if it is, otherwise -1.
    public static int binarySearch(int[] array, int target) {
        int begin = 0;
        int end = array.length - 1;
        int result = -1;
        int middle = 0;
        while(begin<=end){
            middle = (begin + end)/2;
            if(array[middle] < target){
                begin = middle + 1;
            }else if(array[middle]>target){
                end = middle - 1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}
