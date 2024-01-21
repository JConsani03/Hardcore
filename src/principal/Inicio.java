package principal;

//Look and Feel
import DAO.DAOUsuariosImpl;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerContrastIJTheme;

//Proyecto
import vistas.Login;
import DAO.DAOUsuarios;

//Excepciones
import java.sql.SQLException;

//Swing
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Inicio extends javax.swing.JFrame {

    //Variables Globales
    private boolean bActivo, cambio;

    //Constructor
    public Inicio() {

        initComponents();

        //Inicialización de variables globales
        bActivo = false;
        cambio = false;
        
        panel_Contenedor.setVisible(false);
        boton_Atras.setVisible(false);
        boton_Iniciar.setVisible(false);

        Utilidades.setImageLabel(logo.getWidth(),logo.getHeight(),logo, "src/imagenes/V2LogoW.png");

    }

    /*Si no se ha llamado: activa el botón Atras, desactiva el botón Opciones y agrega el JPanel Login al JPanel Contenedor
      Si ya se ha llamado: inicia el JFrame BaseDeDatos (verificando antes el usuario de la base de datos) y cierra este*/
    private void iniciar() {

        if (!cambio) {
            
            panel_Contenedor.setVisible(true);
            Utilidades.setView(new Login(), panel_Contenedor, 360, 130);
            boton_Iniciar.setText("INICIAR");
            boton_Atras.setVisible(true);
            boton_Opciones.setEnabled(false);
            boton_Empezar.setEnabled(false);
            cambio = true;
            
        } else {
            
            if (Login.txt_Usuario.getText().equals("") || String.valueOf(Login.txt_Pass.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, llene los campos.");
            } else {
                
                try {
                    
                    String user = Login.txt_Usuario.getText();
                    String pass = String.valueOf(Login.txt_Pass.getPassword());
                    
                    DAOUsuarios dao = new DAOUsuariosImpl();
                    dao.listarU(true, false, 0, "", user, pass).forEach((i) -> BaseDeDatos.admin = i.isAdministrador());
                    BaseDeDatos db = new BaseDeDatos();
                    db.setVisible(true);        
                    this.setVisible(false);
                    
                } catch (SQLException | ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "ERROR: Usuario no registrado.");
                }
                
            }
            
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_BG = new javax.swing.JPanel();
        boton_Iniciar = new javax.swing.JButton();
        boton_Opciones = new javax.swing.JButton();
        PiePagina = new javax.swing.JLabel();
        panel_Contenedor = new javax.swing.JPanel();
        boton_Atras = new javax.swing.JButton();
        boton_Empezar = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        panel_Imagen = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setIconImage(getIconImage());
        setResizable(false);

        panel_BG.setBackground(new java.awt.Color(8, 5, 4));
        panel_BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_Iniciar.setBackground(new java.awt.Color(213, 24, 26));
        boton_Iniciar.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        boton_Iniciar.setForeground(new java.awt.Color(233, 224, 211));
        boton_Iniciar.setText("INICIAR SESIÓN");
        boton_Iniciar.setBorderPainted(false);
        boton_Iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Iniciar.setFocusable(false);
        boton_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_IniciarActionPerformed(evt);
            }
        });
        panel_BG.add(boton_Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 130, -1));

        boton_Opciones.setBackground(new java.awt.Color(8, 5, 4));
        boton_Opciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/settings.png"))); // NOI18N
        boton_Opciones.setBorderPainted(false);
        boton_Opciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Opciones.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/settingsRR.png"))); // NOI18N
        boton_Opciones.setFocusable(false);
        boton_Opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_OpcionesActionPerformed(evt);
            }
        });
        panel_BG.add(boton_Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 24, 24));

        PiePagina.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        PiePagina.setForeground(new java.awt.Color(233, 224, 211));
        PiePagina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PiePagina.setText("©2017 HARDCORE COMPANY");
        panel_BG.add(PiePagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 360, 30));

        javax.swing.GroupLayout panel_ContenedorLayout = new javax.swing.GroupLayout(panel_Contenedor);
        panel_Contenedor.setLayout(panel_ContenedorLayout);
        panel_ContenedorLayout.setHorizontalGroup(
            panel_ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        panel_ContenedorLayout.setVerticalGroup(
            panel_ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        panel_BG.add(panel_Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 360, 130));

        boton_Atras.setBackground(new java.awt.Color(213, 24, 26));
        boton_Atras.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        boton_Atras.setForeground(new java.awt.Color(233, 224, 211));
        boton_Atras.setText("ATRÁS");
        boton_Atras.setBorderPainted(false);
        boton_Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Atras.setFocusable(false);
        boton_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AtrasActionPerformed(evt);
            }
        });
        panel_BG.add(boton_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 130, -1));

        boton_Empezar.setBackground(new java.awt.Color(213, 24, 26));
        boton_Empezar.setFont(new java.awt.Font("MADE Tommy Soft", 0, 24)); // NOI18N
        boton_Empezar.setForeground(new java.awt.Color(233, 224, 211));
        boton_Empezar.setText("EMPEZAR");
        boton_Empezar.setBorderPainted(false);
        boton_Empezar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Empezar.setFocusable(false);
        boton_Empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_EmpezarActionPerformed(evt);
            }
        });
        panel_BG.add(boton_Empezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 180, 50));
        panel_BG.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 160, 160));

        mensaje.setFont(new java.awt.Font("MADE Tommy Soft", 0, 24)); // NOI18N
        mensaje.setForeground(new java.awt.Color(233, 224, 211));
        mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje.setText("¡REALIZA TU ORDEN!");
        panel_BG.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 360, -1));

        panel_Imagen.setBackground(new java.awt.Color(8, 5, 4));
        panel_Imagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/food.png"))); // NOI18N
        panel_Imagen.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 380, 400));

        panel_BG.add(panel_Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Activa o desactiva el botón Inicar
    private void boton_OpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_OpcionesActionPerformed

        bActivo = !bActivo;
        boton_Iniciar.setVisible(bActivo);
        System.out.println(evt);

    }//GEN-LAST:event_boton_OpcionesActionPerformed

    private void boton_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_IniciarActionPerformed

        iniciar();
        System.out.println(evt);

    }//GEN-LAST:event_boton_IniciarActionPerformed

    //Desactiva el botón Atras e Iniciar a la vez que desactiva el JPanel Contenedor y activa el botón Opciones
    private void boton_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AtrasActionPerformed

        bActivo = !bActivo;
        cambio = !cambio;
        boton_Atras.setVisible(false);
        boton_Iniciar.setVisible(false);
        boton_Opciones.setEnabled(true);
        panel_Contenedor.setVisible(false);
        boton_Empezar.setEnabled(true);
        boton_Iniciar.setText("INICIAR SESIÓN");
        System.out.println(evt);

    }//GEN-LAST:event_boton_AtrasActionPerformed

    //inicia el JFrame Datos y cierra este
    private void boton_EmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_EmpezarActionPerformed

        Datos p = new Datos();
        p.setVisible(true);
        this.setVisible(false);
        System.out.println(evt);

    }//GEN-LAST:event_boton_EmpezarActionPerformed

    public static void main(String args[]) {
        
        //Inicialización del Look and Feel
        FlatMaterialDarkerContrastIJTheme.setup();
        UIManager.put("TextComponent.arc", 900);
        UIManager.put("Button.arc", 32);

        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PiePagina;
    private javax.swing.JButton boton_Atras;
    private javax.swing.JButton boton_Empezar;
    private javax.swing.JButton boton_Iniciar;
    private javax.swing.JButton boton_Opciones;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel panel_BG;
    private javax.swing.JPanel panel_Contenedor;
    private javax.swing.JPanel panel_Imagen;
    // End of variables declaration//GEN-END:variables
}
