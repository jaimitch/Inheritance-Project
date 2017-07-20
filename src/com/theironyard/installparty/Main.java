package com.theironyard.installparty;


import java.time.LocalDateTime;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        TextNotification firstText = new TextNotification(LocalDateTime.now(), "VZW FREE MSG", "Your current Verizon Wireless is bill is ready.  To pay your bill please visit www.verizonwireless.com.", "You", "Verizon Wireless");
        EmailNotification firstEmail = new EmailNotification(LocalDateTime.now(), "VZW FREE MSG", "Your current Verizon Wireless is bill is ready.  To pay your bill please visit www.verizonwireless.com.", "jaren_mitchell@yahoo.com", "Verizon Wireless");
        EmailNotification emailNotificationClone = firstEmail;

        firstEmail.transport();
        firstText.transport();
        emailNotificationClone.transport();



    }
}
