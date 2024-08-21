import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeApp {

    private JTextField fname;
    private JTextField lname;
    private JButton jButton1;

    public WelcomeApp() {
        // Initialize components
        fname = new JTextField(20);
        lname = new JTextField(20);
        jButton1 = new JButton("Submit");

        // Set up the frame
        JFrame frame = new JFrame("Welcome App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel and add components
        JPanel panel = new JPanel();
        panel.add(new JLabel("First Name:"));
        panel.add(fname);
        panel.add(new JLabel("Last Name:"));
        panel.add(lname);
        panel.add(jButton1);

        frame.add(panel);
        frame.setVisible(true);

        // Add action listener to the button
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        // Get the first name and last name
        String firstname = fname.getText();
        String lastname = lname.getText();
        // Show a welcome message
        JOptionPane.showMessageDialog(null, "Welcome " + firstname + " " + lastname);
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WelcomeApp();
            }
        });
    }
}
