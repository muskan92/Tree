package com.muskan.spring.basics.practice24;

//Sort 0,1,2
public class CountZOT {



    public static void main(String[] args) {
        int ar[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort012(ar,ar.length);
        printSortedAr(ar);

    }

    private static void printSortedAr(int[] ar) {
        for (int i=0; i<ar.length; i++){
            System.out.println(ar[i]);
        }
    }

    private static void sort012(int[] ar, int length) {

        int low = 0;
        int mid = 0;
        int high = length-1;

        while(high>=mid){

            if(ar[mid] == 0){
                swap(mid,low,ar);
                mid++;
                low++;
            }
            else if(ar[mid] == 1){
                mid++;
            }
            else {
                swap(mid,high,ar);
                high--;
            }

        }
    }

    private static void swap(int a, int b, int[] ar) {

        int x = 0;
        x = ar[a];
        ar[a] = ar[b];
        ar[b] = x;

    }
}

