package vistas;

//Proyecto
import principal.Pedido;
import principal.Utilidades;

public class Sushis extends javax.swing.JPanel {

    //Constructor
    public Sushis() {
        
        initComponents();
        initBotones();
        
    }
    
    //Agrega imágenes a los botones
    private void initBotones(){
        
        Utilidades.setImageButton(bYakuza,"src/imagenes/Yakuza.png",110, 110);
        Utilidades.setImageButton(bPinkFloyd,"src/imagenes/PinkFloyd.png",110, 110);
        Utilidades.setImageButton(bHotFish,"src/imagenes/HotFish.png",110, 110);
        Utilidades.setImageButton(bGeisha,"src/imagenes/Geisha.png",110, 110);
        Utilidades.setImageButton(bCrab,"src/imagenes/Crab.png",110, 110);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_BG = new javax.swing.JPanel();
        label_Titulo = new javax.swing.JLabel();
        panel_Yakuza = new javax.swing.JPanel();
        label_Precio1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bYakuza = new javax.swing.JButton();
        panel_PinkFloyd = new javax.swing.JPanel();
        label_precio2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bPinkFloyd = new javax.swing.JButton();
        panel_HotFish = new javax.swing.JPanel();
        label_precio3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bHotFish = new javax.swing.JButton();
        panel_Geisha = new javax.swing.JPanel();
        label_precio4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bGeisha = new javax.swing.JButton();
        panel_Crab = new javax.swing.JPanel();
        label_precio5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bCrab = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(730, 320));

        panel_BG.setBackground(new java.awt.Color(8, 5, 4));
        panel_BG.setPreferredSize(new java.awt.Dimension(730, 320));

        label_Titulo.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_Titulo.setForeground(new java.awt.Color(233, 224, 211));
        label_Titulo.setText("  SUSHIS");

        panel_Yakuza.setBackground(new java.awt.Color(8, 5, 4));
        panel_Yakuza.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Precio1.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_Precio1.setForeground(new java.awt.Color(233, 224, 211));
        label_Precio1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_Precio1.setText("9$");
        label_Precio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Yakuza.add(label_Precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        jLabel1.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 224, 211));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("YAKUZA");
        panel_Yakuza.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        bYakuza.setBackground(new java.awt.Color(8, 5, 4));
        bYakuza.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        bYakuza.setForeground(new java.awt.Color(233, 224, 211));
        bYakuza.setBorderPainted(false);
        bYakuza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bYakuza.setFocusable(false);
        bYakuza.setMargin(new java.awt.Insets(2, 14, 20, 14));
        bYakuza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bYakuzaActionPerformed(evt);
            }
        });
        panel_Yakuza.add(bYakuza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        panel_PinkFloyd.setBackground(new java.awt.Color(8, 5, 4));
        panel_PinkFloyd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_precio2.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_precio2.setForeground(new java.awt.Color(233, 224, 211));
        label_precio2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_precio2.setText("10$");
        label_precio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_PinkFloyd.add(label_precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        jLabel2.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(233, 224, 211));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PINK FLOYD");
        panel_PinkFloyd.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        bPinkFloyd.setBackground(new java.awt.Color(8, 5, 4));
        bPinkFloyd.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        bPinkFloyd.setForeground(new java.awt.Color(233, 224, 211));
        bPinkFloyd.setBorderPainted(false);
        bPinkFloyd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bPinkFloyd.setFocusable(false);
        bPinkFloyd.setMargin(new java.awt.Insets(2, 14, 20, 14));
        bPinkFloyd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPinkFloydActionPerformed(evt);
            }
        });
        panel_PinkFloyd.add(bPinkFloyd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        panel_HotFish.setBackground(new java.awt.Color(8, 5, 4));
        panel_HotFish.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_precio3.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_precio3.setForeground(new java.awt.Color(233, 224, 211));
        label_precio3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_precio3.setText("9.5$");
        label_precio3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_HotFish.add(label_precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        jLabel3.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 224, 211));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HOT FISH");
        panel_HotFish.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        bHotFish.setBackground(new java.awt.Color(8, 5, 4));
        bHotFish.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        bHotFish.setForeground(new java.awt.Color(233, 224, 211));
        bHotFish.setBorderPainted(false);
        bHotFish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bHotFish.setFocusable(false);
        bHotFish.setMargin(new java.awt.Insets(2, 14, 20, 14));
        bHotFish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHotFishActionPerformed(evt);
            }
        });
        panel_HotFish.add(bHotFish, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        panel_Geisha.setBackground(new java.awt.Color(8, 5, 4));
        panel_Geisha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_precio4.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_precio4.setForeground(new java.awt.Color(233, 224, 211));
        label_precio4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_precio4.setText("12$");
        label_precio4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Geisha.add(label_precio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        jLabel4.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(233, 224, 211));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GEISHA");
        panel_Geisha.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        bGeisha.setBackground(new java.awt.Color(8, 5, 4));
        bGeisha.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        bGeisha.setForeground(new java.awt.Color(233, 224, 211));
        bGeisha.setBorderPainted(false);
        bGeisha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bGeisha.setFocusable(false);
        bGeisha.setMargin(new java.awt.Insets(2, 14, 20, 14));
        bGeisha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGeishaActionPerformed(evt);
            }
        });
        panel_Geisha.add(bGeisha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        panel_Crab.setBackground(new java.awt.Color(8, 5, 4));
        panel_Crab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_precio5.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_precio5.setForeground(new java.awt.Color(233, 224, 211));
        label_precio5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_precio5.setText("9$");
        label_precio5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Crab.add(label_precio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        jLabel5.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(233, 224, 211));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CRAB");
        panel_Crab.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        bCrab.setBackground(new java.awt.Color(8, 5, 4));
        bCrab.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        bCrab.setForeground(new java.awt.Color(233, 224, 211));
        bCrab.setBorderPainted(false);
        bCrab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCrab.setFocusable(false);
        bCrab.setMargin(new java.awt.Insets(2, 14, 20, 14));
        bCrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrabActionPerformed(evt);
            }
        });
        panel_Crab.add(bCrab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        javax.swing.GroupLayout panel_BGLayout = new javax.swing.GroupLayout(panel_BG);
        panel_BG.setLayout(panel_BGLayout);
        panel_BGLayout.setHorizontalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addComponent(label_Titulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Yakuza, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_PinkFloyd, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_HotFish, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Geisha, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Crab, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_BGLayout.setVerticalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_Yakuza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_PinkFloyd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_HotFish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Geisha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Crab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bYakuzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bYakuzaActionPerformed
        
        Pedido.agregarE("src/imagenes/Yakuza.png", "Yakuza",9.0);
        System.out.println(evt);
        
    }//GEN-LAST:event_bYakuzaActionPerformed

    private void bPinkFloydActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPinkFloydActionPerformed
        
        Pedido.agregarE("src/imagenes/PinkFloyd.png", "PinkFloyd",10.0);
        System.out.println(evt);
        
    }//GEN-LAST:event_bPinkFloydActionPerformed

    private void bHotFishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHotFishActionPerformed
        
        Pedido.agregarE("src/imagenes/HotFish.png", "HotFish",9.5);
        System.out.println(evt);
        
    }//GEN-LAST:event_bHotFishActionPerformed

    private void bGeishaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGeishaActionPerformed
        
        Pedido.agregarE("src/imagenes/Geisha.png", "Geisha",12.0);
        System.out.println(evt);
        
    }//GEN-LAST:event_bGeishaActionPerformed

    private void bCrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrabActionPerformed
        
        Pedido.agregarE("src/imagenes/Crab.png", "Crab",9.0);
        System.out.println(evt);
        
    }//GEN-LAST:event_bCrabActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCrab;
    private javax.swing.JButton bGeisha;
    private javax.swing.JButton bHotFish;
    private javax.swing.JButton bPinkFloyd;
    private javax.swing.JButton bYakuza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label_Precio1;
    private javax.swing.JLabel label_Titulo;
    private javax.swing.JLabel label_precio2;
    private javax.swing.JLabel label_precio3;
    private javax.swing.JLabel label_precio4;
    private javax.swing.JLabel label_precio5;
    private javax.swing.JPanel panel_BG;
    private javax.swing.JPanel panel_Crab;
    private javax.swing.JPanel panel_Geisha;
    private javax.swing.JPanel panel_HotFish;
    private javax.swing.JPanel panel_PinkFloyd;
    private javax.swing.JPanel panel_Yakuza;
    // End of variables declaration//GEN-END:variables
}
