
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics stat = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        while (true) {
            System.out.println("Enter numbers:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }

            stat.addNumber(num);
            if (num % 2 == 0) {
                even.addNumber(num);
            } else {
                odd.addNumber(num);
            }

        }
        System.out.println("Sum: " + stat.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}
