package com.JavaFundamentals.OOPS.features.Exercise.HasAFunction;

public class Address {
    String city;

    String state;
    String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
class Employee{
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address; // Has a relationship
    }

    void display(){
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("bza","ap","India");
        Address address2 = new Address("hyd","ts","India");
        Employee emp = new Employee(101,"narasimha",address1);
        Employee emp1 = new Employee(102,"shiva",address2);
        emp.display();
        emp1.display();
    }
}
