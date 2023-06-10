/*
*Autor: Mongeote Tlachy Daniel
*Fecha de creación: 09/06/2023
*Fecha de modificación: 09/06/2023
*Descripción: Clase encargada de la conexión a la base de datos
*/
package javafxsspger.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
    
    private static String driver = "com.mysql.jdbc.Driver";
    private static String nombreBase = "sspger";
    private static String hostname = "localhost";
    private static String port = "3306";
    
    private static String usuario = "DanielMT";
    private static String password = "ghosttown";
    
    private static String urlConexion = "jdbc:mysql://"+hostname+":"+port+"/"+nombreBase+"?allowPublicKeyRetrieval=true&useSSL=false";
    
    public static Connection abrirConexionBD(){
        Connection conexion = null;
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(urlConexion, usuario, password);
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println("Error de conexion con BD:" + ex.getMessage());
            ex.printStackTrace();
        }
        return conexion;
    }
}