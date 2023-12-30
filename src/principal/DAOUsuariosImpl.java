package principal;

//Proyecto
import bd.Conector;
import interfaces.DAOUsuarios;
import modelos.Usuarios;

//SQL
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Excepciones
import java.sql.SQLException;

//Listas
import java.util.ArrayList;
import java.util.List;

public class DAOUsuariosImpl extends Conector implements DAOUsuarios {

    @Override
    public void ingresarU(Usuarios user) throws SQLException {

        try {

            this.Conectar();
            PreparedStatement ps = this.conexion.prepareStatement("INSERT INTO usuarios(cedula, nombres, apellidos, usuario, pass, administrador) VALUES(?, ?, ?, ?, ?, ?)");

            ps.setString(1, user.getCedula());
            ps.setString(2, user.getNombres());
            ps.setString(3, user.getApellidos());
            ps.setString(4, user.getUsuario());
            ps.setString(5, user.getContraseña());
            ps.setBoolean(6, user.isAdministrador());
            ps.executeUpdate();

        } catch (ClassNotFoundException ex) {
            System.out.println("DB-ingresarU: " + ex);
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void eliminarU(int ID) throws SQLException {

        try {

            this.Conectar();
            PreparedStatement ps = this.conexion.prepareStatement("DELETE FROM usuarios WHERE ID = ?");
            ps.setInt(1, ID);
            ps.executeUpdate();

        } catch (ClassNotFoundException ex) {
            System.out.println("DB-eliminarU: " + ex);
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void editarU(int ID, Usuarios user) {

        try {

            this.Conectar();
            PreparedStatement ps = this.conexion.prepareStatement("UPDATE usuarios SET cedula = ?, nombres = ?, apellidos = ?, usuario = ?, pass = ?, administrador = ? WHERE ID = '" + ID + "'");
            ps.setString(1, user.getCedula());
            ps.setString(2, user.getNombres());
            ps.setString(3, user.getApellidos());
            ps.setString(4, user.getUsuario());
            ps.setString(5, user.getContraseña());
            ps.setBoolean(6, user.isAdministrador());
            ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("DB-editarU: " + ex);
        }

    }
    
    @Override
    public List<Usuarios> listarU(boolean porUser, boolean porID, int ID, String nombre, String usuario, String pass) throws SQLException {

        List<Usuarios> lista = null;
        String sql;

        if (porID) {
            System.out.println(ID);
            sql = "SELECT * FROM usuarios WHERE ID = '" + ID + "'";
            
        } else if (porUser) {
            sql = "SELECT * FROM usuarios WHERE usuario = '" + usuario + "' AND pass = '" + pass + "'";
            
        } else if (nombre.equals("")) {
            sql = "SELECT * FROM usuarios";
            
        } else {
            sql = "SELECT * FROM usuarios WHERE nombres LIKE '" + nombre + "%'";
            
        }

        try {

            this.Conectar();
            PreparedStatement ps = this.conexion.prepareStatement(sql);
            lista = new ArrayList();
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                
                rs.beforeFirst();
                while (rs.next()) {

                    Usuarios user = new Usuarios();
                    user.setID(rs.getInt("ID"));
                    user.setCedula(rs.getString("cedula"));
                    user.setNombres(rs.getString("nombres"));
                    user.setApellidos(rs.getString("apellidos"));
                    user.setUsuario(rs.getString("usuario"));
                    user.setContraseña(rs.getString("pass"));
                    user.setAdministrador(rs.getBoolean("administrador"));
                    lista.add(user);

                }
                
            } else {
                throw new SQLException();
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("DB-listarU: " + ex);
        } finally {
            this.Cerrar();
        }
        return lista;

    }
}
