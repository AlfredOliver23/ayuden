package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con ;
    String url = "jdbc:mysql://localhost:3306/petlandpredos";
    String user= "root";
    String pass = "batiziano2023";
    public Connection getConnection() throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user,pass);
            System.out.println("conectadisimo");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Error al cargar el controlador de MySQL: " + e.getMessage());
        } catch (SQLException e) {
            throw new SQLException("Error al conectarse a la base de datos: " + e.getMessage());
        }
        return con;
    }

}
