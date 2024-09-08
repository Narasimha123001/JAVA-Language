package com.JavaFundamentals.Arrays.Exercise;

public class ArrayTest {
    public static void main(String[] args) {
        //Arrays are objects in java
        // 1.Arrays declaration
        int[] ids; // no array is created here
        //2.Arrays Instantiation (create an object)
        ids = new int[5];
        System.out.println(ids[2]);

        //3.initialize
        ids[0] = 111;
        ids[1] = 222;
        ids[2] = 333;
        ids[3] = 444;
        ids[4] = 555;
        System.out.println(ids[3]);
        //4.accessing
        for (int i = 0 ; i < ids.length;i++){
            System.out.print(ids[i]);
        }

        //shortcut way to create array
        byte[] marks = {25,65,89,21,41,56,33};
        System.out.println(marks.length);

        //4.Accessing the array
        for(int index =0; index < marks.length; index++ ){
            System.out.print(marks[index] + " ");
        }

        System.out.println();

        // shortcut to accessing ,  print only
        // for-each
        // for each id in ids
        for( int id : ids){
            System.out.println(id);
        }
        // for any array  manuplication use normal method only
        for ( int i= 0; i < marks.length; i++){
            marks[i] += 5;
        }

        System.out.println("After update the marks");
        for(byte mark : marks ){
            System.out.print(mark + " ");
        }

    }
}
