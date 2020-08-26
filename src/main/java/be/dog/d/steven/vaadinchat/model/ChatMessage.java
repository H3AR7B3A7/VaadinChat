package be.dog.d.steven.vaadinchat.model;

import java.time.LocalDateTime;

public class ChatMessage {
    private String from;
    private LocalDateTime time;
    private String message;

    public ChatMessage(String from, String message) {
        this.from = from;
        this.message = message;
        this.time = LocalDateTime.now();
    }

    public String getFrom() {
        return from;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }
}
