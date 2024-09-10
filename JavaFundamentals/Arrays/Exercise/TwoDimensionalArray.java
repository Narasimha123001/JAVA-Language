package com.JavaFundamentals.Arrays.Exercise;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] twoD = {{1,0,2,3},{4,5,6,8}};

        for (int[] oneD : twoD){
            for( int value : oneD){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
