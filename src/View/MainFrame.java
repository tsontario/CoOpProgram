package View;

import javax.swing.*;
import java.awt.*;
import Controller.Controller;
import Model.*;

/**
 * Created by timothysmith on 2017-03-15.
 */


public class MainFrame {

    public static void main(String[] args) {
        final Controller controller = new Controller();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
        final Model model = new Model();
    }

    private static void createGUI() {
        // Initial GUI setup
        JFrame frame = new JFrame("Welcome to Classdoor! Your one-stop Coop shop!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        WelcomePanel panel = new WelcomePanel();

        frame.setContentPane(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
