public class DefaultConstructorDemo {
    public static void main(String[] args) {
        Book book = new Book();
        book.displayInfo();
    }
}

class Book {
    private String title;
    private String author;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
    }

    public void displayInfo() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
} 