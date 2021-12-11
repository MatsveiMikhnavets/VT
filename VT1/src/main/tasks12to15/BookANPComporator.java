package main.tasks12to15;

import java.util.Comparator;
//Conmporator for Book Author after Names(Titles) after Price
public class BookANPComporator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int name = o1.getTitle().compareTo(o2.getTitle());
        int author = o1.getAuthor().compareTo(o2.getAuthor());
        int price = (o1.getPrice() < o2.getPrice()) ? -1 : ((o1.getPrice() == o2.getPrice()) ? 0 : 1);
        if (author == 0) {
            if (name == 0) {
                return price;
            } else {
                return name;
            }
        } else {
            return author;
        }
    }
}
