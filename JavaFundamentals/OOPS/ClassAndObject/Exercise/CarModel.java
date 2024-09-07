package com.JavaFundamentals.OOPS.ClassAndObject.Exercise;


class CarModel{
    String color;
    String model;
    public CarModel(String color, String model){
        this.color = color;
        this.model = model;
    }
    public void displayDetails() {
        System.out.println("Model: " +model+" ,color: "+color);
    }

    public static void main(String[] args) {
        // Reference Variable 'myCar is stored on the stack
         CarModel myCar = new CarModel("Red", "Toyota");

         // object 'myCar' is stored in the heap
        //myCar contains  'color' and 'model' stored in heap.
         myCar.displayDetails();//method called, creates a stack frame
    }

}

