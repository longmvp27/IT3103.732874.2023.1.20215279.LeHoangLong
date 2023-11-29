package AimsProject.hust.soict.itep.aims.media;
import java.util.*;
public class Book extends Media {
    private List<String> authors = new ArrayList<String>();
    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
    public List<String> getAuthors() {
        return authors;
    }

    //Method to add an author
    public void addAuthor(String authorName) {
        if(authors.contains(authorName)) {
            System.out.println("The author has been added to the list");
        } else {
            authors.add(authorName);
            System.out.println("Added");
        }
    }

    //Method to remove an author
    public void removeAuthor(String authorName) {
        if(!authors.contains(authorName)) {
            System.out.println("The author isn't in the list");
        } else {
            authors.remove(authorName);
            System.out.println("Removed");
        }
    }
}
