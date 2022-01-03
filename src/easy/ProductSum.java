package easy;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {
    //Write a function that takes in a "special" array and returns its product sum.
    public static int productSum(List<Object> array) {
        return sumArray(array,1);
    }

    public static int sumArray(List<Object> array, int m){
        int sum = 0;
        for(Object obj: array){
            if(obj instanceof ArrayList){
                @SuppressWarnings("unchecked")
                ArrayList<Object> newArray = (ArrayList<Object>) obj;
                sum += sumArray(newArray,m+1);
            }else{
                sum = (int) obj + sum;
            }
        }
        return sum*m;
    }
}
