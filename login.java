package Bank_Management;

import javax.swing.*;
import java.awt.*;

public class login extends JFrame {

    JLabel label1, label2, label3;

    login() {
        super("Bank Management System");

        setSize(850, 480);
        setLocation(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // ===== BACKGROUND IMAGE =====
        ImageIcon bgIcon = new ImageIcon(
                "c:/Users/viren/OneDrive/Pictures/Screenshots/Screenshot 2026-02-01 233621.png"
        );
        Image bgImg = bgIcon.getImage().getScaledInstance(850, 480, Image.SCALE_SMOOTH);
        JLabel background = new JLabel(new ImageIcon(bgImg));
        background.setBounds(0, 0, 850, 480);
        setContentPane(background);
        background.setLayout(null);

        // ===== LOGO =====
        ImageIcon logoIcon = new ImageIcon(
                "c:/Users/viren/Downloads/Screenshot_2026-02-01_223804-removebg-preview.png"
        );
        Image logoImg = logoIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel logo = new JLabel(new ImageIcon(logoImg));
        logo.setBounds(375, 20, 100, 100);
        background.add(logo);

        // ===== CARD IMAGE =====
        ImageIcon cardIcon = new ImageIcon(
                "c:/Users/viren/Downloads/Screenshot_2026-02-01_232821-removebg-preview.png"
        );
        Image cardImg = cardIcon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        JLabel card = new JLabel(new ImageIcon(cardImg));
        card.setBounds(680, 330, 120, 120);
        background.add(card);

        // ===== TEXT LABELS =====
        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Arial", Font.BOLD, 38));
        label1.setBounds(230, 125, 450, 50);
        background.add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Arial", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150, 190, 375, 30);
        background.add(label2);

        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Arial", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150, 250, 375, 30);
        background.add(label3);

        setVisible(true);
    }

    public static void main(String[] args) {
        new login();
    }
}
