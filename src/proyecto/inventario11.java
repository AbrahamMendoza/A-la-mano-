/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import clases.producto;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;


import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Daniel
 */


public class inventario11 extends javax.swing.JFrame {
 URL url= null;
 ImageIcon icon = null;
 producto p= new producto();
      
    public inventario11() {
     

        
   initComponents();
 this.setLocationRelativeTo(null);
   
   
        
    }

    
   

        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        txtcodproducto = new javax.swing.JTextField();
        txtprecproducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtnomproducto = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        desrip = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        preciov = new javax.swing.JTextField();
        btncargar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        lblimagem = new javax.swing.JLabel();
        txtprove = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Menu Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jLabel1.setText("codigo del producto:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 20));

        jLabel5.setText("Precio c:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        txtcodproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodproductoKeyPressed(evt);
            }
        });
        jPanel1.add(txtcodproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 170, -1));
        jPanel1.add(txtprecproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 110, -1));

        jLabel7.setText("Nmobre del Producto:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        txtnomproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomproductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtnomproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 170, -1));

        jButton3.setText("Borrar");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 110, -1));

        jLabel2.setText("Descripcion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        jPanel1.add(desrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 270, 50));

        jLabel8.setText("precio v:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel9.setText("proveedor");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel10.setText("Categoria:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        jPanel1.add(preciov, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 110, -1));

        btncargar.setText("Cargar Imagen");
        btncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarActionPerformed(evt);
            }
        });
        jPanel1.add(btncargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jLabel3.setText("Nombre de la Imagen");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 140, -1));
        jPanel1.add(lblimagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 150, 110));
        jPanel1.add(txtprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 110, -1));
        jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 170, -1));

        jLabel6.setText("cantidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, -1));
        jPanel1.add(txtcate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Principal obj=new Principal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
JFileChooser archivo=new JFileChooser();

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("archivo de texto", "txt");
        archivo.setFileFilter(filtro);
        int opcion = archivo.showSaveDialog(this);
        
        if(opcion == JFileChooser.APPROVE_OPTION){
            try{
                BufferedWriter bw = new BufferedWriter(new FileWriter(archivo.getSelectedFile().getAbsolutePath()));
            bw.write(txtnomproducto.getText());
             bw.write(txtcodproducto.getText());
              bw.write(txtcantidad.getText());
               bw.write(txtprecproducto.getText());
                bw.write(txtprove.getText());
                 bw.write(txtdireccion.getText());
                  bw.write(preciov.getText());
                   bw.write(desrip.getText());
                    bw.write(txtcate.getText());
                    bw.close();
                    
            }catch(IOException e){
                    e.printStackTrace();
            }
        }
     
       
        
        
        
      
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtnomproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomproductoActionPerformed

    private void btncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarActionPerformed
       
        int resultado;
        JFileChooser archivo = new JFileChooser();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("imagenes", "png");
        
        archivo.setFileFilter(filtro);
        
        resultado = archivo.showOpenDialog(null);
        if(resultado == JFileChooser.APPROVE_OPTION){
        File fichero= archivo.getSelectedFile();
        
        try{
            ImageIcon icon=new ImageIcon(fichero.toString());
            Icon icono=new ImageIcon(icon.getImage());
            
            lblimagem.setText(null);
            lblimagem.setIcon(icono);
            
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, "error abriendo la imagen"+ex);
        
        }
        txtdireccion.setText(archivo.getSelectedFile().getName());
        }
        
    }//GEN-LAST:event_btncargarActionPerformed

    private void txtcodproductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodproductoKeyPressed
        // TODO add your handling code here:
      
        
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (p.buscarProducto(txtcodproducto.getText()) == 1) {

                txtnomproducto.setText(p.getNombre());
                desrip.setText(p.getDescripcion());
                txtcate.setText(Integer.toString(p.getCveCategoria()));
                txtcantidad.setText(Integer.toString(p.getCantidad()));
                txtprecproducto.setText(Double.toString(p.getPrecioC()));
                preciov.setText(Double.toString(p.getPrecioV()));
                txtprove.setText(Integer.toString(p.getCveProveedor()));

                int op = Integer.parseInt(txtcodproducto.getText());

        switch (op) {
            case 1: 
                this.mostrarImagen("/Imagenes/1.jpg");
                txtDirecccion.setText("1.jpg");
                break;
            case 2: 
                this.mostrarImagen("/Imagenes/logo4.png");
                txtDirecccion.setText("logo4.png");
                break;
        } 
                        
                
            } else {
                JOptionPane.showMessageDialog(null, "Producto No Encontrado", "Alerta", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtcodproductoKeyPressed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inventario11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventario11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventario11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventario11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventario11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncargar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JTextField desrip;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblimagem;
    private javax.swing.JTextField preciov;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcate;
    private javax.swing.JTextField txtcodproducto;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnomproducto;
    private javax.swing.JTextField txtprecproducto;
    private javax.swing.JTextField txtprove;
    // End of variables declaration//GEN-END:variables

}
