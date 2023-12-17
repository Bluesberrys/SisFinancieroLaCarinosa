
package Sistema;

import data.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import javax.swing.*;

public class BalanceGeneral extends javax.swing.JFrame {
    private Cuentas cuentas = new Cuentas();
    
    public BalanceGeneral() {
        initComponents();
        this.setIconImage(Login.img.getImage());
        this.setLocationRelativeTo(null);
        setImageLabel(logo, "src/img/Finanzasimg.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cajaTxtField = new javax.swing.JTextField();
        bancoTxtField = new javax.swing.JTextField();
        clientesTxtField = new javax.swing.JTextField();
        inventarioTxtField = new javax.swing.JTextField();
        mobiliarioTxtField = new javax.swing.JTextField();
        maquinariaTxtField = new javax.swing.JTextField();
        transporteTxtField = new javax.swing.JTextField();
        terrenoTxtField = new javax.swing.JTextField();
        equipoTxtField = new javax.swing.JTextField();
        proveedoresTxtField = new javax.swing.JTextField();
        cuentasPorPagarTxtField = new javax.swing.JTextField();
        financiaminetoTxtField = new javax.swing.JTextField();
        utilidadTxtField = new javax.swing.JTextField();
        capitalTxtField = new javax.swing.JTextField();
        totActCircTxt = new javax.swing.JLabel();
        totActNoCircTxt = new javax.swing.JLabel();
        totActTxt = new javax.swing.JLabel();
        totPasCircTxt = new javax.swing.JLabel();
        totPasNoCirTxt = new javax.swing.JLabel();
        totPatTxt = new javax.swing.JLabel();
        totPasYCapTxt = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        calcularBtn = new javax.swing.JButton();
        regresarBtn = new javax.swing.JButton();
        btnAumentosYDisminuciones = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema financiero La cariñosa");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        BG.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BALANCE GENERAL");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TEQUILERA LA CARIÑOSA S.A DE C.V");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ACTIVOS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Activo Circulante");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel7.setText("Caja");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 55, -1));

        jLabel8.setText("Banco");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 55, -1));

        jLabel9.setText("Clientes");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 55, -1));

        jLabel10.setText("Inventario");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 55, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Activo no Circulante");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 140, -1));

        jLabel12.setText("Mobiliario");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel13.setText("Maquinaria");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 70, -1));

        jLabel14.setText("Transporte");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel15.setText("Equipo de cómputo");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        jLabel16.setText("Terreno");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 55, -1));

        cajaTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaTxtFieldKeyPressed(evt);
            }
        });
        jPanel2.add(cajaTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 110, -1));

        bancoTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bancoTxtFieldKeyPressed(evt);
            }
        });
        jPanel2.add(bancoTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 110, -1));

        clientesTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clientesTxtFieldKeyPressed(evt);
            }
        });
        jPanel2.add(clientesTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 110, -1));

        inventarioTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inventarioTxtFieldKeyPressed(evt);
            }
        });
        jPanel2.add(inventarioTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 110, -1));

        mobiliarioTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobiliarioTxtFieldKeyPressed(evt);
            }
        });
        jPanel2.add(mobiliarioTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 110, -1));

        maquinariaTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                maquinariaTxtFieldKeyPressed(evt);
            }
        });
        jPanel2.add(maquinariaTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 110, -1));

        transporteTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                transporteTxtFieldKeyPressed(evt);
            }
        });
        jPanel2.add(transporteTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 110, -1));

        terrenoTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                terrenoTxtFieldKeyPressed(evt);
            }
        });
        jPanel2.add(terrenoTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 110, -1));

        equipoTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                equipoTxtFieldKeyPressed(evt);
            }
        });
        jPanel2.add(equipoTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 110, -1));

        proveedoresTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                proveedoresTxtFieldKeyPressed(evt);
            }
        });
        jPanel2.add(proveedoresTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 110, -1));

        cuentasPorPagarTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cuentasPorPagarTxtFieldKeyPressed(evt);
            }
        });
        jPanel2.add(cuentasPorPagarTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 110, -1));

        financiaminetoTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                financiaminetoTxtFieldKeyPressed(evt);
            }
        });
        jPanel2.add(financiaminetoTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 110, -1));

        utilidadTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                utilidadTxtFieldKeyPressed(evt);
            }
        });
        jPanel2.add(utilidadTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 110, -1));

        capitalTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                capitalTxtFieldKeyPressed(evt);
            }
        });
        jPanel2.add(capitalTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 110, -1));

        totActCircTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totActCircTxt.setText("=");
        jPanel2.add(totActCircTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 110, -1));

        totActNoCircTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totActNoCircTxt.setText("=");
        jPanel2.add(totActNoCircTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 110, -1));

        totActTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totActTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totActTxt.setText("=");
        jPanel2.add(totActTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 110, -1));

        totPasCircTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totPasCircTxt.setText("=");
        jPanel2.add(totPasCircTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 110, -1));

        totPasNoCirTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totPasNoCirTxt.setText("=");
        jPanel2.add(totPasNoCirTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 110, -1));

        totPatTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totPatTxt.setText("=");
        jPanel2.add(totPatTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 110, -1));

        totPasYCapTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totPasYCapTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totPasYCapTxt.setText("=");
        jPanel2.add(totPasYCapTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 110, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Total de activos:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        jLabel21.setText("Total:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 93, -1));

        jLabel22.setText("Total:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 93, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("PASIVOS");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Pasivo Circulante");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        jLabel23.setText("Proveedores");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        jLabel24.setText("Cuentas por pagar");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Pasivo no Circulante");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        jLabel26.setText("Total:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 93, -1));

        jLabel28.setText("Arrendamiento");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        jLabel29.setText("Total:");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 93, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setText("Capital Contable");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, -1));

        jLabel32.setText("Utilidad neta");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        jLabel33.setText("Total:");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 93, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setText("Total de pasivos+capital contable:");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, -1));

        jLabel37.setText("Capital Social");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));

        calcularBtn.setBackground(new java.awt.Color(204, 204, 204));
        calcularBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calcular.png"))); // NOI18N
        calcularBtn.setText("Calcular");
        calcularBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularBtnActionPerformed(evt);
            }
        });
        jPanel2.add(calcularBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 120, 50));

        regresarBtn.setBackground(new java.awt.Color(0, 0, 0));
        regresarBtn.setForeground(new java.awt.Color(255, 255, 255));
        regresarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atras.png"))); // NOI18N
        regresarBtn.setText("Regresar");
        regresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(regresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, -1, -1));

        btnAumentosYDisminuciones.setBackground(new java.awt.Color(0, 102, 51));
        btnAumentosYDisminuciones.setForeground(new java.awt.Color(255, 255, 255));
        btnAumentosYDisminuciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aumentos_disminucion.png"))); // NOI18N
        btnAumentosYDisminuciones.setText("Aumentos y Disminuciones");
        btnAumentosYDisminuciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentosYDisminucionesActionPerformed(evt);
            }
        });
        jPanel2.add(btnAumentosYDisminuciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, 50));

        logo.setText("logo");

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jLabel6))
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calcularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularBtnActionPerformed
        RazonesFinancieras rf = new RazonesFinancieras();
        
            
        obtenerInfo();
        totActCircTxt.setText(cuentas.getTotActCirc()+"");
        totActNoCircTxt.setText(cuentas.getTotActNoCirc()+"");
        totActTxt.setText(cuentas.getTotAct()+"");
        totPasCircTxt.setText(cuentas.getTotPasCirc()+"");
        totPasNoCirTxt.setText(cuentas.getTotPasNoCirc()+"");
        totPatTxt.setText(cuentas.getTotPat()+"");
        totPasYCapTxt.setText(cuentas.getTotPasMPat()+"");
        
        /******************************  Inicio de Razones Financieras **********************************************/
        float liquidez = (cuentas.getTotActCirc() - cuentas.getInventario())/ cuentas.getTotPasCirc();
        float circulante = cuentas.getTotActCirc() / cuentas.getTotPasCirc();
        float acido = (circulante - cuentas.getInventario() ) / cuentas.getTotPasCirc();
        float deuda =(cuentas.getTotPasCirc() + cuentas.getTotPasNoCirc())/ cuentas.getTotAct();
        float deudaCapital = (cuentas.getTotPasCirc() + cuentas.getTotPasNoCirc())/ cuentas.getTotPat();
        float capTrabajo = cuentas.getTotActCirc() - cuentas.getTotPasCirc();
        
        rf.setLiquidez(liquidez); rf.setCirculante(circulante); rf.setAcido(acido);
        rf.setDeuda(deuda); rf.setDACapital(deudaCapital); rf.setCaTrabajo(capTrabajo);
        /******************************  Fin de Razones Financieras **********************************************/
        
        EstaticCuentas.setCuentasDyn(cuentas);
    }//GEN-LAST:event_calcularBtnActionPerformed

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_regresarBtnActionPerformed

    private void btnAumentosYDisminucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentosYDisminucionesActionPerformed
        obtenerInfo();
        EstaticCuentas.setCuentasDyn(cuentas);
        new Aumentos_Y_Disminuciones().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAumentosYDisminucionesActionPerformed

    private void cajaTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTxtFieldKeyPressed
        if(evt.getKeyCode()==10) {
            bancoTxtField.requestFocusInWindow(FocusEvent.Cause.UNKNOWN);
        }
    }//GEN-LAST:event_cajaTxtFieldKeyPressed

    private void bancoTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bancoTxtFieldKeyPressed
        if(evt.getKeyCode()==10) {
            clientesTxtField.requestFocusInWindow(FocusEvent.Cause.UNKNOWN);
        }
    }//GEN-LAST:event_bancoTxtFieldKeyPressed

    private void clientesTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clientesTxtFieldKeyPressed
        if(evt.getKeyCode()==10) {
            inventarioTxtField.requestFocusInWindow(FocusEvent.Cause.UNKNOWN);
        }
    }//GEN-LAST:event_clientesTxtFieldKeyPressed

    private void inventarioTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inventarioTxtFieldKeyPressed
        if(evt.getKeyCode()==10) {
            mobiliarioTxtField.requestFocusInWindow(FocusEvent.Cause.UNKNOWN);
        }
    }//GEN-LAST:event_inventarioTxtFieldKeyPressed

    private void mobiliarioTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobiliarioTxtFieldKeyPressed
        if(evt.getKeyCode()==10) {
            maquinariaTxtField.requestFocusInWindow(FocusEvent.Cause.UNKNOWN);
        }
    }//GEN-LAST:event_mobiliarioTxtFieldKeyPressed

    private void maquinariaTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maquinariaTxtFieldKeyPressed
        if(evt.getKeyCode()==10) {
            transporteTxtField.requestFocusInWindow(FocusEvent.Cause.UNKNOWN);
        }
    }//GEN-LAST:event_maquinariaTxtFieldKeyPressed

    private void transporteTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transporteTxtFieldKeyPressed
        if(evt.getKeyCode()==10) {
            terrenoTxtField.requestFocusInWindow(FocusEvent.Cause.UNKNOWN);
        }
    }//GEN-LAST:event_transporteTxtFieldKeyPressed

    private void terrenoTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_terrenoTxtFieldKeyPressed
        if(evt.getKeyCode()==10) {
            equipoTxtField.requestFocusInWindow(FocusEvent.Cause.UNKNOWN);
        }
    }//GEN-LAST:event_terrenoTxtFieldKeyPressed

    private void equipoTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equipoTxtFieldKeyPressed
        if(evt.getKeyCode()==10) {
            proveedoresTxtField.requestFocusInWindow(FocusEvent.Cause.UNKNOWN);
        }
    }//GEN-LAST:event_equipoTxtFieldKeyPressed

    private void proveedoresTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proveedoresTxtFieldKeyPressed
        if(evt.getKeyCode()==10) {
            cuentasPorPagarTxtField.requestFocusInWindow(FocusEvent.Cause.UNKNOWN);
        }
    }//GEN-LAST:event_proveedoresTxtFieldKeyPressed

    private void cuentasPorPagarTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuentasPorPagarTxtFieldKeyPressed
        if(evt.getKeyCode()==10) {
            financiaminetoTxtField.requestFocusInWindow(FocusEvent.Cause.UNKNOWN);
        }
    }//GEN-LAST:event_cuentasPorPagarTxtFieldKeyPressed

    private void financiaminetoTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_financiaminetoTxtFieldKeyPressed
        if(evt.getKeyCode()==10) {
            capitalTxtField.requestFocusInWindow(FocusEvent.Cause.UNKNOWN);
        }
    }//GEN-LAST:event_financiaminetoTxtFieldKeyPressed

    private void capitalTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capitalTxtFieldKeyPressed
        if(evt.getKeyCode()==10) {
            utilidadTxtField.requestFocusInWindow(FocusEvent.Cause.UNKNOWN);
        }
    }//GEN-LAST:event_capitalTxtFieldKeyPressed

    private void utilidadTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_utilidadTxtFieldKeyPressed
        if(evt.getKeyCode()==10) {
            obtenerInfo();
        
            totActCircTxt.setText(cuentas.getTotActCirc()+"");
            totActNoCircTxt.setText(cuentas.getTotActNoCirc()+"");
            totActTxt.setText(cuentas.getTotAct()+"");
            totPasCircTxt.setText(cuentas.getTotPasCirc()+"");
            totPasNoCirTxt.setText(cuentas.getTotPasNoCirc()+"");
            totPatTxt.setText(cuentas.getTotPat()+"");
            totPasYCapTxt.setText(cuentas.getTotPasMPat()+"");

            EstaticCuentas.setCuentasDyn(cuentas);
        }
    }//GEN-LAST:event_utilidadTxtFieldKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(EstaticCuentas.getCuentasDyn() != null) {
            cuentas = EstaticCuentas.getCuentasDyn();
            cajaTxtField.setText(cuentas.getCaja()+ "");
            bancoTxtField.setText(cuentas.getBanco()+ "");
            clientesTxtField.setText(cuentas.getClientes()+ "");
            inventarioTxtField.setText(cuentas.getInventario()+ "");
            mobiliarioTxtField.setText(cuentas.getMobiliario()+ "");
            maquinariaTxtField.setText(cuentas.getMaquinaria()+ "");
            transporteTxtField.setText(cuentas.getTransporte()+ "");
            terrenoTxtField.setText(cuentas.getTerreno()+ "");
            equipoTxtField.setText(cuentas.getEquipoComp()+ "");
            proveedoresTxtField.setText(cuentas.getProveedores()+ "");
            cuentasPorPagarTxtField.setText(cuentas.getCtasPPagar()+ "");
            financiaminetoTxtField.setText(cuentas.getArrendamiento()+ "");
            capitalTxtField.setText(cuentas.getCapSocial()+ "");
            utilidadTxtField.setText(cuentas.getUtilNet()+ "");
        }
    }//GEN-LAST:event_formWindowOpened
    
    private void setImageLabel (JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    private void obtenerInfo () {
        try {
            cuentas.setCaja(Float.parseFloat(cajaTxtField.getText())); 
            cuentas.setBanco(Float.parseFloat(bancoTxtField.getText()));
            cuentas.setClientes(Float.parseFloat(clientesTxtField.getText()));
            cuentas.setInventario(Float.parseFloat(inventarioTxtField.getText()));
            cuentas.setMobiliario(Float.parseFloat(mobiliarioTxtField.getText()));
            cuentas.setMaquinaria(Float.parseFloat(maquinariaTxtField.getText()));
            cuentas.setTransporte(Float.parseFloat(transporteTxtField.getText()));
            cuentas.setTerreno(Float.parseFloat(terrenoTxtField.getText()));
            cuentas.setEquipoComp(Float.parseFloat(equipoTxtField.getText()));
            cuentas.setProveedores(Float.parseFloat(proveedoresTxtField.getText()));
            cuentas.setCtasPPagar(Float.parseFloat(cuentasPorPagarTxtField.getText()));
            cuentas.setArrendamiento(Float.parseFloat(financiaminetoTxtField.getText()));
            cuentas.setCapSocial(Float.parseFloat(capitalTxtField.getText()));
            cuentas.setUtilNet(Float.parseFloat(utilidadTxtField.getText()));
        } 
        catch (Exception e) {
            System.out.println(e);
        }
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
            java.util.logging.Logger.getLogger(BalanceGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BalanceGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BalanceGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BalanceGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BalanceGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JTextField bancoTxtField;
    private javax.swing.JButton btnAumentosYDisminuciones;
    private javax.swing.JTextField cajaTxtField;
    private javax.swing.JButton calcularBtn;
    private javax.swing.JTextField capitalTxtField;
    private javax.swing.JTextField clientesTxtField;
    private javax.swing.JTextField cuentasPorPagarTxtField;
    private javax.swing.JTextField equipoTxtField;
    private javax.swing.JTextField financiaminetoTxtField;
    private javax.swing.JTextField inventarioTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField maquinariaTxtField;
    private javax.swing.JTextField mobiliarioTxtField;
    private javax.swing.JTextField proveedoresTxtField;
    private javax.swing.JButton regresarBtn;
    private javax.swing.JTextField terrenoTxtField;
    private javax.swing.JLabel totActCircTxt;
    private javax.swing.JLabel totActNoCircTxt;
    private javax.swing.JLabel totActTxt;
    private javax.swing.JLabel totPasCircTxt;
    private javax.swing.JLabel totPasNoCirTxt;
    private javax.swing.JLabel totPasYCapTxt;
    private javax.swing.JLabel totPatTxt;
    private javax.swing.JTextField transporteTxtField;
    private javax.swing.JTextField utilidadTxtField;
    // End of variables declaration//GEN-END:variables
}
