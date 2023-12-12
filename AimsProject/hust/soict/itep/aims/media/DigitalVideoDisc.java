package AimsProject.hust.soict.itep.aims.media;
// Le Hoang Long - 20215279
public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDisc = 0;
    private String director;        //Initialize variable string director
    private int length;             //Initialize variable integer length
    private float cost;             //Initialize variable float cost
    public String getDirector() {   //Getter of director
        return director;
    }

    public void setDirector(String director) {  //Setter of director
        this.director = director;
    }

    public int getLength() {       //Getter of length
        return length;
    }

    public void setLength(int length) {     //Setter of length
        this.length = length;
    }
    public float getCost() {
        return cost;
    }

    public DigitalVideoDisc(String title) { //Constructor by tile
        super(title);
        id = ++nbDigitalVideoDisc;
    }
    public DigitalVideoDisc(String title, String category, float cost) {    //Constructor by category, title and cost
        this(title);
        this.category = category;
        this.cost = cost;
        this.id = ++nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) { //Constructor by director, category, title and cost
        this(title, category, cost);
        this.director = director;
        this.id = ++nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {   //Constructor by all attributes
        this(title, category, director, cost);
        this.length = length;
        this.id = ++nbDigitalVideoDisc;
    }

    public String toString() {
        return "[" + title + "] - [" + category + "] - [" + director + "] - [" + length + "]: [" + cost + "]";
    }
    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

}
