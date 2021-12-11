package main.tasks12to15;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o.getClass() != this.getClass()) return false;
        try {
            ProgrammerBook book = (ProgrammerBook) o;
            return super.equals((Book) o) && book.level == this.level && language.equals(book.language);
        } catch (Exception e) {
            return false;
        }
    }


    @Override
    public int hashCode() {
        char hash[] = (language + "" + level).toCharArray();
        long h = super.hashCode();
        int lower = Integer.MAX_VALUE;
        for (int i = 0; i < hash.length; i++) {
            h = (h + hash[i] * (i + h)) % lower;
        }
        return (int) h;

    }

    @Override
    public String toString() {
        return "Programmer" + super.toString() + "\nLanguage : " + language + "\nLevel : " + level;
    }
}
