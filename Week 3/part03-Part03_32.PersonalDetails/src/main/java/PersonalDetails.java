
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        int sum = 0;
        int total = 0;
        String lengthyName = "";
        
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            
            String[] pieces = text.split(",");
            if (pieces[0].length() > length) {
                length = pieces[0].length();
                lengthyName = pieces[0];
            }
            sum += Integer.valueOf(pieces[1]);
            total++;
        }
        System.out.println("Longest name: " + lengthyName);
        System.out.println("Average of the birth years: " + average(sum, total));
    }
    public static double average (int sum, int num) {
        double average = (double) sum / num;
        return average;
    }
}
