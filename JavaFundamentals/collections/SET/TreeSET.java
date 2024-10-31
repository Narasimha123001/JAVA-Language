package com.JavaFundamentals.collections.SET;

import java.util.TreeSet;

public class TreeSET {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet();
        treeSet.add("nani");
        treeSet.add("shiva");
        treeSet.add("hari");
        treeSet.add("apple");
        treeSet.add("apple");

        for (String str : treeSet){
            System.out.println(str);
        }
    }
}

        /*
        TreeSet: its is order doesn't allow the duplicates and also Alphabetic Order
         */