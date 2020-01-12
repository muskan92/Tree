package com.muskan.spring.basics.springpractice;

public class TicketWindow {

    int a[] = {7,4,1,3,2,5};
    int target = 3;
    int len=a.length;

    public int calc(int a[],int index){
        int t = 0;

        for(int i=0;i<len;i++) {

                if (a[i] > a[index]) {
                    t = t + a[index];
                } else
                    t = t + a[i];
            if (i == index)
                a[index]--;

//            if (i > index) {
//                if (a[i] > a[index] - 1) {
//                    t = t + a[index] - 1;
//                } else
//                    t = t + a[i];
//            }
        }

        System.out.println("calculated t is : " +t);
        return t;
    }
}
