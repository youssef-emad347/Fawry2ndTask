package models;

import java.time.LocalDate;

public class EBook extends Book{
    String fileType;
    boolean canSend;

    public EBook(String ISBN, String title, LocalDate yearOfpublished, float price, String fileType, boolean canSend) {
        super(ISBN, title, yearOfpublished, price);
        this.fileType = fileType;
        this.canSend = canSend;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public boolean isCanSend() {
        return canSend;
    }

    public void setCanSend(boolean canSend) {
        this.canSend = canSend;
    }
}
