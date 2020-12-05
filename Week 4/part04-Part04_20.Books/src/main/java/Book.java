/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class Book {
    private String title;
    private int numPages;
    private int publicationYear;
    
    public Book(String title, int numPages, int publicationYear) {
        this.title = title;
        this.numPages = numPages;
        this.publicationYear = publicationYear;
    }
    
    public String getName() {
        return this.title;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.numPages + " pages, " + this.publicationYear;
    }
}
