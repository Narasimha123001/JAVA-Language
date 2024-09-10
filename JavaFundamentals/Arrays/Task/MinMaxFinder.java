package com.JavaFundamentals.Arrays.Task;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] array = {15,3,-8,25,100,125,45,3};

        int min = array[0];
        int max = array[0];

        for (int index = 1 ; index < array.length; index++ ){
            if (array[index] < min){
                min = array[index];
            }
            if(array[index] > max){
                max = array[index];
            }
        }


        System.out.println("min:" + min);
        System.out.println("max:" + max);
    }
}
