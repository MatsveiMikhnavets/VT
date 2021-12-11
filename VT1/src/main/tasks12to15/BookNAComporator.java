package main.tasks12to15;

import java.util.Comparator;

//Comporator for Book names(Titles) and after Author
public class BookNAComporator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int name = o1.getTitle().compareTo(o2.getTitle());
        int author = o1.getAuthor().compareTo(o2.getAuthor());
        if(name==0){
            return author;
        }else{
            return name;
        }
    }
}
