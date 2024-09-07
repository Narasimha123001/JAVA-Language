package com.JavaFundamentals.OOPS.ClassAndObject.Exercise;

public class DefaultValues {

    int id ;
    float salary;
    byte age;
    String name;
    Character Gender;
    boolean Fresher;
    public static void main(String[] args) {

        DefaultValues Obj1 = new DefaultValues();


        DefaultValues Obj2 = Obj1;


        System.out.println("Integer :" + Obj2.id);
        System.out.println("String :" + Obj2.name);
        System.out.println("byte :" + Obj2.age);
        System.out.println("Chara: " + Obj2.Gender);
        System.out.println("Boolean: " + Obj2.Fresher);
        System.out.println("Float: " + Obj2.salary);
    }
}
                /*
                    output:
                    Integer :0
                    String :null
                    byte :0.
                    Chara: null
                    Boolean: false
                    Float: 0.0
                 */
