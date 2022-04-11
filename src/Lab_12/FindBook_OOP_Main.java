package Lab_12;

import java.util.ArrayList;
import java.util.Scanner;

public class FindBook_OOP_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<BookModel> books = new ArrayList<>();
        BookController bookController = new BookController();

        while (true) {
            System.out.println("1. Input book");
            System.out.println("2. Find book by ISBN");
            System.out.println("3. Sort books by ISBN");
            System.out.println("4. Sort books by title ASC");
            System.out.println("5. Sort books by title ESC");
            System.out.println("0. Exit!");

            System.out.print("Enter option number: ");
            int optionNumber = scanner.nextInt();

            // break if option number is zero
            if (optionNumber == 0) break;

            switch (optionNumber){
                case 1:
                    scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter authorName: ");
                    String authorName = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    // create book object
                    BookModel book = new BookModel(ISBN, title, authorName, year);
                    // book.setAuthorName();

                    // add object into list books
                    books.add(book);
                    break;

                case 2:
                    BookModel result = new BookModel();

                    scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN2FindBook = scanner.nextLine();

                    for (BookModel bookItem : books) {
                        if (bookItem.getISBN().equals(ISBN2FindBook)) {
                            result = bookItem;
                            break;
                        }
                    }

                    if (result == null) {
                        System.out.println("Book not found");
                    } else {
                        System.out.println("Title of the book: " + result.getTitle());
                    }

//                    FindBook_OOP_DAO display = new FindBook_OOP_DAO();
//
//                    for(int indexBook = 0; indexBook < books.size(); indexBook++) {
//                        FindBook_OOP_DAO getBookAt = (FindBook_OOP_DAO) books.get(indexBook);
//                        const isbn)
//                    }
                    break;

                case 3:
                    bookController.printSortedBooksByISBN(books);
                    break;

                case 4:
                    bookController.printSortedBooks(books, SortingType.ASC);
                    break;
                case 5:
                    bookController.printSortedBooks(books, SortingType.ESC);
                    break;
            }
        }
    }
}
