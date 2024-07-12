package TAREAS11BIME2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class registroBd extends JFrame{
    private JTextField nom_apel;
    private JTextField age1;
    private JTextField direcc;
    private JTextField phone1;
    private JTextField e_mail;
    private JTextField nota1;
    private JTextField nota2;
    private JButton GUARDARButton;
    private JPanel JPanel_Registro;
    private JButton MENUButton;


    public registroBd()
    {
        super("Registro Estudiantes");
        setContentPane(JPanel_Registro);
        GUARDARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try {
                    registrarEstudiante();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuBD menud = new menuBD();
                menud.iniciar();
            }
        });
    }
    public Connection conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/CURSO";
        String user = "root";
        String password = "";

        return DriverManager.getConnection(url,user,password);
    }
    public void registrarEstudiante() throws SQLException {
        String nombre = nom_apel.getText();
        String edad = age1.getText();
        String direccion= direcc.getText();
        String telefono= phone1.getText();
        String correo= e_mail.getText();
        String nota_1= nota1.getText();
        String nota_2= nota2.getText();
        Connection conectarse = conectar();
        String sql = "INSERT INTO ESTUDIANTES (NOM_APEL,DIRECCION_ESTU,EDAD_ESTU,TELEF_ESTU,CORREO_ESTU,NOTA1_ESTU,NOTA2_ESTU)VALUES (?,?,?,?,?,?,?)";
        PreparedStatement stmr = conectarse.prepareStatement(sql);
        stmr.setString(1,nombre);
        stmr.setString(2,direccion);
        stmr.setInt(3,Integer.parseInt(edad));
        stmr.setInt(4,Integer.parseInt(telefono));
        stmr.setString(5,correo);
        stmr.setDouble(6,Double.parseDouble(nota_1));
        stmr.setDouble(7,Double.parseDouble(nota_2));
        int rowAffected = stmr.executeUpdate();
        if (rowAffected>0){
            JOptionPane.showMessageDialog(null,"Registro ingresado correctamente");
            nom_apel.setText("");
            age1.setText("");
            direcc.setText("");
            phone1.setText("");
            e_mail.setText("");
            nota1.setText("");
            nota2.setText("");
        }
        conectarse.close();
        stmr.close();
    }
    public void iniciar(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500,400);
    }
}
