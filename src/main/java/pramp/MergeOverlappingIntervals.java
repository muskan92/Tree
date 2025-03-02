package pramp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
    Input: arr[] = [[1, 3], [2, 4], [6, 8], [9, 10]]
Output: [[1, 4], [6, 8], [9, 10]]

Input: arr[] = [[7, 8], [1, 5], [2, 4], [4, 6]]
Output: [[1, 6], [7, 8]]
 */

public class MergeOverlappingIntervals {

    static List<int[]> mergeOverlap(int[][] arr) {

        Arrays.sort(arr, (a,b)-> Integer.compare(a[0],b[0]));

        List<int[]> res = new ArrayList<>();
        res.add(new int[] {arr[0][0],arr[0][1]});

        for (int i=1; i< arr.length; i++){

            int[] lastMerged = res.get(res.size()-1);
            int[] curr = arr[i];

            if(curr[0] < lastMerged[1]){
                lastMerged[1] = Math.max(curr[1],lastMerged[1]);
            }
            else
                res.add(new int[]{curr[0],curr[1]});
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{7, 8}, {1, 5}, {2, 4}, {4, 6}};
        List<int[]> res = mergeOverlap(arr);

        for (int[] interval : res) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }

}
