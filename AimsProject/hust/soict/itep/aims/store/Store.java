package AimsProject.hust.soict.itep.aims.store;

import AimsProject.hust.soict.itep.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore; // Array of DVDs available in the store
    private int numberOfDVD;

    public Store(int numberOfDVD) {
        itemsInStore = new DigitalVideoDisc[numberOfDVD];
        this.numberOfDVD = numberOfDVD;
    }
    public int getNumberOfDVD() {
        return numberOfDVD;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] == null) {
                itemsInStore[i] = dvd;
                System.out.println("DVD has been added to store");
                return;
            }
        }
        System.out.println("Store is full");
    }
    public void removeDVD(String title) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] != null && itemsInStore[i].getTitle().toLowerCase().contains(title.toLowerCase())) {
                itemsInStore[i] = null;
                System.out.println("Remove successfully");
                return;
            }
        }
        System.out.println("DVD not found in the store: " + title);
    }
    //method to print items in store
    public void printItems() {
        for(int i = 0; i < itemsInStore.length; i++) {
            if(itemsInStore[i] != null) {
                System.out.println(itemsInStore[i].getTitle());
            }
        }
    }
}
