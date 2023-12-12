package AimsProject.hust.soict.itep.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
    }
    public CompactDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
    public String getArtist() {
        return artist;
    }

    //Method addTrack
    public void addTrack(Track track) {
        if(tracks.contains(track)) {
            System.out.println("The track has been added to the list");
        } else {
            tracks.add(track);
            System.out.println("Added");
        }
    }
    //Method removeTrack
    public void removeTrack(Track track) {
        if(!tracks.contains(track)) {
            System.out.println("The track isn't in the list");
        } else {
            tracks.remove(track);
            System.out.println("Removed");
        }
    }
    @Override
    public int getLength() {
        int totalLength = 0;
        for(Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    //Method to play
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("Length: " + this.getLength());
        for(Track track : tracks) {
            track.play();
        }
    }
}
