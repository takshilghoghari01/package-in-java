package mypack;

class Book {
    String bookname;
    String author;

    Book() {
        bookname = "herry portor";
        author = "herbet";
    }

    void show() {
        System.out.println("Book name is " + bookname + "\n and author name is " + author);
    }
}

public class demopackage {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.show();
    }
}
