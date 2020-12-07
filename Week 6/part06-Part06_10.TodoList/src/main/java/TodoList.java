
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class TodoList {
    private ArrayList<String> todoItems = new ArrayList<>();
    
    public TodoList() {
        
    }
    
    public void add(String todo) {
        this.todoItems.add(todo);
    }
    
    public void print() {
        for (String item: todoItems) {
        if (todoItems.isEmpty()) {
            break;
        }
            System.out.println((todoItems.indexOf(item)+1) + ": " + item);
        }
    }
    
    public void remove(int number) {
        todoItems.remove(todoItems.get(number-1));
    }
}
