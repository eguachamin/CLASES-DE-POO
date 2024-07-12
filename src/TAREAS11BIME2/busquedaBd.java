package TAREAS11BIME2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class busquedaBd extends JFrame{
    private JPanel JPanel_Search;
    private JTextField busqueda;
    private JButton BUSCARButton;
    private JButton MENUButton;
    private JLabel name;
    private JLabel age;
    private JLabel direccion;
    private JLabel email;
    private JLabel phone;
    private JLabel grade1;
    private JLabel grade2;

    public busquedaBd()
    {
        super("Busqueda de Información");
        setContentPane(JPanel_Search);
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuBD salida = new menuBD();
                salida.iniciar();
            }
        });
        BUSCARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    busqueda();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    public Connection conectado () throws SQLException {
        String url = "jdbc:mysql://localhost:3306/CURSO";
        String user ="root";
        String password = "";
        return DriverManager.getConnection(url,user,password);
    }
    public void busqueda() throws SQLException {
        String nombre = busqueda.getText();
        Connection conectar = conectado();
        String sql = "SELECT * FROM ESTUDIANTES WHERE NOM_APEL=?";
        PreparedStatement strm = conectar.prepareStatement(sql);
        strm.setString(1,nombre);
        ResultSet rs = strm.executeQuery();
        if (rs.next()){
            String search = rs.getString("NOM_APEL");
            if (search.equals(nombre)){
                name.setText(rs.getString("NOM_APEL"));
                age.setText(rs.getString("EDAD_ESTU"));
                direccion.setText(rs.getString("DIRECCION_ESTU"));
                email.setText(rs.getString("CORREO_ESTU"));
                phone.setText(rs.getString("TELEF_ESTU"));
                grade1.setText(rs.getString("NOTA1_ESTU"));
                grade2.setText(rs.getString("NOTA2_ESTU"));
            }
        }
    }
    public void iniciar(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500,400);
    }
}
