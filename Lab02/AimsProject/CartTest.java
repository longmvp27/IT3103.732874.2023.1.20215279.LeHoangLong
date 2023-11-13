package Lab02.AimsProject;

import java.util.Scanner;

public class CartTest {
    public static void main(String[] args) {
        //Create new cart
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);
        //test print method
        cart.print();
        //test search method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = sc.nextInt(); //id you want to find
        cart.searchByID(id);

        System.out.println("Enter title: ");
        String title = sc.next(); //title you want to find
        cart.searchByTitle(title);
    }
}