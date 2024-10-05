package com.JavaFundamentals.OOPS.features.Encapsulations.p1;

public class B {
    public static void main(String[] args) {
        A a;
        a = new A();
        System.out.println("public variable :"+a.x);
        //System.out.println("private variable :"+a.y);   not access
        System.out.println("protected variable :"+a.d);
    }
}
