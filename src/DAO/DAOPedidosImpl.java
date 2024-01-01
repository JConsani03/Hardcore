package DAO;

//Proyecto
import DAO.DAOPedidos;
import bd.Conector;
import modelos.Pedidos;

//SQL
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Excepciones
import java.sql.SQLException;

//Listas
import java.util.ArrayList;
import java.util.List;

public class DAOPedidosImpl extends Conector implements DAOPedidos {

    private String identificarFecha(String año, String mes, String dia) {

        String sql;
        if (año.equals("Año") && mes.equals("Mes") && dia.equals("Día")) { // Validación para todos
            sql = "SELECT * FROM pedidos";
            
        } else if (año.equals("Año") && dia.equals("Día")) { // Validación para mes
            sql = "SELECT * FROM pedidos WHERE EXTRACT(MONTH FROM fecha) = '" + mes + "'";
            
        } else if (mes.equals("Mes") && dia.equals("Día")) { // Validación para año
            sql = "SELECT * FROM pedidos WHERE EXTRACT(YEAR FROM fecha) = '" + año + "'";
            
        } else if (año.equals("Año") && mes.equals("Mes")) { // Validación para día
            sql = "SELECT * FROM pedidos WHERE EXTRACT(DAY FROM fecha) = '" + dia + "'";
            
        } else if (año.equals("Año")) { // Validación para día y mes
            sql = "SELECT * FROM pedidos WHERE EXTRACT(MONTH FROM fecha) = '" + mes + "' AND EXTRACT(DAY FROM fecha) = '" + dia + "'";
            
        } else if (dia.equals("Día")) { // Validación para año y mes
            sql = "SELECT * FROM pedidos WHERE EXTRACT(YEAR FROM fecha) = '" + año + "' AND EXTRACT(MONTH FROM fecha) = '" + mes + "'";
            
        } else if (mes.equals("Mes")) { // Validación para día y año
            sql = "SELECT * FROM pedidos WHERE EXTRACT(YEAR FROM fecha) = '" + año + "' AND EXTRACT(DAY FROM fecha) = '" + dia + "'";
            
        } else { // Validación para fecha específica
            sql = "SELECT * FROM pedidos WHERE fecha = '" + año + "-" + mes + "-" + dia + "'";
            
        }
        return sql;

    }

    @Override
    public void ingresarP(Pedidos pedido) throws SQLException {

        try {

            this.Conectar();
            PreparedStatement ps = this.conexion.prepareStatement("INSERT INTO pedidos(fecha, descrip, monto, direc, tlf, delivery, formaP) VALUES(?, ?, ?, ?, ?, ?, ?)");

            ps.setString(1, pedido.getFecha());
            ps.setString(2, pedido.getDescrip());
            ps.setDouble(3, pedido.getMonto());
            ps.setString(4, pedido.getDirec());
            ps.setString(5, pedido.getTlf());
            ps.setString(6, "Ninguno");
            ps.setString(7, "Ninguno");
            ps.executeUpdate();

        } catch (ClassNotFoundException ex) {
            System.out.println("DB-ingresarP: " + ex);
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void eliminarP(int ID) throws SQLException {

        try {

            this.Conectar();
            PreparedStatement ps = this.conexion.prepareStatement("DELETE FROM pedidos WHERE ID = ?");
            ps.setInt(1, ID);
            ps.executeUpdate();

        } catch (ClassNotFoundException ex) {
            System.out.println("DB-eliminarP: " + ex);
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void editarP(int ID, Pedidos pedido) {

        try {

            this.Conectar();
            PreparedStatement ps = this.conexion.prepareStatement("UPDATE pedidos SET fecha = ?, descrip = ?, monto = ?, direc = ?, tlf = ?, formaP = ?, pgdo = ?, etgdo = ?, delivery = ? WHERE ID = '" + ID + "'");
            ps.setString(1, pedido.getFecha());
            ps.setString(2, pedido.getDescrip());
            ps.setDouble(3, pedido.getMonto());
            ps.setString(4, pedido.getDirec());
            ps.setString(5, pedido.getTlf());
            ps.setString(6, pedido.getFormaP());
            ps.setBoolean(7, pedido.isPgdo());
            ps.setBoolean(8, pedido.isEtgdo());
            ps.setString(9, pedido.getDelivery());
            ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("DB-editarP: " + ex);
        }

    }

    @Override
    public List<Pedidos> listarPF(int ID, boolean isFecha, String año, String mes, String dia) throws SQLException {

        List<Pedidos> lista = null;
        String sql;
        
        if (isFecha) { //Validamos si se va a listar por fecha       
            sql = identificarFecha(año, mes, dia);
        } else { //Si no se va a listar por fecha, lo hará por una ID específica
            sql = "SELECT * FROM pedidos WHERE ID = " + ID;
        }

        try {

            this.Conectar();
            PreparedStatement ps = this.conexion.prepareStatement(sql);
            lista = new ArrayList();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Pedidos pedido = new Pedidos();
                pedido.setId(rs.getInt("ID"));
                pedido.setFecha(rs.getString("fecha"));
                pedido.setDescrip(rs.getString("descrip"));
                pedido.setMonto(rs.getDouble("monto"));
                pedido.setDirec(rs.getString("direc"));
                pedido.setTlf(rs.getString("tlf"));
                pedido.setFormaP(rs.getString("formaP"));
                pedido.setPgdo(rs.getBoolean("pgdo"));
                pedido.setEtgdo(rs.getBoolean("etgdo"));
                pedido.setDelivery(rs.getString("delivery"));
                lista.add(pedido);

            }

        } catch (ClassNotFoundException ex) {
            System.out.println("DB-listarP: " + ex);
        } finally {
            this.Cerrar();
        }
        return lista;

    }
}
