package pramp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*input:  arr1 = [1, 2, 3, 5, 6, 7], arr2 = [3, 6, 7, 8, 20]

output: [3, 6, 7] # since only these three values are both in arr1 and arr2

 */
public class FindDuplicates {

    static int[] findTheDuplicates(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        int index =0;
        int start1 =0;
        int start2 =0;
        while(start1 < arr1.length && start2 < arr2.length){
            if(arr1[start1] == arr2[start2]){
                res[index++] = arr1[start1];
                start1++;
                start2++;
                continue;
            }
            if(arr1[start1] < arr2[start2])
                start1++;
            else
                start2++;
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = findTheDuplicates(new int[]{1, 2, 3, 5, 6, 7} , new int[]{3, 6, 7, 8, 20});
        System.out.println(Arrays.toString(arr));

    }
}
