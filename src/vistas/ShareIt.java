package vistas;

//Proyecto
import principal.Pedido;
import principal.Utilidades;

public class ShareIt extends javax.swing.JPanel {

    //Constructor
    public ShareIt() {
        
        initComponents();
        initBotones();
        
    }

    //Agrega imágenes a los botones
    private void initBotones() {
        
        Utilidades.setImageButton(bPapasHXC, "src/imagenes/PapasHXC.png",110, 110);
        Utilidades.setImageButton(bPapasFritas, "src/imagenes/PapasFritas.png",110, 110);
        Utilidades.setImageButton(bClubHouse, "src/imagenes/ClubHouse.png",110, 110);
        Utilidades.setImageButton(bBuffaloWings, "src/imagenes/BuffaloWings.png",110, 110);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_BG = new javax.swing.JPanel();
        label_Titulo = new javax.swing.JLabel();
        panel_PapasHXC = new javax.swing.JPanel();
        label_Precio1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bPapasHXC = new javax.swing.JButton();
        panel_PapasFritas = new javax.swing.JPanel();
        label_precio2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bPapasFritas = new javax.swing.JButton();
        panel_Clubhouse = new javax.swing.JPanel();
        label_precio3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bClubHouse = new javax.swing.JButton();
        panel_BuffaloWings = new javax.swing.JPanel();
        label_precio4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bBuffaloWings = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(730, 320));

        panel_BG.setBackground(new java.awt.Color(8, 5, 4));
        panel_BG.setPreferredSize(new java.awt.Dimension(730, 320));

        label_Titulo.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_Titulo.setForeground(new java.awt.Color(233, 224, 211));
        label_Titulo.setText("  ENTRADAS");

        panel_PapasHXC.setBackground(new java.awt.Color(8, 5, 4));
        panel_PapasHXC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Precio1.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_Precio1.setForeground(new java.awt.Color(233, 224, 211));
        label_Precio1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_Precio1.setText("15$");
        label_Precio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_PapasHXC.add(label_Precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        jLabel1.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 224, 211));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PAPAS HXC");
        panel_PapasHXC.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        bPapasHXC.setBackground(new java.awt.Color(8, 5, 4));
        bPapasHXC.setFont(new java.awt.Font("MADE Tommy Soft", 0, 10)); // NOI18N
        bPapasHXC.setForeground(new java.awt.Color(233, 224, 211));
        bPapasHXC.setBorderPainted(false);
        bPapasHXC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bPapasHXC.setFocusable(false);
        bPapasHXC.setMargin(new java.awt.Insets(2, 14, 10, 14));
        bPapasHXC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPapasHXCActionPerformed(evt);
            }
        });
        panel_PapasHXC.add(bPapasHXC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        panel_PapasFritas.setBackground(new java.awt.Color(8, 5, 4));
        panel_PapasFritas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_precio2.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_precio2.setForeground(new java.awt.Color(233, 224, 211));
        label_precio2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_precio2.setText("2$");
        label_precio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_PapasFritas.add(label_precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        jLabel2.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(233, 224, 211));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PAPAS FRITAS");
        panel_PapasFritas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        bPapasFritas.setBackground(new java.awt.Color(8, 5, 4));
        bPapasFritas.setFont(new java.awt.Font("MADE Tommy Soft", 0, 10)); // NOI18N
        bPapasFritas.setForeground(new java.awt.Color(233, 224, 211));
        bPapasFritas.setBorderPainted(false);
        bPapasFritas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bPapasFritas.setFocusable(false);
        bPapasFritas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPapasFritasActionPerformed(evt);
            }
        });
        panel_PapasFritas.add(bPapasFritas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        panel_Clubhouse.setBackground(new java.awt.Color(8, 5, 4));
        panel_Clubhouse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_precio3.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_precio3.setForeground(new java.awt.Color(233, 224, 211));
        label_precio3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_precio3.setText("4.5$");
        label_precio3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Clubhouse.add(label_precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        jLabel3.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 224, 211));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CLUBHOUSE");
        panel_Clubhouse.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        bClubHouse.setBackground(new java.awt.Color(8, 5, 4));
        bClubHouse.setFont(new java.awt.Font("MADE Tommy Soft", 0, 10)); // NOI18N
        bClubHouse.setForeground(new java.awt.Color(233, 224, 211));
        bClubHouse.setBorderPainted(false);
        bClubHouse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bClubHouse.setFocusable(false);
        bClubHouse.setMargin(new java.awt.Insets(2, 14, 15, 14));
        bClubHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClubHouseActionPerformed(evt);
            }
        });
        panel_Clubhouse.add(bClubHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        panel_BuffaloWings.setBackground(new java.awt.Color(8, 5, 4));
        panel_BuffaloWings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_precio4.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        label_precio4.setForeground(new java.awt.Color(233, 224, 211));
        label_precio4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_precio4.setText("8$");
        label_precio4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_BuffaloWings.add(label_precio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        jLabel4.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(233, 224, 211));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BUFFALO WINGS");
        panel_BuffaloWings.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 20));

        bBuffaloWings.setBackground(new java.awt.Color(8, 5, 4));
        bBuffaloWings.setFont(new java.awt.Font("MADE Tommy Soft", 0, 10)); // NOI18N
        bBuffaloWings.setForeground(new java.awt.Color(233, 224, 211));
        bBuffaloWings.setBorderPainted(false);
        bBuffaloWings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bBuffaloWings.setFocusable(false);
        bBuffaloWings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuffaloWingsActionPerformed(evt);
            }
        });
        panel_BuffaloWings.add(bBuffaloWings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 131));

        javax.swing.GroupLayout panel_BGLayout = new javax.swing.GroupLayout(panel_BG);
        panel_BG.setLayout(panel_BGLayout);
        panel_BGLayout.setHorizontalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addComponent(label_Titulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(panel_PapasHXC, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(panel_PapasFritas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(panel_Clubhouse, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(panel_BuffaloWings, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        panel_BGLayout.setVerticalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_PapasHXC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_PapasFritas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Clubhouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_BuffaloWings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void bPapasHXCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPapasHXCActionPerformed
        
        Pedido.agregarE("src/imagenes/PapasHXC.png", "PapasHXC", 15.0);
        System.out.println(evt);
        
    }//GEN-LAST:event_bPapasHXCActionPerformed

    private void bPapasFritasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPapasFritasActionPerformed
        
        Pedido.agregarE("src/imagenes/PapasFritas.png", "PapasFritas", 2.0);
        System.out.println(evt);
        
    }//GEN-LAST:event_bPapasFritasActionPerformed

    private void bClubHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClubHouseActionPerformed
        
        Pedido.agregarE("src/imagenes/ClubHouse.png", "ClubHouse", 4.5);
        System.out.println(evt);
        
    }//GEN-LAST:event_bClubHouseActionPerformed

    private void bBuffaloWingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuffaloWingsActionPerformed
        
        Pedido.agregarE("src/imagenes/BuffaloWings.png", "BuffaloWings", 8.0);
        System.out.println(evt);
        
    }//GEN-LAST:event_bBuffaloWingsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuffaloWings;
    private javax.swing.JButton bClubHouse;
    private javax.swing.JButton bPapasFritas;
    private javax.swing.JButton bPapasHXC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel label_Precio1;
    private javax.swing.JLabel label_Titulo;
    private javax.swing.JLabel label_precio2;
    private javax.swing.JLabel label_precio3;
    private javax.swing.JLabel label_precio4;
    private javax.swing.JPanel panel_BG;
    private javax.swing.JPanel panel_BuffaloWings;
    private javax.swing.JPanel panel_Clubhouse;
    private javax.swing.JPanel panel_PapasFritas;
    private javax.swing.JPanel panel_PapasHXC;
    // End of variables declaration//GEN-END:variables
}
