package com.JavaFundamentals.OOPS.features.Encapsulations.File;

public class Person {

    private  String Name;
    private  byte age;

    public String getName(){
        return Name;
    }

    public  byte getAge(){
        return age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }


}
