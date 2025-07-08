import models.Book;
import models.EBook;
import models.PaperBook;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book b1 = new PaperBook("1111111","firstbook", LocalDate.of(2020,2,22),22,10,true);
        Book b2 = new PaperBook("1112222","2ndbook", LocalDate.of(1990,3,24),110,10,true);
        Book b3 = new EBook("1333333","e1book", LocalDate.of(2001,4,12),14,"pdf",true);
        Book b4 = new Book("000000","demobook", LocalDate.of(2005,10,20),200);
        b4.setDemo(true);

        Inventory.add(b1);
        Inventory.add(b2);
        Inventory.add(b3);
        Inventory.add(b4);
        System.out.println("---------------------");
        Inventory.remove(b2);
        Inventory.add(b2);
        Inventory.removeOutdated();
        System.out.println("---------------------");
        Inventory.buy("1111111",12,"yy@gmail.com","first street at giza");
        Inventory.buy("1112222",2,"yy@gmail.com","first street at giza");
        Inventory.buy("1333333",5,"yy@gmail.com","first street at giza");
        Inventory.buy("000000",1,"yy@gmail.com","first street at giza");




    }
}