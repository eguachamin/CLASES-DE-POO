package BLOG;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hobbies extends JFrame {
    private JButton biografiaButton;
    private JPanel JPanel_Hobbie;
    private JLabel imagen;

    public hobbies() {
        super("Hobbies");
        setContentPane(JPanel_Hobbie);
        ImageIcon icon = new ImageIcon(getClass().getResource("imagen/images (5).jpeg"));
        imagen.setIcon(icon);
        biografiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                biografia bio = new biografia();
                bio.iniciar();
            }
        });
    }
    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(700,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
