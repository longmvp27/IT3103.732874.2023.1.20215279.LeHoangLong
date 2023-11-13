package Lab02.AimsProject;

import java.util.Scanner;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store(10);
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDVD(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.addDVD(dvd3);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter title of DVD you want to remove: ");
        String title = sc.next();
        store.removeDVD(title);
        System.out.println();
        store.printStore();
    }
}
