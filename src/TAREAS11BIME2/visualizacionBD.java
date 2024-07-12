package TAREAS11BIME2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.*;

public class visualizacionBD extends JFrame {
    private JTable table1;
    private JPanel Jpanel_Visual;
    private JButton button1;
    private JLabel VerDatos;


    public visualizacionBD() {
        super("Viualizacion de Información");
        setContentPane(Jpanel_Visual);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    visualizar();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    public Connection conectado() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/CURSO";
        String user = "root";
        String password="";

        return DriverManager.getConnection(url,user,password);
    }
    public void visualizar() throws SQLException {
        Connection conectar = conectado();
        String sql = "SELECT * FROM ESTUDIANTES";
        Statement stm = conectar.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        StringBuilder strg = new StringBuilder("<html>");
        while (rs.next()){
            strg.append("<b>Nombre y Apellido: </b>").append(rs.getString("NOM_APEL")).append("<br>");
            strg.append("<b>Edad: </b>").append(rs.getString("EDAD_ESTU")).append("<br>");
            strg.append("<b>Direccion: </b>").append(rs.getString("DIRECCION_ESTU")).append("<br>");
            strg.append("<b>Telefono: </b>").append(rs.getString("TELEF_ESTU")).append("<br>");
            strg.append("<b>Correo: </b>").append(rs.getString("CORREO_ESTU")).append("<br>");
            strg.append("<b>Nota 1: </b>").append(rs.getString("NOTA1_ESTU")).append("<br>");
            strg.append("<b>Nota 2: </b>").append(rs.getString("NOTA2_ESTU")).append("<br>");
        }
        strg.append("<html>");
        VerDatos.setText(strg.toString());
        conectar.close();
        stm.close();
    }

    public void iniciar(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500,400);
    }
}
