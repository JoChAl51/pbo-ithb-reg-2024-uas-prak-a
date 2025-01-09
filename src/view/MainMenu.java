package view;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {
    public MainMenu() {
        initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        this.setSize(400, 460);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Main Menu");

        JLabel title = new JLabel("Menu Utama");
        title.setBounds(105, 50, 250, 40);
        title.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        panel.setBounds(44, 150, 300, 300);

        JButton login = new JButton("Login");
        login.setBounds(0, 0, 300, 40);
        panel.add(login);

        login.addActionListener(e ->  {
            this.dispose();
            new Login();
        });

        JButton register = new JButton("Registrasi Pengguna Baru");
        register.setBounds(0, 50, 300, 40);
        panel.add(register);

        register.addActionListener(e ->  {
            this.dispose();
            new Register();
        });

        JButton addTransaction = new JButton("Menambahkan Transaksi Pengiriman");
        addTransaction.setBounds(0, 100, 300, 40);
        panel.add(addTransaction);

        addTransaction.addActionListener(e ->  {
            this.dispose();
            new AddTransaction();
        });

        JButton history = new JButton("Melihat History Paket");
        history.setBounds(0, 150, 300, 40);
        panel.add(history);

        history.addActionListener(e ->  {
            this.dispose();
            new History();
        });

        add(title);
        add(panel);
    }
}