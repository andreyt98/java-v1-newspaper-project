package Clases;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class calculadoraAnuncio extends javax.swing.JFrame {
       
    public Anuncio anuncio = new Anuncio();
    SimpleDateFormat fechaFormat = new SimpleDateFormat("dd-MMMM-yyyy");
       
    public calculadoraAnuncio() {
        
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());//thumbnail
               
        //dedo1 y 2 son imagenes que apuntan a un textfield cuando hay datos incompletos
         dedo1.setVisible(false);
         dedo2.setVisible(false);
         
         jTitulo.setBackground(new Color(0,0,0,60));
         jDescripcion.setBackground(new Color(0,0,0,60));
         
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jTitulo = new javax.swing.JTextField();
        labelSeccion = new javax.swing.JLabel();
        iconosComboSecciones = new javax.swing.JLabel();
        ComboSecciones = new javax.swing.JComboBox<>();
        labelFecha = new javax.swing.JLabel();
        JDate = new com.toedter.calendar.JDateChooser();
        labelDescripcion = new javax.swing.JLabel();
        jDescripcion = new javax.swing.JTextField();
        dedo1 = new javax.swing.JLabel();
        dedo2 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnGenerarReporte = new javax.swing.JButton();
        LabelFondoAzul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Periódico Unidos");
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Titulo del anuncio");
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, -1));

        jTitulo.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTitulo.setForeground(new java.awt.Color(255, 41, 25));
        jTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));
        jTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTituloFocusGained(evt);
            }
        });
        jPanel1.add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 180, 30));

        labelSeccion.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelSeccion.setForeground(new java.awt.Color(255, 255, 255));
        labelSeccion.setText("Sección");
        jPanel1.add(labelSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        iconosComboSecciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconosComboSecciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nacionales.png"))); // NOI18N
        iconosComboSecciones.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        iconosComboSecciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconosComboSeccionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconosComboSeccionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconosComboSeccionesMouseExited(evt);
            }
        });
        jPanel1.add(iconosComboSecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 140, 160));

        ComboSecciones.setBackground(new java.awt.Color(75, 74, 74));
        ComboSecciones.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        ComboSecciones.setForeground(new java.awt.Color(255, 255, 0));
        ComboSecciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacionales", "Internacionales", "Deportes", "Culturales", "Económicos" }));
        ComboSecciones.setOpaque(false);
        jPanel1.add(ComboSecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 130, -1));

        labelFecha.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setText("Fecha de publicación");
        jPanel1.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, -1, -1));

        JDate.setFocusable(false);
        JDate.setFont(new java.awt.Font("Bahnschrift", 0, 10)); // NOI18N
        JDate.setOpaque(false);
        JDate.setPreferredSize(new java.awt.Dimension(86, 19));
        jPanel1.add(JDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 180, 30));

        labelDescripcion.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        labelDescripcion.setText("Descripcion");
        jPanel1.add(labelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        jDescripcion.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jDescripcion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        jDescripcion.setCaretColor(new java.awt.Color(255, 255, 255));
        jDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDescripcionFocusGained(evt);
            }
        });
        jDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDescripcionKeyPressed(evt);
            }
        });
        jPanel1.add(jDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 454, 72));

        dedo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ded.png"))); // NOI18N
        jPanel1.add(dedo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 90, 50));

        dedo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ded.png"))); // NOI18N
        jPanel1.add(dedo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 90, 50));

        btnMinimizar.setBackground(new java.awt.Color(0, 24, 76));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/min.png"))); // NOI18N
        btnMinimizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 18, 63)));
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setFocusPainted(false);
        btnMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setOpaque(false);
        btnMinimizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/min.png"))); // NOI18N
        btnMinimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minHover.png"))); // NOI18N
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 30, 30));

        btnCerrar.setBackground(new java.awt.Color(0, 24, 67));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeHover.png"))); // NOI18N
        btnCerrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, -1, 30));

        btnGenerarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnGenerarReporte.setBorder(null);
        btnGenerarReporte.setContentAreaFilled(false);
        btnGenerarReporte.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnGenerarReporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardarHover.png"))); // NOI18N
        btnGenerarReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarReporteMouseClicked(evt);
            }
        });
        jPanel1.add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, 70));

        LabelFondoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo11.png"))); // NOI18N
        jPanel1.add(LabelFondoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    
    
    private boolean datosSonValidos(){
    //otorgamos cada valor a los atributos de la clase Anuncio.
    //Decidí usar los setters y getters en vez del constructor, ya que los parametros iban a ser demasiado largos
        
    boolean guardar = true;
    
        try{

            anuncio.setTitulo(jTitulo.getText());
            anuncio.setDescripcion(jDescripcion.getText());
            anuncio.setFecha(fechaFormat.format(JDate.getDate()));
            anuncio.setSeccion(ComboSecciones.getSelectedItem().toString());
            anuncio.setCosto(anuncio.costoSinIva(ComboSecciones));
            anuncio.setCostoIva(anuncio.CostoConIva(ComboSecciones));


            if(jTitulo.getText().length() > 15 ){ //este error se muestra hasta que todos los demás datos se hayan introducido

                dedo1.setVisible(true);
                mensajeError("El titulo no debe contener mas de 15 caracteres", "Titulo invalido"); 
                jTitulo.setText("");
                guardar = false;
                
            }else if(jTitulo.getText().trim().equals("")){

                dedo1.setVisible(true);
                throw new NullPointerException();


            }else if(jDescripcion.getText().trim().equals("")){

                dedo2.setVisible(true);
                throw new NullPointerException();

            }

        }catch(NullPointerException ex){

            mensajeError("Por favor, ingrese todos los datos. ","Datos incompletos");
            guardar = false;

        }
        
        return guardar;
    }
 
     
      private void enviarDatosNuevoFrame(){
        
        //instanciamos el nuevo frame en donde se mostrara el reporte final
       // y a los atributos se les asignan los valores recolectados en el primer frame
        JFrameReporte frameReporte = new JFrameReporte();
        //--------------------------
        
        
        
      //formateamos el resultado de los costos para que muestren solo 2 decimales despues de la coma
        DecimalFormat format = new DecimalFormat(".00");
        String costoFormat = format.format(anuncio.getCosto());
        String costoIvaFormat = format.format(anuncio.getCostoIva());
      //--------------------------

        
      
        frameReporte.titulo = "Titulo:   " + anuncio.getTitulo().toUpperCase();
        frameReporte.seccion = "Sección:   " + anuncio.getSeccion().toUpperCase();
        frameReporte.fecha = "Fecha:   " + anuncio.getFecha().toUpperCase();
        frameReporte.descripcion = "Descripción: " + anuncio.getDescripcion().toUpperCase() ;
        frameReporte.costo = "Costo sin IVA:   ₡" + costoFormat;
        frameReporte.costoIva = "Costo con IVA:   ₡" + costoIvaFormat;
          
        
        frameReporte.setVisible(true);
        this.dispose();
        
    }
    
    
     
    private void GenerarReporte(){
        
        if(datosSonValidos()){
            enviarDatosNuevoFrame();
        }

    
    }
      
    //eventos y metodos extra
    private void mensajeError(String txt, String titulo){
    
        JOptionPane.showMessageDialog(null, txt, titulo, ERROR_MESSAGE);

    }
    
   
    private void cambiaIconosComboBox(){
        

        if( ComboSecciones.getSelectedItem() == "Deportes" ){
                        
            cambiarIcono(iconosComboSecciones, "/images/deportes.png");
                    
        }else if(ComboSecciones.getSelectedItem() == "Nacionales" ){
            
            cambiarIcono(iconosComboSecciones, "/images/nacionales.png");
                
        }else if(ComboSecciones.getSelectedItem() == "Culturales" ){
            
            cambiarIcono(iconosComboSecciones, "/images/culturales.png");
                
        }else if(ComboSecciones.getSelectedItem() == "Internacionales" ){
            
            cambiarIcono(iconosComboSecciones, "/images/internacionales.png");
                
        }else if(ComboSecciones.getSelectedItem() == "Económicos" ){
            
            cambiarIcono(iconosComboSecciones, "/images/economicos.png");
        }
      
        
    }
    
    
    private void cambiarIcono(JLabel nombre, String ubicacion){
        
        nombre.setIcon(new ImageIcon(getClass().getResource(ubicacion)));
                                            //        "/images/nombre.extension"
    }
       
    private void jDescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDescripcionFocusGained
        dedo2.setVisible(false);
    }//GEN-LAST:event_jDescripcionFocusGained
    
    private void jDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDescripcionKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
              GenerarReporte();
        }
    }//GEN-LAST:event_jDescripcionKeyPressed

    private void jTituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTituloFocusGained

        dedo1.setVisible(false);
    }//GEN-LAST:event_jTituloFocusGained

    private void iconosComboSeccionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconosComboSeccionesMouseEntered
          cambiaIconosComboBox();
    }//GEN-LAST:event_iconosComboSeccionesMouseEntered

    private void iconosComboSeccionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconosComboSeccionesMouseExited
          cambiaIconosComboBox();
    }//GEN-LAST:event_iconosComboSeccionesMouseExited

    private void iconosComboSeccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconosComboSeccionesMouseClicked
        ComboSecciones.showPopup();        
    }//GEN-LAST:event_iconosComboSeccionesMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setState(calculadoraAnuncio.ICONIFIED);//minimizar pantalla
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnGenerarReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarReporteMouseClicked
        GenerarReporte();
    }//GEN-LAST:event_btnGenerarReporteMouseClicked

   
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadoraAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(() -> {
            new calculadoraAnuncio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboSecciones;
    private com.toedter.calendar.JDateChooser JDate;
    private javax.swing.JLabel LabelFondoAzul;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JLabel dedo1;
    private javax.swing.JLabel dedo2;
    private javax.swing.JLabel iconosComboSecciones;
    private javax.swing.JTextField jDescripcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTitulo;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelSeccion;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
