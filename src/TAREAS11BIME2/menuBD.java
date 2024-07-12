package TAREAS11BIME2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuBD extends JFrame{
    private JPanel JPanel_Menu;
    private JCheckBox REGISTRODEESTUDIANTESCheckBox;
    private JCheckBox VISUALIZACIONDEREGISTROSCheckBox;
    private JCheckBox BUSQUEDACheckBox;
    private JButton SALIRButton;

    public menuBD()
    {
        super("Menu Principal");
        setContentPane(JPanel_Menu);
        REGISTRODEESTUDIANTESCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registroBd regis = new registroBd();
                regis.iniciar();
            }
        });

        VISUALIZACIONDEREGISTROSCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizacionBD visuo = new visualizacionBD();
                visuo.iniciar();
            }
        });
        BUSQUEDACheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                busquedaBd buscar = new busquedaBd();
                buscar.iniciar();
            }
        });
        SALIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginBD salida = new loginBD();
                salida.iniciar();
            }
        });
    }
    public void iniciar(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500,400);
    }
}
