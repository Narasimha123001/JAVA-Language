package com.JavaFundamentals.Arrays.Exercise;


import com.JavaFundamentals.OOPS.Constructor.Exercise.CustomerDetails;

public class ArrayOfReference {
    public static void main(String[] args) {
        CustomerDetails[] customerDetail = new CustomerDetails[3];
        customerDetail[0] = new CustomerDetails();
        customerDetail[1]= new CustomerDetails(3333,"swebue",(byte)55,"yuyvc7asg@hava.coom","5992694");

    }
}
