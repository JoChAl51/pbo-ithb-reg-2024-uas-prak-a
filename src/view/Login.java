package view;

import config.DirectoryConfig;
import controller.AuthenticationController;
import controller.ImageController;

import javax.swing.*;
import java.awt.*;


public class Login extends JFrame {
	public Login() {
		initComponents();
		setVisible(true);
	}

	private void initComponents() {
		this.setSize(400, 450);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Grab");
		this.getContentPane().setBackground(Color.WHITE);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JLabel title = new JLabel("Login Grab");
		title.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 35));
		title.setBounds(100, 22, 200, 51);

		JPanel formLogin = new JPanel();
		formLogin.setBackground(Color.WHITE);
		formLogin.setLayout(null);
		formLogin.setBounds(44, 100, 300, 150);

		JLabel cellphoneLabel = new JLabel("Nomor Telepon:");
		cellphoneLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
		cellphoneLabel.setBounds(94, 0, 130, 30);
		formLogin.add(cellphoneLabel);

		JTextField cellphoneField = new JTextField(255);
		cellphoneField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
		cellphoneField.setBounds(0, 33, 298, 30);
		formLogin.add(cellphoneField);

		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
		passwordLabel.setBounds(113, 77, 130, 30);
		formLogin.add(passwordLabel);

		JPasswordField passwordField = new JPasswordField(255);
		passwordField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
		passwordField.setBounds(0, 110, 298, 30);
		formLogin.add(passwordField);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.WHITE);
		buttonPanel.setLayout(null);
		buttonPanel.setBackground(Color.WHITE);
		buttonPanel.setBounds(43, 275, 300, 40);

		JButton loginButton = new JButton("Login");
		loginButton.setBounds(0, 0, 150, 40);
		buttonPanel.add(loginButton);

		loginButton.addActionListener(e -> {
			String cellphone = cellphoneField.getText();
			String password = passwordField.getText();
			int results = new AuthenticationController().login(cellphone, password);
			if (results != 0) {
				this.dispose();
			}
		});

		JButton backButton = new JButton("Back");
		backButton.setBounds(150, 0, 150, 40);
		buttonPanel.add(backButton);

		backButton.addActionListener(e -> {
			this.dispose();
			new MainMenu();
		});

		String imagePath = DirectoryConfig.ASSET_DIRECTORY + "dummy\\grab-seeklogo.png";
		JLabel victualImage = new JLabel(imagePath);
		victualImage.setBounds(150, 350, 52, 20);
		victualImage.setIcon(new ImageIcon(ImageController.resizeImage(imagePath, 52, 20)));

		add(title);
		add(formLogin);
		add(buttonPanel);
		add(victualImage);
	}
}