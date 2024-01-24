package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

public class HomeFormGui extends JFrame {

    public HomeFormGui() {
        super("Home");
        initialize();
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size and position of the frame
        setSize(500, 600);
        setLocationRelativeTo(null); // Center the frame on the screen

        getContentPane().setBackground(Color.RED);

        // Create a label
        JLabel jaiShriRamLabel = new JLabel("Jai Shri Ram");
        jaiShriRamLabel.setFont(new Font("Dialog", Font.BOLD, 36)); // Increase the font size
        jaiShriRamLabel.setBounds(150, 250, 200, 30); // Adjust the position to center the text

        jaiShriRamLabel.setForeground(Color.BLACK);

        // Center the text within the label
        jaiShriRamLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add the label to the frame
        add(jaiShriRamLabel);
    }
}
