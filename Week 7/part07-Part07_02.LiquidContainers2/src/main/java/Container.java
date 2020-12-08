/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class Container {
    private int amount;

    public Container() {

    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        if (amount + this.amount > 100) {
            this.amount = 100;
        } else {
            this.amount += amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        if (amount > this.amount) {
            this.amount = 0;
        } else {
            this.amount -= amount;
        }
    }
    
    public String toString() {
        return this.contains() + "/100";
    }
}
