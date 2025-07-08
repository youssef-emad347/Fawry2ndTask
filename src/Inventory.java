import Services.MailService;
import Services.ShippingService;
import models.Book;
import models.EBook;
import models.PaperBook;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    static List<Book> st = new ArrayList<Book>();

    public static void add(Book b){
        st.add(b);
        System.out.println(b.getTitle()+" added ("+b.getISBN()+")");
    }
    public static void remove(Book b){
        st.remove(b);
        System.out.println(b.getTitle()+" removed ("+b.getISBN()+")");

    }
    public static void removeOutdated(){
        List<Book> outdated = new ArrayList<Book>();
        for (Book b:st){
            if (b instanceof PaperBook) {
                if (b.getYearOfpublished().isBefore(LocalDate.now().minusYears(10))) {
                    System.out.println(b.getTitle()+" is outdated");
                    outdated.add(b);
                }
            }
        }
        for (Book ob:outdated) {
            Inventory.remove(ob);
        }
    }
    public static Book getBook(String ISBN){
        for(Book b :st) {
            if (b.getISBN().equals(ISBN))
                return b;
        }
        return null;
    }
    public static void buy(String ISBN, int q,String email, String address){
        Book b = Inventory.getBook(ISBN);
        if(b == null) {
            System.out.println("there is no book with this ISBN");
            return;
        }

        if(b.isDemo()) {
            System.out.println("sorry it's a demo not for sale");
            return;
        }

        if (b instanceof PaperBook){
            PaperBook p = (PaperBook) b;
            if (p.getStock() == 0) {
                System.out.println("not available");
            } else if (p.getStock() < q) {
                System.out.println("the stock is " + p.getStock() + " we will get more soon");
                return;
            }
            else{
                ShippingService.send(p);
                p.setStock(p.getStock()-q);
            }
            System.out.println("the paid amount is "+b.getPrice()*q);
        }

        else if (b instanceof EBook){
            EBook e = (EBook) b;
            MailService.send(e);
            System.out.println("the paid amount is "+b.getPrice());
        }



    }
}
