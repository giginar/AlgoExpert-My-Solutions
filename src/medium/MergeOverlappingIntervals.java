package medium;

import java.util.ArrayList;
import java.util.List;

public class MergeOverlappingIntervals {
    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        List<int[]> results = new ArrayList<>();
        for(int i = 0; i < intervals.length-1; i++){
            for(int j = i+1; j < intervals.length; j++){
                if(overlapControl(intervals[i],intervals[j]) != null){
                    intervals[i] = (overlapControl(intervals[i],intervals[j]));
                }else{
                    results.add(intervals[i]);
                    break;
                }
            }
        }
        int[][] returning = new int[results.size()][];
        for(int i = 0; i < results.size(); i++){
            returning[i] = results.get(i);
        }
        return returning;
    }

    public static int[] overlapControl(int[] interval1, int[] interval2){
        int[] newOne = new int[2];
        if(interval1[1] >= interval2[0]){
            newOne[0] = interval1[0];
            newOne[1] = interval2[1];
            return newOne;
        }else{
            return null;
        }
    }
}
