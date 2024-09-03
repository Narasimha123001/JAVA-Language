package com.JavaFundamentals.Day2CoditionalStatement.Task;

public class DayActivities {
    public static void main(String[] args) {
        byte day;
        day = 7;
        switch(day){
            case 1:
                System.out.println("Monday : GYM");
                break;
            case 2:
                System.out.println("Tuesday: YOGA");
                break;
            case 3:
                System.out.println("Wednesday: SWIMMING");
                break;
            case 4:
                System.out.println("Thursday: READING");
                break;
            case 5:
                System.out.println("Friday : MOVIES");
                break;
            case 6:
                System.out.println("Saturday : HIKING");
                break;
            case 7:
                System.out.println("Sunday : REST");
                break;
            default:
                System.out.println("INVALID");
        }

    }

}
