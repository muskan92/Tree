package com.muskan.spring.basics.springpractice.javabasics;

import java.util.Arrays;

public class ValidSudoku {

    static Boolean isValidSudoku(int[][] matrix){
        int n = matrix.length;
        if(n==1)
            return true;

        int [] ar = new int [10];

        for(int r =0; r<n; r++){
            for(int c =0; c<n; c++){
                ar[matrix[r][c]] += 1;
                ar[matrix[c][r]] -= 1;
            }
        }
        for(int i=0; i<n; i++){
            if(ar[i+1] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [][] sudoku = new int [][]{
            {7, 9, 2, 1, 5, 4, 3, 8, 6},
            {6, 4, 3, 8, 2, 7, 1, 5, 9},
            {8, 5, 1, 3, 9, 6, 7, 2, 4},
            {2, 6, 5, 9, 7, 3, 8, 4, 1},
            {4, 8, 9, 5, 6, 1, 2, 7, 3},
            {3, 1, 7, 4, 8, 2, 9, 6, 5},
            {1, 3, 6, 7, 4, 8, 5, 9, 2},
            {9, 7, 4, 2, 1, 5, 6, 3, 8},
            {5, 2, 8, 6, 3, 9, 4, 1, 7}};

        System.out.println(isValidSudoku(sudoku));
    }
}
