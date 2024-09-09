package com.JavaFundamentals.Arrays.Exercise;

public class ArrayTest {
    public static void main(String[] args) {

        //arrays declaration
        int[] ids = new int[5];
        System.out.println(ids[3]);  //-> here just array was created not the elements

        ids[0] = 111;
        ids[1] = 222;
        ids[2] = 333;
        ids[3] = 444;
        ids[4] = 555;

        for(int index = 0 ; index< ids.length; index++ ){
            System.out.print(ids[index]+" ");
        }
        System.out.println(" ");

        //shortcut to creating an array
        byte[] ages = {10, 20, 30, 40, 50};
        for (byte age : ages){
            System.out.print(age+" ");
        }
        System.out.println(" ");

        //for update  or modifying the array we use normal for loop
        for (int index = 0; index < ages.length; index++){
            ages[index] += 10;
        }

        System.out.println("After updateing the array ");
        for (byte age : ages){
            System.out.print(age+" ");
        }
    }
}
