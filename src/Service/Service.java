package Service;

import Domain.Book;

public class Service {
    public void addBookToCart(Book book) {
        System.out.println("Sach da duoc them vao gio hang");
    }

    public void payOrder() {
        System.out.println("Thanh toan thanh cong!");
    }

    public void sendMail(){
        System.out.println("Mail da gui thanh cong!");
    }
}
