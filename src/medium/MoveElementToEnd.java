package medium;

import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd {
    //You are given an array of integers and an integer. Write a function
    //that moves all instances of that integer in the array to the end of the array and returns the array.
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        //List<Integer> notEqualLocations = new ArrayList<>();
        int length1 = array.size();
        List<Integer> returningList = new ArrayList<>();
        for(int i = 0; i < array.size(); i++){
            if(array.get(i) != toMove){
                returningList.add(array.get(i));
            }
        }
        int length2 = returningList.size();
        for(int i = length2; i < array.size(); i++){
            returningList.add(toMove);
        }
        return returningList;
    }
}
