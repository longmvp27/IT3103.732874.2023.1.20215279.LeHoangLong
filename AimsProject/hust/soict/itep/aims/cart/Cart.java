package AimsProject.hust.soict.itep.aims.cart;

import AimsProject.hust.soict.itep.aims.media.DigitalVideoDisc;
import AimsProject.hust.soict.itep.aims.media.Media;

import java.util.ArrayList;
import java.util.Comparator;

// Le Hoang Long - 20215279
public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

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

    public Media searchById(int id) {
        for(Media media : itemsOrdered) {
            if(media.getId() == id) {
                return media;
            }
        }
        System.out.println("Not found");
        return null;
    }
    public Media searchByTitle(String title) {
        for(Media media : itemsOrdered) {
            if(media.getTitle().equals(title)) {
                return media;
            }
        }
        System.out.println("Not found");
        return null;
    }
    public void printCart() {
        System.out.println("Ordered items: ");
        for(Media media : itemsOrdered) {
            System.out.print("Title: " + media.getTitle() + " ");
            System.out.print("Category" + media.getCategory() + " ");
            System.out.print("Cost: " + media.getCost() + " ");
            System.out.println();
        }
        System.out.println("Total cost: " + totalCost());
    }
    public void sortByTitle() {
        itemsOrdered.sort(Media.compareByTitle);
        printCart();
    }
    public void sortByCost() {
        itemsOrdered.sort(Media.compareByCost);
        printCart();
    }
    public int numberMediaInCart() {
        return itemsOrdered.size();
    }
}
