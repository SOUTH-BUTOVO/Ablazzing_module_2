package org.javaacademy.homework3.feedback;

import java.time.LocalDateTime;

public class Feedback {
    private int id;
    private String text;
    private int count;
    private LocalDateTime dateTime;

    public Feedback(int id, String text, int count, LocalDateTime dateTime) {
        this.id = id;
        this.text = text;
        this.count = count;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getCount() {
        return count;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Feedback{" + "id=" + id + ", text='" + text + '\'' +
                ", count=" + count + ", dateTime=" + dateTime + '}';
    }
}
