
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
    private Scanner scan;
    private TodoList todoList;
    
    public UserInterface(TodoList list, Scanner scannedItem) {
        this.scan = scannedItem;
        this.todoList = list;
    }
    
    public void start() {
        
        while(true) {
            System.out.println("Command: ");
            String scanText = scan.nextLine();
            if (scanText.equals("stop")) {
                break;
            }
            
            if (scanText.equals("add")) {
                System.out.println("To add:");
                todoList.add(scan.nextLine());
            }
            
            if (scanText.equals("remove")) {
                System.out.println("Which one is removed? ");
                todoList.remove(Integer.valueOf(scan.nextLine()));
            }
            
            if (scanText.equals("list")) {
            todoList.print();
            }
        }
        
    }
}
