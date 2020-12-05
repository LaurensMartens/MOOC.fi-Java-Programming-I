
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        

        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            
            items.add(new Item(text));
        }
        for (Item piece: items) {
            System.out.println(piece.toString());
        }
        
    }
}
