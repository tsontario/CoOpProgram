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
    AbstractController controller;

    public void start() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                initFrame();
            }
        });
        final Model model = new Model();
    }

    // Top-level initFrame constructs welcome-screen
    protected void initFrame() {
        setController(new WelcomeController());
        controller.initFrame();
    }

    private void setController(AbstractController controller) {
        this.controller = controller;
    }
}
