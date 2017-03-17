package View;

import Controller.UserLogInController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by timothysmith on 2017-03-17.
 */
public class UserLogInPanel extends JPanel {
    public UserLogInPanel(UserLogInController controller) {

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        // Create the welcome message JPanel
        JPanel textPanel = new JPanel();
        JTextArea welcomeText = new JTextArea();
    }
}
