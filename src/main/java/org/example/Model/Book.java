package org.example.Model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Book {

    private int book_id;
    private Integer user_id;
    @NotEmpty(message = "У книги должно быть название!")
    private String name;
    @NotEmpty(message = "У книги должен быть автор!")

    private String author;
    @Min(value = 1, message = "У книги должен быть год издания!")
    private int year;

    public Book(){

    }

    public Book(int book_id, Integer user_id, String name, String author, int year) {
        this.book_id = book_id;
        this.user_id = user_id;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
