package bd;

//SQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

    //Variables Globales
    protected Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    
    private final String DB_URL = "jdbc:mysql://localhost/hardcore";
    private final String USER = "root";
    private final String PASS = "";

    //Inicia una conexión con la base de datos
    public void Conectar() throws SQLException, ClassNotFoundException {

        conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Class.forName(JDBC_DRIVER);

    }

    //Cierra la conexión con la base de datos
    public void Cerrar() throws SQLException {
        
        if (conexion != null && !conexion.isClosed()) {
            conexion = null;
        }
        
    }
}
