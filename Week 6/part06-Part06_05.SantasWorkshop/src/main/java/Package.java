
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
public class Package {
    private ArrayList<Gift> list = new ArrayList<>();
    
    public void addGift(Gift gift) {
        this.list.add(gift);
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Gift item: list) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
}
