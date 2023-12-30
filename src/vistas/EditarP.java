package vistas;

//Proyecto
import principal.DAOPedidosImpl;
import principal.BaseDeDatos;
import interfaces.DAOPedidos;
import principal.Utilidades;

//Excepciones
import java.awt.HeadlessException;
import java.text.ParseException;
import java.sql.SQLException;

//Swing
import javax.swing.JOptionPane;

public class EditarP extends javax.swing.JPanel {

    //Variables Globales
    private Object[] lista;
    private final int ID;

    //Constructor
    public EditarP(int ID) throws SQLException, ClassNotFoundException {

        initComponents();

        //Inicialización de variables globales
        this.ID = ID;

        initStyles();
        agregarDatos();

    }

    //Agrega los datos a los campos del pedido a editar
    private void agregarDatos() throws SQLException, ClassNotFoundException {

        DAOPedidos p = new DAOPedidosImpl();
        p.listarPF(ID, false, "", "", "").forEach((i) -> lista = new Object[]{i.getId(), i.getFecha(), i.getDescrip(), i.getDirec(), i.getTlf(), i.getFormaP(), i.isPgdo(), i.isEtgdo(), i.getDelivery(), i.getMonto()});
        txt_ID.setText(lista[0].toString());
        txt_Fecha.setText(lista[1].toString());
        txtA_Descrip.setText(lista[2].toString());
        txtA_Direc.setText(lista[3].toString());
        txt_Tlf.setText(lista[4].toString());
        txt_FormaP.setText(lista[5].toString());
        check_Pgdo.setSelected(Boolean.parseBoolean(lista[6].toString()));
        check_Etgdo.setSelected(Boolean.parseBoolean(lista[7].toString()));
        txt_Delivery.setText(lista[8].toString());
        txt_Monto.setText(lista[9].toString());

    }

    //Inicializa los estilos de los componentes
    private void initStyles() {

        txt_Fecha.putClientProperty("JTextField.placeholderText", "Ej: año-mes-día");
        txt_Tlf.putClientProperty("JTextField.placeholderText", "Ej: 04121234567 (11 cts.)");
        txt_FormaP.putClientProperty("JTextField.placeholderText", "...");
        txt_Delivery.putClientProperty("JTextField.placeholderText", "...");
        txt_Monto.putClientProperty("JTextField.placeholderText", "Ej: 0.0");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_BG = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        boton_Editar = new javax.swing.JButton();
        label_ID = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        label_Fecha = new javax.swing.JLabel();
        txt_Fecha = new javax.swing.JTextField();
        label_Descrip = new javax.swing.JLabel();
        label_Monto = new javax.swing.JLabel();
        txt_Monto = new javax.swing.JTextField();
        label_Direc = new javax.swing.JLabel();
        label_Tlf = new javax.swing.JLabel();
        txt_Tlf = new javax.swing.JTextField();
        label_FormaP = new javax.swing.JLabel();
        txt_FormaP = new javax.swing.JTextField();
        label_Pgdo = new javax.swing.JLabel();
        label_Etgdo = new javax.swing.JLabel();
        label_Delivery = new javax.swing.JLabel();
        txt_Delivery = new javax.swing.JTextField();
        check_Pgdo = new javax.swing.JCheckBox();
        check_Etgdo = new javax.swing.JCheckBox();
        boton_Atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_Direc = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtA_Descrip = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 450));

        panel_BG.setBackground(new java.awt.Color(8, 5, 4));
        panel_BG.setPreferredSize(new java.awt.Dimension(750, 400));

        titulo.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(233, 224, 211));
        titulo.setText("EDICIÓN");

        boton_Editar.setBackground(new java.awt.Color(51, 153, 0));
        boton_Editar.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        boton_Editar.setForeground(new java.awt.Color(233, 224, 211));
        boton_Editar.setText("EDITAR");
        boton_Editar.setBorderPainted(false);
        boton_Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_EditarActionPerformed(evt);
            }
        });

        label_ID.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_ID.setForeground(new java.awt.Color(233, 224, 211));
        label_ID.setText("ID (OBLIGATORIO):");

        txt_ID.setEditable(false);
        txt_ID.setBackground(new java.awt.Color(233, 224, 211));
        txt_ID.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        txt_ID.setForeground(new java.awt.Color(8, 5, 4));
        txt_ID.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(233, 224, 211)));
        txt_ID.setMaximumSize(new java.awt.Dimension(200, 2147483647));

        label_Fecha.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_Fecha.setForeground(new java.awt.Color(233, 224, 211));
        label_Fecha.setText("FECHA:");

        txt_Fecha.setBackground(new java.awt.Color(233, 224, 211));
        txt_Fecha.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        txt_Fecha.setForeground(new java.awt.Color(8, 5, 4));
        txt_Fecha.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(233, 224, 211)));
        txt_Fecha.setMaximumSize(new java.awt.Dimension(200, 2147483647));

        label_Descrip.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_Descrip.setForeground(new java.awt.Color(233, 224, 211));
        label_Descrip.setText("DESCRIPCIÓN:");

        label_Monto.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_Monto.setForeground(new java.awt.Color(233, 224, 211));
        label_Monto.setText("MONTO:");

        txt_Monto.setBackground(new java.awt.Color(233, 224, 211));
        txt_Monto.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        txt_Monto.setForeground(new java.awt.Color(8, 5, 4));
        txt_Monto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(233, 224, 211)));
        txt_Monto.setMaximumSize(new java.awt.Dimension(250, 2147483647));

        label_Direc.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_Direc.setForeground(new java.awt.Color(233, 224, 211));
        label_Direc.setText("DIRECCIÓN:");

        label_Tlf.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_Tlf.setForeground(new java.awt.Color(233, 224, 211));
        label_Tlf.setText("TELÉFONO:");

        txt_Tlf.setBackground(new java.awt.Color(233, 224, 211));
        txt_Tlf.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        txt_Tlf.setForeground(new java.awt.Color(8, 5, 4));
        txt_Tlf.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(233, 224, 211)));
        txt_Tlf.setMaximumSize(new java.awt.Dimension(250, 2147483647));

        label_FormaP.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_FormaP.setForeground(new java.awt.Color(233, 224, 211));
        label_FormaP.setText("FORMA DE PAGO:");

        txt_FormaP.setBackground(new java.awt.Color(233, 224, 211));
        txt_FormaP.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        txt_FormaP.setForeground(new java.awt.Color(8, 5, 4));
        txt_FormaP.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(233, 224, 211)));
        txt_FormaP.setMaximumSize(new java.awt.Dimension(250, 2147483647));

        label_Pgdo.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_Pgdo.setForeground(new java.awt.Color(233, 224, 211));
        label_Pgdo.setText("PAGADO:");

        label_Etgdo.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_Etgdo.setForeground(new java.awt.Color(233, 224, 211));
        label_Etgdo.setText("ENTREGADO:");

        label_Delivery.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_Delivery.setForeground(new java.awt.Color(233, 224, 211));
        label_Delivery.setText("DELIVERY");

        txt_Delivery.setBackground(new java.awt.Color(233, 224, 211));
        txt_Delivery.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        txt_Delivery.setForeground(new java.awt.Color(8, 5, 4));
        txt_Delivery.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(233, 224, 211)));
        txt_Delivery.setMaximumSize(new java.awt.Dimension(250, 2147483647));

        check_Pgdo.setBackground(new java.awt.Color(8, 5, 4));
        check_Pgdo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check_Pgdo.setFocusable(false);

        check_Etgdo.setBackground(new java.awt.Color(8, 5, 4));
        check_Etgdo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check_Etgdo.setFocusable(false);

        boton_Atras.setBackground(new java.awt.Color(213, 24, 26));
        boton_Atras.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        boton_Atras.setForeground(new java.awt.Color(233, 224, 211));
        boton_Atras.setText("ATRÁS");
        boton_Atras.setBorderPainted(false);
        boton_Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AtrasActionPerformed(evt);
            }
        });

        txtA_Direc.setBackground(new java.awt.Color(233, 224, 211));
        txtA_Direc.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        txtA_Direc.setForeground(new java.awt.Color(8, 5, 4));
        txtA_Direc.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(233, 224, 211)));
        txtA_Direc.setMaximumSize(new java.awt.Dimension(200, 2147483647));
        jScrollPane1.setViewportView(txtA_Direc);

        txtA_Descrip.setBackground(new java.awt.Color(233, 224, 211));
        txtA_Descrip.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        txtA_Descrip.setForeground(new java.awt.Color(8, 5, 4));
        txtA_Descrip.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(233, 224, 211)));
        txtA_Descrip.setMaximumSize(new java.awt.Dimension(200, 2147483647));
        jScrollPane2.setViewportView(txtA_Descrip);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout panel_BGLayout = new javax.swing.GroupLayout(panel_BG);
        panel_BG.setLayout(panel_BGLayout);
        panel_BGLayout.setHorizontalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_BGLayout.createSequentialGroup()
                        .addComponent(boton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_BGLayout.createSequentialGroup()
                        .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_ID)
                            .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Fecha)
                            .addComponent(txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Descrip)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Direc)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Tlf)
                            .addComponent(txt_Tlf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_FormaP)
                            .addComponent(txt_FormaP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Pgdo)
                            .addComponent(check_Pgdo)
                            .addComponent(label_Etgdo)
                            .addComponent(check_Etgdo)
                            .addComponent(label_Delivery)
                            .addComponent(txt_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Monto)
                            .addComponent(txt_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        panel_BGLayout.setVerticalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_BGLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(titulo))
                    .addGroup(panel_BGLayout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_BGLayout.createSequentialGroup()
                                .addComponent(label_ID)
                                .addGap(1, 1, 1)
                                .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(label_Fecha)
                                .addGap(1, 1, 1)
                                .addComponent(txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(label_Descrip)
                                .addGap(1, 1, 1)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(label_Direc)
                                .addGap(1, 1, 1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_BGLayout.createSequentialGroup()
                                .addComponent(label_Tlf)
                                .addGap(1, 1, 1)
                                .addComponent(txt_Tlf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(label_FormaP)
                                .addGap(1, 1, 1)
                                .addComponent(txt_FormaP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(label_Pgdo)
                                .addGap(1, 1, 1)
                                .addComponent(check_Pgdo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(label_Etgdo)
                                .addGap(1, 1, 1)
                                .addComponent(check_Etgdo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(label_Delivery)
                                .addGap(1, 1, 1)
                                .addComponent(txt_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(label_Monto)
                                .addGap(1, 1, 1)
                                .addComponent(txt_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    //Edita un pedido en la base de datos según su ID
    private void boton_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_EditarActionPerformed

        try {
            
            modelos.Pedidos pedido = new modelos.Pedidos();

            Utilidades.esFecha(txt_Fecha.getText());
            pedido.setFecha(txt_Fecha.getText());

            Utilidades.esNumero(txt_Tlf.getText());
            pedido.setTlf(txt_Tlf.getText());

            pedido.setId(Integer.parseInt(txt_ID.getText()));
            pedido.setDescrip(txtA_Descrip.getText());
            pedido.setDirec(txtA_Direc.getText());
            pedido.setFormaP(txt_FormaP.getText());
            pedido.setPgdo(check_Pgdo.isSelected());
            pedido.setEtgdo(check_Etgdo.isSelected());
            pedido.setDelivery(txt_Delivery.getText());
            pedido.setMonto(Double.parseDouble(txt_Monto.getText()));

            DAOPedidos p = new DAOPedidosImpl();
            p.editarP(pedido.getId(), pedido);
            JOptionPane.showMessageDialog(null, "¡Edición exitosa!");
            Utilidades.setView(new Pedidos(), BaseDeDatos.panel_Contenedor, 750, 450);

        } catch (HeadlessException | SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA EDICIÓN \nPor favor, asegúrese de que los datos ingresados en los campos y sus formatos sean los correctos.");
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "ERROR EN EL CAMPO 'Fecha' \nPor favor, asegúrese de que la fecha ingresada cumpla con el formato establecido (Año-Mes-Día | Ej: 2020-01-01).");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERROR EN EL CAMPO 'Teléfono' \nPor favor, asegúrese de que el número de teléfono no contenga caracteres alfanuméricos (A, a, *, -, etc...) y que este cumpla la cantidad de caracteres correcta (11 caracteres).");
        }
        System.out.println(evt);

    }//GEN-LAST:event_boton_EditarActionPerformed

    //Regresa al JPanel Pedidos
    private void boton_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AtrasActionPerformed

        Utilidades.setView(new Pedidos(), BaseDeDatos.panel_Contenedor, 750, 450);
        System.out.println(evt);

    }//GEN-LAST:event_boton_AtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Atras;
    private javax.swing.JButton boton_Editar;
    private javax.swing.JCheckBox check_Etgdo;
    private javax.swing.JCheckBox check_Pgdo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_Delivery;
    private javax.swing.JLabel label_Descrip;
    private javax.swing.JLabel label_Direc;
    private javax.swing.JLabel label_Etgdo;
    private javax.swing.JLabel label_Fecha;
    private javax.swing.JLabel label_FormaP;
    private javax.swing.JLabel label_ID;
    private javax.swing.JLabel label_Monto;
    private javax.swing.JLabel label_Pgdo;
    private javax.swing.JLabel label_Tlf;
    private javax.swing.JPanel panel_BG;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextArea txtA_Descrip;
    private javax.swing.JTextArea txtA_Direc;
    private javax.swing.JTextField txt_Delivery;
    private javax.swing.JTextField txt_Fecha;
    private javax.swing.JTextField txt_FormaP;
    public static javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_Monto;
    private javax.swing.JTextField txt_Tlf;
    // End of variables declaration//GEN-END:variables
}
