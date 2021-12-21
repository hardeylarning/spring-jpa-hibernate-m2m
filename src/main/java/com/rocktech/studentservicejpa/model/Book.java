package com.rocktech.studentservicejpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String bookName;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book() {
    }

    public Book(Long id, String bookName, Student student) {
        this.id = id;
        this.bookName = bookName;
        this.student = student;
    }

    public Book(Long id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
