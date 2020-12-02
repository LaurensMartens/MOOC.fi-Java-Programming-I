
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = Integer.valueOf(scan.nextLine());
        
        if (num >= 1) {
            System.out.println("is positive");
        } else {
            System.out.println("is not positive");
        }
    }
}
