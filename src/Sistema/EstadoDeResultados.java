package Sistema;

import data.*;
import java.awt.Image;
import java.io.*;
import javax.swing.*;


public class EstadoDeResultados extends javax.swing.JFrame {
    private Resultados valoresResul;
    
    public EstadoDeResultados() {
        initComponents();
        this.setIconImage(Login.img.getImage());
        this.setLocationRelativeTo(null);
        setImageLabel(logo, "src/img/Finanzasimg.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ventasTxtField = new javax.swing.JTextField();
        costosVentasTxtField = new javax.swing.JTextField();
        gastosOperacionTxtField = new javax.swing.JTextField();
        gastosFinancierosTxtField = new javax.swing.JTextField();
        otrosGastosTxtField = new javax.swing.JTextField();
        otrosIngresosTxtField = new javax.swing.JTextField();
        impuestosTxtField = new javax.swing.JTextField();
        margenbruto = new javax.swing.JLabel();
        utilidadimpuestos = new javax.swing.JLabel();
        utilidadneta = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        utilidadoperacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Ventas");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Costo de ventas");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 210, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Margen bruto");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Gastos de operacion");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Gastos financieros");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("Otros gastos");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 210, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("Otros ingresos");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 210, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setText("Utilidad antes de impuestos");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setText("Impuestos");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 210, -1));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setText("Utilidad neta");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 210, -1));

        ventasTxtField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel2.add(ventasTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 100, -1));

        costosVentasTxtField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel2.add(costosVentasTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 100, -1));

        gastosOperacionTxtField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel2.add(gastosOperacionTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 100, -1));

        gastosFinancierosTxtField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel2.add(gastosFinancierosTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 100, -1));

        otrosGastosTxtField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel2.add(otrosGastosTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 100, -1));

        otrosIngresosTxtField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel2.add(otrosIngresosTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 100, -1));

        impuestosTxtField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel2.add(impuestosTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 100, -1));

        margenbruto.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        margenbruto.setText("=");
        jPanel2.add(margenbruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 100, -1));

        utilidadimpuestos.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        utilidadimpuestos.setText("=");
        jPanel2.add(utilidadimpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 100, -1));

        utilidadneta.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        utilidadneta.setText("=");
        jPanel2.add(utilidadneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 100, -1));

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel15.setText("Utilidad de la operacion");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, -1));

        utilidadoperacion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        utilidadoperacion.setText("=");
        jPanel2.add(utilidadoperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 400, 430));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESTADO DE RESULTADOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 230, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte.png"))); // NOI18N
        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atras.png"))); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, -1, -1));

        logo.setText("logo");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Creamos un arreglo donde guardaremos los valores para posteriormente utilizarlos
        //el orden es VENTAS, COSSTO DE VENTAS, GASTOS DE OPERACIÓN, OTROS INGRESOS, IMPUESTOS, UTILIDAD NETA
        float valores_to_flujo_efectivo [] = new float [6];
        RazonesFinancieras rf = new RazonesFinancieras();
        
        Float a;
        a = Float.parseFloat(ventasTxtField.getText()) - Float.parseFloat(costosVentasTxtField.getText()) ;
        margenbruto.setText(a+"");
        Float b;
        b = Float.parseFloat(margenbruto.getText()) - Float.parseFloat(gastosOperacionTxtField.getText());
        utilidadoperacion.setText(b+"");
        Float c;
        c = Float.parseFloat(utilidadoperacion.getText()) - Float.parseFloat(gastosFinancierosTxtField.getText()) - Float.parseFloat(otrosGastosTxtField.getText()) + Float.parseFloat(otrosIngresosTxtField.getText());
        utilidadimpuestos.setText(c+"");
        Float d;
        d = Float.parseFloat(utilidadimpuestos.getText()) - Float.parseFloat(impuestosTxtField.getText());
        utilidadneta.setText(d+"");
        
        /******************************  Inicio de Razones Financieras **********************************************/
        float bruto = a;
        float operativo = b / Float.parseFloat(ventasTxtField.getText());
        float neto = d / Float.parseFloat(ventasTxtField.getText());
        float uafida = c/ Float.parseFloat(ventasTxtField.getText());
        rf.setBruto(bruto); rf.setOperativo(operativo); rf.setNeto(neto); rf.setUafida(uafida);
        /******************************  Fin de Razones Financieras **********************************************/
        
        valores_to_flujo_efectivo [0] = Float.parseFloat(ventasTxtField.getText());
        valores_to_flujo_efectivo [1] = Float.parseFloat(costosVentasTxtField.getText());
        valores_to_flujo_efectivo [2] = Float.parseFloat(gastosOperacionTxtField.getText());
        valores_to_flujo_efectivo [3] = Float.parseFloat(otrosIngresosTxtField.getText());
        valores_to_flujo_efectivo [4] = Float.parseFloat(impuestosTxtField.getText());
        valores_to_flujo_efectivo [5] = d; //Utilidad neta
        
        GuardarDatos(valores_to_flujo_efectivo);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (EstaticCuentas.getValoresResultados() != null) {
            valoresResul = EstaticCuentas.getValoresResultados();
            
            ventasTxtField.setText(valoresResul.getVentas() + "");
            costosVentasTxtField.setText(valoresResul.getCostVentas() + "");
            gastosOperacionTxtField.setText(valoresResul.getGastosOp() + "");
            gastosFinancierosTxtField.setText(valoresResul.getGastosFinc() + "");
            otrosGastosTxtField.setText(valoresResul.getOtrosGastos() + "");
            otrosIngresosTxtField.setText(valoresResul.getOtrosIngresos() + "");
            impuestosTxtField.setText(valoresResul.getImpuestos() + "");
        }
    }//GEN-LAST:event_formWindowOpened

    public void GuardarDatos(float [] arry){
        FileWriter papel;
        //PrintWriter pluma; por si se ocupa luego xd
        try {
                //Abrimos un archivo en modo escritura
                papel = new FileWriter("Estado_de_resultados.txt"); 
                
                //Permite escribir sobre un archivo
                // (creo que no se ocupa) pluma = new PrintWriter(papel);
                
                //Creamos un buffer para optimizar el codigo y no abrir tanto el disco
                BufferedWriter buferTemporal = new BufferedWriter(papel);
                
                //Mandar cada objeto del arreglo a una linea del archivo
                //dividir con un caracter de control ;
                for(int i=0; i<arry.length; i++){
                    buferTemporal.write(arry[i] + ",\n");
                }
                buferTemporal.close();
                
                papel.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void setImageLabel (JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
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
            java.util.logging.Logger.getLogger(EstadoDeResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadoDeResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadoDeResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadoDeResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstadoDeResultados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField costosVentasTxtField;
    private javax.swing.JTextField gastosFinancierosTxtField;
    private javax.swing.JTextField gastosOperacionTxtField;
    private javax.swing.JTextField impuestosTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel margenbruto;
    private javax.swing.JTextField otrosGastosTxtField;
    private javax.swing.JTextField otrosIngresosTxtField;
    private javax.swing.JLabel utilidadimpuestos;
    private javax.swing.JLabel utilidadneta;
    private javax.swing.JLabel utilidadoperacion;
    private javax.swing.JTextField ventasTxtField;
    // End of variables declaration//GEN-END:variables
}
