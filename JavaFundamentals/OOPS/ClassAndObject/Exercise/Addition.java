package com.JavaFundamentals.OOPS.ClassAndObject.Exercise;

public class Addition {
    int a ,b,c;
    public  void add(int x,int y){
        a=x;
        b=y;
        c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Addition obj1 = new Addition();
        obj1.add(5,6);
    }
}
