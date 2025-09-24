package LibrarySystem;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("Java Programming", "James Gosling");

        Library lib1 = new Library("Central Library");
        Library lib2 = new Library("City Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);

        lib1.showBooks();
        lib2.showBooks();
    }
}
