package com.muskan.spring.basics.springpractice.javabasics;

public class BeautifulNumber {
    static Integer[] sqr = new Integer[10];

    public static void main(String[] args) {
        int l = 1;
        int r = 3;
        for (int i = 0; i < 10; i++) {
            sqr[i] = i * i;
        }
        int beauty = findBeauty( l, r);
    }

    private static int findBeauty(int l, int r) {
        String sNum = null;int sum=0;int realSum=0;
        for(int i=l;i<=r;i++){
            int x =i;
            if(i<10){
                x = sqr[i];
            }
            sNum = Integer.toString(x);

            sum =findSquareSum(sNum);
            if(sum == 1){
                realSum += i;//Integer.parseInt(sNum);
                System.out.println(realSum);
            }
        }

        return realSum;
    }

    private static int findSquareSum(String sNum) {
        int sum =0;
        if(sNum.length()==1)
            return Integer.parseInt(sNum);
        for (int i = 0; i <sNum.length() ; i++) {

            sum += Integer.parseInt(Character. toString(sNum.charAt(i)))*
                    Integer.parseInt(Character. toString(sNum.charAt(i)));
        }
        return findSquareSum(Integer.toString(sum));
    }
}
