package ConexionBD;

import java.sql.*;

public class ConexionBD {
    private Connection conexion;
    private String user = "sa";
    private String password = "P@ssw0rd";
    private String nombreBD = "LibreriaSedeQuito";

    public Connection conexion() {
       try{
//            String urlBD = "jdbc:sqlserver://RICARDO:1433;"+"databaseName="+nombreBD;
            String urlBD = "jdbc:sqlserver://RICARDO:1433;databaseName="+nombreBD+";encrypt=true;trustServerCertificate=true;";
            conexion = DriverManager.getConnection(urlBD, user, password);
            System.out.println("Conexion exitosa con la BD " + nombreBD);
            return conexion;
        }catch(Exception e){
            System.out.println(e.toString());
            System.out.println("Conexion no exitosa");
        }
            return null;
    }
}
