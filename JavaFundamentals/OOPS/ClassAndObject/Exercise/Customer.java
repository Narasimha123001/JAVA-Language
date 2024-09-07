package com.JavaFundamentals.OOPS.ClassAndObject.Exercise;

public class Customer {

    int Id;  // instance Variable

    String CustomerName;

    String Gmail;

    String ContactNo;

    int Salary;

    public static void main(String[] args) {
        Customer customer = new Customer(); // 1 ref and 1 obj

        customer.Id=35;
        customer.CustomerName="Nara";
        customer.Gmail = "narasi@gmail.com";
        customer.ContactNo="+91-4765264845";
        customer.Salary = 35000;

        System.out.println("Id: " + customer.Id);
        System.out.println("Name: " + customer.CustomerName);
        System.out.println("Gmail: " + customer.Gmail);
        System.out.println("ContactNo: " + customer.ContactNo);
        System.out.println("Salary: " + customer.Salary);

        Customer customer1 = new Customer();  // 2 ref and 2 obj

        customer1.Id = 68;
        customer1.CustomerName="nfwa";
        customer1.ContactNo="+98756425";
        customer1.Salary=586478;
        customer1.Gmail="noasa@faf.com";

        System.out.println("Id: " + customer1.Id);
        System.out.println("Name: " + customer1.CustomerName);
        System.out.println("Gmail: " + customer1.Gmail);
        System.out.println("ContactNo: " + customer1.ContactNo);
        System.out.println("Salary: " + customer1.Salary);
        System.out.println(new Customer().CustomerName); // 3rd object
        Customer customer4; // 3rd reference


    }



}
