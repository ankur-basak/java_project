package Frame;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class PassengerRegistration extends JFrame implements ActionListener {
     
    private Font f1;
    private Color c1;
    private JLabel label, label2, label3, label4, label5 , label6, label7, label8, label9, label10;
    private JButton button1, button2, button3, button4 ;
    private JTextField textField1, textField2, textField3, textField4;
    private JPasswordField passwordField1, passwordField2;
    private JRadioButton rButton1,rButton2,rButton3;
    private JCheckBox checkBox1, checkBox2,checkBox3;
    private ButtonGroup bGroup;
    private JPanel panel;

    

    public PassengerRegistration(){
        super("Passenger Registration");
        super.setBounds(500, 400, 600, 700);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f1 = new Font("Arial", Font.BOLD, 16);
        c1 = new Color (96, 103, 120);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(c1);

        JLabel lable1 = new JLabel("Passenger Registration Form");
        lable1.setBounds(180, 20, 300, 30);
        lable1.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(lable1);
        
        label2 = new JLabel("Full Name:");
        label2.setBounds(50, 80, 100, 25);
        label2.setFont(f1);
        panel.add(label2);

        label3 = new JLabel("Email Address:");
        label3.setBounds(50, 120, 150, 25);
        label3.setFont(f1);
        panel.add(label3);
        
        label4 = new JLabel("Phone Number:");
        label4.setBounds(50, 160, 150, 25);
        label4.setFont(f1);
        panel.add(label4);

        label5 = new JLabel("Address:");
        label5.setBounds(50, 200, 150, 25);
        label5.setFont(f1);
        panel.add(label5);

        label6 = new JLabel("Password:");
        label6.setBounds(50, 240, 150, 25);
        label6.setFont(f1);
        panel.add(label6);

        label7 = new JLabel("Confirm Password:");
        label7.setBounds(50, 280, 150, 25);
        label7.setFont(f1);
        panel.add(label7);

        label8 = new JLabel("Gender:");
        label8.setBounds(50, 320, 150, 25);
        label8.setFont(f1);
        panel.add(label8);

        label9 = new JLabel("Policy:");
        label9.setBounds(50, 360, 150, 25);
        label9.setFont(f1);
        panel.add(label9);

        

        textField1 = new JTextField();
        textField1.setBounds(200, 80, 300, 25);
        panel.add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(200, 120, 300, 25);
        panel.add(textField2);

        textField3 = new JTextField();
        textField3.setBounds(200, 160, 300, 25);
        panel.add(textField3);

        textField4 = new JTextField();
        textField4.setBounds(200, 200, 300, 25);
        panel.add(textField4); 

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(200, 240, 300, 25);
        panel.add(passwordField1);

        passwordField2 = new JPasswordField();
        passwordField2.setBounds(200, 280, 300, 25);
        panel.add(passwordField2);

        rButton1 = new JRadioButton("Male");
        rButton1.setBounds(200, 320, 80, 25);
        panel.add(rButton1);

        rButton2 = new JRadioButton("Female");
        rButton2.setBounds(300, 320, 80, 25);
        panel.add(rButton2);

        rButton3 = new JRadioButton("Other");
        rButton3.setBounds(400, 320, 80, 25);
        panel.add(rButton3);

        bGroup = new ButtonGroup();
        bGroup.add(rButton1);
        bGroup.add(rButton2);
        bGroup.add(rButton3);


        checkBox1 = new JCheckBox("I agree to the Terms and Conditions");
        checkBox1.setBounds(200, 360, 300, 25);
        panel.add(checkBox1);

        checkBox2 = new JCheckBox("Accept Privacy Policy");
        checkBox2.setBounds(200, 390, 300, 25);
        panel.add(checkBox2);

        checkBox3 = new JCheckBox("Receive Notifications");
        checkBox3.setBounds(200, 420, 300, 25);
        panel.add(checkBox3);

        button1 = new JButton("Register");
        button1.setBounds(200, 460, 100, 30);
        button1.addActionListener(this);
        panel.add(button1);

        button2 = new JButton("Login");
        button2.setBounds(320, 460, 100, 30);
        button2.addActionListener(this);
        panel.add(button2);

        button3 = new JButton("Update");
        button3.setBounds(200, 500, 100, 30);
        button3.addActionListener(this);
        panel.add(button3);

        button4 = new JButton("Logout");
        button4.setBounds(320, 500, 100, 30);
        button4.addActionListener(this);
        panel.add(button4);


        super.add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            
            String name = textField1.getText().trim();
            String email = textField2.getText().trim();
            String phone = textField3.getText().trim();
            String address = textField4.getText().trim();
            String password = new String(passwordField1.getPassword()).trim();
            String confirmPassword = new String(passwordField2.getPassword()).trim();
            
            String gender = "";
            if (rButton1.isSelected()) gender = "Male";
            else if (rButton2.isSelected()) gender = "Female";
            else if (rButton3.isSelected()) gender = "Other";
            
            if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields.");
                return;
            }
            if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match.");
                return;
            }
            if (gender.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please select gender.");
                return;
            }
            
            try (FileWriter fw = new FileWriter("data.txt", true)) {
                fw.write(name + "|" + email + "|" + phone + "|" + address + "|" + gender + "|" + password + "\n");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving data.");
                return;
            }
            
            JOptionPane.showMessageDialog(this, "Registration successful!");
            
            RegisteredList listFrame = new RegisteredList();
            listFrame.setVisible(true);
            
        } else if (e.getSource() == button2) {
            PassengerLogin loginFrame = new PassengerLogin();
            loginFrame.setVisible(true);
        } else if (e.getSource() == button3) {
    
            String name = textField1.getText().trim();
            String email = textField2.getText().trim();
            String phone = textField3.getText().trim();
            String address = textField4.getText().trim();
            String password = new String(passwordField1.getPassword()).trim();
            String confirmPassword = new String(passwordField2.getPassword()).trim();
            
            String gender = "";
            if (rButton1.isSelected()) gender = "Male";
            else if (rButton2.isSelected()) gender = "Female";
            else if (rButton3.isSelected()) gender = "Other";
            
            if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields.");
                return;
            }
            if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match.");
                return;
            }
            if (gender.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please select gender.");
                return;
            }
            
            java.util.List<String> lines = new java.util.ArrayList<>();
            boolean updated = false;
            try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split("\\|");
                    if (parts.length >= 2 && parts[1].equals(email)) {
        
                        lines.add(name + "|" + email + "|" + phone + "|" + address + "|" + gender + "|" + password);
                        updated = true;
                    } else {
                        lines.add(line);
                    }
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error reading data.");
                return;
            }
            
            if (!updated) {
                
                lines.add(name + "," + email + "," + phone + "," + address + "," + gender + "," + password);
            }
            
           
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"))) {
                for (String line : lines) {
                    bw.write(line);
                    bw.newLine();
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving data.");
                return;
            }
            
            JOptionPane.showMessageDialog(this, updated ? "Data updated successfully!" : "Data added successfully!");
            
            RegisteredList listFrame = new RegisteredList();
            listFrame.setVisible(true);
        } else if (e.getSource() == button4) {
            System.exit(0);
        }
    }
};