package View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by timothysmith on 2017-03-15.
 */
public class WelcomePanel extends JPanel {

    public WelcomePanel() {

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        // Create the welcome message
        JPanel textPanel = new JPanel();
        JTextArea welcomeText = new JTextArea();
        welcomeText.setText("Welcome to Classdoor! Log in or register to get started!");
        welcomeText.setFont(new Font("TimesRoman", Font.BOLD, 24));

        // Create the menu buttons
        JPanel buttons = new JPanel();
        JButton userLogInBtn = new JButton("Log in (Student)");
        JButton companyLoginBtn = new JButton("Log in (Company)");
        JButton registerBtn = new JButton("Register (New User)");
        JButton exitBtn = new JButton("Quit");

        // Welcome Message layout constraints + ADD TO PANEL
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.gridy = 0;
        gc.insets = new Insets(40, 5, 125, 5);
        textPanel.add(welcomeText, BorderLayout.NORTH);
        add(textPanel, gc);

        // Menu button layout constraints + ADD TO PANEL
        // TODO menu button layout constraints
        gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.gridy = 2;
        gc.insets = new Insets(5,5,5,5);

        buttons.add(userLogInBtn);
        buttons.add(companyLoginBtn);
        buttons.add(registerBtn);
        buttons.add(exitBtn);


        add(buttons, gc);




        setVisible(true);
    }


}
