package Controller;

import View.WelcomePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by timothysmith on 2017-03-17.
 */
public class WelcomeController extends AbstractController {
    AbstractController parent;
    JPanel view;

    private void initFrame() {
        JFrame frame = new JFrame("Welcome to Classdoor! Your one-stop Coop shop!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        view = new WelcomePanel(this);
        frame.add(view, BorderLayout.CENTER);

        frame.setSize(new Dimension(800, 600));
        frame.setVisible(true);
    }

    public void userLogIn() {
        view.setVisible(false);
        parent.initFrame(new UserLogInController(), parent);
    }

    public void exit() {
        System.exit(0);
    }

    protected void initFrame(AbstractController controller, AbstractController parent) {
        this.parent = parent;
        initFrame();
    }
}
