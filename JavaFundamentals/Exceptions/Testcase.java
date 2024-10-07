package com.JavaFundamentals.Exceptions;

public class Testcase {
    public static void main(String[] args) {

        String username = null;
        String password = "Narasimhan13#";

        boolean isValid = false;
        try {
            isValid = isValid(username, password);
            if (isValid)
                System.out.println("user valid");
            else
                System.out.println("username or password is wrong");
        }catch (NullPointerException e){
            System.out.println("username or password is null");
        }catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
     }

    private static boolean isValid(String username, String password) throws NullPointerException , IllegalAccessException{
        boolean isValid = false;

            if(username.equalsIgnoreCase("99220041435") && password.equals("Narasimhan123#")){
                isValid = true;
            }
            else
                throw new IllegalAccessException ("wrong password or username");
        return isValid;
    }
}
