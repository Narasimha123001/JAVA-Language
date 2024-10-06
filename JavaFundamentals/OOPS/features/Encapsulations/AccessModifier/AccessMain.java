package com.JavaFundamentals.OOPS.features.Encapsulations.AccessModifier;

public class AccessMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Narasimhan");

        person.address="dfbiseufvbakj";
        person.gmail="dwuf@chuebg.254";
        System.out.println("Name: "+person.getName());
        System.out.println("Age: "+person.age);
        System.out.println("Address: "+person.address);
        System.out.println("Gmail: "+person.gmail);

    }
}
