package Frame;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.Image;

class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel(Image img) {
        this.backgroundImage = img;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}

public class StudentRegistration extends JFrame {

    private Font f1;
    private Color c1;
    private JLabel label2, label3, label4, label5, label6, label7, label8, label9;
    private JButton button1, button2;
    private JTextField textField1, textField2, textField3, textField4, textField5, textFieldYear;
    private JPasswordField passwordField1, passwordField2;
    private JRadioButton male, female, other;
    private JRadioButton science, commerce, arts;
    private JCheckBox checkBox1, checkBox2;
    private ButtonGroup genderGroup, deptGroup;
    private JPanel panel;
    public static List<Student> students = new ArrayList<>();

    public StudentRegistration() {
        super("Student Registration");
        setBounds(500, 200, 600, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f1 = new Font("Arial", Font.BOLD, 14);
        c1 = new Color(96, 103, 120);

        panel = new BackgroundPanel(new ImageIcon("images/images.jpeg").getImage());
        panel.setLayout(null);

        JLabel title = new JLabel("Student Registration Form");
        title.setBounds(160, 20, 300, 30);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setOpaque(true);
        title.setBackground(Color.WHITE);
        panel.add(title);

        label2 = new JLabel("Student Name:");
        label2.setBounds(50, 80, 150, 25);
        label2.setFont(f1);
        label2.setOpaque(true);
        label2.setBackground(Color.WHITE);
        panel.add(label2);

        label3 = new JLabel("Student ID:");
        label3.setBounds(50, 120, 150, 25);
        label3.setFont(f1);
        label3.setOpaque(true);
        label3.setBackground(Color.WHITE);
        panel.add(label3);

        label4 = new JLabel("Email:");
        label4.setBounds(50, 160, 150, 25);
        label4.setFont(f1);
        label4.setOpaque(true);
        label4.setBackground(Color.WHITE);
        panel.add(label4);

        label5 = new JLabel("Phone:");
        label5.setBounds(50, 200, 150, 25);
        label5.setFont(f1);
        label5.setOpaque(true);
        label5.setBackground(Color.WHITE);
        panel.add(label5);

        label6 = new JLabel("Address:");
        label6.setBounds(50, 240, 150, 25);
        label6.setFont(f1);
        label6.setOpaque(true);
        label6.setBackground(Color.WHITE);
        panel.add(label6);

        label7 = new JLabel("Year:");
        label7.setBounds(50, 280, 150, 25);
        label7.setFont(f1);
        label7.setOpaque(true);
        label7.setBackground(Color.WHITE);
        panel.add(label7);

        label8 = new JLabel("Password:");
        label8.setBounds(50, 320, 150, 25);
        label8.setFont(f1);
        label8.setOpaque(true);
        label8.setBackground(Color.WHITE);
        panel.add(label8);

        label9 = new JLabel("Confirm Password:");
        label9.setBounds(50, 360, 150, 25);
        label9.setFont(f1);
        label9.setOpaque(true);
        label9.setBackground(Color.WHITE);
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

        textField5 = new JTextField();
        textField5.setBounds(200, 240, 300, 25);
        panel.add(textField5);

        textFieldYear = new JTextField();
        textFieldYear.setBounds(200, 280, 300, 25);
        panel.add(textFieldYear);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(200, 320, 300, 25);
        panel.add(passwordField1);

        passwordField2 = new JPasswordField();
        passwordField2.setBounds(200, 360, 300, 25);
        panel.add(passwordField2);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 400, 150, 25);
        genderLabel.setFont(f1);
        genderLabel.setOpaque(true);
        genderLabel.setBackground(Color.WHITE);
        panel.add(genderLabel);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");

        male.setBounds(200, 400, 80, 25);
        female.setBounds(300, 400, 80, 25);
        other.setBounds(400, 400, 80, 25);

        male.setFont(f1);
        male.setOpaque(true);
        male.setBackground(Color.WHITE);
        female.setFont(f1);
        female.setOpaque(true);
        female.setBackground(Color.WHITE);
        other.setFont(f1);
        other.setOpaque(true);
        other.setBackground(Color.WHITE);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        panel.add(male);
        panel.add(female);
        panel.add(other);

        JLabel deptLabel = new JLabel("Department:");
        deptLabel.setBounds(50, 440, 150, 25);
        deptLabel.setFont(f1);
        deptLabel.setOpaque(true);
        deptLabel.setBackground(Color.WHITE);
        panel.add(deptLabel);

        science = new JRadioButton("Science");
        commerce = new JRadioButton("Commerce");
        arts = new JRadioButton("Arts");

        science.setBounds(200, 440, 90, 25);
        commerce.setBounds(300, 440, 100, 25);
        arts.setBounds(420, 440, 80, 25);

        science.setFont(f1);
        science.setOpaque(true);
        science.setBackground(Color.WHITE);
        commerce.setFont(f1);
        commerce.setOpaque(true);
        commerce.setBackground(Color.WHITE);
        arts.setFont(f1);
        arts.setOpaque(true);
        arts.setBackground(Color.WHITE);

        deptGroup = new ButtonGroup();
        deptGroup.add(science);
        deptGroup.add(commerce);
        deptGroup.add(arts);

        panel.add(science);
        panel.add(commerce);
        panel.add(arts);

        checkBox1 = new JCheckBox("I agree to Terms & Conditions");
        checkBox1.setBounds(200, 480, 300, 25);
        checkBox1.setFont(f1);
        checkBox1.setOpaque(true);
        checkBox1.setBackground(Color.WHITE);
        panel.add(checkBox1);

        checkBox2 = new JCheckBox("Accept Privacy Policy");
        checkBox2.setBounds(200, 510, 300, 25);
        checkBox2.setFont(f1);
        checkBox2.setOpaque(true);
        checkBox2.setBackground(Color.WHITE);
        panel.add(checkBox2);

        button1 = new JButton("Register");
        button1.setBounds(200, 560, 100, 30);
        button1.setFont(f1);
        button1.setBackground(Color.WHITE);
        panel.add(button1);

        button2 = new JButton("Login");
        button2.setBounds(320, 560, 100, 30);
        button2.setFont(f1);
        button2.setBackground(Color.WHITE);
        panel.add(button2);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerStudent();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginFrame();
            }
        });

        add(panel);
        setVisible(true);

        loadStudents();
    }

    private void registerStudent() {
        String name = textField1.getText().trim();
        String id = textField2.getText().trim();
        String email = textField3.getText().trim();
        String phone = textField4.getText().trim();
        String address = textField5.getText().trim();
        String year = textFieldYear.getText().trim();
        String password = new String(passwordField1.getPassword());
        String confirmPassword = new String(passwordField2.getPassword());

        if (name.isEmpty() || id.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || year.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields");
            return;
        }

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match");
            return;
        }

        String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : other.isSelected() ? "Other" : "";
        if (gender.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select gender");
            return;
        }

        String dept = science.isSelected() ? "Science" : commerce.isSelected() ? "Commerce" : arts.isSelected() ? "Arts" : "";
        if (dept.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select department");
            return;
        }

        if (!checkBox1.isSelected() || !checkBox2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please agree to terms and privacy policy");
            return;
        }

        Student student = new Student(name, id, email, phone, address, year, password, gender, dept);
        students.add(student);
        saveStudent(student);
        JOptionPane.showMessageDialog(this, "Registered successfully");

        // Clear fields
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textFieldYear.setText("");
        passwordField1.setText("");
        passwordField2.setText("");
        genderGroup.clearSelection();
        deptGroup.clearSelection();
        checkBox1.setSelected(false);
        checkBox2.setSelected(false);

    
        showRegisteredList();
    }

    private void showRegisteredList() {
        JFrame listFrame = new JFrame("Registered Students");
        listFrame.setBounds(500, 200, 800, 400);
        listFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] columns = {"Name", "ID", "Email", "Phone", "Address", "Year", "Gender", "Department"};
        Object[][] data = new Object[students.size()][8];

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            data[i][0] = s.getName();
            data[i][1] = s.getId();
            data[i][2] = s.getEmail();
            data[i][3] = s.getPhone();
            data[i][4] = s.getAddress();
            data[i][5] = s.getYear();
            data[i][6] = s.getGender();
            data[i][7] = s.getDepartment();
        }

        JTable table = new JTable(data, columns);
        JScrollPane scroll = new JScrollPane(table);
        listFrame.add(scroll);
        listFrame.setVisible(true);
    }

    private void loadStudents() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 9) {
                    Student s = new Student(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6], parts[7], parts[8]);
                    students.add(s);
                }
            }
            br.close();
        } catch (IOException e) {
        }
    }

    private void saveStudent(Student s) {
        try {
            FileWriter fw = new FileWriter("students.txt", true); // append
            fw.write(s.getName() + "," + s.getId() + "," + s.getEmail() + "," + s.getPhone() + "," + s.getAddress() + "," + s.getYear() + "," + s.getPassword() + "," + s.getGender() + "," + s.getDepartment() + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}