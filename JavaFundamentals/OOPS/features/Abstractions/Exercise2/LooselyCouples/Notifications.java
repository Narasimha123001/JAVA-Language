package com.JavaFundamentals.OOPS.features.Abstractions.Exercise2.LooselyCouples;

interface Notifications {
    void notifyUser();

    public static void main(String[] args) {
        Notifications notifications = new EmailNotification();
        notifications.notifyUser();
        notifications = new SMSNotifications();  //--> change
        notifications.notifyUser();
    }
}
        /*
        In the above example, changing the implementation from EmailNotification to
        SMSNotification does not require changes in the rest of the code
         */


// subclass
class EmailNotification implements Notifications{

    @Override
    public void notifyUser() {
        System.out.println("sending email notifications...");
    }
}

class SMSNotifications implements Notifications{

    @Override
    public void notifyUser() {
        System.out.println("sending sms notification...");
    }
}