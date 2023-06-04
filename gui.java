import javax.swing.*;
import java.awt.*;

public class gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My GUI");

        // Create components
        JButton button = new JButton("Click me");
        JCheckBox checkBox = new JCheckBox("Check me");
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(20);
        JTextArea textArea = new JTextArea(5, 20);
        JComboBox<String> comboBox = new JComboBox<String>(new String[] {"Option 1", "Option 2", "Option 3"});
        JPasswordField passwordField = new JPasswordField(20);

        // Set layout
        frame.setLayout(new GridLayout(0, 2));

        // Add components to the frame
        frame.add(button);
        frame.add(checkBox);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(label);
        frame.add(textField);
        frame.add(textArea);
        frame.add(comboBox);
        frame.add(passwordField);

        // Set frame properties
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
