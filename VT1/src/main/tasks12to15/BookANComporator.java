package main.tasks12to15;

import java.util.Comparator;
//Conmporator for Book Author after Names(Titles)
public class BookANComporator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int name = o1.getTitle().compareTo(o2.getTitle());
        int author = o1.getAuthor().compareTo(o2.getAuthor());
        if (author == 0) {
            return name;
        } else {
            return author;
        }
    }
}
