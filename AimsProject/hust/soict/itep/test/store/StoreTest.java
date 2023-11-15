package AimsProject.hust.soict.itep.test.store;
import AimsProject.hust.soict.itep.aims.disc.DigitalVideoDisc;
import AimsProject.hust.soict.itep.aims.store.Store;

import java.util.*;
public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store(5);
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDVD(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.addDVD(dvd3);
        //remove dvd from store
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title of DVD you want to remove: ");
        String title = sc.next();
        store.removeDVD(title);
        System.out.println();

        //print store
        store.printItems();
    }
}
