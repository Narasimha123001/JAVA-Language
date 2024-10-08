package com.JavaFundamentals.Exceptions;

public class Testcase {
    public static void main(String[] args) {

        String username = "Narasimhan";
        String password = "Narasimha@114433";

        boolean isValid = false;
        try {

            if (isValid(username,password))
                System.out.println("valid user");
        }catch (NullPointerException | InvalidUserException e){
            System.out.println(e.getMessage());
        }
    }

    private static boolean isValid(String username, String password) throws NullPointerException,InvalidUserException {
        boolean isValid = false;
            if (username.equalsIgnoreCase("Narasimhan") && password.equals("Narasimha@114433") )
                isValid = true;
            else
                throw new InvalidUserException("wrong username or password");
        return isValid;
    }
}
