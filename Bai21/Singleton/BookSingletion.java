package Bai21.Singleton;

public class BookSingletion {
    private String author;
    private String title;
    private static BookSingletion book;
    private static boolean isLoanedOut;

    private BookSingletion() {
        author = "Gamma, Helm, Johnson, and Vlissides";
        title = "Design Patters";
        book = null;
        isLoanedOut = false;
    }

    public static BookSingletion borrowBook() {
        if (!isLoanedOut) {
            if (book == null) {
                book = new BookSingletion();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }

    public void returnBook(BookSingletion bookReturned) {
        isLoanedOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle() {
        return getTitle() + " by " + getAuthor();
    }
}
