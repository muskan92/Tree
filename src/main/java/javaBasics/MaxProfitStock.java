package javaBasics;

/**
 * numenhealth 2nd round
 */
public class MaxProfitStock {

    public static void main(String[] args) {
        int [] stocks = new int[]{100, 180, 260, 310, 695, 535, 40};

        int profit = getMaxProgit(stocks);
        System.out.println(profit);
    }

    private static int getMaxProgit(int[] stocks) {

        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        int index =0;

        for (int i = 0; i < stocks.length; i++) {
            if(stocks[i]>max) {
                max = stocks[i];
                index = i;
            }
            if(i<=index && stocks[i]<min ) {
                min = stocks[i];
            }

        }
        return max-min;
    }
}
