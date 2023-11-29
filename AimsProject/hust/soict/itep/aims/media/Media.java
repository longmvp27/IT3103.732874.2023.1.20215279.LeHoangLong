package AimsProject.hust.soict.itep.aims.media;
import java.text.AttributedCharacterIterator;

public abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public Media(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }
}
