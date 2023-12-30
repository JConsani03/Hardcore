package principal;

//Look and Feel
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerContrastIJTheme;

//Swing
import javax.swing.JOptionPane;

public class Datos extends javax.swing.JFrame {

    //Constructor
    public Datos() {

        initComponents();
        txt_Tlf.putClientProperty("JTextField.placeholderText", "Ej: 04121234567 (11 cts.)");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        txt_Tlf = new javax.swing.JTextField();
        label_1 = new javax.swing.JLabel();
        separador_1 = new javax.swing.JSeparator();
        label_2 = new javax.swing.JLabel();
        scrollPane_Direccion = new javax.swing.JScrollPane();
        txtA_Direccion = new javax.swing.JTextArea();
        boton_Atras = new javax.swing.JButton();
        boton_Continuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(192, 24, 26));

        titulo.setFont(new java.awt.Font("MADE Tommy Soft", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(233, 224, 211));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("¡ANTES DE CONTINUAR!");

        mensaje.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        mensaje.setForeground(new java.awt.Color(233, 224, 211));
        mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje.setText("INGRESE LA SIGUIENTE INFORMACIÓN");

        txt_Tlf.setBackground(new java.awt.Color(233, 224, 211));
        txt_Tlf.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        txt_Tlf.setForeground(new java.awt.Color(26, 18, 16));
        txt_Tlf.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(233, 224, 211)));

        label_1.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_1.setForeground(new java.awt.Color(233, 224, 211));
        label_1.setText("Número Telefónico:");

        separador_1.setForeground(new java.awt.Color(233, 224, 211));

        label_2.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_2.setForeground(new java.awt.Color(233, 224, 211));
        label_2.setText("Dirección:");

        txtA_Direccion.setBackground(new java.awt.Color(233, 224, 211));
        txtA_Direccion.setColumns(2);
        txtA_Direccion.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        txtA_Direccion.setForeground(new java.awt.Color(26, 18, 16));
        txtA_Direccion.setRows(2);
        txtA_Direccion.setTabSize(2);
        txtA_Direccion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(233, 224, 211)));
        scrollPane_Direccion.setViewportView(txtA_Direccion);

        boton_Atras.setBackground(new java.awt.Color(51, 51, 51));
        boton_Atras.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        boton_Atras.setForeground(new java.awt.Color(233, 224, 211));
        boton_Atras.setText("ATRÁS");
        boton_Atras.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        boton_Atras.setBorderPainted(false);
        boton_Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AtrasActionPerformed(evt);
            }
        });

        boton_Continuar.setBackground(new java.awt.Color(78, 155, 53));
        boton_Continuar.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        boton_Continuar.setForeground(new java.awt.Color(233, 224, 211));
        boton_Continuar.setText("CONTINUAR");
        boton_Continuar.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        boton_Continuar.setBorderPainted(false);
        boton_Continuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(boton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addComponent(mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Tlf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_2)
                        .addGap(18, 18, 18)
                        .addComponent(scrollPane_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                    .addComponent(separador_1))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador_1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(mensaje)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Tlf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_2)
                    .addComponent(scrollPane_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_Continuar)
                    .addComponent(boton_Atras))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Regresa al JFrame Inicio
    private void boton_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AtrasActionPerformed

        Inicio h = new Inicio();
        h.setVisible(true);
        this.setVisible(false);
        System.out.println(evt);

    }//GEN-LAST:event_boton_AtrasActionPerformed

    //Inicia el JFrame Pedido y cierra este
    private void boton_ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ContinuarActionPerformed

        if (txtA_Direccion.getText().equals("") || txt_Tlf.getText().equals("")) { //Valida si los campos están vacíos
            JOptionPane.showMessageDialog(null, "Por favor, llene los campos antes de continuar.");
        } else {
            
            try {
                
                Utilidades.esNumero(txt_Tlf.getText());
                Pedido.tlf = txt_Tlf.getText();
                Pedido.direc = txtA_Direccion.getText();
                Pedido h = new Pedido();
                h.setVisible(true);
                this.setVisible(false);
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR EN EL CAMPO 'Número Telefónico' \nPor favor, asegúrese de que el número de teléfono no contenga caracteres alfanuméricos (A, a, *, -, etc...) y que este cumpla la cantidad de caracteres correcta (11 caracteres).");
            }
            
        }
        System.out.println(evt);

    }//GEN-LAST:event_boton_ContinuarActionPerformed

    public static void main(String args[]) {
        
        //Inicialización del Look and Feel
        FlatMaterialDarkerContrastIJTheme.setup();
        
        java.awt.EventQueue.invokeLater(() -> {
            new Datos().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Atras;
    private javax.swing.JButton boton_Continuar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_1;
    private javax.swing.JLabel label_2;
    private javax.swing.JLabel mensaje;
    private javax.swing.JScrollPane scrollPane_Direccion;
    private javax.swing.JSeparator separador_1;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextArea txtA_Direccion;
    private javax.swing.JTextField txt_Tlf;
    // End of variables declaration//GEN-END:variables
}
