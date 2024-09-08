package com.JAVAFUNDAMENTALS.java.OOPS.Methods;

public class Employee4 {
    String displayDetails(String Name,byte Age){
        return "the name of the employee is "+Name+" and his age is "+Age;
    }

    public static void main(String[] args) {
        Employee4 obj = new Employee4();
        String details =obj.displayDetails("Naveen",(byte) 22);  // assign the method to variable for representing
        System.out.println(details);
    }

}
