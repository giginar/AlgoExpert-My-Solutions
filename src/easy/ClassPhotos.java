package easy;

import java.util.ArrayList;
import java.util.Collections;

public class ClassPhotos {

    //You are given two input arrays: one containing the heights of all the students with red shirts
    //and another one containing the heights of akk the students with blue shirts.
    //These arrays will always have the same length and each height will be a positive integer.
    //Write a function that returns whether a class photo that follows the stated guidelines can be taken.

    public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights, Collections.reverseOrder());
        Collections.sort(blueShirtHeights, Collections.reverseOrder());
        boolean isTrue = false;
        int counterRed = 0;
        int counterBlue = 0;

        for (int i = 0; i<redShirtHeights.size(); i++){
            if(redShirtHeights.get(i)>blueShirtHeights.get(i)){
                counterRed ++;
                System.out.println("RED: " + counterRed);
            }
        }
        for (int i = 0; i<redShirtHeights.size(); i++){
            if(redShirtHeights.get(i)<blueShirtHeights.get(i)){
                counterBlue ++;
                System.out.println("BLUE: " + counterBlue);
            }
        }
        if(counterRed == redShirtHeights.size() || counterBlue == redShirtHeights.size()){
            isTrue = true;
        }
        return isTrue;
    }
}
