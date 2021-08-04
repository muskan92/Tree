package com.muskan.spring.basics.springpractice.javabasics;

public class SearchIn2DRowColWiseSortedMatrix {

    public static void main(String[] args) {
     int [][] matrix = new int[][]{{}};
        boolean f = searchMatrix(matrix,1);
        System.out.println(f);

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int maxRow = matrix.length;
        int maxCol = matrix[0].length;

        int r = 0; int col = maxCol-1;

        while(r < maxRow && col >= 0){
            if(matrix[r][col] == target)
                return true;
            if(matrix[r][col]>target)
                col--;
            else
                r++;
        }
        return false;
    }
}

