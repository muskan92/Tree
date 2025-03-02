package neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllTriplets {

    public static List<List<Integer>> findTriplets(int[] nums) {

        Arrays.sort(nums);
//-4,-1,-1,0,1,2
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        int tgt = 0;
        int currTgt = 0;
        int l = 0;
        int r = 0;
        for(int i=0; i<n-2; i++){
            List<Integer> trplt = new ArrayList<>();
            l = i+1;
            r = n-1;
            currTgt = tgt-nums[i];
            while(l<r){
                if(nums[l]+nums[r] > currTgt)
                    r--;
                else if(nums[l]+nums[r] < currTgt)
                    l++;
                else{
                    trplt.add(nums[i]);
                    trplt.add(nums[l]);
                    trplt.add(nums[r]);
                    res.add(trplt);
                    break;
                }
            }

        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(findTriplets(new int [] {-4,-1,-1,0,1,2}).toString());
    }
}
