package problemsolving;
public class Library {
    
    int bookId1;
    String author1;
    String title1;
    double price1;
    int pages1;

    public void setBookDetails(int bookId, String author, String title, double price, int pages) {
        bookId1 = bookId;
        author1 = author;
        title1 = title;
        price1 = price;
        pages1= pages;
    }

    public void displayBookDetails() {
    	System.out.println("		library management");
        System.out.println("Book ID is              : " + bookId1);
        System.out.println("Author for the book is  : " + author1);
        System.out.println("Title of the book is    : " + title1);
        System.out.println("Price of the book is    : " + price1);
        System.out.println("The No.Pages are        : " + pages1);
    }
}
