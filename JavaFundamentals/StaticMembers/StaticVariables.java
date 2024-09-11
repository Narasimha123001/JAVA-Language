package com.JavaFundamentals.StaticMembers;
/*
   Static Variables are  shared among all instance of  class . they are initialize at starting of the program and only one time.
 */
public class StaticVariables {

    static int Number1;
    int instanceNumber2;

    public StaticVariables(){
        Number1++;
        instanceNumber2++;
    }

    public static void main(String[] args) {
        StaticVariables obj1 = new StaticVariables();
        StaticVariables obj2 = new StaticVariables();

        System.out.println(StaticVariables.Number1);
        System.out.println(obj1.instanceNumber2);
        System.out.println(obj2.instanceNumber2);;
    }

}
