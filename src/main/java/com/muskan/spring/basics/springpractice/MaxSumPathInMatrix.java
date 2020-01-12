package com.muskan.spring.basics.springpractice;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MaxSumPathInMatrix {

    public void calc(int a[][]){

        int row = a.length;
        int col = a[0].length;
        int max = 0;

        List<List<Integer>> listArrayList = new LinkedList<>();
        for (int i = 0; i < col; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(a[0][i]);
            listArrayList.add(tmp);
        }

        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {

                int tempCol=0;
                int currElmnt =a[i][j];
                if(j!=0 && j<col-1){
                    a[i][j]+= Math.max(Math.max(a[i-1][j-1],a[i-1][j]),a[i-1][j+1]);
                    tempCol = a[i-1][j-1]>a[i - 1][j]?j-1:j;
                    tempCol = a[i-1][tempCol]>a[i - 1][j+1]?tempCol:j+1;

                }
                else if(j==0) {
                    a[i][j] += Math.max(a[i - 1][j], a[i - 1][j + 1]);
                    tempCol = a[i-1][j]>a[i - 1][j + 1]?j:j+1;

                }
                else if(j==col-1){
                        a[i][j]+= Math.max(a[i-1][j-1],a[i-1][j]);
                    tempCol = a[i-1][j-1]>a[i-1][j]?j-1:j;

                }

                List<Integer> tList = new ArrayList<>(listArrayList.get(tempCol));
                if(tList.size()>i)
                    tList.set(i,currElmnt);
                else
                    tList.add(currElmnt);

                listArrayList.set(j,tList);

                listArrayList.stream().forEach(l->{
                    l.stream().forEach(e->{
                        System.out.print(e+",");
                    });
                    System.out.println();
                });

                max = Math.max(a[i][j],max);

            }
        }
        System.out.println("max "+max);

        listArrayList.stream().forEach(l->{
            l.stream().forEach(e->{
                System.out.print(e+",");
            });
            System.out.println();
        });
    }

}
