package com.JavaFundamentals.OOPS.features.Encapsulations.p1;

public class A {

    public int x = 100;
    private  int y = 20;
    protected int d = 16;
    public static void main(String[] args) {
        A a;
        a = new A();
        System.out.println("public variable :"+a.x);
        System.out.println("private variable :"+a.y);
        System.out.println("protected variable :"+a.d);

    }
}
