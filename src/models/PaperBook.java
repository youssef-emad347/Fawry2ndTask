package models;

import java.time.LocalDate;

public class PaperBook extends Book{
    int stock;
    boolean isShippable;

    public PaperBook(String ISBN, String title, LocalDate yearOfpublished, float price, int stock, boolean isShippable) {
        super(ISBN, title, yearOfpublished, price);
        this.stock = stock;
        this.isShippable = isShippable;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isShippable() {
        return isShippable;
    }

    public void setShippable(boolean shippable) {
        isShippable = shippable;
    }
}

