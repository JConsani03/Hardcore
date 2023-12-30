package vistas;

public class Login extends javax.swing.JPanel {

    //Constructor
    public Login() {
        
        initComponents();
        
        txt_Usuario.putClientProperty("JTextField.placeholderText", "USUARIO");
        txt_Pass.putClientProperty("JTextField.placeholderText", "CONTRASEÑA");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_BG = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        txt_Pass = new javax.swing.JPasswordField();

        setPreferredSize(new java.awt.Dimension(360, 400));

        panel_BG.setBackground(new java.awt.Color(8, 5, 4));
        panel_BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("MADE Tommy Soft", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(233, 224, 211));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("INICIO DE SESIÓN");
        panel_BG.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 360, -1));

        txt_Usuario.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        txt_Usuario.setForeground(new java.awt.Color(233, 224, 211));
        panel_BG.add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 280, 30));

        txt_Pass.setFont(new java.awt.Font("MADE Tommy Soft", 0, 12)); // NOI18N
        panel_BG.add(txt_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 280, 30));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel_BG;
    private javax.swing.JLabel titulo;
    public static javax.swing.JPasswordField txt_Pass;
    public static javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
