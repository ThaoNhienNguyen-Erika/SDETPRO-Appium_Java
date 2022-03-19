package Lab_07;

import com.sun.istack.internal.FinalArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FindBook_OOP_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<FindBook_OOP_DAO> books = new ArrayList<>();

        while (true) {
            System.out.println("1. Input book");
            System.out.println("2. Find book by ISBN");
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
                    FindBook_OOP_DAO book = new FindBook_OOP_DAO(ISBN, title, authorName, year);
                    // book.setAuthorName();

                    // add object into list books
                    books.add(book);
                    break;
                case 2:
                    FindBook_OOP_DAO result = new FindBook_OOP_DAO();

                    scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN2FindBook = scanner.nextLine();

                    for (FindBook_OOP_DAO bookItem : books) {
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

            }
        }
    }
}
