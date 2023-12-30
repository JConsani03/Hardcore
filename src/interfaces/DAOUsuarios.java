package interfaces;

//Proyecto
import modelos.Usuarios;

//SQL
import java.sql.SQLException;

//Lista
import java.util.List;

public interface DAOUsuarios {
    
    public void ingresarU(Usuarios usuario) throws SQLException, ClassNotFoundException;

    public void eliminarU(int ID) throws SQLException, ClassNotFoundException;

    public void editarU(int ID, Usuarios usuario) throws SQLException, ClassNotFoundException;

    public List<Usuarios> listarU(boolean porUser, boolean porID, int ID, String nombre, String user, String pass) throws SQLException, ClassNotFoundException;
    
}
