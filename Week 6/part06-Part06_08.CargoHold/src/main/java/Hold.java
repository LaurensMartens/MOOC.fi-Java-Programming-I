
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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> list = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        if (list.isEmpty()) {
            return 0;
        }
        int totalWeightHold = 0;
        for (Suitcase part : list) {
            totalWeightHold += part.totalWeight();
        }
        return totalWeightHold;

    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.totalWeight() > maxWeight) {
            return;
        } else {
            this.list.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase part: list) {
            part.printItems();
        }
    }

    @Override
    public String toString() {
        if (list.isEmpty()) {
            return null;
        }

        if (list.size() > 1) {
            return list.size() + " suitcases (" + this.totalWeight() + " kg)";
        } else {
            return list.size() + " suitcase (" + this.totalWeight() + " kg)";
        }
    }

}
