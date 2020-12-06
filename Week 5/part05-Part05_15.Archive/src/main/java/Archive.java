/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class Archive {
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }
    @Override
    public boolean equals(Object compared) {
        if (compared == this) {
            return true;
        }
        
        if (! (compared instanceof Archive)) {
            return false;
        }
        
        Archive comparedItem = (Archive) compared;
        
        if (this.identifier.equals(comparedItem.identifier)) {
            return true;
        } else {
            return false;
        }
    }
}
