
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int first = Integer.valueOf(scanner.next());
        int second = Integer.valueOf(scanner.next());
        
        int number = first + second;
        double squareRoot = Math.sqrt(number);
        
        System.out.println(squareRoot);
    }
}
