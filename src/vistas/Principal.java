package vistas;

public class Principal extends javax.swing.JPanel {

    //Constructor
    public Principal() {
        
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_BG = new javax.swing.JPanel();
        burger = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 450));

        panel_BG.setBackground(new java.awt.Color(8, 5, 4));
        panel_BG.setPreferredSize(new java.awt.Dimension(750, 400));

        burger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/burger.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(233, 224, 211));
        titulo.setText("SISTEMA DE ADMINISTRACIÓN DE PEDIDOS");

        jLabel3.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 224, 211));
        jLabel3.setText("     Con este sistema podrás almacenar y organizar información sobre tus clientes");

        jLabel4.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(233, 224, 211));
        jLabel4.setText("y sus pedidos.");

        jLabel5.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(233, 224, 211));
        jLabel5.setText("     Además, esta herramienta te permitirá realizar búsquedas rápidas y");

        jLabel6.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(233, 224, 211));
        jLabel6.setText("precisas para encontrar la información que necesites en cualquier momento,");

        jLabel7.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(233, 224, 211));
        jLabel7.setText("como también tener acceso a categorías y herramientas especiales,");

        jLabel9.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(233, 224, 211));
        jLabel9.setText("- Pedidos.");

        jLabel11.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(233, 224, 211));
        jLabel11.setText("- Eliminar Pedidos.");

        jLabel12.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(233, 224, 211));
        jLabel12.setText("- Editar Pedidos.");

        jLabel14.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(233, 224, 211));
        jLabel14.setText("entre las cuales están:");

        javax.swing.GroupLayout panel_BGLayout = new javax.swing.GroupLayout(panel_BG);
        panel_BG.setLayout(panel_BGLayout);
        panel_BGLayout.setHorizontalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titulo))
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_BGLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 451, Short.MAX_VALUE)
                        .addComponent(burger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_BGLayout.createSequentialGroup()
                        .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_BGLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(148, 148, 148)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_BGLayout.setVerticalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(titulo)
                .addGap(13, 13, 13)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(burger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_BGLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(207, 207, 207))
                    .addGroup(panel_BGLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(120, 120, 120))
                    .addGroup(panel_BGLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(145, 145, 145))
                    .addGroup(panel_BGLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(95, 95, 95))
                    .addGroup(panel_BGLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(232, 232, 232)))
                .addGap(24, 24, 24))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel burger;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panel_BG;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
