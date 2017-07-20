package com.theironyard.installparty;

import java.time.LocalDateTime;

public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(LocalDateTime createdAt, String subject, String body, String recipient, String smsProvider) {
        super(createdAt, subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() {
        System.out.println(getRecipient());
        System.out.println(getSmsProvider());
        System.out.println(super.getBody());
        System.out.println(super.getCreatedAt());
        System.out.println(super.getSubject());
        System.out.println(super.getStatus());
    }
}


