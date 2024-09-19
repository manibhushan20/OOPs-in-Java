class Book {
    private String title;
    private double price;

    // Constructor requiring book title
    public Book(String title) {
        this.title = title;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }
}

class Hardware extends Book {
    public Hardware(String title) {
        super(title);
        setPrice(250); // Set price for Hardware books
    }
}

class Software extends Book {
    public Software(String title) {
        super(title);
        setPrice(370); // Set price for Software books
    }
}

public class BookArray {
    public static void main(String[] args) {
        Book[] books = new Book[10];

        // Creating an array of 10 books, some Hardware and some Software
        books[0] = new Hardware("Hardware Book 1");
        books[1] = new Hardware("Hardware Book 2");
        books[2] = new Hardware("Hardware Book 3");
        books[3] = new Software("Software Book 1");
        books[4] = new Software("Software Book 2");
        books[5] = new Software("Software Book 3");
        books[6] = new Hardware("Hardware Book 4");
        books[7] = new Hardware("Hardware Book 5");
        books[8] = new Software("Software Book 4");
        books[9] = new Software("Software Book 5");

        // Displaying details about all 10 books
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book Title: " + books[i].getTitle());
            System.out.println("Book Price: " + books[i].getPrice());
            System.out.println();
        }
    }
}
