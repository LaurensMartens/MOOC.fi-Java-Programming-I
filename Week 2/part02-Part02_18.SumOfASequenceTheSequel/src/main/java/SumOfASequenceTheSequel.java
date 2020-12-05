
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number?");
        int num = Integer.valueOf(scanner.next());

        int sum = 0;
        for (int i = first; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
