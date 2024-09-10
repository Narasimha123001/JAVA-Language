package com.JavaFundamentals.Arrays.Task;

public class AdditionOfTwoMatrix {
    //define
    int[][] mat1 = {{4,5,8},{7,9,6}};
    int[][] mat2 = {{4,5,8},{7,9,6}};
    //method to add two matrix
    public int[][] additionOfMatrix(int[][] matrix1, int[][] matrix2){
        int row =matrix1.length;
        int col = matrix1[0].length;
        int[][] result =new int[row][col];

        for(int i = 0 ; i < row; i++){
            for(int j = 0 ; j< col; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    //method to print

    public void print(int[][] matrix){
        for(int[] row : matrix){
            for(int value : row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        AdditionOfTwoMatrix addition = new AdditionOfTwoMatrix();

        int[][] Result= addition.additionOfMatrix(addition.mat1, addition.mat2);

        System.out.println("Resultant Matrix:");
        addition.print(Result);
    }
}
