/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class Multiplier {
    private int num;
    
    public Multiplier(int num) {
        this.num = num;
    }
    
    public int multiply(int num) {
        int total = this.num * num;
        return total;
    }
}
