package SOS;

import com.mysql.cj.WarningListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen extends JFrame {

    JFrame frame;
    JButton btnlogin;
    JButton btnregister;
    JLabel title;
    JLabel txt;
    JLabel hero;

    WelcomeScreen()
    {
        frame = new JFrame();
        frame.setSize(1280,720);
        frame.getContentPane().setBackground(Color.WHITE);

        title = new JLabel();
        title.setText("SOS");
        title.setBounds(588,61,105,78);
        title.setFont(new Font("Poppins", Font.BOLD, 52));

        hero = new JLabel();
        hero.setIcon(new ImageIcon("D:\\JAVA\\Sales Order System\\src\\SOS\\sos_hero.png"));
        hero.setBounds(60,180, 452,360);

        txt = new JLabel();
        txt.setIcon(new ImageIcon("D:\\JAVA\\Sales Order System\\src\\SOS\\sos_txt.png"));
        txt.setBounds(748,214, 472,283);

        btnlogin = new JButton("Login");
        btnlogin.setFont(new Font("Poppins", Font.BOLD, 16));
        btnlogin.setBorder(null);
        btnlogin.setFocusable(false);
        btnlogin.setForeground(Color.WHITE);
        btnlogin.setBackground(Color.BLACK);
        btnlogin.setBounds(748,570,200,55);

        btnlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Login();
            }
        });

        btnregister = new JButton("Register");
        btnregister.setFont(new Font("Poppins", Font.BOLD, 16));
        btnregister.setBorder(null);
        btnregister.setFocusable(false);
        btnregister.setForeground(Color.WHITE);
        btnregister.setBackground(Color.BLACK);
        btnregister.setBounds(1020,570,200,55);

        btnregister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Register();
            }
        });

        frame.add(title);
        frame.add(hero);
        frame.add(txt);
        frame.add(btnlogin);
        frame.add(btnregister);

        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new WelcomeScreen();
    }
}
