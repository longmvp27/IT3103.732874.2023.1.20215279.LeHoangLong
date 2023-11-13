package Lab02.AimsProject;
// Le Hoang Long - 20215279
public class DigitalVideoDisc {
    private int id;
    private static int nbDigitalVideoDisc = 0;
    private String title;           //Initialize variable string tile
    private String category;        //Initialize variable string category
    private String director;        //Initialize variable string director
    private int length;             //Initialize variable integer length
    private float cost;             //Initialize variable float cost
    public int getId() {
        return id;
    }
    public String getTitle() {      //Getter of title
        return title;
    }

    public void setTitle(String title) {    //Setter of title
        this.title = title;
    }

    public String getCategory() {   //Getter of category
        return category;
    }

    public void setCategory(String category) {  //Setter of category
        this.category = category;
    }

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

    public float getCost() {       //Getter of cost
        return cost;
    }

    public void setCost(float cost) {   //Setter of cost
        this.cost = cost;
    }

    public DigitalVideoDisc(String title) { //Constructor by tile
        this.title = title;
        this.id = ++nbDigitalVideoDisc;
    }
    public DigitalVideoDisc(String title, String category, float cost) {    //Constructor by category, title and cost
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) { //Constructor by director, category, title and cost
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.id = ++nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {   //Constructor by all attributes
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = ++nbDigitalVideoDisc;
    }

    public String toString() {
        return "[" + title + "] - [" + category + "] - [" + director + "] - [" + length + "]: [" + cost + "]";
    }
    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }
}
