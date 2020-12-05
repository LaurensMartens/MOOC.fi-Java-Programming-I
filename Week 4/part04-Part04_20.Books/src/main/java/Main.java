
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();
            if (bookTitle.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(bookTitle, pages, pubYear));
        }
        System.out.println("What information will be printed?");
        String text = scanner.nextLine();
        for (Book piece : books) {
            if (text.equals("everything")) {
                System.out.println(piece.toString());
            } else if (text.equals("name")) {
                System.out.println(piece.getName());
            }
        }
    }
}
