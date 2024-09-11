package com.JavaFundamentals.StaticMembers;

        /*
        Static blocks are used to initialize static variables.they are
        executed when the class is loaded into memory
         */
public class StaticBlocks {
    //static variables
    static int x;
    static int y;

    //static block
    static {
        x = 10;
        y = 20;
    }

    public static void main(String[] args) {
        System.out.println("x: " + StaticBlocks.x);
        System.out.println("y: " + StaticBlocks.y);
    }

}
