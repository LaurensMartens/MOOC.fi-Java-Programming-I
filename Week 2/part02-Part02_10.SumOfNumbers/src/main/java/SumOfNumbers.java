
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            //If they enter 0, stop loop and print sum of the given numbers
            if (num == 0) {
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
            
            //Add user input to sum
            sum += num;
        }
    }
}
