package com.JavaFundamentals.OOPS.features.Encapsulations.File;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Narasimhan");
        person.setAge((byte) 21);

        System.out.println("Name: "+person.getName());
        System.out.println("Age: "+person.getAge());

    }
}
