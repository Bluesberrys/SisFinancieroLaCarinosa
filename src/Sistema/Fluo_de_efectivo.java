
package Sistema;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ivam1
 */
public class Fluo_de_efectivo extends javax.swing.JFrame {

    /**
     * Creates new form Fluo_de_efectivo
     */
    public Fluo_de_efectivo() {
        initComponents();
        this.setIconImage(Login.img.getImage());
        this.setLocationRelativeTo(null);
        setImageLabel(logo, "src/img/Finanzasimg.png");
    }
    
    public void CargarDatos (float [] arry, String nombre_arch){
        
        //Verificamos si existen datos guardados
        //Es necesario proporcionar  el nombre del archivo que vamos a buscar
        File archivo = new File(nombre_arch + ".txt");
        Scanner lector1;
        
        //Si ya hay un archivo lo vamos a cargar
        if(archivo.exists()){
            
            //Usamos try catch 
            try {
                lector1 = new Scanner(archivo);
               int indx = 0;
                //hasnextline para capturar todo el texto contenido
                while(lector1.hasNextLine()){
                    String archivo_entero = lector1.nextLine();
                    
                    //ahora dividimos el texto y lo vamos agregando al objeto
                    Scanner lector2 = new Scanner(archivo_entero);
                    lector2.useDelimiter("\\s*,\\s*");
                    
                    //Creamos un arreglo para guardar los datos temporalmente
                    //Posiblemente no se necesite para nada lo dejo por si se llega a presentar un error pero facilmente se podría borrar
                    //float [] contendor_temporal = new float[6];
                    arry[indx]=(Float.parseFloat(lector2.next()));
                    //arry[indx] = contendor_temporal[indx];
                    indx++;
                }
                //Cerramos el scanner
                lector1.close();
               
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EstadoDeResultados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        Title_description = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Method = new javax.swing.JLabel();
        Year = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        generate_report = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        efectivo_recibido_por_los_clientes = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        otros_ingresos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        total_de_las_entradas = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        efectivo_pagados_por_los_inventarios = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        efectivo_pagado_por_los_gastos_operativos = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        efectivo_pagado_por_impuestos = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        total_de_las_salidas = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        efectivo_de_las_actividades_de_operacion = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        maquinaria_y_transporte = new javax.swing.JLabel();
        equipo_de_computo = new javax.swing.JLabel();
        mobiliario = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        efectivo_utilizado_maquinaria_y_equipo = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        emision_de_nueva_deuda = new javax.swing.JLabel();
        dividendos = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        efectivo_proviniente_del_financiamiento = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        flujo_de_efectivo_neto = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        efectivo_al_inicio_del_periodo = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        efectivo_al_final_del_periodo = new javax.swing.JLabel();
        return_menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(0, 102, 51));

        Title_description.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        Title_description.setForeground(new java.awt.Color(255, 255, 255));
        Title_description.setText("Estado de flujo de efectivo");

        Title.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Tequilera Cariñosa S.A. de C.V.");

        Method.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        Method.setForeground(new java.awt.Color(255, 255, 255));
        Method.setText("Metodo Directo");

        Year.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        Year.setForeground(new java.awt.Color(255, 255, 255));
        Year.setText("2023");

        logo.setText("Logo");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(Title_description))
                    .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Title)
                        .addGroup(HeaderLayout.createSequentialGroup()
                            .addGap(162, 162, 162)
                            .addComponent(Method)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Year))))
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(Title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Title_description)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Method)
                            .addComponent(Year))))
                .addGap(120, 120, 120))
        );

        Body.setBackground(new java.awt.Color(51, 51, 51));
        Body.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actividades de Operación:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Entradas:");

        generate_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte.png"))); // NOI18N
        generate_report.setText("Generar");
        generate_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_reportActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Efectivo recibido por los clientes:");

        efectivo_recibido_por_los_clientes.setForeground(new java.awt.Color(255, 255, 255));
        efectivo_recibido_por_los_clientes.setText("$$$$$");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Otros ingresos:");

        otros_ingresos.setForeground(new java.awt.Color(255, 255, 255));
        otros_ingresos.setText("$$$$$");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total de las entradas:");

        total_de_las_entradas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        total_de_las_entradas.setForeground(new java.awt.Color(255, 255, 255));
        total_de_las_entradas.setText("$$$$$");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Salidas:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Efectivo pagado por los inventarios");

        efectivo_pagados_por_los_inventarios.setForeground(new java.awt.Color(255, 255, 255));
        efectivo_pagados_por_los_inventarios.setText("$$$$");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Efectivo pagado por los gastos operativos");

        efectivo_pagado_por_los_gastos_operativos.setForeground(new java.awt.Color(255, 255, 255));
        efectivo_pagado_por_los_gastos_operativos.setText("$$$$");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Efectivo pagado por impuestos");

        efectivo_pagado_por_impuestos.setForeground(new java.awt.Color(255, 255, 255));
        efectivo_pagado_por_impuestos.setText("$$$$$");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total de las salidas:");

        total_de_las_salidas.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        total_de_las_salidas.setForeground(new java.awt.Color(255, 255, 255));
        total_de_las_salidas.setText("$$$$$");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Efectivo de las actividades de operación:");

        efectivo_de_las_actividades_de_operacion.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        efectivo_de_las_actividades_de_operacion.setForeground(new java.awt.Color(255, 255, 255));
        efectivo_de_las_actividades_de_operacion.setText("$$$$$$");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Actividades de inversión:");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Maquinaria y equipo de transporte");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Equipo de computo");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Mobiliario");

        maquinaria_y_transporte.setForeground(new java.awt.Color(255, 255, 255));
        maquinaria_y_transporte.setText("$$$$$");

        equipo_de_computo.setForeground(new java.awt.Color(255, 255, 255));
        equipo_de_computo.setText("$$$$");

        mobiliario.setForeground(new java.awt.Color(255, 255, 255));
        mobiliario.setText("$$$$");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Efectivo utilizado para la adquisicion de maquinaria y equipo");

        efectivo_utilizado_maquinaria_y_equipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        efectivo_utilizado_maquinaria_y_equipo.setForeground(new java.awt.Color(255, 255, 255));
        efectivo_utilizado_maquinaria_y_equipo.setText("$$$$");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Actividades de financiamiento:");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Emisión de nueva deuda");

        emision_de_nueva_deuda.setForeground(new java.awt.Color(255, 255, 255));
        emision_de_nueva_deuda.setText("$$$$");

        dividendos.setForeground(new java.awt.Color(255, 255, 255));
        dividendos.setText("$$$$");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Dividendos");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Efectivo proviniente del financiamiento");

        efectivo_proviniente_del_financiamiento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        efectivo_proviniente_del_financiamiento.setForeground(new java.awt.Color(255, 255, 255));
        efectivo_proviniente_del_financiamiento.setText("$$$$");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Flujo de efectivo neto");

        flujo_de_efectivo_neto.setForeground(new java.awt.Color(255, 255, 255));
        flujo_de_efectivo_neto.setText("$$$$");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Efectivo al  inicio del  periodo");

        efectivo_al_inicio_del_periodo.setForeground(new java.awt.Color(255, 255, 255));
        efectivo_al_inicio_del_periodo.setText("$$$$");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Efectivo al final del periodo");

        efectivo_al_final_del_periodo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        efectivo_al_final_del_periodo.setForeground(new java.awt.Color(255, 255, 255));
        efectivo_al_final_del_periodo.setText("$$$");

        return_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atras.png"))); // NOI18N
        return_menu.setText("Regresar");
        return_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel6))
                    .addComponent(jLabel8)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel17)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                .addComponent(generate_report)
                                .addGap(65, 65, 65)))
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BodyLayout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(flujo_de_efectivo_neto)
                                    .addComponent(efectivo_proviniente_del_financiamiento)
                                    .addComponent(efectivo_al_inicio_del_periodo)
                                    .addComponent(efectivo_al_final_del_periodo)))
                            .addGroup(BodyLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(return_menu))))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(242, 242, 242))
                                .addGroup(BodyLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(311, 311, 311)))
                            .addGroup(BodyLayout.createSequentialGroup()
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addGap(97, 97, 97)))
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dividendos)
                            .addComponent(emision_de_nueva_deuda)
                            .addComponent(efectivo_utilizado_maquinaria_y_equipo)
                            .addComponent(mobiliario)
                            .addComponent(equipo_de_computo)
                            .addComponent(maquinaria_y_transporte)
                            .addComponent(total_de_las_entradas)
                            .addComponent(otros_ingresos)
                            .addComponent(efectivo_pagados_por_los_inventarios)
                            .addComponent(efectivo_pagado_por_los_gastos_operativos)
                            .addComponent(efectivo_pagado_por_impuestos)
                            .addComponent(total_de_las_salidas)
                            .addComponent(efectivo_de_las_actividades_de_operacion)
                            .addComponent(efectivo_recibido_por_los_clientes))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(efectivo_recibido_por_los_clientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(otros_ingresos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(total_de_las_entradas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(efectivo_pagados_por_los_inventarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(efectivo_pagado_por_los_gastos_operativos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(efectivo_pagado_por_impuestos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(total_de_las_salidas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(efectivo_de_las_actividades_de_operacion))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(maquinaria_y_transporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(equipo_de_computo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(mobiliario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(efectivo_utilizado_maquinaria_y_equipo))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(emision_de_nueva_deuda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(dividendos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(efectivo_proviniente_del_financiamiento))
                .addGap(18, 18, 18)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(flujo_de_efectivo_neto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(efectivo_al_inicio_del_periodo))
                .addGap(18, 18, 18)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(efectivo_al_final_del_periodo))
                .addGap(18, 18, 18)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generate_report)
                    .addComponent(return_menu))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generate_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_reportActionPerformed
        
        float [] estado_result = new float[6];
        float [] balance_datos = new float[11];
        
        String edo_result_name = "Estado_de_resultados";
        String balance_name = "Diferencia_flujo_efectivo";
        
        CargarDatos(balance_datos, balance_name);
        CargarDatos(estado_result, edo_result_name);
        
        CalculoFlujoEfectivo(estado_result, balance_datos);
    }//GEN-LAST:event_generate_reportActionPerformed

    private void CalculoFlujoEfectivo(float [] edo_result, float [] balance){
       //Actividades de operación
            //entradas
        efectivo_recibido_por_los_clientes.setText(String.valueOf(edo_result[0]));
        otros_ingresos.setText(String.valueOf(edo_result[3]));
        total_de_las_entradas.setText(String.valueOf(edo_result[3] + edo_result[0] ));
        
            //salidas
        efectivo_pagados_por_los_inventarios.setText(String.valueOf((edo_result[1]  + balance[1] - balance[3] - balance [4]) * (-1) )); 
        efectivo_pagado_por_los_gastos_operativos.setText(String.valueOf(edo_result[2]  * (-1)));
        efectivo_pagado_por_impuestos.setText(String.valueOf(edo_result[4] * (-1)));
        float calculo_total = Float.parseFloat(efectivo_pagado_por_impuestos.getText()) 
                            + Float.parseFloat(efectivo_pagado_por_los_gastos_operativos.getText())
                            + Float.parseFloat(efectivo_pagados_por_los_inventarios.getText());
        total_de_las_salidas.setText(String.valueOf(calculo_total));
        efectivo_de_las_actividades_de_operacion.setText(String.valueOf(Float.parseFloat(total_de_las_entradas.getText()) + calculo_total));
        
        //Actividades de inversion
        maquinaria_y_transporte.setText(String.valueOf((balance[8]*(-1))));
        equipo_de_computo.setText(String.valueOf(balance[10]*(-1)));
        mobiliario.setText(String.valueOf(balance[2]*(-1)));
        float calculo_maquinaria_y_equipo = Float.parseFloat(maquinaria_y_transporte.getText()) 
                            + Float.parseFloat(equipo_de_computo.getText())
                            + Float.parseFloat(mobiliario.getText());
        efectivo_utilizado_maquinaria_y_equipo.setText(String.valueOf(calculo_maquinaria_y_equipo));
        
        //Actividades de Financiamiento
        emision_de_nueva_deuda.setText(String.valueOf(balance[5]));
        dividendos.setText(String.valueOf((edo_result[5] + balance[7]) * (-1)));
        efectivo_proviniente_del_financiamiento.setText(String.valueOf(((edo_result[5] + balance[7])*(-1)) + balance[5]));
        
        //Calculos finales
        float calculo_final =  Float.parseFloat(efectivo_de_las_actividades_de_operacion.getText()) 
                            + Float.parseFloat(efectivo_utilizado_maquinaria_y_equipo.getText())
                            + Float.parseFloat(efectivo_proviniente_del_financiamiento.getText());
        flujo_de_efectivo_neto.setText(String.valueOf(calculo_final));
        efectivo_al_inicio_del_periodo.setText(String.valueOf(50000.0));
        efectivo_al_final_del_periodo.setText(String.valueOf(calculo_final+Float.parseFloat(efectivo_al_inicio_del_periodo.getText())));
    }
    
    private void return_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_menuActionPerformed
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_return_menuActionPerformed

    public void setImageLabel (JLabel labelName, String root) {
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
            java.util.logging.Logger.getLogger(Fluo_de_efectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fluo_de_efectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fluo_de_efectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fluo_de_efectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fluo_de_efectivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Method;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title_description;
    private javax.swing.JLabel Year;
    private javax.swing.JLabel dividendos;
    private javax.swing.JLabel efectivo_al_final_del_periodo;
    private javax.swing.JLabel efectivo_al_inicio_del_periodo;
    private javax.swing.JLabel efectivo_de_las_actividades_de_operacion;
    private javax.swing.JLabel efectivo_pagado_por_impuestos;
    private javax.swing.JLabel efectivo_pagado_por_los_gastos_operativos;
    private javax.swing.JLabel efectivo_pagados_por_los_inventarios;
    private javax.swing.JLabel efectivo_proviniente_del_financiamiento;
    private javax.swing.JLabel efectivo_recibido_por_los_clientes;
    private javax.swing.JLabel efectivo_utilizado_maquinaria_y_equipo;
    private javax.swing.JLabel emision_de_nueva_deuda;
    private javax.swing.JLabel equipo_de_computo;
    private javax.swing.JLabel flujo_de_efectivo_neto;
    private javax.swing.JButton generate_report;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel maquinaria_y_transporte;
    private javax.swing.JLabel mobiliario;
    private javax.swing.JLabel otros_ingresos;
    private javax.swing.JButton return_menu;
    private javax.swing.JLabel total_de_las_entradas;
    private javax.swing.JLabel total_de_las_salidas;
    // End of variables declaration//GEN-END:variables
}
