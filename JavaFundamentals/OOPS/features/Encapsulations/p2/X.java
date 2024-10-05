package com.JavaFundamentals.OOPS.features.Encapsulations.p2;

import com.JavaFundamentals.OOPS.features.Encapsulations.p1.A;

public class X {
    public static void main(String[] args) {
        A a;
        a = new A();
        System.out.println("public variable :"+a.x);
        //System.out.println("private variable :"+a.y);    not access
        //System.out.println("protected variable :"+a.d);   not access
    }
}