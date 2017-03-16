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
        // Top level entry point to program
        final Controller controller = new Controller();
        controller.start();
    }

    private static void createGUI() {

    }
}
