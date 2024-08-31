package com.JavaFundamentals.Day1WorkingWithPrimitives.Exercise;

public class Keywords {
    public static void main(String[] args) {
        int age;
        age = 25; // value=25

        String job;
        job = "Java Developer";

        long Salary; //here ,first i gave variable name as "package" its show error "Compile error as we have given keyword as a variable name"
        //thus why , change its "Salary"
        Salary = 50_00_000;

        System.out.println(age+" "+job+" his salary "+Salary);

    }

}
