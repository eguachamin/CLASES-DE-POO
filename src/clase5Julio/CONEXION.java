package clase5Julio;

import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CONEXION extends JFrame{
    private JButton button1;
    private JPanel panel1;
    private JLabel ver_datos;

    public CONEXION() {
        super("Conexion a Base de Datos");
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url="jdbc:mysql://localhost:3306/esfot_ventas";//Nombre de la base de datos
                String user="root";
                String password="";
                try (Connection connection = DriverManager.getConnection(url,user,password)){
                    //System.out.println("Conectado a la base de Datos");
                    String query="select CORREO_CLI from cliente";
                    Statement statement =  connection.createStatement();
                    ResultSet resultSet=statement.executeQuery(query);

                    StringBuilder ver_datos = new StringBuilder("<html>");
                    while (resultSet.next())
                        ver_datos.append("<b>Nombre:</b>").append(resultSet.getString("NOMBRE_CLI")).append("<br>");
                        ver_datos.append("<b>Correo:</b>").append(resultSet.getString("CORREO_CLI")).append("<br>");
                        ver_datos.append("<b>Password:</b>").append(resultSet.getString("PASSW_CLI")).append("<br>");
                }

                catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
    }
    //Forma de mostrar la pantalla (opcion sencilla)
//    public void iniciar(){
//        setVisible(true);
//        setLocationRelativeTo(null);
//        setSize(500,400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
}
class Main {
    public static void main(String[] args) throws SQLException {
        //Abrir pantalla con metodo contructor
        CONEXION conectar = new CONEXION();
        conectar.setVisible(true);
        //Una forma mas de iniciar con metodo
        //CONEXION conectar = new CONEXION();
        //conectar.iniciar();
    }
}
