
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
public class TextUI {
    private Scanner scan;
    private SimpleDictionary list;
    
    
    public TextUI(Scanner scan, SimpleDictionary list) {
        this.scan = scan;
        this.list = list;
    }
    
    public void start() {
        while (true) {
        System.out.println("Command: ");
        String command = this.scan.nextLine();
        
        if (command.equals("end")) {
            System.out.println("Bye bye!");
            break;
        } 
        if (command.equals("add")) {
            System.out.println("Word:");
            String word = this.scan.nextLine();
            
            System.out.println("Translation:");
            String translation = this.scan.nextLine();
            this.list.add(word, translation);
        } else if (command.equals("search")) {
            System.out.println("To be translated:");
            String toBeTrans = this.scan.nextLine();
            if (this.list.translate(toBeTrans) == null) {
                System.out.println("Word " + toBeTrans + " was not found");
                continue;
            }
            System.out.println(this.list.translate(toBeTrans));
            
        } else {
            System.out.println("Uknown command");
        }
        }
    }
}
