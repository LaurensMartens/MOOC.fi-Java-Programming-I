
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points pointList = new Points();
        UserInterface ui = new UserInterface(scanner, pointList);
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        ui.start();
    }
}
