package Gui;
import Customerinfo.*;
import file.*;
import java.awt.*;
import java.io.IOException;
import javax.swing.*;


public class Restaurant extends JFrame {

    // ===== Class level declarations (IMPORTANT) =====
    JRadioButton CoffeeItem, TeaItem, GiItem, LEMItem;
    ButtonGroup bts1, bts2, Pts1, gts1, Lts2;

    JTextField userTF, UserTF;
    JComboBox<String> PAY;

    JButton addBtn, removeBtn;
    JTextArea outputArea;

    public Restaurant() {
        super("MY RESTAURANT ITEMS :");
        setSize(800, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        Font MenuFont = new Font("Baguet Script", Font.BOLD, 20);
        Font ItemFont = new Font("Aptos Light", Font.BOLD, 15);
        Font itemFont = new Font("Aptos Light", Font.BOLD, 15);

        // ===== Title =====
        JLabel userMENU = new JLabel("OUR TEA ITEMS");
        userMENU.setBounds(320, 10, 180, 30);
        userMENU.setOpaque(true);
        userMENU.setBackground(new Color(152, 255, 152));
        userMENU.setFont(MenuFont);
        panel.add(userMENU);

        // ===== COFFEE =====
        CoffeeItem = new JRadioButton("COFFEE -- 5$");
        CoffeeItem.setBounds(19, 60, 130, 14);
        CoffeeItem.setOpaque(true);
        CoffeeItem.setBackground(new Color(137, 207, 240));
        CoffeeItem.setFont(ItemFont);
        panel.add(CoffeeItem);
		
		
	    JLabel CoffeeQu = new JLabel("QUANTITY:");
	    CoffeeQu.setBounds(25,100,140,10);
	    CoffeeQu.setOpaque(true);
	    panel.add(CoffeeQu);
	
	    String[] items = {"1","2","3","4","5"};
	    JComboBox<String> combo = new JComboBox<>(items);
	    combo.setBounds(25,115,130,25);
	    panel.add(combo);

        JRadioButton x1 = new JRadioButton("SUGAR");
        x1.setBounds(24, 150, 130, 25);
        panel.add(x1);
        
        JRadioButton x2 = new JRadioButton("WITHOUT SUGAR");
        x2.setBounds(24, 170, 130, 25);
        panel.add(x2);
	   
	   
   	    bts1 = new ButtonGroup();
        bts1.add(x1);
        bts1.add(x2);

        // ===== MASALA TEA =====
        TeaItem = new JRadioButton("MASALA TEA -- 3$");
        TeaItem.setBounds(19, 220, 170, 14);
        TeaItem.setOpaque(true);
        TeaItem.setBackground(new Color(137, 207, 240));
        TeaItem.setFont(ItemFont);
        panel.add(TeaItem);
		
		JLabel TeaQu = new JLabel("QUANTITY:");
	    TeaQu.setBounds(25,260,140,10);
	    TeaQu.setOpaque(true);
	    panel.add(TeaQu);
	
	    String[] item = {"1","2","3","4","5"};
	    JComboBox<String> combos = new JComboBox<>(item);
	    combos.setBounds(25,280,130,25);
	    panel.add(combos);

        JRadioButton x3 = new JRadioButton("SUGAR");
        x3.setBounds(25, 320, 130, 25);      
        panel.add(x3);
        
        JRadioButton x4 = new JRadioButton("WITHOUT SUGAR");
		x4.setBounds(25, 340, 130, 25);
		panel.add(x4);
		
        bts2 = new ButtonGroup();
        bts2.add(x3);
        bts2.add(x4);

        /*
        // ===== MASALA TEA =====
        MASItem = new JRadioButton("MASALA TEA -- 5$");
        MASItem.setBounds(215, 260, 160, 14);
        MASItem.setOpaque(true);
        MASItem.setBackground(new Color(137, 207, 240));
        MASItem.setFont(ItemFont);
        panel.add(MASItem);

        JRadioButton P1 = new JRadioButton("SUGAR");
        JRadioButton P2 = new JRadioButton("WITHOUT SUGAR");
        P1.setBounds(222, 360, 130, 25);
        P2.setBounds(222, 380, 130, 25);
        panel.add(P1);
        panel.add(P2);

        Pts1 = new ButtonGroup();
        Pts1.add(P1);
        Pts1.add(P2);
        */

        // ===== GINGER TEA =====
        GiItem = new JRadioButton("GINGER TEA -- 6$");
        GiItem.setBounds(570, 60, 160, 17);
        GiItem.setOpaque(true);
        GiItem.setBackground(new Color(137, 207, 240));
        GiItem.setFont(ItemFont);
        panel.add(GiItem);
		
		JLabel gIQu = new JLabel("QUANTITY:");
	    gIQu.setBounds(576,100,140,10);
	    gIQu.setOpaque(true);
	    panel.add(gIQu);
	
	    String[] gIitems = {"1","2","3","4","5"};
	    JComboBox<String> Ginger = new JComboBox<>(gIitems);
	    Ginger.setBounds(576,115,130,25);
	    panel.add(Ginger);

        JRadioButton g1 = new JRadioButton("SUGAR");
        g1.setBounds(576, 150, 130, 25);
		panel.add(g1);
		
		
		JRadioButton g2 = new JRadioButton("WITHOUT SUGAR");
        g2.setBounds(576, 170, 130, 25);
        panel.add(g2);

        gts1 = new ButtonGroup();
        gts1.add(g1);
        gts1.add(g2);

        // ===== LEMON TEA =====
        LEMItem = new JRadioButton("LEMON TEA -- 3$");
        LEMItem.setBounds(570, 220, 160, 14);
        LEMItem.setOpaque(true);
        LEMItem.setBackground(new Color(137, 207, 240));
        LEMItem.setFont(ItemFont);
        panel.add(LEMItem);
		
		JLabel LEMQu = new JLabel("QUANTITY:");
	    LEMQu.setBounds(576,260,140,10);
	    LEMQu.setOpaque(true);
	    panel.add(LEMQu);
	    
	    String[] LEMitem = {"1","2","3","4","5"};
	    JComboBox<String> LEMcombos = new JComboBox<>(LEMitem);
	    LEMcombos.setBounds(576,280,130,25);
	    panel.add(LEMcombos);

        JRadioButton L3 = new JRadioButton("SUGAR");
        JRadioButton L4 = new JRadioButton("WITHOUT SUGAR");
        L3.setBounds(576, 320, 130, 25);
        L4.setBounds(576, 340, 130, 25);
        panel.add(L3);
        panel.add(L4);

        Lts2 = new ButtonGroup();
        Lts2.add(L3);
        Lts2.add(L4);

        // ===== CUSTOMER INFO =====
        JLabel uName = new JLabel("BUYER'S NAME :");
        uName.setBounds(210, 90, 140, 19);
        uName.setOpaque(true);
        uName.setBackground(new Color(173, 248, 2));
        uName.setFont(itemFont);
        panel.add(uName);

        userTF = new JTextField();
        userTF.setBounds(353, 86, 160, 30);
        panel.add(userTF);

        JLabel Numbe = new JLabel("PHONE NUMBER :");
        Numbe.setBounds(210, 125, 140, 19);
        Numbe.setOpaque(true);
        Numbe.setBackground(new Color(173, 248, 2));
        Numbe.setFont(itemFont);
        panel.add(Numbe);

        UserTF = new JTextField();
        UserTF.setBounds(353, 120, 160, 30);
        panel.add(UserTF);

        JLabel Paymen = new JLabel("PAYMENT METHOD :");
        Paymen.setBounds(210, 160, 165, 20);
        Paymen.setOpaque(true);
        Paymen.setBackground(new Color(173, 248, 2));
        Paymen.setFont(itemFont);
        panel.add(Paymen);

        String[] payItems = {"BKASH", "ROCKET", "UPAY", "NAGAD", "CASH"};
        PAY = new JComboBox<>(payItems);
        PAY.setBounds(380, 160, 135, 25);
        panel.add(PAY);

        // ===== OUTPUT AREA =====
        outputArea = new JTextArea();
        outputArea.setBounds(210, 200, 300, 180);
        outputArea.setEditable(false);
        panel.add(outputArea);

        // ===== BUTTONS =====
        addBtn = new JButton("ADD ORDER");
        addBtn.setBounds(210, 380, 120, 30);
        panel.add(addBtn);

        removeBtn = new JButton("REMOVE");
        removeBtn.setBounds(350, 380, 120, 30);
        panel.add(removeBtn);

        // ===== ADD BUTTON LOGIC =====
        addBtn.addActionListener(e -> {
			int total = 0;
            String result = "Customer Name: " + userTF.getText() + "\n";
            result += "Phone: " + UserTF.getText() + "\n";
            result += "Payment: " + PAY.getSelectedItem() + "\n\n";
            result += "Ordered Items:\n";

            if (CoffeeItem.isSelected()) {
               int q = Integer.parseInt(combo.getSelectedItem().toString());
               result += "- Coffee (Qty: " + q + ")\n";
               total += q * 5;
            }
            
			if (TeaItem.isSelected()) {
               int q = Integer.parseInt(combos.getSelectedItem().toString());
               result += "- Masala Tea (Qty: " + q + ")\n";
               total += q * 3;
            }

            //if (MASItem.isSelected()) result += "- Masala Tea\n";
            if (GiItem.isSelected()) {
               int q = Integer.parseInt(Ginger.getSelectedItem().toString());
               result += "- Ginger Tea (Qty: " + q + ")\n";
               total += q * 6;
            }

            if (LEMItem.isSelected()) {
               int q = Integer.parseInt(LEMcombos.getSelectedItem().toString());
               result += "- Lemon Tea (Qty: " + q + ")\n";
               total += q * 3;
            }

            result += "\nTotal Price: $" + total;
            outputArea.setText(result);
			
			     try {
            Customer cust = new Customer(UserTF.getText(), UserTF.getText());
            FileIO.appendOrder("orders.txt", result);
            JOptionPane.showMessageDialog(this, "Order saved to orders.txt");
        }
		catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Failed to save order: " + ex.getMessage(),
                    "File Error", JOptionPane.ERROR_MESSAGE);
        }
			
			
			
        });

        // ===== REMOVE BUTTON LOGIC =====
        removeBtn.addActionListener(e -> {
            CoffeeItem.setSelected(false);
            TeaItem.setSelected(false);
            //MASItem.setSelected(false);
            GiItem.setSelected(false);
            LEMItem.setSelected(false);

            bts1.clearSelection();
            bts2.clearSelection();
            gts1.clearSelection();
            Lts2.clearSelection();

            UserTF.setText("");
            UserTF.setText("");
            outputArea.setText("");
        });

        add(panel);
        setVisible(true);
    }
}
