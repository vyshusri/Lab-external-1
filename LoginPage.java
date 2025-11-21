import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginPage() {
        setTitle("Login Page");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel userLabel = new JLabel("Username:");
        userField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        passField = new JPasswordField();

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        messageLabel = new JLabel("");

        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(new JLabel("")); // Placeholder
        add(loginButton);
        add(messageLabel);

        setLocationRelativeTo(null); // Center window
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userField.getText();
        String password = new String(passField.getPassword());

        // Hardcoded credentials (for demo purposes)
        if (username.equals("admin") && password.equals("password")) {
            messageLabel.setText("Login successful!");
            messageLabel.setForeground(Color.GREEN);
        } else {
            messageLabel.setText("Invalid credentials.");
            messageLabel.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}