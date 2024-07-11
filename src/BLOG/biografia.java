package BLOG;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class biografia extends JFrame {
    private JButton HOBBIEButton;
    private JPanel JPanel_Biog;
    private JButton salirButton;

    public biografia()
    {
        super("Biografia");
        setContentPane(JPanel_Biog);
        HOBBIEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hobbies hobbi = new hobbies();
                hobbi.iniciar();
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                biografia salida = new biografia();
                salida.iniciar();
            }
        });
    }
    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
