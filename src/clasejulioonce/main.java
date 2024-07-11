package clasejulioonce;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class main {
    public static void main(String[] args){
        /*String url = "jdbc:mysql://localhost:3306/ESFOT_VENTAS";
        String user ="root";
        String password="";

        try(Connection connecta = DriverManager.getConnection(url,user,password)) {
            if (connecta != null){
                System.out.println("Conexion exitosa a la base de Datos");
            }
            else {
                System.out.println("Conexion no");
            }

        }
         catch (SQLException e) {
            e.printStackTrace();
        }*/
        botoncito ventana = new botoncito();
        ventana.iniciar();

    }
}