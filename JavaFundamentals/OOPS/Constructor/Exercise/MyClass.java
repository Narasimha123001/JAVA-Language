//constructor overriding
package com.JavaFundamentals.OOPS.Constructor.Exercise;

public class MyClass {
    int x;
    String y;

    public MyClass(){                //no args constructor
        int x = 0;
        String y = "Default";
    }
    public MyClass(int x){           // arg construction with one parameter
        this.x = x;
        this.y = "Default";
    }
    public MyClass(int x, String y){  // arg construction with two parameter
        this.x= x;
        this.y =y;
    }

    void display(){
        System.out.println("X: "+x);
        System.out.println("Y: "+y);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(10);
        MyClass obj3 = new MyClass(10,"hi");


        obj1.display();
        obj2.display();
        obj3.display();
    }

}
