package AimsProject.hust.soict.dsai.aims.cart;

import AimsProject.hust.soict.dsai.aims.disc.DigitalVideoDisc;

// Le Hoang Long - 20215279
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
    public Cart() {
        this.qtyOrdered = 0;
    }
    //Method to add dvd
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered += 1;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }
    //Method to remove dvd
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i] == disc) {
                itemsOrdered[i] = itemsOrdered[qtyOrdered-1];
                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered -= 1;
                break;
            }
        }
        System.out.println("The dvd has been removed successfully");
    }
    //Method to calculate total cost
    public float totalCost() {
        float total = 0.0f;
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i] != null) {
                total += itemsOrdered[i].getCost();
            }
        }
        return total;
    }
    //Method to print items in the cart
    public void printItems() {
        for(int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemsOrdered[i].getTitle());
        }
    }
    //Method overloading
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for(DigitalVideoDisc dvd : dvdList) {
            if(qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = dvd;
                qtyOrdered += 1;
            } else {
                System.out.println("The cart is almost full");
                break;
            }
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if(qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered += 1;
            System.out.println("The disc1 has been added");
        }
        if(qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered += 1;
            System.out.println("The disc2 has been added");
            return;
        }
    }

    //Method to print cart
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        float totalCost = 0f;
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". DVD - " + itemsOrdered[i].toString());
            totalCost += itemsOrdered[i].getCost();
        }

        System.out.println("Total cost: [" + totalCost + "]");
        System.out.println("***************************************************");
    }
    public void searchByID(int id) {
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].getId() == id) {
                System.out.println((i + 1) + ". DVD - " + itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("No match is found");
    }
    public void searchByTitle(String title) {
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].isMatch(title)) {
                System.out.println((i + 1) + ". DVD - " + itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("No match is found");
    }
}
