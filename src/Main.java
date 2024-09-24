import Domain.Book;
import Service.Service;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("SGK", "NQT", 12.000, 10);
        Service service = new Service();
        service.addBookToCart(book);
    }
}