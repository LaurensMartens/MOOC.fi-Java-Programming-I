
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        
        
        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }
            lines.add(line);
        }
        System.out.println(lines.size());
    }
}
