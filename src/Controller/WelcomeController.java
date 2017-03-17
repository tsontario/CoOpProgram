package Controller;

import View.WelcomePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by timothysmith on 2017-03-17.
 */
public class WelcomeController extends AbstractController {


    @Override
    protected void initFrame() {
        JFrame frame = new JFrame("Welcome to Classdoor! Your one-stop Coop shop!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel masterPanel = new WelcomePanel(this);
        frame.add(masterPanel, BorderLayout.CENTER);

        frame.setSize(new Dimension(800, 600));
        frame.setVisible(true);
    }

    public void userLogIn() {
        System.out.println("COMMUNICATION SUCCESSFUL!");
    }

    public void exit() {
        System.exit(0);
    }
}
