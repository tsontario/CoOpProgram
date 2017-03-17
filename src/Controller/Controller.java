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

    AbstractController controller;

    public void start() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                initFrame(new WelcomeController(), null);
            }
        });
        final Model model = new Model();
    }

    // Top-level initFrame
    protected void initFrame(AbstractController controller, AbstractController parent) {
        setController(controller);
        controller.initFrame(controller, this);
    }

    private void setController(AbstractController controller) {
        this.controller = controller;
    }
}
