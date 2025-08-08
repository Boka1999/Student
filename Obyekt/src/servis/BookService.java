package servis;
import model.Book;

public class BookService {
    public Book create (String title, String auntor, int pages, int price, boolean isAvailable, boolean isEbook, double rating) {
       Book book = new Book();
        book.setTitle(title);
        book.setAuntor(auntor);
        book.setPages(pages);
        book.setPrice(price);
        book.setAvailable(isAvailable);
        book.setEbook(isEbook);
        book.setRating(rating);
        return book;
    }
     }

