
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
public class Suitcase {

    private ArrayList<Item> list = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item part : list) {
            totalWeight += part.getWeight();
        }

        return totalWeight;
    }

    public void addItem(Item item) {

        if ((totalWeight() + item.getWeight()) > maxWeight) {
            return;
        }

        this.list.add(item);
    }
    
    public void printItems() {
        for (Item part: list) {
            System.out.println(part.getName() + " (" + part.getWeight() + " kg)");
        }
    }
    
    public Item heaviestItem() {
        if (list.isEmpty()) {
            return null;
        }
        
        int index = 0;
        int weight = 0;
        for (Item part: list) {
            if (list.indexOf(part) == 0) {
                weight = part.getWeight();
                index++;
            } else if (part.getWeight() > weight) {
                weight = part.getWeight();
                index++;
            }
        }
        
        return list.get(index - 1);
    }
    
    @Override
    public String toString() {
        if (list.isEmpty()) {
            return "no items (0 kg)";
        }
        if (list.size() > 1) {
            return list.size() + " items (" + totalWeight() + " kg)";
        } else {
            return list.size() + " item (" + totalWeight() + " kg)";

        }
    }

}
