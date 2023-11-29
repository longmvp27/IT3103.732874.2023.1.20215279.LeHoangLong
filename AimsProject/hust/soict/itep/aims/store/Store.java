package AimsProject.hust.soict.itep.aims.store;

import AimsProject.hust.soict.itep.aims.media.DigitalVideoDisc;
import AimsProject.hust.soict.itep.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Media> itemsInStore; // Array of DVDs available in the store
    private int numberOfMedia;

    public Store(int numberOfMedia) {
        itemsInStore = new ArrayList<Media>();
        this.numberOfMedia = numberOfMedia;
    }
    public int getNumberOfMedia() {
        return numberOfMedia;
    }

    public void addMedia(Media media) {
        if(itemsInStore.size() < numberOfMedia) {
            if(itemsInStore.contains(media)) {
                System.out.println("The media has been added to the cart");
                return;
            }
            itemsInStore.add(media);
            System.out.println("Added");
        } else {
            System.out.println("The cart is full");
        }
    }

    public void removeMedia(Media media) {
        if(itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Removed");
        } else {
            System.out.println("The media isn't in the cart");
        }
    }
}
