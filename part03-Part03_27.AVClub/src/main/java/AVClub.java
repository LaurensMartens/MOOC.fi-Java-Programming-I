
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            
            String[] av = text.split(" ");
            for (String piece: av) {
                if (piece.contains("av")) {
                    System.out.println(piece);
                }
            }
        }

    }
}
