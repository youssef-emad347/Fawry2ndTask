package models;

import java.time.LocalDate;

public class Book {
    String ISBN;
    String title;
    LocalDate yearOfpublished;
    float price;
    boolean isDemo;


    public Book(String ISBN, String title, LocalDate yearOfpublished, float price) {
        this.ISBN = ISBN;
        this.title = title;
        this.yearOfpublished = yearOfpublished;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getYearOfpublished() {
        return yearOfpublished;
    }

    public void setYearOfpublished(LocalDate yearOfpublished) {
        this.yearOfpublished = yearOfpublished;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isDemo() {
        return isDemo;
    }

    public void setDemo(boolean demo) {
        isDemo = demo;
    }
}
