package Frame;

import java.awt.*;
import javax.swing.*;

public class UniversityFrame extends JFrame {

    public UniversityFrame() {
        super("AIUB University");
        setBounds(500, 200, 600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Load the AIUB image (ensure "aiub.jpg" or "aiub.png" is in the project directory)
        ImageIcon icon = new ImageIcon("images/sports-slider-1.jpg"); // Change to "aiub.png" if needed
        if (icon.getImageLoadStatus() != MediaTracker.COMPLETE) {
            // If image not found, show a text label
            JLabel label = new JLabel("AIUB University Image Not Found. Please add 'sports-slider-1.jpg' to the images directory.");
            label.setHorizontalAlignment(JLabel.CENTER);
            add(label);
        } else {
            JLabel label = new JLabel(icon);
            add(label);
        }

        setVisible(true);
    }
}