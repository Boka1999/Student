package servis;

import model.Book;

public class Book1 {
    public static void main(String[] args) {
        BookService book = new BookService();
        Book b1 = book.create("The catcher in the", "J.D Salinger", 277, 130, true, true, 4.8);
        Book b2 = book.create("To Kill a Mockingbird", "Harper Lee", 324, 180, true, false, 4.9);
        Book b3 = book.create("1984", "George Orwell", 328, 200, true, true, 6.8);
        Book b4 = book.create("Pride and Prejudice", "Jane Austen", 279, 190, true, true, 4.3);
        Book b5 = book.create("The Great Gatsby", "F. Scott Fitzgerald", 180, 135, false, false, 5.8);
         b1.printInfo();
         b2.printInfo();
         b3.printInfo();
         b4.printInfo();
         b5.printInfo();


    }
}
