package clients.login;

import javax.swing.*;
import java.awt.*;
import middle.MiddleFactory;

public class loginView {
		public static void main(String[] args) {
        JFrame frame = new JFrame("Testing1");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width, screenSize.height); 
        JPanel panel = new JPanel();
        JTextField textBox1 = new JTextField(30);
        JTextField textBox2 = new JTextField(30);
        
        panel.add(new JLabel("Username:")); 
        panel.add(textBox1);
        panel.add(new JLabel("Password:"));
        panel.add(textBox2);
        
        JButton LoginButton = new JButton("Login");
        panel.add(LoginButton);
        LoginButton.addActionListener(e -> {
        String username = textBox1.getText();
        String password = textBox2.getText();
        
        if ("Username".equals(username) && "Password".equals(password)) {
        JOptionPane.showMessageDialog(frame,"Login successful!","Success",JOptionPane.INFORMATION_MESSAGE);
        frame.dispose();
        } else {
        JOptionPane.showMessageDialog(
        frame, "Invalid username or password. Please try again.","Login Error",
        JOptionPane.ERROR_MESSAGE
        );
        }
        });
        frame.add(panel);
        frame.setVisible(true);
        panel.setBackground(Color.gray);

}
}