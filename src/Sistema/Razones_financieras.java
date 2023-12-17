package Sistema;
/**
 *
 * @author Yam
 */
import data.*;
import javax.swing.*;

public class Razones_financieras extends javax.swing.JFrame {
    /**
     * Creates new form Razones_financieras
     */
    private RazonesFinancieras rf;
    public Razones_financieras() {
        initComponents();
        rf = new RazonesFinancieras();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        BG = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panel1 = new java.awt.Panel();
        lblAcido = new javax.swing.JLabel();
        lblCirculante = new javax.swing.JLabel();
        lblLiquidez = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblcapTrabajo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panel2 = new java.awt.Panel();
        lbldeuCap = new javax.swing.JLabel();
        lblDeuda = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        panel3 = new java.awt.Panel();
        lblNeto = new javax.swing.JLabel();
        lblOperativo = new javax.swing.JLabel();
        lblBruto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblUafida = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 628));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        BG.setBackground(new java.awt.Color(51, 51, 51));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        panel1.setBackground(new java.awt.Color(204, 204, 204));

        lblAcido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAcido.setText("Prueba de Ácido:");

        lblCirculante.setBackground(new java.awt.Color(222, 222, 222));
        lblCirculante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCirculante.setText("Razón Circulante:");

        lblLiquidez.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        lblLiquidez.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLiquidez.setText("Razón de liquidez ");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel3.setText("Razones de Liquidez");

        lblcapTrabajo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblcapTrabajo.setText("Razón Cápital del Trabajo");

        jButton1.setText("?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCirculante)
                            .addComponent(lblLiquidez)
                            .addComponent(lblAcido)
                            .addComponent(lblcapTrabajo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLiquidez)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCirculante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAcido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcapTrabajo)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(204, 204, 204));

        lbldeuCap.setBackground(new java.awt.Color(222, 222, 222));
        lbldeuCap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbldeuCap.setText("Razón de Deuda a Cápital:");

        lblDeuda.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        lblDeuda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDeuda.setText("Razón de Deuda:");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel4.setText("Razones de Endeudamiento");

        jButton3.setText("?");
        jButton3.setName("?Deuda"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldeuCap)
                            .addComponent(lblDeuda))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(lblDeuda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbldeuCap)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panel3.setBackground(new java.awt.Color(204, 204, 204));

        lblNeto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNeto.setText("Margen Neto:");

        lblOperativo.setBackground(new java.awt.Color(222, 222, 222));
        lblOperativo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOperativo.setText("Margen Operativo:");

        lblBruto.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        lblBruto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBruto.setText("Margen Bruto:");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel5.setText("Razones de Rentabilidad");

        lblUafida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUafida.setText("Margen UAFIDA:");

        jButton4.setText("?");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOperativo)
                            .addComponent(lblBruto)
                            .addComponent(lblNeto)
                            .addComponent(lblUafida))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBruto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOperativo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNeto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUafida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atras.png"))); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        BG.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, -1, 580));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TEQUILERA LA CARIÑOSA S.A DE C.V");
        BG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 12, 263, -1));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Razones Financieras");
        BG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 39, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JOptionPane.showMessageDialog(null,"Permiten identificar el grado o indice de liquidez con que cuenta la empresa \n \n Razon circulante:Cuan mayor es el valor mejor los resultados de la empresa."
               + " \n Prueba de acido: Muestra la capacidad de pagar las deudas a corto plazo. \n Razon de capital de trabajo: Determina la cantidad de recursos de facil conversion a efectivo. "  );
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(null,"Permiten observar el riesgo financiero que la empresa posee."
                + " \n \n Razon de deuda: Mide la capacidad de la empresa de hacer frente a sus deudas con sus activos."
                + " \n Razon de deuda a capital: Muestra el compromiso que han tomado tanto los accionistas como los proveedores y acredores dentro de la empresa"
                );
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JOptionPane.showMessageDialog(null,"Muestra la capacidad de generar utilidades o incrementar los activos netos."
                + " \n \n Margen bruto: Muestra una idea general sobre la eficiencia de las materias primas en la produccion."
                + " \n Margen operativo: Muestra cuanto de la utilidad se utiliza en gastos administrativos."
                + " \n Margen neto: Muestra la utilidad libre de costos, gastos, impuesto y otras salidas de dinero."
                + " \n Margen UAFIDA: Muestra la eficienca del manejo admnistrativo en materia de impuestos. ");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lblLiquidez.setText("Razón de Liquidez: " + rf.getLiquidez());
        lblCirculante.setText("Razón Circulante: " + rf.getCirculante());
        lblAcido.setText("Prueba de Ácido: " + rf.getAcido());
        lblcapTrabajo.setText("Razón Cápital del Trabajo: " + rf.getCaTrabajo());
        
        lblDeuda.setText("Razón de Deuda: " + rf.getDeuda());
        lbldeuCap.setText("Razón de Deuda a Cápital: " + rf.getDACapital());
        
        lblBruto.setText("Margen Bruto: " + rf.getBruto());
        lblOperativo.setText("Margen Operativo: " + rf.getOperativo());
        lblNeto.setText("Margen Neto: " + rf.getNeto());
        lblUafida.setText("Margen UAFIDA: " + rf.getUafida());
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Razones_financieras().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAcido;
    private javax.swing.JLabel lblBruto;
    private javax.swing.JLabel lblCirculante;
    private javax.swing.JLabel lblDeuda;
    private javax.swing.JLabel lblLiquidez;
    private javax.swing.JLabel lblNeto;
    private javax.swing.JLabel lblOperativo;
    private javax.swing.JLabel lblUafida;
    private javax.swing.JLabel lblcapTrabajo;
    private javax.swing.JLabel lbldeuCap;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    // End of variables declaration//GEN-END:variables
}
