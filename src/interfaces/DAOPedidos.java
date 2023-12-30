package interfaces;

//Proyecto
import modelos.Pedidos;

//SQL
import java.sql.SQLException;

//Lista
import java.util.List;

public interface DAOPedidos {
    
    public void ingresarP(Pedidos pedido) throws SQLException, ClassNotFoundException;

    public void eliminarP(int ID) throws SQLException, ClassNotFoundException;

    public void editarP(int ID, Pedidos pedido) throws SQLException, ClassNotFoundException;

    public List<Pedidos> listarPF(int ID, boolean isFecha, String año, String mes, String dia) throws SQLException, ClassNotFoundException;
}
