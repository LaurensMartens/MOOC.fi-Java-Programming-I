
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
public class Stack {
    private ArrayList<String> s;
    
    public Stack() {
        this.s = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String value) {
        this.s.add(value);
    }
    
    public ArrayList<String> values() {
        return s;
    }
    
    public String take() {
        String lastItem = this.s.get(this.s.size()-1);
        this.s.remove(this.s.size()-1);
        return lastItem;
    }
}
