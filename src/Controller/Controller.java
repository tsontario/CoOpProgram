package Controller;
import Model.Model;
import View.WelcomePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by timothysmith on 2017-03-15.
 * Top-Level controller for CoOp program. This controller is designed to hold references to the
 * controller for the current view as well.
 */
public class Controller extends AbstractController {

    // The current view (except for main menu).
    AbstractController currentController;

    public void start() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                initFrame();
            }
        });
        final Model model = new Model();
    }

    protected void initFrame() {
        // Initial GUI setup
        JFrame frame = new JFrame("Welcome to Classdoor! Your one-stop Coop shop!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel masterPanel = new WelcomePanel();
        frame.add(masterPanel, BorderLayout.CENTER);

        frame.setSize(new Dimension(800, 600));
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
