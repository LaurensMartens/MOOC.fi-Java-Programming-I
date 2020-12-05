
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] username = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};
        
        System.out.println("Enter username:");
        String user = scanner.nextLine();
        
        System.out.println("Enter password:");
        String pass = scanner.nextLine();
        
        if (user.equals(username[0]) && pass.equals(password[0])) {
            System.out.println("You are successfully logged in!");
            return;
        } else if (user.equals(username[1]) && pass.equals(password[1])) {
            System.out.println("You are successfully logged in!");
            return;
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
    
}
