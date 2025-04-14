package pramp;

import java.util.Arrays;
import java.util.HashSet;

public class TwoThreeFourSum {

    static int[] findPair(int[] arr , int tgt) {

        HashSet<Integer> set = new HashSet<>();
        int[] res = new int[2];
        int compliment = 0;
        for (int i : arr) {
            compliment = tgt - i;
            if (set.contains(compliment)) {
                res[0] = i;
                res[1] = compliment;
                return res;
            }
            set.add(i);
        }
        return res;
    }


    /*Input: arr = {12, 3, 4, 1, 6, 9}, sum = 24;
    Output: 12, 3, 9

    Input: arr = {1, 2, 3, 4, 5}, sum = 9
    Output: 5, 3, 1

    Input: arr = {2, 10, 12, 4, 8}, sum = 9
    Output: No Triplet

    Two pointer method works on sorted array only

     */

    static int[] findTriplet(int[] arr , int tgt) {

        int left = 0;
        int right = 0;
        int pair =0;
        int currTgt =0;
        int[] res = new int[3];
        for (int i=0; i<arr.length-2; i++){
            currTgt = tgt-arr[i];
            left = i+1;
            right = arr.length-1;
            while(left < right){
                pair = arr[left] + arr[right];
                if(pair == currTgt){
                    res[0] = arr[i];
                    res[1] = arr[left];
                    res[2] = arr[right];
                    return res;
                }else if (pair > currTgt){
                    right--;
                }else {
                    left++;
                }
            }

        }
        return res;
    }

    static int[] findQuadruplet(int[] arr , int tgt) {
        int[] res = new int[4];
        int currTgt =0;
        int left = 0;
        int right = 0;
        int pair =0;

        for(int i=0; i< arr.length-3 ; i++){

            for (int j=i+1 ; j<arr.length-2 ; j++){
                currTgt = tgt - (arr[i]+arr[j]);
                left = j+1;
                right = arr.length-1;
                while(left < right){
                    pair = arr[left] + arr[right];
                    if (pair > currTgt){
                        right--;
                    }else if(pair < currTgt) {
                        left++;
                    }else {
                        res[0] = arr[i];
                        res[1] = arr[j];
                        res[2] = arr[left];
                        res[3] = arr[right];
                        return res;
                    }
                }

            }

            }
        return res;
        }

    public static void main(String[] args) {

        //System.out.println(Arrays.toString(findPair(new int[]{2,7,4,0,9,5,1,3}, 6)));
        //System.out.println(Arrays.toString(findTriplet(new int[]{0,1,2,3,4,5,7,9}, 6)));
        System.out.println(Arrays.toString(findQuadruplet(new int[]{0,1,2,3,4,5,7,9}, 6)));
    }
}
