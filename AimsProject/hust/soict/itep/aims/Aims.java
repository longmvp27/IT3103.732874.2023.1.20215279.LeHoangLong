package AimsProject.hust.soict.itep.aims;

import AimsProject.hust.soict.itep.aims.cart.Cart;
import AimsProject.hust.soict.itep.aims.media.*;
import AimsProject.hust.soict.itep.aims.store.Store;

import java.util.Scanner;


// Le Hoang Long - 20215279
public class Aims {
    public static void showMenu() {

        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    public static void main(String[] args) {
        Cart cart = new Cart();
        Store store = new Store(10);
        Media media1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.5f);
        Media media2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        Media media3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        store.addMedia(media1);
        store.addMedia(media2);
        store.addMedia(media3);

        while(true) {
            showMenu();
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            //Option 1
            if(option == 1) {
                store.printStore();
                storeMenu();
                int choose = sc.nextInt();
                if(choose == 1) {
                    String title = sc.next();
                    Media newMedia = store.searchByTitle(title);
                    if(newMedia != null) {
                        System.out.println(newMedia.toString());
                        mediaDetailsMenu();
                    }
                }
                if(choose == 2) {
                    String title = sc.next();
                    Media newMedia = store.searchByTitle(title);
                    if(newMedia != null) {
                        cart.addMedia(newMedia);
                        System.out.println(cart.numberMediaInCart());
                    }
                }
                if(choose == 3) {
                    String title = sc.next();
                    Media newMedia = store.searchByTitle(title);
                    if(newMedia != null) {
                        DigitalVideoDisc dvd = (DigitalVideoDisc) newMedia;
                        dvd.play();
                    }
                }
            }
            if(option == 2) {
                store.printStore();
                System.out.println("Do you want to add a remove (1: add & 2: remove) ?");
                int choose = sc.nextInt();
                if(choose == 1) {
                    String title = sc.next();
                    if(store.searchByTitle(title) == null) {
                        store.addMedia(new DigitalVideoDisc(title));
                    } else {
                        System.out.println("The media has been added");
                    }
                } else if(choose == 2) {
                    String title = sc.next();
                    if(store.searchByTitle(title) != null) {
                        store.removeMedia(new DigitalVideoDisc(title));
                    }
                }

            }
            if(option == 3) {
                cartMenu();
                int choose = sc.nextInt();
                if(choose == 1) {
                    System.out.println("Filter by title (1) or id (2)?");
                    int n = sc.nextInt();
                    if(n == 1) {
                        System.out.println("Enter title: ");
                        String title = sc.next();
                        store.searchByTitle(title);
                    } else if(n == 2) {
                        System.out.println("Enter id: ");
                        int id = sc.nextInt();
                        store.searchById(id);
                    }
                }
            }
        }

    }
}