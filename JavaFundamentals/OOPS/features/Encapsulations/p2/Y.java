package com.JavaFundamentals.OOPS.features.Encapsulations.p2;

import com.JavaFundamentals.OOPS.features.Encapsulations.p1.A;

public class Y extends  A{
    public static void main(String[] args) {
        A a;
        a = new A();
        System.out.println("public variable :"+a.x);
        //System.out.println("private variable :"+a.y);   not access
        //System.out.println("protected variable :"+a.d);  not access with parent class
        Y y = new Y();
        System.out.println("protected variable :"+y.d);  //access with child class
    }
}

