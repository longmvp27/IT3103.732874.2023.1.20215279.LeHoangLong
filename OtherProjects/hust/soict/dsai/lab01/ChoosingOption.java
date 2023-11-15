package OtherProjects.hust.soict.dsai.lab01;
// Exercise 6.1: Write, compile and run ChoosingOption.java
import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        String[] buttons = {"Yes", "No", "I do", "I don't"};
        int option = JOptionPane.showOptionDialog(null,
                "Le Hoang Long - 20215279 - Do you want to change to the first class ticket?", "Options",
                0, 3, null,
                buttons, buttons[0]);
        JOptionPane.showMessageDialog(null, "You've chosen: "
                        + (option == JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
