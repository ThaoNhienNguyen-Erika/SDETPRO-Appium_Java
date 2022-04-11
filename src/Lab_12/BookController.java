package Lab_12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookController {

    public void printSortedBooksByISBN(ArrayList<BookModel> books) {

        ArrayList<BookModel> booksClone = (ArrayList<BookModel>)books.clone();
        booksClone.sort(new Comparator<BookModel>() {
            @Override
            public int compare(BookModel o1, BookModel o2) {
                return o1.getISBN().compareTo(o2.getISBN());
            }
        });

        // display list books
        for (BookModel book: booksClone) {
            System.out.println(book.toString());
        }
    }

    public void printSortedBooks(ArrayList<BookModel> books, SortingType sortingType) {
        ArrayList<BookModel> booksClone = (ArrayList<BookModel>)books.clone();
        if (sortingType == SortingType.ASC) {
            Collections.sort(booksClone, Collections.reverseOrder());
        }

        if (sortingType == SortingType.ESC){
            Collections.sort(booksClone);
        }

        // display list books
        for (BookModel book: booksClone) {
            System.out.println(book.toString());
        }
    }
}
