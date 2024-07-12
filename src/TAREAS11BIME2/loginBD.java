package TAREAS11BIME2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class loginBD extends JFrame{
    private JPanel JPanel_LoginBD;
    private JTextField correoing;
    private JTextField passing;
    private JButton INGRESARButton;

    public loginBD()
    {
        super("LOGIN");
        setContentPane(JPanel_LoginBD);
        INGRESARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    comprobacionLogin();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    public Connection coneccion() throws SQLException {
        String url= "jdbc:mysql://localhost:3306/CURSO";
        String user = "root";
        String pass= "";

        return DriverManager.getConnection(url,user,pass);
    }
    public void comprobacionLogin() throws SQLException {
        String correo = correoing.getText();
        String password=passing.getText();
        Connection conectar = coneccion();
        String query = "SELECT * FROM USUARIO_ADMINISTRADOR WHERE CORREO_UAD=? AND PASS_ADMIN=?";
        PreparedStatement stm = conectar.prepareStatement(query);
        stm.setString(1,correo);
        stm.setString(2,password);
        ResultSet rs = stm.executeQuery();
        if (rs.next()){
            String mail1=rs.getString("CORREO_UAD");
            String pass2=rs.getString("PASS_ADMIN");
            if (mail1.equals(correo) && pass2.equals(password) ){
                menuBD menu1=new menuBD();
                menu1.iniciar();
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"El correo ingreso no es correcto");
            correoing.setText("");
            passing.setText("");
        }
        conectar.close();
        rs.close();
        stm.close();

    }
    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
