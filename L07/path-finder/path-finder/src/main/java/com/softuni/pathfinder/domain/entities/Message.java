package com.softuni.pathfinder.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="messages")
public class Message extends BaseEnity {

    @Column(name="date_time")
    private LocalDateTime dateTime; // time - Accepts Date and Time values

    @Column(columnDefinition = "TEXT", name = "text_content")
    private String textContent; // content - Accepts very long String values

    @ManyToOne
    private User author; // - Accepts User Entities as values


    @ManyToOne
    private User recipient; // - Accepts User Entities as values


    public Message() {
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Message setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public String getTextContent() {
        return textContent;
    }

    public Message setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Message setAuthor(User author) {
        this.author = author;
        return this;
    }

    public User getRecipient() {
        return recipient;
    }

    public Message setRecipient(User recipient) {
        this.recipient = recipient;
        return this;
    }
}
