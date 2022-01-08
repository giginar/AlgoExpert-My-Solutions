package easy;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        for(int i = 0 ; i<array.length; i++){
            int minIndex = i;
            for(int j = i + 1 ; j <array.length; j++ ){
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        return array;
    }
}
