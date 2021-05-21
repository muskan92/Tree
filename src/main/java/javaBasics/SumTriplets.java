package javaBasics;

import java.util.*;

/**
 * 1->2->3->4->5->2
 *
 * x,y
 *
 * x->1, 2, 3, 4,
 * y->2, 4, 2, 4,
 *
 *
 *          10
 *        6    15
 *      7  5  16  14
 *
 *      queue : [10,6,15,7,5,16,14]
 *
 *      1- [10]
 *      2- 10 [6,15]
 *      3 - 6 [15,7,5]
 *      4-  15 [7,5,16,14]
 *      5 - 7 [5,16,14]
 *      6 - 5 [16,14]
 *      7- 16 [14]
 *      8 - 14
 *
 *
 *      class A
 *
 *    class B extends A   class C extends A
 *
 *    class D extends A,B
 *
 *
 *    String s = "abc;
 *    String s1 = "abc";
 *
 *
 *   s==s1
    true;
 */


public class SumTriplets {

    public static void main(String[] args) {

        int[] ar = {1,2,3,4};
        int x = 7;
        List<Integer> list = getTriplets(ar,x);
        System.out.println(list);
    }

    private static List<Integer> getTriplets(int[] ar,int x) {
    List<Integer> triplets = new ArrayList<>();
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = i+1; j <ar.length-1 ; j++) {

                if(ar[i]+ar[j]+ar[j+1]  == x){
                    triplets.add(ar[i]);
                    triplets.add(ar[j]);
                    triplets.add(ar[j+1]);
                    break;
                }
            }

        }

        Map<Integer,String> m = new HashMap<>();
        Set<Map.Entry<Integer, String>> entries = m.entrySet();

        entries.stream().forEach(i-> {
            System.out.println(i.getKey()+" , "+i.getValue());
        });
        return triplets;
    }

}
