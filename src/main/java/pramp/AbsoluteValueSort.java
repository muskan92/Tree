package pramp;

import java.util.Arrays;

public class AbsoluteValueSort {

    static int[] absSort(int[] arr) {
        //Integer[] ar = new Integer[arr.length];

        Integer[] ar = Arrays.stream( arr ).boxed().toArray( Integer[]::new );
        //System.out.println(Arrays.toString(ar));

        Arrays.sort(ar, (a,b)-> Integer.compare(Math.abs(a),Math.abs(b)));
        //System.out.println(Arrays.toString(ar));

        int[] intArray = Arrays.stream(ar).mapToInt(Integer::intValue).toArray();


        return intArray;


    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(absSort(new int[]{2,-7,-2,-2,0})));

    }
}
