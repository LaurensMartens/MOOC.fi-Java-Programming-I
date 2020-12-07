
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
public class Room {

    private ArrayList<Person> list = new ArrayList<>();

    public Room() {

    }

    public void add(Person person) {
        this.list.add(person);
    }

    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.list;
    }

    public Person shortest() {
        if (this.list.isEmpty()) {
            return null;
        }
        int height = 0;
        int index = 0;
        for (Person prs : list) {
            if (list.indexOf(prs) == 0) {
                height = prs.getHeight();
            }
            if (prs.getHeight() < height) {
                height = prs.getHeight();
                index++;

            }
        }
        return list.get(index);
    }

    public Person take() {
        if (this.list.isEmpty()) {
            return null;
        }
        Person remove = shortest();
        list.remove(remove);
        return remove;
    }
}
