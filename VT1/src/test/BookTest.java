package test;

import main.tasks12to15.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class BookTest {
    private ArrayList<Book> list;

    @Before
    public void initList() {
        Book book1 = new Book("Eugeni Onegin", "Pushkin", 29, 12961);
        Book book2 = new Book("Little prince", "de Saint-Exupery", 42, 12071);
        Book book3 = new Book("Taras Bulba", "Gogol", 31, 23402);
        Book book4 = new Book("War and Peace", "Lev Tolstoy", 12, 19054);
        Book book5 = new Book("Crime and Punishment ", "Fyodor Dostoevsky", 22, 11754);
        Book book6 = new Book("Heart of a Dog", "Michael Bulgakov", 22, 12354);
        Book book7 = new Book("Anna Karenina", "Lev Tolstoy", 21, 19055);
        Book book8 = new Book("Revision", "Gogol", 29, 23403);
        list = new ArrayList<>(Arrays.asList(book1, book2, book3, book4, book5, book6, book7, book8));
    }

    @Test
    public void equalsTest() {
        System.out.println("\nTest for 12 task");
        System.out.println("\nEqualsTest");

        Book book1 = new Book("", "", 1, 0);
        Book book2 = new Book("Eugeni Onegin", "Pushkin", 29, 12961);
        Book book3 = new Book("Eugeni Onegin", "Pushkin", 29, 12961);
        System.out.println(book1.equals(book1) + "\n" + book1.equals(book2) + "\n" + book2.equals(book3));
    }

    @Test
    public void hashCodeTest() {
        System.out.println("\nTest for 12 task");
        System.out.println("\nHashCodeTest");
        Book book1 = new Book("", "", 1, 0);
        Book book2 = new Book("Eugeni Onegin", "Pushkin", 29, 12961);
        Book book3 = new Book("Eugeni Onegin", "Pushkin", 29, 12961);
        Book book4 = new Book("Little prince", "de Saint-Exupery", 42, 12071);
        Book book5 = new Book("Taras Bulba", "Gogol", 31, 23402);
        System.out.println(book1.hashCode() + " \n" + book2.hashCode() + " \n" + book3.hashCode() + "\n " + book4.hashCode() + "\n " + book5.hashCode());
    }

    @Test
    public void toStringTest() {
        System.out.println("\nTest for 12 task");
        System.out.println("\nToStringTest");
        Book book = new Book("Eugeni Onegin", "Pushkin", 29, 12961);
        System.out.println(book.toString());
    }

    @Test
    public void cloneTest() {
        System.out.println("\nTest for 12 task");
        System.out.println("\nCloneTest");
        Book book1 = new Book("Eugeni Onegin", "Pushkin", 29, 12961);
        Book book2 = new Book("Little prince", "de Saint-Exupery", 42, 12071);
        Book clonebook = (Book) book1.clone();
        Book linkbook = book1;
        System.out.println("original " + book1.hashCode() + "\n clone " + clonebook.hashCode() + "\n linkbook " + linkbook.hashCode());
    }

    @Test
    public void iSBNComporatorTest() {
        System.out.println("\nTest for 14 task");
        System.out.println("\nDefaultComporatorTest");
        TreeSet<Book> tree = new TreeSet<>();
        tree.addAll(list);
        for (Book b : tree) {
            System.out.println(b.toString());
        }
    }

    @Test
    public void nameComporatorTest() {
        System.out.println("\nTest for 15 task");
        System.out.println("\nNameComporatorTest");
        TreeSet<Book> tree = new TreeSet<>(new BookNComporator());
        tree.addAll(list);
        for (Book b : tree) {
            System.out.println(b.toString());
        }
    }

    @Test
    public void nameAuthorComporatorTest() {
        System.out.println("\nTest for 15 task");
        System.out.println("\nNameAuthorComporatorTest");
        TreeSet<Book> tree = new TreeSet<>(new BookNAComporator());
        tree.addAll(list);
        for (Book b : tree) {
            System.out.println(b.toString());
        }
    }

    @Test
    public void authorNameComporatorTest() {
        System.out.println("\nTest for 15 task");
        System.out.println("\nAuthorNameComporatorTest");
        TreeSet<Book> tree = new TreeSet<>(new BookANComporator());
        tree.addAll(list);
        for (Book b : tree) {
            System.out.println(b.toString());
        }
    }

    @Test
    public void authorNamePriceComporatorTest() {
        System.out.println("\nTest for 15 task");
        System.out.println("\nAuthorNamePriceComporatorTest");
        TreeSet<Book> tree = new TreeSet<>(new BookANPComporator());
        tree.addAll(list);
        for (Book b : tree) {
            System.out.println(b.toString());
        }
    }
}