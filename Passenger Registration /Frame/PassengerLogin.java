package Frame;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class PassengerLogin extends JFrame implements ActionListener {
    private Font f1;
    private Color c1;
    private JLabel label1, label2;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton backButton;
    private JPanel panel;

    public PassengerLogin() {
        super("Passenger Login");
        super.setBounds(500, 400, 400, 400);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        f1 = new Font("Arial", Font.BOLD, 16);
        c1 = new Color(96, 103, 120);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(c1);

        JLabel imageLabel = new JLabel();
        try {
            ImageIcon icon = new ImageIcon("image/Terminal.jpg");
            imageLabel.setIcon(icon);
        } catch (Exception e) {
            imageLabel.setText("Terminal Image");
        }
        imageLabel.setBounds(100, 10, 200, 100);
        panel.add(imageLabel);

        label1 = new JLabel("Email:");
        label1.setBounds(50, 120, 100, 25);
        label1.setFont(f1);
        panel.add(label1);

        usernameField = new JTextField();
        usernameField.setBounds(150, 120, 200, 25);
        panel.add(usernameField);

        label2 = new JLabel("Password:");
        label2.setBounds(50, 170, 100, 25);
        label2.setFont(f1);
        panel.add(label2);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 170, 200, 25);
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 220, 100, 30);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        backButton = new JButton("Back");
        backButton.setBounds(150, 250, 100, 30);
        backButton.addActionListener(this);
        panel.add(backButton);

        super.add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText().trim();
            String password = new String(passwordField.getPassword()).trim();
            
            boolean valid = false;
            try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split("\\|");
                    if (parts.length >= 6 && parts[1].equals(username) && parts[5].equals(password)) {
                        valid = true;
                        break;
                    }
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error reading data.");
                return;
            }
            
            if (valid) {
                BusTerminalFrame busFrame = new BusTerminalFrame();
                busFrame.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.");
            }
        } else if (e.getSource() == backButton) {
            this.dispose();
        }
    }
}