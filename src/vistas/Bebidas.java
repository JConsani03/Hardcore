package vistas;

//Proyecto
import principal.Pedido;
import principal.Utilidades;

public class Bebidas extends javax.swing.JPanel {

    //Constructor
    public Bebidas() {
        
        initComponents();
        initBotones();
        
    }
    
    //Agrega imágenes a los botones
    private void initBotones() {
        
        Utilidades.setImageButton(boton_Coca,"src/imagenes/cola1L.png", 90, 90);
        Utilidades.setImageButton(boton_CocaM,"src/imagenes/colaML.png", 68, 68);
        Utilidades.setImageButton(boton_Pepsi,"src/imagenes/pepsi1L.png", 90, 90);
        Utilidades.setImageButton(boton_PepsiM,"src/imagenes/pepsiML.png", 68, 68);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_BG = new javax.swing.JPanel();
        label_Titulo = new javax.swing.JLabel();
        panel_Coca = new javax.swing.JPanel();
        precio_1 = new javax.swing.JLabel();
        titulo_1 = new javax.swing.JLabel();
        boton_Coca = new javax.swing.JButton();
        panel_Pepsi = new javax.swing.JPanel();
        precio_2 = new javax.swing.JLabel();
        titulo_2 = new javax.swing.JLabel();
        boton_Pepsi = new javax.swing.JButton();
        panel_CocaM = new javax.swing.JPanel();
        precio_3 = new javax.swing.JLabel();
        titulo_3 = new javax.swing.JLabel();
        boton_CocaM = new javax.swing.JButton();
        panel_PepsiM = new javax.swing.JPanel();
        precio_4 = new javax.swing.JLabel();
        titulo_4 = new javax.swing.JLabel();
        boton_PepsiM = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(730, 320));

        panel_BG.setBackground(new java.awt.Color(8, 5, 4));
        panel_BG.setPreferredSize(new java.awt.Dimension(730, 320));

        label_Titulo.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_Titulo.setForeground(new java.awt.Color(233, 224, 211));
        label_Titulo.setText("  BEBIDAS");

        panel_Coca.setBackground(new java.awt.Color(8, 5, 4));
        panel_Coca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        precio_1.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        precio_1.setForeground(new java.awt.Color(233, 224, 211));
        precio_1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precio_1.setText("3$");
        precio_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Coca.add(precio_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        titulo_1.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        titulo_1.setForeground(new java.awt.Color(233, 224, 211));
        titulo_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_1.setText("COCA COLA 1L");
        panel_Coca.add(titulo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        boton_Coca.setBackground(new java.awt.Color(8, 5, 4));
        boton_Coca.setFont(new java.awt.Font("MADE Tommy Soft", 0, 10)); // NOI18N
        boton_Coca.setForeground(new java.awt.Color(233, 224, 211));
        boton_Coca.setBorderPainted(false);
        boton_Coca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Coca.setFocusable(false);
        boton_Coca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_CocaActionPerformed(evt);
            }
        });
        panel_Coca.add(boton_Coca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        panel_Pepsi.setBackground(new java.awt.Color(8, 5, 4));
        panel_Pepsi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        precio_2.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        precio_2.setForeground(new java.awt.Color(233, 224, 211));
        precio_2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precio_2.setText("3$");
        precio_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pepsi.add(precio_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        titulo_2.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        titulo_2.setForeground(new java.awt.Color(233, 224, 211));
        titulo_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_2.setText("PEPSI COLA 1L");
        panel_Pepsi.add(titulo_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        boton_Pepsi.setBackground(new java.awt.Color(8, 5, 4));
        boton_Pepsi.setFont(new java.awt.Font("MADE Tommy Soft", 0, 10)); // NOI18N
        boton_Pepsi.setForeground(new java.awt.Color(233, 224, 211));
        boton_Pepsi.setBorderPainted(false);
        boton_Pepsi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Pepsi.setFocusable(false);
        boton_Pepsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_PepsiActionPerformed(evt);
            }
        });
        panel_Pepsi.add(boton_Pepsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        panel_CocaM.setBackground(new java.awt.Color(8, 5, 4));
        panel_CocaM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        precio_3.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        precio_3.setForeground(new java.awt.Color(233, 224, 211));
        precio_3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precio_3.setText("1.5$");
        precio_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_CocaM.add(precio_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        titulo_3.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        titulo_3.setForeground(new java.awt.Color(233, 224, 211));
        titulo_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_3.setText("COCA COLA 1/2L");
        panel_CocaM.add(titulo_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        boton_CocaM.setBackground(new java.awt.Color(8, 5, 4));
        boton_CocaM.setFont(new java.awt.Font("MADE Tommy Soft", 0, 10)); // NOI18N
        boton_CocaM.setForeground(new java.awt.Color(233, 224, 211));
        boton_CocaM.setBorderPainted(false);
        boton_CocaM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_CocaM.setFocusable(false);
        boton_CocaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_CocaMActionPerformed(evt);
            }
        });
        panel_CocaM.add(boton_CocaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        panel_PepsiM.setBackground(new java.awt.Color(8, 5, 4));
        panel_PepsiM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        precio_4.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        precio_4.setForeground(new java.awt.Color(233, 224, 211));
        precio_4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precio_4.setText("1.5$");
        precio_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_PepsiM.add(precio_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        titulo_4.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        titulo_4.setForeground(new java.awt.Color(233, 224, 211));
        titulo_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_4.setText("PEPSI 1/2L");
        panel_PepsiM.add(titulo_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        boton_PepsiM.setBackground(new java.awt.Color(8, 5, 4));
        boton_PepsiM.setFont(new java.awt.Font("MADE Tommy Soft", 0, 10)); // NOI18N
        boton_PepsiM.setForeground(new java.awt.Color(233, 224, 211));
        boton_PepsiM.setBorderPainted(false);
        boton_PepsiM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_PepsiM.setFocusable(false);
        boton_PepsiM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_PepsiMActionPerformed(evt);
            }
        });
        panel_PepsiM.add(boton_PepsiM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        javax.swing.GroupLayout panel_BGLayout = new javax.swing.GroupLayout(panel_BG);
        panel_BG.setLayout(panel_BGLayout);
        panel_BGLayout.setHorizontalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addComponent(label_Titulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Coca, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Pepsi, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_CocaM, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_PepsiM, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_BGLayout.setVerticalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_Coca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Pepsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_CocaM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_PepsiM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boton_CocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_CocaActionPerformed
        
        Pedido.agregarE("src/imagenes/cola1L.png", "Coca-Cola 1L",3.0);
        System.out.println(evt);
        
    }//GEN-LAST:event_boton_CocaActionPerformed

    private void boton_PepsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_PepsiActionPerformed
        
        Pedido.agregarE("src/imagenes/pepsi1L.png", "Pepsi 1L",3.0);
        System.out.println(evt);
        
    }//GEN-LAST:event_boton_PepsiActionPerformed

    private void boton_CocaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_CocaMActionPerformed
        
        Pedido.agregarE("src/imagenes/colaML.png", "Coca-Cola 1/2L",1.5);
        System.out.println(evt);
        
    }//GEN-LAST:event_boton_CocaMActionPerformed

    private void boton_PepsiMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_PepsiMActionPerformed
        
        Pedido.agregarE("src/imagenes/pepsiML.png", "Pepsi 1/2L",1.5);
        System.out.println(evt);
        
    }//GEN-LAST:event_boton_PepsiMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Coca;
    private javax.swing.JButton boton_CocaM;
    private javax.swing.JButton boton_Pepsi;
    private javax.swing.JButton boton_PepsiM;
    private javax.swing.JLabel label_Titulo;
    private javax.swing.JPanel panel_BG;
    private javax.swing.JPanel panel_Coca;
    private javax.swing.JPanel panel_CocaM;
    private javax.swing.JPanel panel_Pepsi;
    private javax.swing.JPanel panel_PepsiM;
    private javax.swing.JLabel precio_1;
    private javax.swing.JLabel precio_2;
    private javax.swing.JLabel precio_3;
    private javax.swing.JLabel precio_4;
    private javax.swing.JLabel titulo_1;
    private javax.swing.JLabel titulo_2;
    private javax.swing.JLabel titulo_3;
    private javax.swing.JLabel titulo_4;
    // End of variables declaration//GEN-END:variables
}
