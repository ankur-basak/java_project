package Frame;
import java.io.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RegisteredList extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scrollPane;

    public RegisteredList() {
        super("Registered Passengers");
        super.setBounds(400, 300, 800, 400);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Phone");
        model.addColumn("Address");
        model.addColumn("Gender");

        table = new JTable(model);
        scrollPane = new JScrollPane(table);
        add(scrollPane);

        loadData();
    }

    private void loadData() {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length >= 5) {
                    model.addRow(new Object[]{parts[0], parts[1], parts[2], parts[3], parts[4]});
                }
            }
        } catch (IOException e) {
        }
    }
}