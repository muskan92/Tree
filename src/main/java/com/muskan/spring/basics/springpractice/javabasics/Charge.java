package com.muskan.spring.basics.springpractice.javabasics;

public class Charge {

    public static void main(String[] args) {
        int c=5;

        int rate = getRate(c);
    }

    private static int getRate(int c) {

        int rate =0;
        if(c>=0 && c<=10)
            rate = 10;
        else if (c>=11 && c<=230)
            rate = 9;
        else if (c>=231 && c<=559)
            rate = 8;
        else if (c>=560 && c<=1009)
            rate = 2;
        else if (c>=1010 && c<=5000)
            rate = 7;
        else if (c>=5001 && c<=10000)
            rate = 8;
        else if (c>=10001)
            rate = 3;
        return rate;
    }
}
