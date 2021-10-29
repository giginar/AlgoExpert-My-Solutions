package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumWaitingTime {
    public int minimumWaitingTime(int[] queries) {

        Arrays.sort(queries);

        int totalForEach = 0;

        List<Integer> newArray = new ArrayList<>();
        newArray.add(totalForEach);

        for(Integer i:queries){
            totalForEach = i + totalForEach;
            newArray.add(totalForEach);
        }
        int lastIndex = newArray.size() - 1;
        newArray.remove(lastIndex);

        int minTime = 0;


        for(Integer i:newArray){
            minTime = i + minTime;
        }

        return minTime;
    }
}
