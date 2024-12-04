package com.JavaFundamentals.collections.Task.ArrayListOperations;

import java.util.ArrayList;
import java.util.List;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit(1, "Apple");
        Fruit fruit2 = new Fruit(2, "Banana");
        Fruit fruit3 = new Fruit(3, "Grape");
        Fruit fruit4 = new Fruit(4, "Pineapple");
        Fruit fruit5 = new Fruit(5, "Orange");


        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(fruit1);
        fruitList.add(fruit2);
        fruitList.add(fruit3);
        fruitList.add(fruit4);
        fruitList.add(fruit5);
        System.out.println(fruitList);
        System.out.println("Fruits Size:"+fruitList.size());

        //modify
        fruitList.add(2,new Fruit(3,"JackFruit"));
        fruitList.remove(4);


        //Iterate
        for(Fruit fruits:fruitList){
            System.out.println(fruits);
        }
        System.out.println("Fruits Size After update :"+fruitList.size());

        //Checks
        if (fruitList.contains(fruit1)){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }

    }
}
