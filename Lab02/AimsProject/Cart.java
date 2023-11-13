package Lab02.AimsProject;
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
    
}
