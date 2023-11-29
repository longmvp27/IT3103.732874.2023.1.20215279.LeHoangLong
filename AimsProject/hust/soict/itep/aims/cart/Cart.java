package AimsProject.hust.soict.itep.aims.cart;

import AimsProject.hust.soict.itep.aims.media.DigitalVideoDisc;
import AimsProject.hust.soict.itep.aims.media.Media;

import java.util.ArrayList;

// Le Hoang Long - 20215279
public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    //Method addMedia
    public void addMedia(Media media) {
        if(itemsOrdered.size() < MAX_NUMBER_ORDERED) {
            if(itemsOrdered.contains(media)) {
                System.out.println("The media has been added to cart");
                return;
            }
            itemsOrdered.add(media);
            System.out.println("Added");
        } else {
            System.out.println("The cart is full");
        }
    }

    //Method removeMedia
    public void removeMedia(Media media) {
        if(itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Removed");
        } else {
            System.out.println("The media isn't in the cart");
        }
    }

    //Method to calculate totalCost
    public float totalCost() {
        float totalCost = 0;
        for(Media media : itemsOrdered) {
            totalCost += media.getCost();
        }
        return totalCost;
    }
}
