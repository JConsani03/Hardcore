package vistas;

//iText
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;

//Proyecto
import principal.DAOPedidosImpl;
import principal.BaseDeDatos;
import principal.Utilidades;
import interfaces.DAOPedidos;

//Excepciones
import java.sql.SQLException;
import java.io.IOException;

//Swing
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pedidos extends javax.swing.JPanel {

    //Constructor
    public Pedidos() {

        initComponents();
        verificarAdmin(BaseDeDatos.admin);
        initCombos();
        llenarT(-1, -1, -1);

    }

    //Verifica si el usuario tiene el rango Administrador. De caso contrario, deshabilita algunas opciones
    private void verificarAdmin(boolean admin){
        
        if(!admin){
            boton_Editar.setEnabled(false);
            boton_Eliminar.setEnabled(false);
        }
        
    }
    
    //Llena los comboBox
    private void initCombos() {

        for (int i = 2023; i <= 9999; i++) {
            combo_Año.addItem(String.valueOf(i));
        }

        for (int i = 1; i <= 12; i++) {
            combo_Mes.addItem(String.valueOf(i));
        }

        for (int i = 1; i <= 31; i++) {
            combo_Dia.addItem(String.valueOf(i));
        }

    }

    //Llena la tabla
    private void llenarT(int año, int mes, int dia) {

        String[] fecha = Utilidades.comboFecha(año, mes, dia);

        DefaultTableModel modelo = (DefaultTableModel) tabla_1.getModel();
        modelo.setRowCount(0);
        DAOPedidos pedido = new DAOPedidosImpl();
        try {

            pedido.listarPF(0, true, fecha[0], fecha[1], fecha[2]).forEach(
                    (i) -> modelo.addRow(
                            new Object[]{
                                i.getId(), i.getFecha(), i.getDescrip(), i.getMonto(),
                                i.getDirec(), i.getTlf(), i.getFormaP(), i.isPgdo(),
                                i.isEtgdo(), i.getDelivery()
                            }
                    )
            );

        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al llenar la tabla.");
        }

    }

    //Genera un PDF con los pedidos según la fecha establecida en los comboBox
    private void reporte(int año, int mes, int dia) {
        
        try {
            
            String[] fecha = Utilidades.comboFecha(año, mes, dia);

            Document documento = new Document(PageSize.A3, (float) 0, (float) 0, (float) 0, (float) 0);
            String user = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(user + "/OneDrive/Escritorio/Reporte.pdf"));

            Image header = Image.getInstance("src/imagenes/header.png");
            header.scaleToFit(1200, 300);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Segoe UI Semibold", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("\nPedidos del " + fecha[0] + "/" + fecha[1] + "/" + fecha[2] + "\n\n");

            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(10);
            float[] ancho = {100f, 180f, 350f, 180f, 350f, 200f, 175f, 150f, 200f, 160f};
            tabla.setWidths(ancho);
            Font fontH = new Font(FontFactory.getFont("Segoe UI Semibold", 12, Font.BOLD, BaseColor.DARK_GRAY));
            Font fontD = new Font(FontFactory.getFont("Segoe UI Semibold", 10, Font.NORMAL, BaseColor.DARK_GRAY));
            tabla.addCell(new PdfPCell(new Paragraph("#", fontH)));
            tabla.addCell(new PdfPCell(new Paragraph("Fecha", fontH)));
            tabla.addCell(new PdfPCell(new Paragraph("Descripción", fontH)));
            tabla.addCell(new PdfPCell(new Paragraph("Monto ($)", fontH)));
            tabla.addCell(new PdfPCell(new Paragraph("Dirección", fontH)));
            tabla.addCell(new PdfPCell(new Paragraph("Teléfono", fontH)));
            tabla.addCell(new PdfPCell(new Paragraph("Forma de Pago", fontH)));
            tabla.addCell(new PdfPCell(new Paragraph("Pagado", fontH)));
            tabla.addCell(new PdfPCell(new Paragraph("Entregado", fontH)));
            tabla.addCell(new PdfPCell(new Paragraph("Delivery", fontH)));

            DAOPedidos p = new DAOPedidosImpl();
            
            for (modelos.Pedidos i : p.listarPF(0, true, fecha[0], fecha[1], fecha[2])) {
                
                tabla.addCell(new PdfPCell(new Paragraph(String.valueOf(i.getId()), fontD)));
                tabla.addCell(new PdfPCell(new Paragraph(i.getFecha(), fontD)));
                tabla.addCell(new PdfPCell(new Paragraph(i.getDescrip(), fontD)));
                tabla.addCell(new PdfPCell(new Paragraph(String.valueOf(i.getMonto()), fontD)));
                tabla.addCell(new PdfPCell(new Paragraph(i.getDirec(), fontD)));
                tabla.addCell(new PdfPCell(new Paragraph(i.getTlf(), fontD)));
                tabla.addCell(new PdfPCell(new Paragraph(i.getFormaP(), fontD)));
                
                if (i.isPgdo()) {
                    tabla.addCell(new PdfPCell(new Paragraph("SÍ", fontD)));
                } else {
                    tabla.addCell(new PdfPCell(new Paragraph("NO", fontD)));
                }

                if (i.isEtgdo()) {
                    tabla.addCell(new PdfPCell(new Paragraph("SÍ", fontD)));
                } else {
                    tabla.addCell(new PdfPCell(new Paragraph("NO", fontD)));
                }
                
                tabla.addCell(new PdfPCell(new Paragraph(i.getDelivery(), fontD)));
                
            }
            documento.add(tabla);
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte generado con la fecha:\n" + fecha[0] + "/" + fecha[1] + "/" + fecha[2]);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar el reporte.");
        } catch (ClassNotFoundException ex) {
            System.out.println("CLASS: " + ex);
        } catch (DocumentException ex) {
            System.out.println("DOC: " + ex);
        } catch (IOException ex) {
            System.out.println("IO: " + ex);
        }
        
    }

    //Actualiza el JTable tabla_1
    private void actualizarT_R(boolean esTabla) {

        int año, mes, dia;
        try {
            año = Integer.parseInt(combo_Año.getSelectedItem().toString());
        } catch (NumberFormatException e) {
            año = -1;
        }
        try {
            mes = Integer.parseInt(combo_Mes.getSelectedItem().toString());
        } catch (NumberFormatException e) {
            mes = -1;
        }
        try {
            dia = Integer.parseInt(combo_Dia.getSelectedItem().toString());
        } catch (NumberFormatException e) {
            dia = -1;
        }

        if (esTabla) {
            llenarT(año, mes, dia);
        } else {
            reporte(año, mes, dia);
        }

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
        combo_Año = new javax.swing.JComboBox<>();
        combo_Mes = new javax.swing.JComboBox<>();
        combo_Dia = new javax.swing.JComboBox<>();
        boton_Actualizar = new javax.swing.JButton();
        boton_Reporte = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 450));

        panel_BG.setBackground(new java.awt.Color(8, 5, 4));
        panel_BG.setPreferredSize(new java.awt.Dimension(750, 400));

        titulo.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(233, 224, 211));
        titulo.setText("PEDIDOS");

        tabla_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Fecha", "Descipción", "Monto ($)", "Dirección", "Teléfono", "Forma de Pago", "Pgdo.", "Etgdo.", "Delivery"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
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
        scrollPanel_1.setViewportView(tabla_1);

        boton_Editar.setBackground(new java.awt.Color(213, 24, 26));
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

        combo_Año.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        combo_Año.setForeground(new java.awt.Color(233, 224, 211));
        combo_Año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año" }));
        combo_Año.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo_Año.setFocusable(false);

        combo_Mes.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        combo_Mes.setForeground(new java.awt.Color(233, 224, 211));
        combo_Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes" }));
        combo_Mes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo_Mes.setFocusable(false);

        combo_Dia.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        combo_Dia.setForeground(new java.awt.Color(233, 224, 211));
        combo_Dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia" }));
        combo_Dia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo_Dia.setFocusable(false);

        boton_Actualizar.setBackground(new java.awt.Color(0, 153, 153));
        boton_Actualizar.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        boton_Actualizar.setForeground(new java.awt.Color(233, 224, 211));
        boton_Actualizar.setText("ACTUALIZAR");
        boton_Actualizar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 10, 2, 10, new java.awt.Color(0, 0, 0)));
        boton_Actualizar.setBorderPainted(false);
        boton_Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Actualizar.setFocusable(false);
        boton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ActualizarActionPerformed(evt);
            }
        });

        boton_Reporte.setBackground(new java.awt.Color(8, 5, 4));
        boton_Reporte.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        boton_Reporte.setForeground(new java.awt.Color(233, 224, 211));
        boton_Reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/printer.png"))); // NOI18N
        boton_Reporte.setBorderPainted(false);
        boton_Reporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Reporte.setFocusable(false);
        boton_Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_BGLayout = new javax.swing.GroupLayout(panel_BG);
        panel_BG.setLayout(panel_BGLayout);
        panel_BGLayout.setHorizontalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_BGLayout.createSequentialGroup()
                        .addGap(10, 550, Short.MAX_VALUE)
                        .addComponent(boton_Editar)
                        .addGap(8, 8, 8)
                        .addComponent(boton_Eliminar))
                    .addComponent(scrollPanel_1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BGLayout.createSequentialGroup()
                        .addComponent(titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_Actualizar)
                        .addGap(16, 16, 16)
                        .addComponent(boton_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(combo_Año, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(combo_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(combo_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        panel_BGLayout.setVerticalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titulo)
                        .addComponent(combo_Año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(scrollPanel_1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(panel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    //Inicia el JPanel EditarP dentro del JPanel Contenedor de la clase BaseDeDatos
    private void boton_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_EditarActionPerformed

        if (tabla_1.getSelectedRow() == -1) { //Valida si se ha seleccionado algún pedido
            JOptionPane.showMessageDialog(null, "Seleccione un pedido para editar.");
        } else {

            int ID = (int) tabla_1.getValueAt(tabla_1.getSelectedRow(), 0);
            try {
                Utilidades.setView(new EditarP(ID), BaseDeDatos.panel_Contenedor, 750, 450);
            } catch (SQLException | ClassNotFoundException ex) {
                System.out.println(ex);
            }
            System.out.println(evt);

        }

    }//GEN-LAST:event_boton_EditarActionPerformed

    //Elimina un pedido en la base de datos según su ID
    private void boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_EliminarActionPerformed

        if (tabla_1.getSelectedRow() != -1) { //Valida si no se ha seleccionado ningún pedido de la tabla

            int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea realizar una eliminación?");
            if (opcion == 0) { //Valida si el susuario quiere realizar la eliminación

                for (int i : tabla_1.getSelectedRows()) { //Recorre la lista de pedidos seleccionados para eliminarlos

                    try {
                        DAOPedidos impl = new DAOPedidosImpl();
                        impl.eliminarP((int) tabla_1.getValueAt(i, 0));
                    } catch (SQLException | ClassNotFoundException ex) {
                        System.out.println(ex);
                    }

                }
                JOptionPane.showMessageDialog(null, "¡Eliminación exitosa!");
                actualizarT_R(true);

            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione uno o varios pedidos para eliminar.");
        }
        System.out.println(evt);

    }//GEN-LAST:event_boton_EliminarActionPerformed

    //Actualiza la tabla
    private void boton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ActualizarActionPerformed
        
        actualizarT_R(true);
        System.out.println(evt);
        
    }//GEN-LAST:event_boton_ActualizarActionPerformed

    private void boton_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ReporteActionPerformed
        
        actualizarT_R(false);
        System.out.println(evt);
        
    }//GEN-LAST:event_boton_ReporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Actualizar;
    private javax.swing.JButton boton_Editar;
    private javax.swing.JButton boton_Eliminar;
    private javax.swing.JButton boton_Reporte;
    private javax.swing.JComboBox<String> combo_Año;
    private javax.swing.JComboBox<String> combo_Dia;
    private javax.swing.JComboBox<String> combo_Mes;
    private javax.swing.JPanel panel_BG;
    private javax.swing.JScrollPane scrollPanel_1;
    public static javax.swing.JTable tabla_1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
