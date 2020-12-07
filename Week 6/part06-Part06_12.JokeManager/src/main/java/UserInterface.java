
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gebruiker
 */
public class UserInterface {

    private JokeManager jokeManagerInstance;
    private Scanner scannerInstance;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManagerInstance = jokeManager;
        this.scannerInstance = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scannerInstance.nextLine();

            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {

                System.out.println("Write the joke to be added: ");
                String joke = scannerInstance.nextLine();
                jokeManagerInstance.addJoke(joke);

            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                String drawnJoke = jokeManagerInstance.drawJoke();
                System.out.println(drawnJoke);
            } else if (command.equals("3")) {
                jokeManagerInstance.printJokes();
            }

        }
    }
}
