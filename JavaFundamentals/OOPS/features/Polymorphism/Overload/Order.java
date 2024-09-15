package com.JavaFundamentals.OOPS.features.Polymorphism.Overload;

public class Order {
    void order(int a , float b ){
        System.out.println("int "+ a +","+"float "+b);
    }
    void order(float a, int b){
        System.out.println("float "+a + ","+"int "+b);
    }

    public static void main(String[] args) {
        Order obj1 = new Order();
        obj1.order(5,43.5f);
        obj1.order(6.5f,22);
    }
}
/*
output:
    int 5,float 43.5
    float 6.5,int 22

 */