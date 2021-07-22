package com.Casthegrinni.todolist.models.dtos;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue
    private UUID id;

    @Column
    private String title;

    @Column
    private Date date;

    @Column
    private String description;

    // Constructor
    public Task(String title, Date date, String description) {
        this.id = UUID.randomUUID(); // Criado depois, de forma aleatória
        this.title = title;
        this.date = date;
        this.description = description;
    }

    // Getter and Setter
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }

    public Task() {
    }

}
