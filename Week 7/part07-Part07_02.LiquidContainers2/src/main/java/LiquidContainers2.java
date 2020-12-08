
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container(), second = new Container();

        while (true) {
            System.out.print("First: " + first.toString() + "\n");
            System.out.print("Second: " + second.toString() + "\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            }

            if (command.equals("move")) {
                if (amount < 0) {
                    continue;
                }
                if (amount > first.contains()) {
                    second.add(first.contains());
                    first.remove(amount);
                } else {
                    second.add(amount);
                    first.remove(amount);
                }

            }

            if (command.equals("remove")) {
                second.remove(amount);
            }

        }
    }

}