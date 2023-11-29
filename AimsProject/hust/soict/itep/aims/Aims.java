package AimsProject.hust.soict.itep.aims;

import AimsProject.hust.soict.itep.aims.cart.Cart;
import AimsProject.hust.soict.itep.aims.media.DigitalVideoDisc;

// Le Hoang Long - 20215279
public class Aims {
    public static void main(String[] args) {
        //Create a new cart
        Cart anOrder = new Cart();
        //Create new dvd object and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        //Print total cost of items in cart
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());
        System.out.print("\n");

        //Check method Remove
        anOrder.removeDigitalVideoDisc(dvd1);
        System.out.println("The cart after removing one dvd: ");
        anOrder.printItems();
    }
}