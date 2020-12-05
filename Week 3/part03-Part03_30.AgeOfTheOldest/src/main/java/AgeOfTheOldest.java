
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            
            String[] pieces = text.split(",");
            for (String piece: pieces) {
                if (Integer.valueOf(pieces[1]) > oldestAge) {
                    oldestAge = Integer.valueOf(pieces[1]);
                }
            }
            System.out.println("Age of the oldest: " + oldestAge);
        }

    }
}
