package com.example.news2.models;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Table(name = "comment_name")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private String name;

    @Column
    private String subject;

    @Column
    private int release;

    public Comment() { }

    public void setBookid() {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public int getRelease() {
        return release;
    }

}
