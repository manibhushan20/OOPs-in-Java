class Book {
    protected String title;
    protected String author;
    protected int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}

class TechnicalBook extends Book {
    private String subject;

    public TechnicalBook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

class ProgrammingBook extends Book {
    private String language;

    public ProgrammingBook(String title, String author, int year, String language) {
        super(title, author, year);
        this.language = language;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Language: " + language);
    }
}

public class BookMain {
    public static void main(String[] args) {
        TechnicalBook technicalBook = new TechnicalBook("Operating System Concepts", "Abraham Silberschatz", 2018, "Operating System");
        ProgrammingBook programmingBook = new ProgrammingBook("Java: The Complete Reference", "Herbert Schildt", 2019, "Java");

        System.out.println("Technical Book Info:");
        technicalBook.displayInfo();

        System.out.println("\nProgramming Book Info:");
        programmingBook.displayInfo();
    }
}
