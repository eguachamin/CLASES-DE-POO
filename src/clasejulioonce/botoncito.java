package clasejulioonce;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class botoncito extends JFrame{
    private JPanel JPanel_botoncito;
    private JButton botonButton;
    private JTextField nom;
    private JTextField eda;
    private JTextField not1;
    private JTextField not2;
    private JButton VISUALIZARButton;

    public botoncito()
    {
        super("Botoncito");
        setContentPane(JPanel_botoncito);
        botonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    insertarDatos();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        VISUALIZARButton.addActionListener(new ActionListener() {
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
    public Connection conexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ESFOT_VENTAS";
        String user ="root";
        String password="";

        //try(Connection connecta = DriverManager.getConnection(url,user,password)) {
            //if (connecta != null){
                //System.out.println("Conexion exitosa a la base de Datos");
               // JOptionPane.showMessageDialog(null,"Conexion exitosa a la base de Datos");
                /*String nombre = nom.getText();
                String edad = eda.getText();
                String nota1= not1.getText();
                String nota2= not2.getText();
                //Float edad=Float.parseFloat(eda.getText());
                String sql= "INSERT INTO ESTUDIANTES (NOMBRE_ESTU,EDAD_ESTU,NOTA1,NOTA2)VALUES(?,?,?,?)";
                PreparedStatement pstmt = connecta.prepareStatement(sql);
                pstmt.setString(1,nombre);
                pstmt.setInt(2,Integer.parseInt(edad));
                pstmt.setDouble(3,Double.parseDouble(nota1));
                pstmt.setDouble(4,Double.parseDouble(nota2));
                int rowAffected = pstmt.executeUpdate();
                if(rowAffected>0){
                    JOptionPane.showMessageDialog(null,"Registro insertado correctamente");
                    nom.setText("");
                    eda.setText("");
                    not1.setText("");
                    not2.setText("");
                }
                pstmt.close();
                connecta.close();*/
            //}
            //else {
                //System.out.println("Conexion no");
                return DriverManager.getConnection(url,user,password);
            //}

        //}
        //catch (SQLException e) {
          //  e.printStackTrace();
        //}
    }
    public void insertarDatos() throws SQLException {
        String nombre = nom.getText();
        String edad = eda.getText();
        String nota1= not1.getText();
        String nota2= not2.getText();

        Connection connecta = conexion();
        //Float edad=Float.parseFloat(eda.getText());
        String sql= "INSERT INTO ESTUDIANTES (NOMBRE_ESTU,EDAD_ESTU,NOTA1,NOTA2)VALUES(?,?,?,?)";
        PreparedStatement pstmt = connecta.prepareStatement(sql);
        pstmt.setString(1,nombre);
        pstmt.setInt(2,Integer.parseInt(edad));
        pstmt.setDouble(3,Double.parseDouble(nota1));
        pstmt.setDouble(4,Double.parseDouble(nota2));
        int rowAffected = pstmt.executeUpdate();
        if(rowAffected>0){
            JOptionPane.showMessageDialog(null,"Registro insertado correctamente");
            nom.setText("");
            eda.setText("");
            not1.setText("");
            not2.setText("");
        }
        pstmt.close();
        connecta.close();
    }
    public void iniciar(){
        setVisible(true);
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void visualizar() throws SQLException {
        String nombre = nom.getText();
        Connection connection = conexion();
        String query = "SELECT * FROM ESTUDIANTES where NOMBRE_ESTU=?";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1,nombre);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()){
            String edad =rs.getString("EDAD_ESTU");
            JOptionPane.showMessageDialog(null,"nombre"+nombre+"edad"+edad);
        }
        rs.close();
        connection.close();
    }

}
