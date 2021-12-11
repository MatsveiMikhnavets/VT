package main.tasks12to15;

import java.util.Comparator;
//Comporator for Book names(Titles)
public class BookNComporator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
