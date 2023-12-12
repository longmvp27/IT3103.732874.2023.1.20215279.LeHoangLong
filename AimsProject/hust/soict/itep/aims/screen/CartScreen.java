package AimsProject.hust.soict.itep.aims.screen;
import AimsProject.hust.soict.itep.aims.cart.Cart;
import AimsProject.hust.soict.itep.aims.media.Media;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.ArrayList;

public class CartScreen extends JFrame {
    private static Cart cart = new Cart();
    public static Cart getCart() {
        return cart;
    }
    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");
        JMenuItem menuItem = new JMenuItem("View store");
        menu.add(menuItem);


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

        header.add(Box.createRigidArea(new Dimension(5, 0)));
        header.add(title);
        header.add(Box.createHorizontalGlue());

        return header;
    }

    JPanel createFilter() {
        JPanel filter = new JPanel();
        filter.setLayout(new BoxLayout(filter, BoxLayout.X_AXIS));

        JLabel filterLabel = new JLabel("Filter: ");
        JTextField filterField = new JTextField(20);
        filterField.setMaximumSize(new Dimension(100, 30));
        JCheckBox byId = new JCheckBox("By ID");
        JCheckBox byTitle = new JCheckBox("By title");

        filter.add(Box.createRigidArea(new Dimension(10, 0)));
        filter.add(filterLabel);
        filter.add(filterField);
        filter.add(byId);
        filter.add(byTitle);
        filter.add(Box.createHorizontalGlue());

        return filter;
    }

    JPanel createTable() {
        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new BoxLayout(tablePanel, BoxLayout.Y_AXIS));

        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        table.setFont(new Font(table.getFont().getName(), Font.PLAIN, 20));
        //table.setPreferredSize(new Dimension(800, 350));

        model.addColumn("Title");
        model.addColumn("Category");
        model.addColumn("Cost");

        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(new Font(tableHeader.getFont().getName(), Font.PLAIN, 20));

        ArrayList<Media> itemsInCart = cart.getItemsOrdered();

        for(Media media: itemsInCart) {
            Object[] rowData = {media.getTitle(), media.getCategory(), media.getCost()};
            model.addRow(rowData);
            table.setRowHeight(30);
        }
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.add(Box.createHorizontalGlue());
        JButton playButton = new JButton("Play");
        JButton removeButton = new JButton("Remove");
        playButton.setPreferredSize(new Dimension(100, 30));
        removeButton.setPreferredSize(new Dimension(100, 30));

        //buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(playButton);
        buttonPanel.add(removeButton);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(scrollPane);
        mainPanel.add(buttonPanel);

        tablePanel.add(mainPanel);
        return tablePanel;
    }
    JPanel createCal() {
        JPanel calPanel = new JPanel();
        calPanel.setLayout(new BoxLayout(calPanel, BoxLayout.Y_AXIS));

        float totalCost = cart.totalCost();
        JPanel subTotalCost = new JPanel();
        subTotalCost.setLayout(new BoxLayout(subTotalCost, BoxLayout.X_AXIS));
        JLabel totalLabel = new JLabel("Total: ");
        JLabel floatLabel = new JLabel(String.format("%.2f", totalCost) + " $");
        totalLabel.setFont(new Font(totalLabel.getFont().getName(), Font.PLAIN, 20));
        floatLabel.setFont(new Font(totalLabel.getFont().getName(), Font.PLAIN, 26));
        floatLabel.setForeground(Color.CYAN);
        subTotalCost.add(totalLabel);
        subTotalCost.add(floatLabel);
        subTotalCost.setAlignmentX(CENTER_ALIGNMENT);

        JButton orderButton = new JButton("Place order");
        orderButton.setFont(new Font(orderButton.getFont().getName(), Font.PLAIN, 24));
        orderButton.setBackground(Color.RED);
        orderButton.setAlignmentX(CENTER_ALIGNMENT);;

        calPanel.add(subTotalCost);
        calPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        calPanel.add(orderButton);
        calPanel.add(Box.createVerticalGlue());

        return calPanel;
    }
    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        north.add(createFilter());
        return north;
    }
    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new BoxLayout(center, BoxLayout.X_AXIS));
        center.add(Box.createRigidArea(new Dimension(10, 0)));
        center.add(createTable());
        center.add(createCal());
        return center;
    }
    public CartScreen() {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);
        setVisible(true);
        setTitle("Cart");
        setSize(1024, 768);
    }

    public static void main(String[] args) {
        new CartScreen();
    }
}
