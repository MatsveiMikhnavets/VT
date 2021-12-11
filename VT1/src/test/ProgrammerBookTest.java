package test;

import main.tasks12to15.ProgrammerBook;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ProgrammerBookTest {


    @Test
    public void equalsTest() {
        System.out.println("\nTest for 13 task");
        System.out.println("\nEqualsTest");
        ProgrammerBook book1 = new ProgrammerBook("Java Philosophy","Bruce Eckel ",41,71019,"Java",0);
        ProgrammerBook book2 = new ProgrammerBook("Java Philosophy","Bruce Eckel ",41,71019,"Java",0);
        ProgrammerBook book3 = new ProgrammerBook("Functional programming in JavaScript","Atencio Luis",56,73091,"JavaScirpt",2);
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
    }

    @Test
    public void hashCodeTest() {
        System.out.println("\nTest for 13 task");
        System.out.println("\nHashCodeTest");
        ProgrammerBook book1 = new ProgrammerBook("Java Philosophy","Bruce Eckel ",41,71019,"Java",0);
        ProgrammerBook book2 = new ProgrammerBook("Java Philosophy","Bruce Eckel ",41,71019,"Java",0);
        ProgrammerBook book3 = new ProgrammerBook("Functional programming in JavaScript","Atencio Luis",56,73091,"JavaScirpt",2);
        ProgrammerBook book4 = book1;
        System.out.println(book1.hashCode() + " \n" + book2.hashCode() + " \n" + book3.hashCode()+" \n"+book4.hashCode());
    }

    @Test
    public void toStringTest() {
        System.out.println("\nTest for 13 task");
        System.out.println("\nToStringTest");
        ProgrammerBook book1 = new ProgrammerBook("Java Philosophy","Bruce Eckel ",41,71019,"Java",0);
        System.out.println(book1.toString());
    }
}