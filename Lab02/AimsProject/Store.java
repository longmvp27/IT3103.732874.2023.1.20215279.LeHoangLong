package Lab02.AimsProject;

public class Store {
    DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[50];
    int numberOfDVD;
    public Store(int numberOfDVD) {
        itemsInStore = new DigitalVideoDisc[numberOfDVD];
        this.numberOfDVD = numberOfDVD;
    }
    //Method to add dvd
    public void addDVD(DigitalVideoDisc dvd) {
        for(int i = 0; i < itemsInStore.length; i++) {
            if(itemsInStore[i] == null) {
                itemsInStore[i] = dvd;
                System.out.println("The DVD has been added successfully");
                return;
            }
        }
        System.out.println("The cart is almost full");
    }
    //Method to remove dvd
    public void removeDVD(String title) {
        for(int i = 0; i < itemsInStore.length; i++) {
            if(itemsInStore[i].getTitle().toLowerCase().contains(title.toLowerCase())) {
                itemsInStore[i] = itemsInStore[numberOfDVD-1];
                itemsInStore[numberOfDVD-1] = null;
                numberOfDVD -= 1;
                System.out.println("The DVD has been removed successfully");
                return;
            }
        }
        System.out.println("The DVD you are finding doesn't exist");

    }

    //Method to print DVD in store
    public void printStore() {
        System.out.println("DVDs in Store: ");
        for(int i = 0; i < itemsInStore.length; i++) {
            if(itemsInStore[i] != null) {
                System.out.println(itemsInStore[i].getTitle());
            }
        }
    }
}
