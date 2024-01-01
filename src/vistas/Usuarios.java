package vistas;

//Proyecto
import DAO.DAOUsuariosImpl;
import DAO.DAOUsuarios;

//Excepciones
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Swing
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import principal.BaseDeDatos;

public class Usuarios extends javax.swing.JPanel {

    //Constructor
    public Usuarios() {

        initComponents();
        initStyles();
        verificarAdmin(BaseDeDatos.admin);
        txtBuscar();
        llenarT("");

    }

    //Verifica si el usuario tiene el rango Administrador. De caso contrario, deshabilita algunas opciones
    private void verificarAdmin(boolean admin) {
        if (!admin) {
            boton_Agregar.setEnabled(false);
            boton_Editar.setEnabled(false);
            boton_Eliminar.setEnabled(false);
        }
    }

    //Limpia los campos
    private void limpiarCampos() {
        txt_ID.setText("");
        txt_Cedula.setText("");
        txt_Nombres.setText("");
        txt_Apellidos.setText("");
        txt_Usuario.setText("");
        txt_Pass.setText("");
        check_Admin.setSelected(false);
    }

    //Inicializa los estilos de los componentes
    private void initStyles() {

        txt_Buscar.putClientProperty("JTextField.placeholderText", "...");
        txt_ID.putClientProperty("JTextField.placeholderText", "ID");
        txt_Cedula.putClientProperty("JTextField.placeholderText", "C.I. Ej: V-12345678");
        txt_Nombres.putClientProperty("JTextField.placeholderText", "NOMBRES");
        txt_Apellidos.putClientProperty("JTextField.placeholderText", "APELLIDOS");
        txt_Usuario.putClientProperty("JTextField.placeholderText", "NOMBRE DE USUARIO");
        txt_Pass.putClientProperty("JTextField.placeholderText", "CONTRASEÑA");

    }

    //Llena la tabla
    private void llenarT(String nombre) {

        System.out.println(nombre);
        DefaultTableModel modelo = (DefaultTableModel) tabla_1.getModel();
        modelo.setRowCount(0);
        DAOUsuarios user = new DAOUsuariosImpl();
        try {

            user.listarU(false, false, 0, nombre, "", "").forEach(
                    (i) -> modelo.addRow(
                            new Object[]{
                                i.getID(), i.getCedula(), i.getNombres(), i.getApellidos(), i.isAdministrador()
                            }
                    )
            );

        } catch (SQLException | ClassNotFoundException ex) {
        }

    }
    
    //Verifica que la cadena recibida cumpla con el formato establecido
    private boolean esCed(String ced){
        
        String regex = "[A-Za-z]-\\d{7,8}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ced);
        return matcher.matches();
        
    }

    //Detecta si se ha actualizado el campo txt_Buscar
    private void txtBuscar() {
        
        txt_Buscar.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                llenarT(txt_Buscar.getText());
                // Hacer algo con el texto ingresado
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                llenarT(txt_Buscar.getText());
                // Hacer algo con el texto ingresado
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                llenarT(txt_Buscar.getText());
            }
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_BG = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        scrollPanel_1 = new javax.swing.JScrollPane();
        tabla_1 = new javax.swing.JTable();
        boton_Editar = new javax.swing.JButton();
        boton_Eliminar = new javax.swing.JButton();
        boton_Agregar = new javax.swing.JButton();
        txt_Buscar = new javax.swing.JTextField();
        label_1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        label_2 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        txt_Cedula = new javax.swing.JTextField();
        txt_Nombres = new javax.swing.JTextField();
        txt_Apellidos = new javax.swing.JTextField();
        txt_Usuario = new javax.swing.JTextField();
        txt_Pass = new javax.swing.JTextField();
        label_3 = new javax.swing.JLabel();
        check_Admin = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 450));

        panel_BG.setBackground(new java.awt.Color(8, 5, 4));
        panel_BG.setPreferredSize(new java.awt.Dimension(750, 400));
        panel_BG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_BGMouseClicked(evt);
            }
        });

        titulo.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(233, 224, 211));
        titulo.setText("USUARIOS");

        tabla_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Cédula", "Nombres", "Apellidos", "Administrador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_1.setFocusable(false);
        tabla_1.setShowGrid(true);
        tabla_1.getTableHeader().setReorderingAllowed(false);
        tabla_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_1MouseClicked(evt);
            }
        });
        scrollPanel_1.setViewportView(tabla_1);

        boton_Editar.setBackground(new java.awt.Color(102, 102, 102));
        boton_Editar.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        boton_Editar.setForeground(new java.awt.Color(233, 224, 211));
        boton_Editar.setText("EDITAR");
        boton_Editar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 10, new java.awt.Color(0, 0, 0)));
        boton_Editar.setBorderPainted(false);
        boton_Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_EditarActionPerformed(evt);
            }
        });

        boton_Eliminar.setBackground(new java.awt.Color(213, 24, 26));
        boton_Eliminar.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        boton_Eliminar.setForeground(new java.awt.Color(233, 224, 211));
        boton_Eliminar.setText("ELIMINAR");
        boton_Eliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 10, new java.awt.Color(0, 0, 0)));
        boton_Eliminar.setBorderPainted(false);
        boton_Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_EliminarActionPerformed(evt);
            }
        });

        boton_Agregar.setBackground(new java.awt.Color(51, 153, 0));
        boton_Agregar.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        boton_Agregar.setForeground(new java.awt.Color(233, 224, 211));
        boton_Agregar.setText("AGREGAR");
        boton_Agregar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 10, 2, 10, new java.awt.Color(0, 0, 0)));
        boton_Agregar.setBorderPainted(false);
        boton_Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Agregar.setFocusable(false);
        boton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AgregarActionPerformed(evt);
            }
        });

        txt_Buscar.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        txt_Buscar.setForeground(new java.awt.Color(233, 224, 211));

        label_1.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_1.setForeground(new java.awt.Color(233, 224, 211));
        label_1.setText("BÚSQUEDA POR NOMBRE:");

        jSeparator1.setForeground(new java.awt.Color(233, 224, 211));

        label_2.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_2.setForeground(new java.awt.Color(233, 224, 211));
        label_2.setText("AGREGAR/EDITAR");

        txt_ID.setEditable(false);
        txt_ID.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        txt_ID.setForeground(new java.awt.Color(233, 224, 211));
        txt_ID.setFocusable(false);

        txt_Cedula.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        txt_Cedula.setForeground(new java.awt.Color(233, 224, 211));

        txt_Nombres.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        txt_Nombres.setForeground(new java.awt.Color(233, 224, 211));

        txt_Apellidos.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        txt_Apellidos.setForeground(new java.awt.Color(233, 224, 211));

        txt_Usuario.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        txt_Usuario.setForeground(new java.awt.Color(233, 224, 211));

        txt_Pass.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        txt_Pass.setForeground(new java.awt.Color(233, 224, 211));

        label_3.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_3.setForeground(new java.awt.Color(233, 224, 211));
        label_3.setText("Administrador");

        check_Admin.setBackground(new java.awt.Color(8, 5, 4));
        check_Admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_BGLayout = new javax.swing.GroupLayout(panel_BG);
        panel_BG.setLayout(panel_BGLayout);
        panel_BGLayout.setHorizontalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_BGLayout.createSequentialGroup()
                        .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_1)
                            .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel_BGLayout.createSequentialGroup()
                                    .addComponent(label_3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(check_Admin))
                                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_Pass, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Usuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Apellidos, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Nombres, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Cedula, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_ID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_BGLayout.createSequentialGroup()
                                        .addComponent(label_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                                    .addComponent(txt_Buscar, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(panel_BGLayout.createSequentialGroup()
                                .addComponent(boton_Agregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton_Editar)))
                        .addGap(16, 16, 16)
                        .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPanel_1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                            .addComponent(boton_Eliminar))
                        .addGap(16, 16, 16))
                    .addGroup(panel_BGLayout.createSequentialGroup()
                        .addComponent(titulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel_BGLayout.setVerticalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(titulo)
                .addGap(11, 11, 11)
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BGLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(label_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(check_Admin)
                            .addComponent(label_3))))
                .addGap(8, 8, 8)
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    //Inicia el JPanel EditarP dentro del JPanel Contenedor de la clase BaseDeDatos
    private void boton_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_EditarActionPerformed

        if (tabla_1.getSelectedRow() == -1) { //Valida si se ha seleccionado algún pedido
            JOptionPane.showMessageDialog(null, "Seleccione un usuario para editar.");
        } else if (!esCed(txt_Cedula.getText())) {
            JOptionPane.showMessageDialog(null, "Cédula incompatible, asegúrese de que cumpla el formato.");
        } else {

            int ID = (int) tabla_1.getValueAt(tabla_1.getSelectedRow(), 0);
            try {
                
                DAOUsuarios user = new DAOUsuariosImpl();
                modelos.Usuarios model = new modelos.Usuarios();
                model.setCedula(txt_Cedula.getText());
                model.setNombres(txt_Nombres.getText());
                model.setApellidos(txt_Apellidos.getText());
                model.setUsuario(txt_Usuario.getText());
                model.setContraseña(txt_Pass.getText());
                model.setAdministrador(check_Admin.isSelected());
                user.editarU(ID, model);
                JOptionPane.showMessageDialog(null, "¡Edición exitosa!");
                
            } catch (SQLException | ClassNotFoundException ex) {
                System.out.println(ex);
            }  
            llenarT("");
            limpiarCampos();
            boton_Agregar.setEnabled(true);
            
        }
        System.out.println(evt);

    }//GEN-LAST:event_boton_EditarActionPerformed

    //Elimina un pedido en la base de datos según su ID
    private void boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_EliminarActionPerformed

        if (tabla_1.getSelectedRow() != -1) { //Valida si no se ha seleccionado ningún pedido de la tabla

            int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea realizar una eliminación?");
            if (opcion == 0) { //Valida si el susuario quiere realizar la eliminación

                for (int i : tabla_1.getSelectedRows()) { //Recorre la lista de pedidos seleccionados para eliminarlos

                    try {
                        DAOUsuarios user = new DAOUsuariosImpl();
                        user.eliminarU((int) tabla_1.getValueAt(i, 0));
                    } catch (SQLException | ClassNotFoundException ex) {
                        System.out.println(ex);
                    }

                }
                JOptionPane.showMessageDialog(null, "¡Eliminación exitosa!");
                llenarT(txt_Buscar.getText());
                limpiarCampos();

            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione uno o varios usuarios para eliminar.");
        }
        System.out.println(evt);

    }//GEN-LAST:event_boton_EliminarActionPerformed

    //Actualiza la tabla
    private void boton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AgregarActionPerformed

        if (txt_Cedula.getText().equals("") || txt_Nombres.getText().equals("") || txt_Apellidos.getText().equals("") || txt_Usuario.getText().equals("") || txt_Pass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos.");
        } else if (!esCed(txt_Cedula.getText())) {
            JOptionPane.showMessageDialog(null, "Cédula incompatible, asegúrese de que cumpla el formato.");
        } else {
            
            modelos.Usuarios user = new modelos.Usuarios();
            user.setCedula(txt_Cedula.getText());
            user.setNombres(txt_Nombres.getText());
            user.setApellidos(txt_Apellidos.getText());
            user.setUsuario(txt_Usuario.getText());
            user.setContraseña(txt_Pass.getText());
            user.setAdministrador(check_Admin.isSelected());

            DAOUsuarios dao = new DAOUsuariosImpl();
            try {
                
                dao.ingresarU(user);
                llenarT(txt_Buscar.getText());
                JOptionPane.showMessageDialog(null, "¡Usuario registrado exitosamente!");
                
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al ingresar el usuario.");
            }
            
        }
        System.out.println(evt);

    }//GEN-LAST:event_boton_AgregarActionPerformed

    private void tabla_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_1MouseClicked

        if (BaseDeDatos.admin) {

            boton_Agregar.setEnabled(false);
            int ID = (int) tabla_1.getValueAt(tabla_1.getSelectedRow(), 0);
            System.out.println(ID);
            try {

                DAOUsuarios user = new DAOUsuariosImpl();
                for (modelos.Usuarios i : user.listarU(false, true, ID, "", "", "")) {

                    txt_ID.setText(String.valueOf(i.getID()));
                    txt_Cedula.setText(i.getCedula());
                    txt_Nombres.setText(i.getNombres());
                    txt_Apellidos.setText(i.getApellidos());
                    txt_Usuario.setText(i.getUsuario());
                    txt_Pass.setText(i.getContraseña());
                    check_Admin.setSelected(i.isAdministrador());

                }

            } catch (SQLException | ClassNotFoundException ex) {
                System.out.println(ex);
            }

        }
        System.out.println(evt);

    }//GEN-LAST:event_tabla_1MouseClicked

    private void panel_BGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_BGMouseClicked

        if (BaseDeDatos.admin) boton_Agregar.setEnabled(true);

        tabla_1.clearSelection();
        limpiarCampos();
        System.out.println(evt);

    }//GEN-LAST:event_panel_BGMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Agregar;
    private javax.swing.JButton boton_Editar;
    private javax.swing.JButton boton_Eliminar;
    private javax.swing.JCheckBox check_Admin;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_1;
    private javax.swing.JLabel label_2;
    private javax.swing.JLabel label_3;
    private javax.swing.JPanel panel_BG;
    private javax.swing.JScrollPane scrollPanel_1;
    public static javax.swing.JTable tabla_1;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txt_Apellidos;
    private javax.swing.JTextField txt_Buscar;
    private javax.swing.JTextField txt_Cedula;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_Nombres;
    private javax.swing.JTextField txt_Pass;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
