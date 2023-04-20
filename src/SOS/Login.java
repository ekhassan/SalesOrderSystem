package SOS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame{

    JFrame frame;
    JTextField textField;
    JPasswordField passwordField;
    JButton btnlogin;
    JButton btnback;
    JLabel label;
    JLabel emailLabel;
    JLabel passwordLabel;


    Login()
    {
        frame = new JFrame();
        frame.setSize(1280,720);
        frame.getContentPane().setBackground(Color.WHITE);

        label =new JLabel();
        label.setFont(new Font("Poppins", Font.BOLD, 52));
        label.setBounds(568,61,144,108);
        label.setText("Login");

        emailLabel =new JLabel();
        emailLabel.setFont(new Font("Poppins", Font.BOLD, 16));
        emailLabel.setBounds(257, 292,64, 33);
        emailLabel.setText("Email");

        textField= new JTextField();
        textField.setBounds(453,284,472,50);
        textField.setFont(new Font("Poppins", Font.BOLD, 16));

        passwordLabel =new JLabel();
        passwordLabel.setFont(new Font("Poppins", Font.BOLD, 16));
        passwordLabel.setBounds(257, 408,111, 33);
        passwordLabel.setText("Password");

        passwordField =new JPasswordField();
        passwordField.setBounds(453,399,472,50);
        passwordField.setFont(new Font("Poppins", Font.BOLD, 16));

        btnlogin = new JButton("Login");
        btnlogin.setFont(new Font("Poppins", Font.BOLD, 16));
        btnlogin.setBorder(null);
        btnlogin.setFocusable(false);
        btnlogin.setForeground(Color.WHITE);
        btnlogin.setBackground(Color.BLACK);
        btnlogin.setBounds(725,517,200,55);

        btnlogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textField.getText();
                String password = new String(passwordField.getPassword());
                boolean isValid = DataBase.validateUser(username, password);
                if (isValid) {
                    JOptionPane.showMessageDialog(frame, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid email or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnback = new JButton("Back");
        btnback.setFont(new Font("Poppins", Font.BOLD, 16));
        btnback.setBorder(null);
        btnback.setFocusable(false);
        btnback.setForeground(Color.WHITE);
        btnback.setBackground(Color.BLACK);
        btnback.setBounds(453,517,200,55);

        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new WelcomeScreen();
            }
        });

        frame.add(label);
        frame.add(passwordLabel);
        frame.add(emailLabel);
        frame.add(textField);
        frame.add(passwordField);
        frame.add(btnlogin);
        frame.add(btnback);

        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Login();
    }
}
