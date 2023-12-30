package vistas;

//Proyecto
import principal.Pedido;
import principal.Utilidades;

public class Hamburguesas extends javax.swing.JPanel {

    //Constructor
    public Hamburguesas() {
        
        initComponents();
        initBotones();
        
    }

    //Agrega imágenes a los botones
    private void initBotones() {
        
        Utilidades.setImageButton(bYoko, "src/imagenes/Yoko.png", 110, 110);
        Utilidades.setImageButton(bCalifornibacon, "src/imagenes/Californibacon.png", 110, 110);
        Utilidades.setImageButton(bMotley, "src/imagenes/Motley.png", 110, 110);
        Utilidades.setImageButton(bQueen, "src/imagenes/Queen.png", 110, 110);
        Utilidades.setImageButton(bHardcore, "src/imagenes/Hardcore.png", 110, 110);
        Utilidades.setImageButton(bAmerican, "src/imagenes/American.png", 110, 110);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_BG = new javax.swing.JPanel();
        label_Titulo = new javax.swing.JLabel();
        panel_Yoko = new javax.swing.JPanel();
        label_Precio1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bYoko = new javax.swing.JButton();
        panel_Californibacon = new javax.swing.JPanel();
        label_precio2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bCalifornibacon = new javax.swing.JButton();
        panel_Motley = new javax.swing.JPanel();
        label_precio3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bMotley = new javax.swing.JButton();
        panel_Queen = new javax.swing.JPanel();
        label_precio4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bQueen = new javax.swing.JButton();
        panel_Hardcore = new javax.swing.JPanel();
        label_precio5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bHardcore = new javax.swing.JButton();
        panel_American = new javax.swing.JPanel();
        label_precio6 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bAmerican = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(730, 320));

        panel_BG.setBackground(new java.awt.Color(8, 5, 4));
        panel_BG.setPreferredSize(new java.awt.Dimension(730, 320));

        label_Titulo.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_Titulo.setForeground(new java.awt.Color(233, 224, 211));
        label_Titulo.setText("  HAMBURGUESAS");

        panel_Yoko.setBackground(new java.awt.Color(8, 5, 4));
        panel_Yoko.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Precio1.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_Precio1.setForeground(new java.awt.Color(233, 224, 211));
        label_Precio1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_Precio1.setText("7$");
        label_Precio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Yoko.add(label_Precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        jLabel1.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 224, 211));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("YOKO");
        panel_Yoko.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        bYoko.setBackground(new java.awt.Color(8, 5, 4));
        bYoko.setFont(new java.awt.Font("MADE Tommy Soft", 0, 10)); // NOI18N
        bYoko.setForeground(new java.awt.Color(233, 224, 211));
        bYoko.setBorderPainted(false);
        bYoko.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bYoko.setFocusable(false);
        bYoko.setMargin(new java.awt.Insets(2, 14, 15, 14));
        bYoko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bYokoActionPerformed(evt);
            }
        });
        panel_Yoko.add(bYoko, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        panel_Californibacon.setBackground(new java.awt.Color(8, 5, 4));
        panel_Californibacon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_precio2.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_precio2.setForeground(new java.awt.Color(233, 224, 211));
        label_precio2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_precio2.setText("10$");
        label_precio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Californibacon.add(label_precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        jLabel2.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(233, 224, 211));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CALIFORNIBACON");
        panel_Californibacon.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        bCalifornibacon.setBackground(new java.awt.Color(8, 5, 4));
        bCalifornibacon.setFont(new java.awt.Font("MADE Tommy Soft", 0, 10)); // NOI18N
        bCalifornibacon.setForeground(new java.awt.Color(233, 224, 211));
        bCalifornibacon.setBorderPainted(false);
        bCalifornibacon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCalifornibacon.setFocusable(false);
        bCalifornibacon.setMargin(new java.awt.Insets(2, 14, 20, 14));
        bCalifornibacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalifornibaconActionPerformed(evt);
            }
        });
        panel_Californibacon.add(bCalifornibacon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        panel_Motley.setBackground(new java.awt.Color(8, 5, 4));
        panel_Motley.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_precio3.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_precio3.setForeground(new java.awt.Color(233, 224, 211));
        label_precio3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_precio3.setText("5$");
        label_precio3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Motley.add(label_precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        jLabel3.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 224, 211));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MOTLEY");
        panel_Motley.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        bMotley.setBackground(new java.awt.Color(8, 5, 4));
        bMotley.setFont(new java.awt.Font("MADE Tommy Soft", 0, 10)); // NOI18N
        bMotley.setForeground(new java.awt.Color(233, 224, 211));
        bMotley.setBorderPainted(false);
        bMotley.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bMotley.setFocusable(false);
        bMotley.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMotleyActionPerformed(evt);
            }
        });
        panel_Motley.add(bMotley, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        panel_Queen.setBackground(new java.awt.Color(8, 5, 4));
        panel_Queen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_precio4.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_precio4.setForeground(new java.awt.Color(233, 224, 211));
        label_precio4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_precio4.setText("5$");
        label_precio4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Queen.add(label_precio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        jLabel4.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(233, 224, 211));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("QUEEN");
        panel_Queen.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        bQueen.setBackground(new java.awt.Color(8, 5, 4));
        bQueen.setFont(new java.awt.Font("MADE Tommy Soft", 0, 10)); // NOI18N
        bQueen.setForeground(new java.awt.Color(233, 224, 211));
        bQueen.setBorderPainted(false);
        bQueen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bQueen.setFocusable(false);
        bQueen.setMargin(new java.awt.Insets(2, 14, 20, 14));
        bQueen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQueenActionPerformed(evt);
            }
        });
        panel_Queen.add(bQueen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        panel_Hardcore.setBackground(new java.awt.Color(8, 5, 4));
        panel_Hardcore.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_precio5.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_precio5.setForeground(new java.awt.Color(233, 224, 211));
        label_precio5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_precio5.setText("6.5$");
        label_precio5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Hardcore.add(label_precio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        jLabel5.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(233, 224, 211));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HARDCORE");
        panel_Hardcore.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        bHardcore.setBackground(new java.awt.Color(8, 5, 4));
        bHardcore.setFont(new java.awt.Font("MADE Tommy Soft", 0, 10)); // NOI18N
        bHardcore.setForeground(new java.awt.Color(233, 224, 211));
        bHardcore.setBorderPainted(false);
        bHardcore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bHardcore.setFocusable(false);
        bHardcore.setMargin(new java.awt.Insets(2, 14, 15, 14));
        bHardcore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHardcoreActionPerformed(evt);
            }
        });
        panel_Hardcore.add(bHardcore, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        panel_American.setBackground(new java.awt.Color(8, 5, 4));
        panel_American.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_precio6.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_precio6.setForeground(new java.awt.Color(233, 224, 211));
        label_precio6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_precio6.setText("7$");
        label_precio6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_American.add(label_precio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        jLabel6.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(233, 224, 211));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("AMERICAN");
        panel_American.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        bAmerican.setBackground(new java.awt.Color(8, 5, 4));
        bAmerican.setFont(new java.awt.Font("MADE Tommy Soft", 0, 10)); // NOI18N
        bAmerican.setForeground(new java.awt.Color(233, 224, 211));
        bAmerican.setBorderPainted(false);
        bAmerican.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAmerican.setFocusable(false);
        bAmerican.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAmericanActionPerformed(evt);
            }
        });
        panel_American.add(bAmerican, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        javax.swing.GroupLayout panel_BGLayout = new javax.swing.GroupLayout(panel_BG);
        panel_BG.setLayout(panel_BGLayout);
        panel_BGLayout.setHorizontalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addComponent(label_Titulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_Yoko, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_American, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Californibacon, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Motley, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Queen, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Hardcore, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_BGLayout.setVerticalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_Yoko, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Californibacon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Motley, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Queen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Hardcore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_American, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_BG, javax.swing.GroupLayout.PREFERRED_SIZE, 324, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bYokoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bYokoActionPerformed
        
        Pedido.agregarE("src/imagenes/Yoko.png", "Yoko", 7.0);
        System.out.println(evt);
        
    }//GEN-LAST:event_bYokoActionPerformed

    private void bCalifornibaconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalifornibaconActionPerformed
        
        Pedido.agregarE("src/imagenes/Californibacon.png", "Californibacon", 10.0);
        System.out.println(evt);
        
    }//GEN-LAST:event_bCalifornibaconActionPerformed

    private void bMotleyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMotleyActionPerformed
        
        Pedido.agregarE("src/imagenes/Motley.png", "Motley", 5.0);
        System.out.println(evt);
        
    }//GEN-LAST:event_bMotleyActionPerformed

    private void bQueenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQueenActionPerformed
        
        Pedido.agregarE("src/imagenes/Queen.png", "Queen", 5.0);
        System.out.println(evt);
        
    }//GEN-LAST:event_bQueenActionPerformed

    private void bHardcoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHardcoreActionPerformed
        
        Pedido.agregarE("src/imagenes/Hardcore.png", "Hardcore", 6.5);
        System.out.println(evt);
        
    }//GEN-LAST:event_bHardcoreActionPerformed

    private void bAmericanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAmericanActionPerformed
        
        Pedido.agregarE("src/imagenes/American.png", "American", 7.0);
        System.out.println(evt);
        
    }//GEN-LAST:event_bAmericanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAmerican;
    private javax.swing.JButton bCalifornibacon;
    private javax.swing.JButton bHardcore;
    private javax.swing.JButton bMotley;
    private javax.swing.JButton bQueen;
    private javax.swing.JButton bYoko;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel label_Precio1;
    private javax.swing.JLabel label_Titulo;
    private javax.swing.JLabel label_precio2;
    private javax.swing.JLabel label_precio3;
    private javax.swing.JLabel label_precio4;
    private javax.swing.JLabel label_precio5;
    private javax.swing.JLabel label_precio6;
    private javax.swing.JPanel panel_American;
    private javax.swing.JPanel panel_BG;
    private javax.swing.JPanel panel_Californibacon;
    private javax.swing.JPanel panel_Hardcore;
    private javax.swing.JPanel panel_Motley;
    private javax.swing.JPanel panel_Queen;
    private javax.swing.JPanel panel_Yoko;
    // End of variables declaration//GEN-END:variables
}
