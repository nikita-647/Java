package learn.collectionFramework;

class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book[title=" + title + "]";
    }
}

public class ArrayDeque {
    public static void main(String[] args) {
        java.util.ArrayDeque<Book> booklist = new java.util.ArrayDeque<>();

        booklist.offerLast(new Book("Book 1")); // Add at the front of the deque
        booklist.offerLast(new Book("Book 2"));
        booklist.offerLast(new Book("Book 3"));
        booklist.offerLast(new Book("Book 4"));

        System.out.println(booklist);

    }
}
