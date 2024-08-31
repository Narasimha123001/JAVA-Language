package com.JavaFundamentals.Day1WorkingWithPrimitives.Exercise;

public class EmployeeInfo {
    public static void main(String[] args) {
        /*
        Working with primitives
         */
        byte age;
        age = 21;
        System.out.println("Age: "+age);

        short salary;
        salary = 32767;
        System.out.println("OrderValue: "+salary);

        int annualSalary;
        annualSalary = 393204568;
        System.out.println("AnnualSalary: "+annualSalary);

        long totalSaving;
        totalSaving = 8965479268976579L;
        System.out.println("TotalSaving: "+totalSaving);

        float avgSalary;
        avgSalary = 658956.254F;
        System.out.println("AvgSalary: "+avgSalary);

        double avgAnnualIncome;
        avgAnnualIncome = 5896452.245848;
        System.out.println("AvgAnnualIncome: "+avgAnnualIncome);

        char gender;
        gender = 'M';
        System.out.println("Gender: "+gender);

        boolean isEligible;
        isEligible = true;
        System.out.println("Eligible: " +isEligible);

    }
}


/*
output:
Age: 21
OrderValue: 32767
AnnualSalary: 393204568
TotalSaving: 8965479268976579
AvgSalary: 658956.25
AvgAnnualIncome: 5896452.245848
Gender: M
Eligible: true
 */