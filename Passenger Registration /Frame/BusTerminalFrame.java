package Frame;
import java.awt.*;
import javax.swing.*;

public class BusTerminalFrame extends JFrame {
    private JPanel panel;

    public BusTerminalFrame() {
        super("Bus Terminal");
        super.setBounds(400, 300, 800, 600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));


        JLabel image1 = new JLabel();
        try {
            ImageIcon icon1 = new ImageIcon("Terminal.jpg");
            image1.setIcon(icon1);
        } catch (Exception e) {
            image1.setText("Terminal.jpg");
        }
        panel.add(image1);

        JLabel image2 = new JLabel();
        try {
            ImageIcon icon2 = new ImageIcon("bus_terminal2.jpg");
            image2.setIcon(icon2);
        } catch (Exception e) {
            image2.setText("Bus Terminal Image 2");
        }
        panel.add(image2);

        JLabel image3 = new JLabel();
        try {
            ImageIcon icon3 = new ImageIcon("bus_terminal3.jpg");
            image3.setIcon(icon3);
        } catch (Exception e) {
            image3.setText("Bus Terminal Image 3");
        }
        panel.add(image3);

        JLabel image4 = new JLabel();
        try {
            ImageIcon icon4 = new ImageIcon("bus_terminal4.jpg");
            image4.setIcon(icon4);
        } catch (Exception e) {
            image4.setText("Bus Terminal Image 4");
        }
        panel.add(image4);

        JScrollPane scrollPane = new JScrollPane(panel);
        add(scrollPane);
    }
}