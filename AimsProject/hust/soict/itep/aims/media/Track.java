package AimsProject.hust.soict.itep.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public int getLength() {
       return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    //Method play
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    public boolean equals(Object ob) {
        Media media = (Media) ob;
        return media.getTitle().equals(this.getTitle());
    }
}
