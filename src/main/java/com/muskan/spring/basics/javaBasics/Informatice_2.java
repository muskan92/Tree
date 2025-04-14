package javaBasics;


/**
 * informativca 2nd round
 *
 * Q) The cost of a stock on each day is given in an array, find the max profit that you can make by buying and selling in those days. For example, if the given array is
 * {100, 180, 260, 310, 40, 535, 695}, find the max profit
 *
 * Reliance
 * Arr[] = {100, 180, 260, 310, 40, 535, 695}
 * maxProfit : 695 - 40 = 655
 *
 * {100, 150, 200, 300, 40, 90, 30}
 *  1,   2,....
 *  150-100 =50
 */
public class Informatice_2 {

    public static void main(String[] args) {
        int [] ar = new int [] {100, 150, 200, 300, 40, 90, 30};
        int profit = getMaxProfit(ar);
        System.out.println(profit);
    }

    private static int getMaxProfit(int [] ar) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int day =0;
         int sum=0;
        for(int i=1; i<ar.length; i++){

//            if(ar[i]>max){
//                max= ar[i];
//                day = i;
//            }
//            if(i<=day && ar[i]<min){
//                min= ar[i];
//            }

            if(ar[i]>ar[i-1]){
                sum += ar[i]-ar[i-1];
            }

        }
//        sum += max-min;
//        max =0;
//        min =0;

        return sum;
    }

}

