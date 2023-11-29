package AimsProject.hust.soict.itep.aims.media;
import java.text.AttributedCharacterIterator;
import java.util.Comparator;
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

    @Override
    public boolean equals(Object ob) {
        Media media = (Media) ob;
        return media.getTitle().equals(this.getTitle());
    }
}
class MediaComparatorByTitle implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        return media1.getTitle().compareTo(media2.getTitle());
    }
}

class MediaComparatorByCost implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        return Double.compare(media1.getCost(), media2.getCost());
    }
}
