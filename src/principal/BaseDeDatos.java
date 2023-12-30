package principal;

//Proyecto
import vistas.Principal;
import vistas.Pedidos;

//Look and Feel
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerContrastIJTheme;

//AWT
import java.awt.Color;

//Fecha
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import vistas.Usuarios;

public class BaseDeDatos extends javax.swing.JFrame {

    //Variables Globales
    public static boolean admin;
    
    //Constructor
    public BaseDeDatos() {
        
        initComponents();
        
        initStyles();
        setFecha();
        Utilidades.setView(new Principal(), panel_Contenedor, 750, 450);
        Utilidades.setImageLabel(logo.getWidth(),logo.getHeight(),logo, "src/imagenes/V2LogoW.png");
        
    }

    //Estilos para los objetos afectados por el Look and Feel
    private void initStyles() {
        
        mensaje.putClientProperty("FlatLaf.style", "font: 14 $light.font");
        mensaje.setForeground(new Color(233, 224, 211));
        navegacion.putClientProperty("FlatLaf.style", "font: $h3.font");
        navegacion.setForeground(new Color(233, 224, 211));
        fecha.putClientProperty("FlatLaf.style", "font: 24 $light.font");
        fecha.setForeground(new Color(233, 224, 211));
        separador.setForeground(new Color(233, 224, 211));
        
    }

    //Agrega información del día, mes y año al JLabel dateText
    private void setFecha() {
        
        LocalDate now = LocalDate.now();
        Locale spanish = new Locale("es", "ES");
        fecha.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanish)));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_BG = new javax.swing.JPanel();
        panel_Menu = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        boton_Principal = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        boton_Pedidos = new javax.swing.JButton();
        boton_Atras = new javax.swing.JButton();
        boton_Usuarios = new javax.swing.JButton();
        panel_Cabecera = new javax.swing.JPanel();
        navegacion = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        panel_Contenedor = new javax.swing.JPanel();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración");
        setMinimumSize(new java.awt.Dimension(1050, 700));
        setSize(new java.awt.Dimension(1020, 650));

        panel_BG.setBackground(new java.awt.Color(8, 5, 4));

        panel_Menu.setBackground(new java.awt.Color(192, 24, 26));

        nombre.setFont(new java.awt.Font("MADE Tommy Soft", 0, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(233, 224, 211));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("HARDCORE");

        separador.setForeground(new java.awt.Color(233, 224, 211));

        boton_Principal.setBackground(new java.awt.Color(213, 24, 26));
        boton_Principal.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        boton_Principal.setForeground(new java.awt.Color(233, 224, 211));
        boton_Principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
        boton_Principal.setText("PRINCIPAL");
        boton_Principal.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 10, 5, 5, new java.awt.Color(0, 0, 0)));
        boton_Principal.setBorderPainted(false);
        boton_Principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Principal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_Principal.setIconTextGap(10);
        boton_Principal.setPreferredSize(new java.awt.Dimension(46, 16));
        boton_Principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_PrincipalActionPerformed(evt);
            }
        });

        boton_Pedidos.setBackground(new java.awt.Color(213, 24, 26));
        boton_Pedidos.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        boton_Pedidos.setForeground(new java.awt.Color(233, 224, 211));
        boton_Pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pedidos.png"))); // NOI18N
        boton_Pedidos.setText("PEDIDOS");
        boton_Pedidos.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 10, 5, 5, new java.awt.Color(0, 0, 0)));
        boton_Pedidos.setBorderPainted(false);
        boton_Pedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Pedidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_Pedidos.setIconTextGap(10);
        boton_Pedidos.setPreferredSize(new java.awt.Dimension(46, 16));
        boton_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_PedidosActionPerformed(evt);
            }
        });

        boton_Atras.setBackground(new java.awt.Color(22, 21, 21));
        boton_Atras.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        boton_Atras.setForeground(new java.awt.Color(233, 224, 211));
        boton_Atras.setText("VOLVER");
        boton_Atras.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 10, 5, 5, new java.awt.Color(0, 0, 0)));
        boton_Atras.setBorderPainted(false);
        boton_Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AtrasActionPerformed(evt);
            }
        });

        boton_Usuarios.setBackground(new java.awt.Color(213, 24, 26));
        boton_Usuarios.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        boton_Usuarios.setForeground(new java.awt.Color(233, 224, 211));
        boton_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/users.png"))); // NOI18N
        boton_Usuarios.setText("USUARIOS");
        boton_Usuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 10, 5, 5, new java.awt.Color(0, 0, 0)));
        boton_Usuarios.setBorderPainted(false);
        boton_Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Usuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_Usuarios.setIconTextGap(10);
        boton_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_UsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_MenuLayout = new javax.swing.GroupLayout(panel_Menu);
        panel_Menu.setLayout(panel_MenuLayout);
        panel_MenuLayout.setHorizontalGroup(
            panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MenuLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panel_MenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(boton_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(boton_Pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(boton_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(boton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_MenuLayout.setVerticalGroup(
            panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MenuLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(boton_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(boton_Pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(boton_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(boton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        panel_Cabecera.setBackground(new java.awt.Color(197, 24, 26));
        panel_Cabecera.setPreferredSize(new java.awt.Dimension(714, 150));

        navegacion.setText("Administración/Control/Pedidos");

        fecha.setText("Hoy es {day} de {month} del {year}");

        javax.swing.GroupLayout panel_CabeceraLayout = new javax.swing.GroupLayout(panel_Cabecera);
        panel_Cabecera.setLayout(panel_CabeceraLayout);
        panel_CabeceraLayout.setHorizontalGroup(
            panel_CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CabeceraLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(panel_CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navegacion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        panel_CabeceraLayout.setVerticalGroup(
            panel_CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CabeceraLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(navegacion)
                .addGap(18, 18, 18)
                .addComponent(fecha)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        panel_Contenedor.setBackground(new java.awt.Color(8, 5, 4));
        panel_Contenedor.setLayout(new java.awt.BorderLayout());

        mensaje.setText("We love eating!");

        javax.swing.GroupLayout panel_BGLayout = new javax.swing.GroupLayout(panel_BG);
        panel_BG.setLayout(panel_BGLayout);
        panel_BGLayout.setHorizontalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addComponent(panel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_BGLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel_Cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addComponent(panel_Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panel_BGLayout.setVerticalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(mensaje)
                .addGap(5, 5, 5)
                .addComponent(panel_Cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_PedidosActionPerformed
        
        Utilidades.setView(new Pedidos(), panel_Contenedor, 750, 450);
        System.out.println(evt);
        
    }//GEN-LAST:event_boton_PedidosActionPerformed

    private void boton_PrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_PrincipalActionPerformed
        
        Utilidades.setView(new Principal(), panel_Contenedor, 750, 450);
        System.out.println(evt);
        
    }//GEN-LAST:event_boton_PrincipalActionPerformed

    //Vuelve al JFrame Inicio
    private void boton_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AtrasActionPerformed
        
        Inicio h = new Inicio();
        h.setVisible(true);
        this.setVisible(false);
        System.out.println(evt);
        
    }//GEN-LAST:event_boton_AtrasActionPerformed

    private void boton_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_UsuariosActionPerformed
       
        Utilidades.setView(new Usuarios(), panel_Contenedor, 750, 450);
        System.out.println(evt);
        
    }//GEN-LAST:event_boton_UsuariosActionPerformed

    public static void main(String args[]) {
        
        //Inicialización del Look and Feel
        FlatMaterialDarkerContrastIJTheme.setup();

        java.awt.EventQueue.invokeLater(() -> {
            new BaseDeDatos().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Atras;
    private javax.swing.JButton boton_Pedidos;
    private javax.swing.JButton boton_Principal;
    private javax.swing.JButton boton_Usuarios;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel navegacion;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panel_BG;
    private javax.swing.JPanel panel_Cabecera;
    public static javax.swing.JPanel panel_Contenedor;
    private javax.swing.JPanel panel_Menu;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}
