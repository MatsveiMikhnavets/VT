package main.tasks12to15;


public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    @Override
    public int compareTo(Book o) {
        return (isbn < o.isbn) ? -1 : ((isbn == o.isbn) ? 0 : 1);
    }


    /*public Book(String title, String author, int price) {
        this.edition = edition = 1;
        this.title = title;
        this.author = author;
        this.price = price;
    }*/

    public Book(String title, String author, int price, int isbn) {
        this.edition = edition = 1;
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o.getClass() != this.getClass()) return false;
        try {
            Book book = (Book) o;
            return book.author.equals(this.author) && book.price == this.price && book.title.equals(book.title) && book.isbn == this.isbn;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        char hash[] = (author + "" + title + "" + price + "" + edition + "" + isbn).toCharArray();
        long h = System.identityHashCode(this);
        int lower = Integer.MAX_VALUE;
        for (int i = 0; i < hash.length; i++) {
            h = (h + hash[i] * (i + h)) % lower;
        }
        return (int) h;
    }

    @Override
    public String toString() {
        return "Book:\nTitle: " + title + "\nAuthor : " + author + "\nPrice : " + price + "\nEdition : " + edition + "\nISBN : " + isbn;
    }


    @Override
    public Object clone() {
        Book ret = new Book(title, author, price, isbn);
        return ret;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public static int getEdition() {
        return edition;
    }

    public int getIsbn() {
        return isbn;
    }
}
