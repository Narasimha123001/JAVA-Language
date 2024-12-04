package com.JavaFundamentals.collections.Task.ArrayListOperations;

import java.util.Objects;

public class Fruit {
    private int fruitCode;
    private String fruitName;

    public Fruit() {

    }

    public Fruit(int fruitCode, String fruitName) {
        this.fruitCode = fruitCode;
        this.fruitName = fruitName;
    }

    public int getFruitCode() {
        return fruitCode;
    }

    public void setFruitCode(int fruitCode) {
        this.fruitCode = fruitCode;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitCode=" + fruitCode +
                ", fruitName='" + fruitName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return fruitCode == fruit.fruitCode && Objects.equals(fruitName, fruit.fruitName);
    }



    @Override
    public int hashCode() {
        return Objects.hash(fruitCode, fruitName);
    }


}
