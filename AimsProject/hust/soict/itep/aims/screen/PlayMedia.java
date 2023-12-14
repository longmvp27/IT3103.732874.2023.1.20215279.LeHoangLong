package AimsProject.hust.soict.itep.aims.screen;

import AimsProject.hust.soict.itep.aims.media.Media;

import javax.swing.*;
import java.awt.*;

public class PlayMedia extends JFrame {
    public PlayMedia(Media media) {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        JLabel mediaTitle = new JLabel("Playing media: " + media.getTitle());

        add(mediaTitle);
        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
    }
}
