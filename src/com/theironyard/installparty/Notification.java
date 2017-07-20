package com.theironyard.installparty;

import java.time.LocalDateTime;


public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;


    public Notification(LocalDateTime createdAt, String subject, String body) {
        this.createdAt = LocalDateTime.now();
        this.subject = subject;
        this.body = body;
        this.status = "All Done";
    }

    public String getBody() {
        return body;
    }

    public String getSubject() {

        return subject;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getStatus() {
        return status;
    }

    public void transport() {
        throw new NoTransportException();
    }

    protected String status() {
        return "Some Text";
    }

}
