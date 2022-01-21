package medium;

public class FirstDuplicateValue {
    //Given an array of integers between 1 and n, inclusive,
    //where n is the length of the array, write a function that returns the first integer
    //that appears more than once (when the array is read from left to right).
    public int firstDuplicateValue(int[] array) {
        if(array.length<2){
            return -1;
        }
        int currentDuplicateIndex = array.length;
        outer:
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]){
                    if(currentDuplicateIndex>j){
                        currentDuplicateIndex = j;
                    }
                }
            }
        }
        if(currentDuplicateIndex == array.length){
            return -1;
        }
        return array[currentDuplicateIndex];
    }
}
