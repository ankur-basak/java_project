package Frame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {

    private JLabel userLabel, passLabel;
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginBtn;

    public LoginFrame() {
        super("Student Login");
        setBounds(500, 200, 400, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);

        userLabel = new JLabel("Username (ID):");
        userLabel.setBounds(50, 30, 120, 25);
        panel.add(userLabel);

        userField = new JTextField();
        userField.setBounds(180, 30, 150, 25);
        panel.add(userField);

        passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 70, 120, 25);
        panel.add(passLabel);

        passField = new JPasswordField();
        passField.setBounds(180, 70, 150, 25);
        panel.add(passField);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(150, 120, 100, 30);
        panel.add(loginBtn);

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        add(panel);
        setVisible(true);
    }

    private void login() {
        String user = userField.getText().trim();
        String pass = new String(passField.getPassword());

        if (user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter username and password");
            return;
        }

        boolean found = false;
        Student loggedIn = null;
        for (Student s : StudentRegistration.students) {
            if (s.getId().equals(user) && s.getPassword().equals(pass)) {
                found = true;
                loggedIn = s;
                break;
            }
        }

        if (found) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            new UniversityFrame();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password");
        }
    }
}