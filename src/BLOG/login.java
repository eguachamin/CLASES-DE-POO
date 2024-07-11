package BLOG;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JTextField usuario;
    private JButton INICIARSESIONButton;
    private JPasswordField passwordField1;
    private JPanel JPanel_Login;

    private void createUIComponents() {

        usuario = new JTextField();
        passwordField1 = new JPasswordField();
        INICIARSESIONButton = new JButton("INICIAR SESIÓN");
        JPanel_Login = new JPanel();
    }
    public login() {
        super("Ingreso de Sesión");
        setContentPane(JPanel_Login);
        INICIARSESIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario1= usuario.getText();
                String clave = new String(passwordField1.getPassword());
                if ("Evelyn".equals(usuario1) && "123456".equals(clave)){
                    biografia inicio = new biografia();
                    inicio.iniciar();
                }
                else {
                    JOptionPane.showMessageDialog(null,"Contraseña o Usuario incorrecto: Ingrese nuevamente ");
                    usuario.setText("");
                    passwordField1.setText("");
                }
            }
        });

    }

    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
