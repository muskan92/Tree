package com.muskan.spring.basics.springpractice;

public class SegmentTreeSum {

    int mid =0;
    public void createSegTree(int ar[],int start, int end, int curr, int sgArr[]){

        mid = (int) Math.floor((start+end)/2);

        if(start == end){
            sgArr[curr] = ar[start];
            return;
        }

        createSegTree(ar, start, (int) mid, 2*curr+1, sgArr);
        createSegTree(ar, (int) mid+1, end, 2*curr+2, sgArr);

        sgArr[curr] = sgArr[2*curr+1] + sgArr[2*curr+2];

        return;

    }

    public int sumOfRange(int sr, int er, int sga[], int s, int e, int curr){

        int mid = (s+e)/2;
        if(sr == s && er == e){
            return sga[curr];
        }
        else if((s<sr && e<sr) || (s>er && e>er))
            return 0;
        else if(sr<=s && er>= e){
            return sga[curr];
        }

        int l = sumOfRange(sr, er, sga, s, mid, 2*curr+1);
        int r = sumOfRange(sr, er, sga, mid+1, e, 2*curr+2);

        return l+r;
    }
}
