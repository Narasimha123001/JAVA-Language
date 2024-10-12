package com.JavaFundamentals.collections.SET;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
                              // <> = generic collection is used for to store same type of object in the set
        hashSet.add("Sai");
        hashSet.add("ravi");
        hashSet.add("shiva");
        hashSet.add("Sai");
        System.out.println(hashSet.size());
        for (String str : hashSet){
            System.out.println(str);
        }
    }
}


        /*Hashset:its is used to store the objects in unOrder and doesn't allow the duplicates


         */