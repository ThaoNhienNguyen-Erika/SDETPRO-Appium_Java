package Lab_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookList_Main {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int optionInput;
        String ISBN;
        String title;
        String authorName;
        int year;
        String ISBNinput;
        boolean isContinuing = true;
        while(isContinuing){
            System.out.println("===MENU===");
            System.out.println("1. Input book");
            System.out.println("2. Find book by ISBN");
            System.out.println("0. Exit!");
            System.out.println("===MENU===");
            System.out.print("Input option: ");
            optionInput = scanner.nextInt();
            scanner.nextLine();

            switch(optionInput){
                case 1:
                    System.out.print("Input ISBN: ");
                    ISBN = scanner.nextLine();
                    System.out.print("Input title: ");
                    title = scanner.nextLine();
                    System.out.print("Input authorName: ");
                    authorName = scanner.nextLine();
                    System.out.print("Input year: ");
                    year = scanner.nextInt();

                    Book newBook = new Book(ISBN, title, authorName, year);
                    bookList.add(newBook);
                    System.out.println(bookList.toString());
                    break;
                case 2:
                    System.out.print("Input ISBN need to find: ");
                    ISBNinput = scanner.nextLine();
                    for (int index = 0; index < bookList.size(); index++) {
                        if(ISBNinput.equals(bookList.get(index).getISBN())){
                            System.out.println(bookList.get(index).toString());
                            break;
                        }
                        if(index == bookList.size()-1 && !ISBNinput.equals(bookList.get(index).getISBN()))
                            System.out.println("Cannot find any matching book.");
                        }
                    break;
                case 0:
                    isContinuing = false;
                    break;
            }
        }
    }
}
