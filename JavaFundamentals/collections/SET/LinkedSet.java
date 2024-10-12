package com.JavaFundamentals.collections.SET;

import java.util.LinkedHashSet;

public class LinkedSet {

    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("sai");
        linkedHashSet.add("shiva");
        linkedHashSet.add("ravi");
        linkedHashSet.add("sai");

        for(String str : linkedHashSet){
            System.out.println(str);
        }
        System.out.println(linkedHashSet.size());
    }
}


/*
linkedSet: linked set is orderSet and doesn't allow the duplicates
 */