package com.JavaFundamentals.OOPS.features.Encapsulations;
//Accessing a class from another package using the import statement.
import com.JavaFundamentals.OOPS.features.Encapsulations.utilities.MathUtil;

public class Main {
    public static void main(String[] args) {

        int sum = MathUtil.add(5,6);
        System.out.println("Sum :"+sum);
    }
}
//utilities main plz checks its