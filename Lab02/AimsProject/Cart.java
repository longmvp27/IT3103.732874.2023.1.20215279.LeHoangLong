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

    //Method to print cart
    public void print() {
        float totalCost = 0f;
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc dvd = itemsOrdered[i];
            System.out.println(dvd.getId() + 1 + ". DVD - " + dvd.toString());
            totalCost += dvd.getCost();
        }
        System.out.println("Total cost: [" + totalCost + "]");
        System.out.println("***************************************************");
    }



}
