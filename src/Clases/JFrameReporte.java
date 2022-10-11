package Clases;

import javax.swing.ImageIcon;

public class JFrameReporte extends javax.swing.JFrame {

  calculadoraAnuncio ventana = new calculadoraAnuncio();
  
  String titulo, seccion, fecha, descripcion,costo, costoIva;
      
    public JFrameReporte() {
      
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());//thumbnail de la app
            
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resultadoTitulo = new javax.swing.JLabel();
        resultadoSeccion = new javax.swing.JLabel();
        resultadoCosto = new javax.swing.JLabel();
        resultadoCostoIva = new javax.swing.JLabel();
        resultadoFecha = new javax.swing.JLabel();
        resultadoDescripcion = new javax.swing.JLabel();
        btnCerrar2 = new javax.swing.JButton();
        btnMinimizar2 = new javax.swing.JButton();
        btnNuevoRegistro = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        fondoReporte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultadoTitulo.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        resultadoTitulo.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(resultadoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 390, 50));

        resultadoSeccion.setBackground(new java.awt.Color(255, 255, 255));
        resultadoSeccion.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        resultadoSeccion.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(resultadoSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 400, 60));

        resultadoCosto.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        resultadoCosto.setForeground(new java.awt.Color(28, 145, 6));
        jPanel1.add(resultadoCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 400, 50));

        resultadoCostoIva.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        resultadoCostoIva.setForeground(new java.awt.Color(28, 145, 6));
        jPanel1.add(resultadoCostoIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 400, 40));

        resultadoFecha.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        resultadoFecha.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(resultadoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 300, -1));

        resultadoDescripcion.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        resultadoDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(resultadoDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 400, 110));

        btnCerrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnCerrar2.setBorder(null);
        btnCerrar2.setContentAreaFilled(false);
        btnCerrar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeHover.png"))); // NOI18N
        btnCerrar2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnCerrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrar2MouseClicked(evt);
            }
        });
        jPanel1.add(btnCerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        btnMinimizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/min.png"))); // NOI18N
        btnMinimizar2.setBorder(null);
        btnMinimizar2.setContentAreaFilled(false);
        btnMinimizar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minHover.png"))); // NOI18N
        btnMinimizar2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/min.png"))); // NOI18N
        btnMinimizar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizar2MouseClicked(evt);
            }
        });
        jPanel1.add(btnMinimizar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));

        btnNuevoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevoRegistro.png"))); // NOI18N
        btnNuevoRegistro.setBorder(null);
        btnNuevoRegistro.setContentAreaFilled(false);
        btnNuevoRegistro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevoRegistroHover.png"))); // NOI18N
        btnNuevoRegistro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevoRegistro.png"))); // NOI18N
        btnNuevoRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoRegistroMouseClicked(evt);
            }
        });
        jPanel1.add(btnNuevoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 160, 50));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salir.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salirHover.png"))); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 640, 160, 50));

        fondoReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoReport.png"))); // NOI18N
        fondoReporte.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(fondoReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        resultadoTitulo.setText(titulo);    
        resultadoSeccion.setText(seccion);
        resultadoFecha.setText(fecha);
        resultadoDescripcion.setText(descripcion);
        resultadoCosto.setText(costo);
        resultadoCostoIva.setText(costoIva);
    }//GEN-LAST:event_formWindowActivated

    private void btnMinimizar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizar2MouseClicked
        this.setState(JFrameReporte.ICONIFIED);//minimizar pantalla 
    }//GEN-LAST:event_btnMinimizar2MouseClicked

    private void btnCerrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrar2MouseClicked
        System.exit(0); 
    }//GEN-LAST:event_btnCerrar2MouseClicked

    private void btnNuevoRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoRegistroMouseClicked
          ventana.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btnNuevoRegistroMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
         System.exit(0); 
    }//GEN-LAST:event_btnSalirMouseClicked

    
   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFrameReporte().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar2;
    private javax.swing.JButton btnMinimizar2;
    private javax.swing.JButton btnNuevoRegistro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fondoReporte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resultadoCosto;
    private javax.swing.JLabel resultadoCostoIva;
    private javax.swing.JLabel resultadoDescripcion;
    private javax.swing.JLabel resultadoFecha;
    private javax.swing.JLabel resultadoSeccion;
    private javax.swing.JLabel resultadoTitulo;
    // End of variables declaration//GEN-END:variables
}
