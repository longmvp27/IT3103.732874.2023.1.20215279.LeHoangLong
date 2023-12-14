package AimsProject.hust.soict.itep.aims.screen;

import AimsProject.hust.soict.itep.aims.cart.Cart;
import AimsProject.hust.soict.itep.aims.media.Book;
import AimsProject.hust.soict.itep.aims.media.CompactDisc;
import AimsProject.hust.soict.itep.aims.media.DigitalVideoDisc;
import AimsProject.hust.soict.itep.aims.media.Media;
import AimsProject.hust.soict.itep.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StoreScreen extends JFrame {
    private Store store;
    public Store getStore() {
        return store;
    }

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }
    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");
        JMenu smUpdateStore = new JMenu("Update store");
        smUpdateStore.add(new JMenuItem("Add book"));
        smUpdateStore.add(new JMenuItem("Add CD"));
        smUpdateStore.add(new JMenuItem("Add DVD"));

        menu.add(smUpdateStore);
        JMenuItem storeView = new JMenuItem("View Store");
        JMenuItem cartView = new JMenuItem("View cart");
        menu.add(storeView);
        menu.add(cartView);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
        return menuBar;
    }
    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        JButton cart = new JButton("View cart");
        cart.setPreferredSize(new Dimension(100, 50));
        cart.setMaximumSize(new Dimension(100, 50));
        cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CartScreen(getStore());

            }
        });

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        return header;

    }
    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        if(store != null) {
            ArrayList<Media> mediaInStore = store.getItemsInStore();
            for(int i = 0; i < mediaInStore.size(); i++) {
                MediaStore cell = new MediaStore(mediaInStore.get(i));
                center.add(cell);
            }
        }
        return center;
    }
    public StoreScreen(Store store) {
        this.store = store;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);

    }

    public static void main(String[] args) {
        Store store = new Store(9);
        Media media1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.5f);
        Media media2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        Media media3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        Media media4 = new Book(1, "Voi vang", "Literature", 17.98f);
        Media media5 = new Book(2, "Truyen Kieu", "Poem", 20.98f);
        Media media6 = new Book(3, "Twilight", "Literature", 30.52f);
        Media media7 = new CompactDisc(4, "CD1", "Music", 13.54f);
        Media media8 = new CompactDisc(5, "CD2", "Music", 12.57f);
        Media media9 = new CompactDisc(6, "CD3", "Music", 13.24f);

        store.addMedia(media1);
        store.addMedia(media2);
        store.addMedia(media3);
        store.addMedia(media4);
        store.addMedia(media5);
        store.addMedia(media6);
        store.addMedia(media7);
        store.addMedia(media8);
        store.addMedia(media9);

        new StoreScreen(store);

    }
}
