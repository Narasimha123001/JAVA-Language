package com.JavaFundamentals.OOPS.features.Encapsulations.AccessModifier;

public class Person {
    private  String Name;

     int age;

    protected String address;

    public String gmail;

    public String getName(){
        return Name;
    }

    public void setName(String name) {
        this.Name=Name;
    }
}
/*
Private: only accessible within the Person class
Default: accessible within myPackage
Protected: accessible within myPackage and subclasses
public: accessible from anywhere
 */