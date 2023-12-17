package Sistema;

import data.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

//@author aroda
public class Aumentos_Y_Disminuciones extends javax.swing.JFrame {
    //Creates new form Aumentos_Y_Disminuciones
    private Cuentas cuentas;
    private Cuentas cuentasFijo;
    private PorcentajesCuentas porcentajeCuentas;
    
    public Aumentos_Y_Disminuciones() {
        initComponents();
        cuentas = EstaticCuentas.getCuentasDyn();
        cuentasFijo = EstaticCuentas.getCuentasFijo();
        porcentajeCuentas = new PorcentajesCuentas();
        this.setIconImage(Login.img.getImage());
        this.setLocationRelativeTo(null);
        setImageLabel(logo, "src/img/Finanzasimg.png");
    }
    
    public void GuardarDatos(float [] arry){
        //Basicamente este y el de Edo.Resultados es el mismo, pero bueno jsjsjs
        FileWriter papel;
        //PrintWriter pluma; por si se ocupa luego xd
        try {
                //Abrimos un archivo en modo escritura
                papel = new FileWriter("Diferencia_flujo_efectivo.txt");
                //Permite escribir sobre un archivo
                // (creo que no se ocupa) pluma = new PrintWriter(papel);
                //Creamos un buffer para optimizar el codigo y no abrir tanto el disco
                BufferedWriter buferTemporal = new BufferedWriter(papel);
                //Mandar cada objeto del arreglo a una linea del archivo
                //dividir con un caracter de control
                for(int i=0; i<arry.length; i++){
                    buferTemporal.write(arry[i] + ",\n");
                }
                buferTemporal.close();
                papel.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }
    
    private void calcPortcentajes() {
        //Activos
        //activo circulante
        porcentajeCuentas.setCaja(formulaPorcentaje(cuentasFijo.getCaja(), cuentas.getCaja()));
        lblCaja3.setText(porcentajeCuentas.getCaja()+"");
        porcentajeCuentas.setBanco(formulaPorcentaje(cuentasFijo.getBanco(), cuentas.getBanco()));
        lblBancos3.setText(porcentajeCuentas.getBanco()+"");
        porcentajeCuentas.setClientes(formulaPorcentaje(cuentasFijo.getClientes(), cuentas.getClientes()));
        lblClientes3.setText(porcentajeCuentas.getClientes()+"");
        porcentajeCuentas.setInventario(formulaPorcentaje(cuentasFijo.getInventario(), cuentas.getInventario()));
        lblInventario3.setText(porcentajeCuentas.getInventario()+"");
        porcentajeCuentas.setTotActCirc(formulaPorcentaje(cuentasFijo.getClientes(), cuentas.getClientes()));
        lblTotalActivoCir3.setText(porcentajeCuentas.getTotActCirc()+"");
        //activo no circulante
        porcentajeCuentas.setMobiliario(formulaPorcentaje(cuentasFijo.getMobiliario(), cuentas.getMobiliario()));
        lblMobiliario3.setText(porcentajeCuentas.getMobiliario()+"");
        porcentajeCuentas.setMaquinaria(formulaPorcentaje(cuentasFijo.getMaquinaria(), cuentas.getMaquinaria()));
        lblMaquinaria3.setText(porcentajeCuentas.getMaquinaria()+"");
        porcentajeCuentas.setTransporte(formulaPorcentaje(cuentasFijo.getTransporte(), cuentas.getTransporte()));
        lblTransporte3.setText(porcentajeCuentas.getTransporte()+"");
        porcentajeCuentas.setTerreno(formulaPorcentaje(cuentasFijo.getTerreno(), cuentas.getTerreno()));
        lblTerreno3.setText(porcentajeCuentas.getTerreno()+"");
        porcentajeCuentas.setEquipoComp(formulaPorcentaje(cuentasFijo.getEquipoComp(), cuentas.getEquipoComp()));
        lblComputo3.setText(porcentajeCuentas.getEquipoComp()+"");
        porcentajeCuentas.setTotActNoCirc(formulaPorcentaje(cuentasFijo.getTotActNoCirc(), cuentas.getTotActNoCirc()));
        lblTotalActivoNoCir3.setText(porcentajeCuentas.getTotActNoCirc()+"");
        porcentajeCuentas.setTotAct(formulaPorcentaje(cuentasFijo.getTotAct(), cuentas.getTotAct()));
        lblTotalActivo3.setText(porcentajeCuentas.getTotAct()+"");
        //pasivos
        //pasivos circulantes
        porcentajeCuentas.setProveedores(formulaPorcentaje(cuentasFijo.getProveedores(), cuentas.getProveedores()));
        lblProveedores3.setText(porcentajeCuentas.getProveedores()+"");
        porcentajeCuentas.setCtasPPagar(formulaPorcentaje(cuentasFijo.getCtasPPagar(), cuentas.getCtasPPagar()));
        lblCuentas3.setText(porcentajeCuentas.getCtasPPagar()+"");
        porcentajeCuentas.setTotPasCirc(formulaPorcentaje(cuentasFijo.getTotPasCirc(), cuentas.getTotPasCirc()));
        lblTotalPasivoCir3.setText(porcentajeCuentas.getTotPasCirc()+"");
        //pasivos no circulantes
        porcentajeCuentas.setArrendamiento(formulaPorcentaje(cuentasFijo.getArrendamiento(), cuentas.getArrendamiento()));
        lblArrendamiento3.setText(porcentajeCuentas.getArrendamiento()+"");
        porcentajeCuentas.setTotPasNoCirc(formulaPorcentaje(cuentasFijo.getTotPasNoCirc(), cuentas.getTotPasNoCirc()));
        lblTotalPasivoNoCir3.setText(porcentajeCuentas.getTotPasNoCirc()+"");
        porcentajeCuentas.setTotPas(formulaPorcentaje(cuentasFijo.getTotPas(), cuentas.getTotPas()));
        lblTotalPasivo3.setText(porcentajeCuentas.getTotPas()+"");
        //capital contable
        porcentajeCuentas.setCapSocial(formulaPorcentaje(cuentasFijo.getCapSocial(), cuentas.getCapSocial()));
        lblCapital3.setText(porcentajeCuentas.getCapSocial()+"");
        porcentajeCuentas.setUtilNet(formulaPorcentaje(cuentasFijo.getUtilNet(), cuentas.getUtilNet()));
        lblUtilidad3.setText(porcentajeCuentas.getUtilNet()+"");
        porcentajeCuentas.setTotPat(formulaPorcentaje(cuentasFijo.getTotPat(), cuentas.getTotPat()));
        lblTotalCapital3.setText(porcentajeCuentas.getTotPat()+"");
        porcentajeCuentas.setTotPasMPat(formulaPorcentaje(cuentasFijo.getTotPasMPat(), cuentas.getTotPasMPat()));
        lblCapYPas3.setText(porcentajeCuentas.getTotPasMPat()+"");
        //transferir info
        EstaticCuentas.setPorcentajeCuentas(porcentajeCuentas);
    }
    
    private void calcDif(JLabel labelName1, JLabel labelName2, JLabel labelName4, JLabel labelName5) {
        float cajaAumento;
        if ((Float.parseFloat(labelName2.getText())) > (Float.parseFloat(labelName1.getText()))) {
            cajaAumento = Float.parseFloat(labelName2.getText()) - Float.parseFloat(labelName1.getText());
            labelName4.setText(cajaAumento + "");
            labelName5.setText("0.00");
        } else {
            cajaAumento = Float.parseFloat(labelName1.getText()) - Float.parseFloat(labelName2.getText());
            labelName4.setText("0.00");
            labelName5.setText(cajaAumento + "");
        }
    }
    
    private void calcOrgOAplc(JLabel labelName4, JLabel labelName5, JLabel labelName6, JLabel labelName7) {
        float cajaAumento;
        if (Float.parseFloat(labelName5.getText()) > Float.parseFloat(labelName4.getText())){
            cajaAumento = Float.parseFloat(labelName5.getText());
            labelName6.setText(cajaAumento + "");
            labelName7.setText("0.00");
        } else {
            cajaAumento = Float.parseFloat(labelName4.getText());
            labelName6.setText("0.00");
            labelName7.setText(cajaAumento + "");
        }
    }
    
    private float formulaPorcentaje(float datoAnt, float datoAct) {
        float porcentaje = ((datoAct-datoAnt)/datoAnt)*100;
        return porcentaje;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Funciones Sumas de Totales">
        private void sumActCir(JLabel lblCaja, JLabel lblBanco, JLabel lblClientes, JLabel lblInv, JLabel lblTotal) {
            float total;
            total = Float.parseFloat(lblCaja.getText()) + Float.parseFloat(lblBanco.getText()) + 
                    Float.parseFloat(lblClientes.getText()) + Float.parseFloat(lblInv.getText());
            lblTotal.setText(total+"");
        }
        private void sumActNCir(JLabel lblMobiliario, JLabel lblMaquinaria, JLabel lblTransporte, JLabel lblTerreno, JLabel lblEquipoComp, JLabel lblTotal) {
            float total;
            total = Float.parseFloat(lblMobiliario.getText()) + Float.parseFloat(lblMaquinaria.getText()) + Float.parseFloat(lblTransporte.getText()) + 
                    Float.parseFloat(lblTerreno.getText()) + Float.parseFloat(lblEquipoComp.getText());
            lblTotal.setText(total+"");
        }
        private void sumActvs(JLabel lblTotActC, JLabel lblTotActNC, JLabel lblTotal) {
            float total;
            total = Float.parseFloat(lblTotActC.getText()) + Float.parseFloat(lblTotActNC.getText());
            lblTotal.setText(total+"");
        }
        private void sumPasCir(JLabel lblProv, JLabel lblCtasXPag, JLabel lblTotal) {
            float total;
            total = Float.parseFloat(lblProv.getText()) + Float.parseFloat(lblCtasXPag.getText());
            lblTotal.setText(total+"");
        }
        private void sumPasNCir(JLabel lblArren, JLabel lblTotal) {
            float total;
            total = Float.parseFloat(lblArren.getText());
            lblTotal.setText(total+"");
        }
        private void sumPasvs(JLabel lblTotPasC, JLabel lblTotPasNC, JLabel lblTotal) {
            float total;
            total = Float.parseFloat(lblTotPasC.getText()) + Float.parseFloat(lblTotPasNC.getText());
            lblTotal.setText(total+"");
        }
        private void sumCap(JLabel lblCapSoc, JLabel lblUtil, JLabel lblTotal) {
            float total;
            total = Float.parseFloat(lblCapSoc.getText()) + Float.parseFloat(lblUtil.getText());
            lblTotal.setText(total+"");
        }
        private void sumPasvsYCap(JLabel lblTotPasvs, JLabel lblTotCap, JLabel lblTotal) {
            float total;
            total = Float.parseFloat(lblTotPasvs.getText()) + Float.parseFloat(lblTotCap.getText());
            lblTotal.setText(total+"");
        }
    //</editor-fold>
    
    public void compararValores(){
        float valores_to_flujo_datos [] = new float [11];
        //<editor-fold defaultstate="collapsed" desc="DIFERENCIA">
        calcDif(lblCaja1, lblCaja2, lblCaja4, lblCaja5);
        calcDif(lblBancos1, lblBancos2, lblBancos4, lblBancos5);
        calcDif(lblClientes1, lblClientes2, lblClientes4, lblClientes5);
        calcDif(lblInventario1, lblInventario2, lblInventario4, lblInventario5);
        calcDif(lblMobiliario1, lblMobiliario2, lblMobiliario4, lblMobiliario5);
        calcDif(lblMaquinaria1, lblMaquinaria2, lblMaquinaria4, lblMaquinaria5);
        calcDif(lblTransporte1, lblTransporte2, lblTransporte4, lblTransporte5);
        calcDif(lblTerreno1, lblTerreno2, lblTerreno4, lblTerreno5);
        calcDif(lblComputo1, lblComputo2, lblComputo4, lblComputo5);
        
        calcDif(lblProveedores1, lblProveedores2, lblProveedores4, lblProveedores5);
        calcDif(lblCuentas1, lblCuentas2, lblCuentas4, lblCuentas5);
        calcDif(lblArrendamiento1, lblArrendamiento2, lblArrendamiento4, lblArrendamiento5);
        
        calcDif(lblCapital1, lblCapital2, lblCapital4, lblCapital5);
        calcDif(lblUtilidad1, lblUtilidad2, lblUtilidad4, lblUtilidad5);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="ORIGEN O APLICACION">
        calcOrgOAplc(lblCaja4, lblCaja5, lblCaja6, lblCaja7);
        calcOrgOAplc(lblBancos4, lblBancos5, lblBancos6, lblBancos7);
        calcOrgOAplc(lblClientes4, lblClientes5, lblClientes6, lblClientes7);
        calcOrgOAplc(lblInventario4, lblInventario5, lblInventario6, lblInventario7);
        calcOrgOAplc(lblMobiliario4, lblMobiliario5, lblMobiliario6, lblMobiliario7);
        calcOrgOAplc(lblMaquinaria4, lblMaquinaria5, lblMaquinaria6, lblMaquinaria7);
        calcOrgOAplc(lblTransporte4, lblTransporte5, lblTransporte6, lblTransporte7);
        calcOrgOAplc(lblTerreno4, lblTerreno5, lblTerreno6, lblTerreno7);
        calcOrgOAplc(lblComputo4, lblComputo5, lblComputo6, lblComputo7);
        
        calcOrgOAplc(lblProveedores4, lblProveedores5, lblProveedores6, lblProveedores7);
        calcOrgOAplc(lblCuentas4, lblCuentas5, lblCuentas6, lblCuentas7);
        calcOrgOAplc(lblArrendamiento4, lblArrendamiento5, lblArrendamiento6, lblArrendamiento7);
        
        calcOrgOAplc(lblCapital4, lblCapital5, lblCapital6, lblCapital7);
        calcOrgOAplc(lblUtilidad4, lblUtilidad5, lblUtilidad6, lblUtilidad7);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="FLUJO DE EFECTIVO">
        if (Float.parseFloat(lblCaja6.getText()) > Float.parseFloat(lblCaja7.getText())){
            float cajaAumento;
            cajaAumento = Float.parseFloat(lblCaja6.getText());
            lblCaja8.setText(Float.toString(cajaAumento));
        } else if(Float.parseFloat(lblCaja7.getText()) > Float.parseFloat(lblCaja6.getText())){
            float cajaAumento;
            cajaAumento = Float.parseFloat(lblCaja7.getText());
            lblCaja8.setText(Float.toString(cajaAumento));
        }
        
        if (Float.parseFloat(lblBancos6.getText()) > Float.parseFloat(lblBancos7.getText()))
        {float cajaAumento;
        cajaAumento = Float.parseFloat(lblBancos6.getText());
        lblBancos8.setText(Float.toString(cajaAumento));
        } else if(Float.parseFloat(lblBancos7.getText()) > Float.parseFloat(lblBancos6.getText())){
            float cajaAumento;
            cajaAumento = Float.parseFloat(lblBancos7.getText());
            lblBancos8.setText(Float.toString(cajaAumento));
        }
        
        if (Float.parseFloat(lblInventario6.getText()) > Float.parseFloat(lblInventario7.getText()))
        {float cajaAumento;
        cajaAumento = Float.parseFloat(lblInventario6.getText());
        lblInventario8.setText(Float.toString(cajaAumento));
        } else if(Float.parseFloat(lblInventario7.getText()) > Float.parseFloat(lblInventario6.getText())){
            float cajaAumento;
            cajaAumento = Float.parseFloat(lblInventario7.getText());
            lblInventario8.setText(Float.toString(cajaAumento));
        }
        
        if (Float.parseFloat(lblClientes6.getText()) > Float.parseFloat(lblClientes7.getText()))
        {float cajaAumento;
        cajaAumento = Float.parseFloat(lblClientes6.getText());
        lblClientes9.setText(Float.toString(cajaAumento));
        } else if(Float.parseFloat(lblClientes7.getText()) > Float.parseFloat(lblClientes6.getText())){
            float cajaAumento;
            cajaAumento = Float.parseFloat(lblClientes7.getText());
            lblClientes10.setText(Float.toString(cajaAumento));
        }
        
        if (Float.parseFloat(lblMobiliario6.getText()) > Float.parseFloat(lblMobiliario7.getText()))
        {float cajaAumento;
        cajaAumento = Float.parseFloat(lblMobiliario6.getText());
        lblMobiliario8.setText(Float.toString(cajaAumento));
        } else if(Float.parseFloat(lblMobiliario7.getText()) > Float.parseFloat(lblMobiliario6.getText())){
            float cajaAumento;
            cajaAumento = Float.parseFloat(lblMobiliario7.getText());
            lblMobiliario9.setText(Float.toString(cajaAumento));
        }
        
        if (Float.parseFloat(lblMaquinaria6.getText()) > Float.parseFloat(lblMaquinaria7.getText()))
        {float cajaAumento;
        cajaAumento = Float.parseFloat(lblMaquinaria6.getText());
        lblMaquinaria8.setText(Float.toString(cajaAumento));
        } else if(Float.parseFloat(lblMaquinaria7.getText()) > Float.parseFloat(lblMaquinaria6.getText())){
            float cajaAumento;
            cajaAumento = Float.parseFloat(lblMaquinaria7.getText());
            lblMaquinaria8.setText(Float.toString(cajaAumento));
        }
        
        if (Float.parseFloat(lblTransporte6.getText()) > Float.parseFloat(lblTransporte7.getText()))
        {float cajaAumento;
        cajaAumento = Float.parseFloat(lblTransporte6.getText());
        lblTransporte8.setText(Float.toString(cajaAumento));
        } else if(Float.parseFloat(lblTransporte7.getText()) > Float.parseFloat(lblTransporte6.getText())){
            float cajaAumento;
            cajaAumento = Float.parseFloat(lblTransporte7.getText());
            lblTransporte9.setText(Float.toString(cajaAumento));
        }
        
        if (Float.parseFloat(lblTerreno6.getText()) > Float.parseFloat(lblTerreno7.getText()))
        {float cajaAumento;
        cajaAumento = Float.parseFloat(lblTerreno6.getText());
        lblTerreno9.setText(Float.toString(cajaAumento));
        } else if(Float.parseFloat(lblTerreno7.getText()) > Float.parseFloat(lblTerreno6.getText())){
            float cajaAumento;
            cajaAumento = Float.parseFloat(lblTerreno7.getText());
            lblTerreno9.setText(Float.toString(cajaAumento));
        }
        
        if (Float.parseFloat(lblComputo6.getText()) > Float.parseFloat(lblComputo7.getText()))
        {float cajaAumento;
        cajaAumento = Float.parseFloat(lblComputo6.getText());
        lblComputo8.setText(Float.toString(cajaAumento));
        } else if(Float.parseFloat(lblComputo7.getText()) > Float.parseFloat(lblComputo6.getText())){
            float cajaAumento;
            cajaAumento = Float.parseFloat(lblComputo7.getText());
            lblComputo8.setText(Float.toString(cajaAumento));
        }
        
        if (Float.parseFloat(lblProveedores6.getText()) > Float.parseFloat(lblProveedores7.getText()))
        {float cajaAumento;
        cajaAumento = Float.parseFloat(lblProveedores6.getText());
        lblProveedores8.setText(Float.toString(cajaAumento));
        } else if(Float.parseFloat(lblProveedores7.getText()) > Float.parseFloat(lblProveedores6.getText())){
            float cajaAumento;
            cajaAumento = Float.parseFloat(lblProveedores7.getText());
            lblProveedores8.setText(Float.toString(cajaAumento));
        }
        
        if (Float.parseFloat(lblCuentas6.getText()) > Float.parseFloat(lblCuentas7.getText()))
        {float cajaAumento;
        cajaAumento = Float.parseFloat(lblCuentas6.getText()) * -1;
        lblCuentas10.setText(Float.toString(cajaAumento));
        } else if(Float.parseFloat(lblCuentas7.getText()) > Float.parseFloat(lblCuentas6.getText())){
            float cajaAumento;
            cajaAumento = Float.parseFloat(lblCuentas7.getText());
            lblCuentas10.setText(Float.toString(cajaAumento));
        }
        
        if (Float.parseFloat(lblArrendamiento6.getText()) > Float.parseFloat(lblArrendamiento7.getText()))
        {float cajaAumento;
        cajaAumento = Float.parseFloat(lblArrendamiento6.getText());
        lblArrendamiento8.setText(Float.toString(cajaAumento));
        } else if(Float.parseFloat(lblArrendamiento7.getText()) > Float.parseFloat(lblArrendamiento6.getText())){
            float cajaAumento;
            cajaAumento = Float.parseFloat(lblArrendamiento7.getText());
            lblArrendamiento8.setText(Float.toString(cajaAumento));
        }
        
        if (Float.parseFloat(lblCapital6.getText()) > Float.parseFloat(lblCapital7.getText()))
        {float cajaAumento;
        cajaAumento = Float.parseFloat(lblCapital6.getText());
        lblCapital8.setText(Float.toString(cajaAumento));
        } else if(Float.parseFloat(lblCapital7.getText()) > Float.parseFloat(lblCapital6.getText())){
            float cajaAumento;
            cajaAumento = Float.parseFloat(lblCapital7.getText());
            lblCapital9.setText(Float.toString(cajaAumento));
        }
        
        if (Float.parseFloat(lblUtilidad6.getText()) > Float.parseFloat(lblUtilidad7.getText()))
        {float cajaAumento;
        cajaAumento = Float.parseFloat(lblUtilidad6.getText());
        lblUtilidad8.setText(Float.toString(cajaAumento));
        } else if(Float.parseFloat(lblUtilidad7.getText()) > Float.parseFloat(lblUtilidad6.getText())){
            float cajaAumento;
            cajaAumento = Float.parseFloat(lblUtilidad7.getText());
            lblUtilidad8.setText(Float.toString(cajaAumento));
        }
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="SUMAS TOTALES">
        //AUMENTO
        sumActCir(lblCaja4, lblBancos4, lblClientes4, lblInventario4, lblTotalActivoCir4);
        sumActNCir(lblMobiliario4, lblMaquinaria4, lblTransporte4, lblTerreno4, lblComputo4, lblTotalActivoNoCir4);
        sumActvs(lblTotalActivoCir4, lblTotalActivoNoCir4, lblTotalActivo4);
        sumPasCir(lblProveedores4, lblCuentas4, lblTotalPasivoCir4);
        sumPasNCir(lblArrendamiento4, lblTotalPasivoNoCir4);
        sumPasvs(lblTotalPasivoCir4, lblTotalPasivoNoCir4, lblTotalPasivo4);
        sumCap(lblCapital4, lblUtilidad4, lblTotalCapital4);
        sumPasvsYCap(lblTotalPasivo4, lblTotalCapital4, lblCapYPas4);
        //DISMINUCION
        sumActCir(lblCaja5, lblBancos5, lblClientes5, lblInventario5, lblTotalActivoCir5);
        sumActNCir(lblMobiliario5, lblMaquinaria5, lblTransporte5, lblTerreno5, lblComputo5, lblTotalActivoNoCir5);
        sumActvs(lblTotalActivoCir5, lblTotalActivoNoCir5, lblTotalActivo5);
        sumPasCir(lblProveedores5, lblCuentas5, lblTotalPasivoCir5);
        sumPasNCir(lblArrendamiento5, lblTotalPasivoNoCir5);
        sumPasvs(lblTotalPasivoCir5, lblTotalPasivoNoCir5, lblTotalPasivo5);
        sumCap(lblCapital5, lblUtilidad4, lblTotalCapital5);
        sumPasvsYCap(lblTotalPasivo5, lblTotalCapital5, lblCapYPas5);
        //ORIGEN
        sumActCir(lblCaja6, lblBancos6, lblClientes6, lblInventario6, lblTotalActivoCir6);
        sumActNCir(lblMobiliario6, lblMaquinaria6, lblTransporte6, lblTerreno6, lblComputo6, lblTotalActivoNoCir6);
        sumActvs(lblTotalActivoCir6, lblTotalActivoNoCir6, lblTotalActivo6);
        sumPasCir(lblProveedores6, lblCuentas6, lblTotalPasivoCir6);
        sumPasNCir(lblArrendamiento6, lblTotalPasivoNoCir6);
        sumPasvs(lblTotalPasivoCir6, lblTotalPasivoNoCir6, lblTotalPasivo6);
        sumCap(lblCapital6, lblUtilidad6, lblTotalCapital6);
        sumPasvsYCap(lblTotalPasivo6, lblTotalCapital6, lblCapYPas6);
        //APLICACION
        sumActCir(lblCaja7, lblBancos7, lblClientes7, lblInventario7, lblTotalActivoCir7);
        sumActNCir(lblMobiliario7, lblMaquinaria7, lblTransporte7, lblTerreno7, lblComputo7, lblTotalActivoNoCir7);
        sumActvs(lblTotalActivoCir7, lblTotalActivoNoCir7, lblTotalActivo7);
        sumPasCir(lblProveedores7, lblCuentas7, lblTotalPasivoCir7);
        sumPasNCir(lblArrendamiento7, lblTotalPasivoNoCir7);
        sumPasvs(lblTotalPasivoCir7, lblTotalPasivoNoCir7, lblTotalPasivo7);
        sumCap(lblCapital7, lblUtilidad7, lblTotalCapital7);
        sumPasvsYCap(lblTotalPasivo7, lblTotalCapital7, lblCapYPas7);
        //</editor-fold>
        //GUARDAMOS LAS DIFERENCIAS QUE NOS INTERESAN PARA HACER EL CALCULO DEL FLUO DE EFECTIVO 
        valores_to_flujo_datos [0] = Float.parseFloat(lblClientes9.getText());
        valores_to_flujo_datos [1] = Float.parseFloat(lblInventario8.getText());
        valores_to_flujo_datos [2] = Float.parseFloat(lblMobiliario8.getText()); 
        valores_to_flujo_datos [3] = Float.parseFloat(lblProveedores8.getText());
        valores_to_flujo_datos [4] = Float.parseFloat(lblCuentas10.getText())*(-1);
        valores_to_flujo_datos [5] = Float.parseFloat(lblArrendamiento8.getText());
        valores_to_flujo_datos [6] = Float.parseFloat(lblCapital8.getText());
        valores_to_flujo_datos [7] = Float.parseFloat(lblUtilidad8.getText());
        //Tuve que agregar más porque no tome en cuenta bien  que pasaba aqui
        valores_to_flujo_datos [8] = Float.parseFloat(lblMaquinaria8.getText());
        valores_to_flujo_datos [9] = Float.parseFloat(lblTransporte8.getText());
        valores_to_flujo_datos [10] = Float.parseFloat(lblComputo8.getText());
        GuardarDatos(valores_to_flujo_datos);
    }
    
    
    
    private void setImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        lblMaquinaria4 = new javax.swing.JLabel();
        lblProveedores5 = new javax.swing.JLabel();
        lblComputo4 = new javax.swing.JLabel();
        jLabel359 = new javax.swing.JLabel();
        lblTerreno6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblTotalActivoCir6 = new javax.swing.JLabel();
        jLabel293 = new javax.swing.JLabel();
        lblClientes9 = new javax.swing.JLabel();
        lblSigno4 = new javax.swing.JLabel();
        lblCaja4 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        lblTotalActivoNoCir8 = new javax.swing.JLabel();
        lblCapital6 = new javax.swing.JLabel();
        lblMobiliario2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lblMobiliario8 = new javax.swing.JLabel();
        jLabel300 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        lblMobiliario3 = new javax.swing.JLabel();
        lblArrendamiento10 = new javax.swing.JLabel();
        jLabel358 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        lblClientes2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        lblporcen = new javax.swing.JLabel();
        lblTotalPasivoNoCir6 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        lblTransporte1 = new javax.swing.JLabel();
        lblComputo8 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        lblTotalActivo9 = new javax.swing.JLabel();
        lblTotalPasivoCir8 = new javax.swing.JLabel();
        jLabel324 = new javax.swing.JLabel();
        lblTotalActivoCir4 = new javax.swing.JLabel();
        lblTransporte6 = new javax.swing.JLabel();
        jLabel313 = new javax.swing.JLabel();
        lblTotalCapital2 = new javax.swing.JLabel();
        jLabel306 = new javax.swing.JLabel();
        lblTotalActivoNoCir10 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        lblSignoI2 = new javax.swing.JLabel();
        lblCaja6 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        lblArrendamiento5 = new javax.swing.JLabel();
        jLabel394 = new javax.swing.JLabel();
        jLabel325 = new javax.swing.JLabel();
        lblTotalPasivoCir7 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel387 = new javax.swing.JLabel();
        lblProveedores4 = new javax.swing.JLabel();
        lblTotalPasivoCir2 = new javax.swing.JLabel();
        lblSignoI4 = new javax.swing.JLabel();
        lblInventario6 = new javax.swing.JLabel();
        lblBancos3 = new javax.swing.JLabel();
        lblTotalCapital8 = new javax.swing.JLabel();
        lblComputo10 = new javax.swing.JLabel();
        lblProveedores2 = new javax.swing.JLabel();
        lblComputo3 = new javax.swing.JLabel();
        lblTerreno3 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel316 = new javax.swing.JLabel();
        lblCapYPas7 = new javax.swing.JLabel();
        jLabel310 = new javax.swing.JLabel();
        lblInventario9 = new javax.swing.JLabel();
        lblBancos1 = new javax.swing.JLabel();
        lblUtilidad3 = new javax.swing.JLabel();
        jLabel346 = new javax.swing.JLabel();
        lblComputo5 = new javax.swing.JLabel();
        lblTotalPasivo2 = new javax.swing.JLabel();
        jLabel317 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        lblTotalActivoNoCir5 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        lblTransporte7 = new javax.swing.JLabel();
        jLabel307 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel337 = new javax.swing.JLabel();
        lblTotalActivoNoCir7 = new javax.swing.JLabel();
        lblClientes6 = new javax.swing.JLabel();
        lblProveedores8 = new javax.swing.JLabel();
        lblTotalPasivoNoCir7 = new javax.swing.JLabel();
        lblBancos4 = new javax.swing.JLabel();
        lblTransporte5 = new javax.swing.JLabel();
        lblTotalActivo1 = new javax.swing.JLabel();
        lblCuentas1 = new javax.swing.JLabel();
        lblBancos6 = new javax.swing.JLabel();
        lblMaquinaria7 = new javax.swing.JLabel();
        jLabel355 = new javax.swing.JLabel();
        jLabel312 = new javax.swing.JLabel();
        lblUtilidad10 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        lblClientes8 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        lblMaquinaria3 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        lblComputo6 = new javax.swing.JLabel();
        jLabel390 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel386 = new javax.swing.JLabel();
        lblCapital5 = new javax.swing.JLabel();
        lblCapital2 = new javax.swing.JLabel();
        jLabel319 = new javax.swing.JLabel();
        lblTotalActivoCir9 = new javax.swing.JLabel();
        lblCaja8 = new javax.swing.JLabel();
        jLabel320 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        lblTotalPasivoCir4 = new javax.swing.JLabel();
        lblTotalActivo8 = new javax.swing.JLabel();
        jLabel259 = new javax.swing.JLabel();
        lblTotalActivoNoCir6 = new javax.swing.JLabel();
        jLabel305 = new javax.swing.JLabel();
        lblTotalPasivoNoCir8 = new javax.swing.JLabel();
        jLabel338 = new javax.swing.JLabel();
        lblProveedores6 = new javax.swing.JLabel();
        jLabel290 = new javax.swing.JLabel();
        jLabel301 = new javax.swing.JLabel();
        lblArrendamiento2 = new javax.swing.JLabel();
        jLabel308 = new javax.swing.JLabel();
        jLabel366 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lblUtilidad4 = new javax.swing.JLabel();
        lblSigno6 = new javax.swing.JLabel();
        jLabel318 = new javax.swing.JLabel();
        lblTotalActivo3 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel343 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        lblClientes3 = new javax.swing.JLabel();
        lblComputo1 = new javax.swing.JLabel();
        lblSigno7 = new javax.swing.JLabel();
        lblTotalPasivo9 = new javax.swing.JLabel();
        lblTotalActivoCir3 = new javax.swing.JLabel();
        lblInventario4 = new javax.swing.JLabel();
        jLabel326 = new javax.swing.JLabel();
        lblMaquinaria2 = new javax.swing.JLabel();
        lblSigno2 = new javax.swing.JLabel();
        lblClientes7 = new javax.swing.JLabel();
        lblComputo7 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblTotalPasivoCir5 = new javax.swing.JLabel();
        lblCaja5 = new javax.swing.JLabel();
        jLabel311 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel335 = new javax.swing.JLabel();
        lblTotalActivoCir10 = new javax.swing.JLabel();
        lblInventario7 = new javax.swing.JLabel();
        lblTotalActivoCir7 = new javax.swing.JLabel();
        lblSigno = new javax.swing.JLabel();
        lblTotalActivoCir8 = new javax.swing.JLabel();
        lblTransporte4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblCaja10 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jLabel356 = new javax.swing.JLabel();
        lblCuentas8 = new javax.swing.JLabel();
        lblBancos9 = new javax.swing.JLabel();
        jLabel365 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        lblCapYPas9 = new javax.swing.JLabel();
        lblInventario8 = new javax.swing.JLabel();
        jLabel323 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        lblSigno3 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel391 = new javax.swing.JLabel();
        lblTotalPasivoNoCir1 = new javax.swing.JLabel();
        lblSignoI1 = new javax.swing.JLabel();
        lblMobiliario6 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel292 = new javax.swing.JLabel();
        lblInventario2 = new javax.swing.JLabel();
        jLabel340 = new javax.swing.JLabel();
        lblSigno5 = new javax.swing.JLabel();
        lblComputo9 = new javax.swing.JLabel();
        lblMobiliario4 = new javax.swing.JLabel();
        jLabel372 = new javax.swing.JLabel();
        lblProveedores9 = new javax.swing.JLabel();
        jLabel267 = new javax.swing.JLabel();
        jLabel295 = new javax.swing.JLabel();
        lblTransporte9 = new javax.swing.JLabel();
        lblTotalCapital7 = new javax.swing.JLabel();
        lblSignoI3 = new javax.swing.JLabel();
        lblSignoI7 = new javax.swing.JLabel();
        jLabel276 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblCaja1 = new javax.swing.JLabel();
        jLabel377 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel354 = new javax.swing.JLabel();
        lblMaquinaria5 = new javax.swing.JLabel();
        lblTerreno10 = new javax.swing.JLabel();
        lblTotalActivoNoCir4 = new javax.swing.JLabel();
        lblCapital1 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel277 = new javax.swing.JLabel();
        lblTotalCapital5 = new javax.swing.JLabel();
        jLabel374 = new javax.swing.JLabel();
        jLabel336 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jLabel303 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel329 = new javax.swing.JLabel();
        lblCapital7 = new javax.swing.JLabel();
        lblCapYPas4 = new javax.swing.JLabel();
        jLabel327 = new javax.swing.JLabel();
        jLabel361 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        lblTerreno8 = new javax.swing.JLabel();
        jLabel351 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel385 = new javax.swing.JLabel();
        lblCapital10 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel322 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        lblArrendamiento8 = new javax.swing.JLabel();
        lblCuentas6 = new javax.swing.JLabel();
        jLabel257 = new javax.swing.JLabel();
        lblInventario5 = new javax.swing.JLabel();
        jLabel353 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        lblTotalActivoCir1 = new javax.swing.JLabel();
        jLabel382 = new javax.swing.JLabel();
        jLabel348 = new javax.swing.JLabel();
        lblUtilidad2 = new javax.swing.JLabel();
        lblSigno1 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        lblArrendamiento4 = new javax.swing.JLabel();
        jLabel341 = new javax.swing.JLabel();
        lblTotalActivo10 = new javax.swing.JLabel();
        lblProveedores1 = new javax.swing.JLabel();
        lblTotalPasivoCir6 = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        lblUtilidad8 = new javax.swing.JLabel();
        lblTotalPasivo3 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jLabel342 = new javax.swing.JLabel();
        jLabel373 = new javax.swing.JLabel();
        lblUtilidad5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblTotalActivo5 = new javax.swing.JLabel();
        lblTotalActivo2 = new javax.swing.JLabel();
        lblTotalActivoNoCir9 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        jLabel321 = new javax.swing.JLabel();
        lblCuentas3 = new javax.swing.JLabel();
        lblTotalPasivo1 = new javax.swing.JLabel();
        lblMobiliario9 = new javax.swing.JLabel();
        lblInventario3 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblTerreno5 = new javax.swing.JLabel();
        lblSigno8 = new javax.swing.JLabel();
        jLabel395 = new javax.swing.JLabel();
        jLabel283 = new javax.swing.JLabel();
        lblMaquinaria10 = new javax.swing.JLabel();
        jLabel347 = new javax.swing.JLabel();
        jLabel286 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblUtilidad6 = new javax.swing.JLabel();
        lblTotalPasivoNoCir10 = new javax.swing.JLabel();
        lblPorcentaje = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        lblTotalActivoNoCir2 = new javax.swing.JLabel();
        jLabel273 = new javax.swing.JLabel();
        lblTerreno9 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        lblUtilidad9 = new javax.swing.JLabel();
        lblMaquinaria9 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        lblTotalActivoCir5 = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        lblTotalPasivo4 = new javax.swing.JLabel();
        lblCapYPas6 = new javax.swing.JLabel();
        lblMobiliario7 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        lblCapital3 = new javax.swing.JLabel();
        lblCapYPas3 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel375 = new javax.swing.JLabel();
        jLabel334 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblTotalActivo7 = new javax.swing.JLabel();
        jLabel288 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        lblBancos5 = new javax.swing.JLabel();
        jLabel297 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblArrendamiento1 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel380 = new javax.swing.JLabel();
        jLabel349 = new javax.swing.JLabel();
        lblInventario10 = new javax.swing.JLabel();
        lblTotalPasivoCir9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblBancos7 = new javax.swing.JLabel();
        lblTotalActivoNoCir1 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        lblCuentas5 = new javax.swing.JLabel();
        lblCapYPas5 = new javax.swing.JLabel();
        jLabel381 = new javax.swing.JLabel();
        jLabel371 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        lblCaja9 = new javax.swing.JLabel();
        lblTotalActivoNoCir3 = new javax.swing.JLabel();
        jLabel376 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        lblTotalPasivo10 = new javax.swing.JLabel();
        lblTotalCapital6 = new javax.swing.JLabel();
        jLabel294 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        lblTotalPasivo7 = new javax.swing.JLabel();
        jLabel364 = new javax.swing.JLabel();
        lblTotalCapital1 = new javax.swing.JLabel();
        jLabel369 = new javax.swing.JLabel();
        lblTotalPasivoNoCir9 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel389 = new javax.swing.JLabel();
        lblComputo2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTotalCapital10 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        lblTerreno1 = new javax.swing.JLabel();
        lblMaquinaria1 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel367 = new javax.swing.JLabel();
        lblMobiliario1 = new javax.swing.JLabel();
        jLabel331 = new javax.swing.JLabel();
        lblTransporte2 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        lblTotalPasivoNoCir2 = new javax.swing.JLabel();
        lblProveedores7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblCapYPas10 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        lblBancos2 = new javax.swing.JLabel();
        lblCapYPas1 = new javax.swing.JLabel();
        jLabel393 = new javax.swing.JLabel();
        lblMaquinaria6 = new javax.swing.JLabel();
        lblCapital9 = new javax.swing.JLabel();
        jLabel344 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        lblTotalCapital3 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        lblTotalActivo6 = new javax.swing.JLabel();
        jLabel350 = new javax.swing.JLabel();
        lblTerreno4 = new javax.swing.JLabel();
        lblTotalCapital9 = new javax.swing.JLabel();
        lblCuentas7 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        lblInventario1 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        jLabel304 = new javax.swing.JLabel();
        lblTerreno7 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        lblBancos8 = new javax.swing.JLabel();
        lblClientes5 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblMobiliario10 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        btnCalcularTabala = new javax.swing.JButton();
        jLabel275 = new javax.swing.JLabel();
        jLabel357 = new javax.swing.JLabel();
        jLabel328 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel384 = new javax.swing.JLabel();
        lblTotalPasivoCir1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel330 = new javax.swing.JLabel();
        lblUtilidad7 = new javax.swing.JLabel();
        lblClientes10 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        lblTotalCapital4 = new javax.swing.JLabel();
        lblProveedores3 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCaja3 = new javax.swing.JLabel();
        lblTotalActivo4 = new javax.swing.JLabel();
        jLabel315 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblArrendamiento3 = new javax.swing.JLabel();
        lblSignoI6 = new javax.swing.JLabel();
        lblTotalActivoCir2 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        lblClientes1 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        lblUtilidad1 = new javax.swing.JLabel();
        lblCapYPas2 = new javax.swing.JLabel();
        lblArrendamiento7 = new javax.swing.JLabel();
        lblSignoI8 = new javax.swing.JLabel();
        lblTotalPasivo6 = new javax.swing.JLabel();
        lblCuentas2 = new javax.swing.JLabel();
        lblCapital4 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel333 = new javax.swing.JLabel();
        jLabel285 = new javax.swing.JLabel();
        lblCuentas4 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        lblTotalPasivo5 = new javax.swing.JLabel();
        lblCaja2 = new javax.swing.JLabel();
        jLabel363 = new javax.swing.JLabel();
        lblCaja7 = new javax.swing.JLabel();
        lblMobiliario5 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        btnGraficas = new javax.swing.JButton();
        lblSignoI5 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        lblTotalPasivoNoCir3 = new javax.swing.JLabel();
        jLabel299 = new javax.swing.JLabel();
        jLabel379 = new javax.swing.JLabel();
        jLabel370 = new javax.swing.JLabel();
        lblTotalPasivoNoCir5 = new javax.swing.JLabel();
        lblBancos10 = new javax.swing.JLabel();
        lblSignoI = new javax.swing.JLabel();
        lblCuentas10 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel368 = new javax.swing.JLabel();
        lblTotalPasivoCir10 = new javax.swing.JLabel();
        jLabel339 = new javax.swing.JLabel();
        lblCuentas9 = new javax.swing.JLabel();
        lblArrendamiento6 = new javax.swing.JLabel();
        lblTotalPasivoCir3 = new javax.swing.JLabel();
        jLabel362 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblCapYPas8 = new javax.swing.JLabel();
        lblClientes4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel392 = new javax.swing.JLabel();
        lblTotalPasivoNoCir4 = new javax.swing.JLabel();
        lblTransporte8 = new javax.swing.JLabel();
        lblTransporte10 = new javax.swing.JLabel();
        jLabel241 = new javax.swing.JLabel();
        lblTerreno2 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        lblProveedores10 = new javax.swing.JLabel();
        jLabel332 = new javax.swing.JLabel();
        lblTotalPasivo8 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        lblTransporte3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel360 = new javax.swing.JLabel();
        jLabel287 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel314 = new javax.swing.JLabel();
        jLabel383 = new javax.swing.JLabel();
        jLabel352 = new javax.swing.JLabel();
        jLabel309 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        lblArrendamiento9 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel388 = new javax.swing.JLabel();
        lblCapital8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel378 = new javax.swing.JLabel();
        lblMaquinaria8 = new javax.swing.JLabel();
        jLabel345 = new javax.swing.JLabel();
        tituloTxt = new javax.swing.JLabel();
        empresaTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        BG.setBackground(new java.awt.Color(51, 51, 51));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMaquinaria4.setForeground(new java.awt.Color(255, 255, 255));
        lblMaquinaria4.setText("0.00");
        BG.add(lblMaquinaria4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, -1));

        lblProveedores5.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores5.setText("0.00");
        BG.add(lblProveedores5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, -1, -1));

        lblComputo4.setForeground(new java.awt.Color(255, 255, 255));
        lblComputo4.setText("0.00");
        BG.add(lblComputo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        jLabel359.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel359.setForeground(new java.awt.Color(255, 255, 255));
        jLabel359.setText("$");
        BG.add(jLabel359, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 310, -1, -1));

        lblTerreno6.setForeground(new java.awt.Color(255, 255, 255));
        lblTerreno6.setText("0.00");
        BG.add(lblTerreno6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Terreno");
        BG.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, -1));

        lblTotalActivoCir6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoCir6.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoCir6.setText("-------------");
        BG.add(lblTotalActivoCir6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, -1, -1));

        jLabel293.setForeground(new java.awt.Color(255, 255, 255));
        jLabel293.setText("$");
        BG.add(jLabel293, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, -1));

        lblClientes9.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes9.setText("0.00");
        BG.add(lblClientes9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 130, -1, -1));

        lblSigno4.setForeground(new java.awt.Color(255, 255, 255));
        lblSigno4.setText("$");
        BG.add(lblSigno4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, -1, -1));

        lblCaja4.setForeground(new java.awt.Color(255, 255, 255));
        lblCaja4.setText("0.00");
        BG.add(lblCaja4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("$");
        BG.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 10, -1));

        lblTotalActivoNoCir8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoNoCir8.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoNoCir8.setText("-------------");
        BG.add(lblTotalActivoNoCir8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 310, -1, -1));

        lblCapital6.setForeground(new java.awt.Color(255, 255, 255));
        lblCapital6.setText("0.00");
        BG.add(lblCapital6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, -1, -1));

        lblMobiliario2.setForeground(new java.awt.Color(255, 255, 255));
        lblMobiliario2.setText("0.00");
        BG.add(lblMobiliario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mobiliario");
        BG.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 140, -1));

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("%");
        BG.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        lblMobiliario8.setForeground(new java.awt.Color(255, 255, 255));
        lblMobiliario8.setText("0.00");
        BG.add(lblMobiliario8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 210, -1, -1));

        jLabel300.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel300.setForeground(new java.awt.Color(255, 255, 255));
        jLabel300.setText("$");
        BG.add(jLabel300, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, -1, -1));

        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("$");
        BG.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        lblMobiliario3.setForeground(new java.awt.Color(255, 255, 255));
        lblMobiliario3.setText("0.00");
        BG.add(lblMobiliario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 40, -1));

        lblArrendamiento10.setForeground(new java.awt.Color(255, 255, 255));
        lblArrendamiento10.setText("0.00");
        BG.add(lblArrendamiento10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 460, -1, -1));

        jLabel358.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel358.setForeground(new java.awt.Color(255, 255, 255));
        jLabel358.setText("$");
        BG.add(jLabel358, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 170, -1, -1));

        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("$");
        BG.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        lblClientes2.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes2.setText("0.00");
        BG.add(lblClientes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Total");
        BG.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 102, -1));

        jLabel271.setForeground(new java.awt.Color(255, 255, 255));
        jLabel271.setText("$");
        BG.add(jLabel271, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, -1));

        lblporcen.setForeground(new java.awt.Color(255, 255, 255));
        lblporcen.setText("%");
        BG.add(lblporcen, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        lblTotalPasivoNoCir6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoNoCir6.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoNoCir6.setText("-------------");
        BG.add(lblTotalPasivoNoCir6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, -1, -1));

        jLabel274.setForeground(new java.awt.Color(255, 255, 255));
        jLabel274.setText("$");
        BG.add(jLabel274, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, -1, -1));

        lblTransporte1.setForeground(new java.awt.Color(255, 255, 255));
        lblTransporte1.setText("1100000.00");
        BG.add(lblTransporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 80, -1));

        lblComputo8.setForeground(new java.awt.Color(255, 255, 255));
        lblComputo8.setText("0.00");
        BG.add(lblComputo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 290, -1, -1));

        jLabel239.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel239.setForeground(new java.awt.Color(255, 255, 255));
        jLabel239.setText("Financiamiento");
        BG.add(jLabel239, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 70, -1, -1));

        lblTotalActivo9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivo9.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivo9.setText("-------------");
        BG.add(lblTotalActivo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 330, -1, -1));

        lblTotalPasivoCir8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoCir8.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoCir8.setText("-------------");
        BG.add(lblTotalPasivoCir8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 420, -1, -1));

        jLabel324.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel324.setForeground(new java.awt.Color(255, 255, 255));
        jLabel324.setText("$");
        BG.add(jLabel324, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 590, -1, -1));

        lblTotalActivoCir4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoCir4.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoCir4.setText("-------------");
        BG.add(lblTotalActivoCir4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        lblTransporte6.setForeground(new java.awt.Color(255, 255, 255));
        lblTransporte6.setText("0.00");
        BG.add(lblTransporte6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, -1, -1));

        jLabel313.setForeground(new java.awt.Color(255, 255, 255));
        jLabel313.setText("$");
        BG.add(jLabel313, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, -1, -1));

        lblTotalCapital2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalCapital2.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCapital2.setText("-------------");
        BG.add(lblTotalCapital2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, -1, -1));

        jLabel306.setForeground(new java.awt.Color(255, 255, 255));
        jLabel306.setText("$");
        BG.add(jLabel306, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, -1, -1));

        lblTotalActivoNoCir10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoNoCir10.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoNoCir10.setText("-------------");
        BG.add(lblTotalActivoNoCir10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 310, -1, -1));

        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setText("%");
        BG.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        lblSignoI2.setForeground(new java.awt.Color(255, 255, 255));
        lblSignoI2.setText("$");
        BG.add(lblSignoI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        lblCaja6.setForeground(new java.awt.Color(255, 255, 255));
        lblCaja6.setText("0.00");
        BG.add(lblCaja6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, -1, -1));

        jLabel289.setForeground(new java.awt.Color(255, 255, 255));
        jLabel289.setText("$");
        BG.add(jLabel289, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, -1));

        jLabel270.setForeground(new java.awt.Color(255, 255, 255));
        jLabel270.setText("$");
        BG.add(jLabel270, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        lblArrendamiento5.setForeground(new java.awt.Color(255, 255, 255));
        lblArrendamiento5.setText("0.00");
        BG.add(lblArrendamiento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, -1, -1));

        jLabel394.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel394.setForeground(new java.awt.Color(255, 255, 255));
        jLabel394.setText("$");
        BG.add(jLabel394, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 310, -1, -1));

        jLabel325.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel325.setForeground(new java.awt.Color(255, 255, 255));
        jLabel325.setText("$");
        BG.add(jLabel325, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, -1, -1));

        lblTotalPasivoCir7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoCir7.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoCir7.setText("-------------");
        BG.add(lblTotalPasivoCir7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 420, -1, -1));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Aumento");
        BG.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        jLabel387.setForeground(new java.awt.Color(255, 255, 255));
        jLabel387.setText("$");
        BG.add(jLabel387, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 290, -1, -1));

        lblProveedores4.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores4.setText("0.00");
        BG.add(lblProveedores4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));

        lblTotalPasivoCir2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoCir2.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoCir2.setText("-------------");
        BG.add(lblTotalPasivoCir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        lblSignoI4.setForeground(new java.awt.Color(255, 255, 255));
        lblSignoI4.setText("$");
        BG.add(lblSignoI4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, -1, -1));

        lblInventario6.setForeground(new java.awt.Color(255, 255, 255));
        lblInventario6.setText("0.00");
        BG.add(lblInventario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, -1, -1));

        lblBancos3.setForeground(new java.awt.Color(255, 255, 255));
        lblBancos3.setText("0.00");
        BG.add(lblBancos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        lblTotalCapital8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalCapital8.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCapital8.setText("-------------");
        BG.add(lblTotalCapital8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 590, -1, -1));

        lblComputo10.setForeground(new java.awt.Color(255, 255, 255));
        lblComputo10.setText("0.00");
        BG.add(lblComputo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 290, -1, -1));

        lblProveedores2.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores2.setText("0.00");
        BG.add(lblProveedores2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        lblComputo3.setForeground(new java.awt.Color(255, 255, 255));
        lblComputo3.setText("0.00");
        BG.add(lblComputo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        lblTerreno3.setForeground(new java.awt.Color(255, 255, 255));
        lblTerreno3.setText("0.00");
        BG.add(lblTerreno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("%");
        BG.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, -1, -1));

        jLabel316.setForeground(new java.awt.Color(255, 255, 255));
        jLabel316.setText("$");
        BG.add(jLabel316, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, -1, -1));

        lblCapYPas7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCapYPas7.setForeground(new java.awt.Color(255, 255, 255));
        lblCapYPas7.setText("-------------");
        BG.add(lblCapYPas7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 610, -1, -1));

        jLabel310.setForeground(new java.awt.Color(255, 255, 255));
        jLabel310.setText("$");
        BG.add(jLabel310, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, -1, -1));

        lblInventario9.setForeground(new java.awt.Color(255, 255, 255));
        lblInventario9.setText("0.00");
        BG.add(lblInventario9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 150, -1, -1));

        lblBancos1.setForeground(new java.awt.Color(255, 255, 255));
        lblBancos1.setText("1359000.00");
        BG.add(lblBancos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 80, -1));

        lblUtilidad3.setForeground(new java.awt.Color(255, 255, 255));
        lblUtilidad3.setText("0.00");
        BG.add(lblUtilidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, -1, -1));

        jLabel346.setForeground(new java.awt.Color(255, 255, 255));
        jLabel346.setText("$");
        BG.add(jLabel346, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 210, -1, -1));

        lblComputo5.setForeground(new java.awt.Color(255, 255, 255));
        lblComputo5.setText("0.00");
        BG.add(lblComputo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, -1));

        lblTotalPasivo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivo2.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivo2.setText("-------------");
        BG.add(lblTotalPasivo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, -1, -1));

        jLabel317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel317.setText("$");
        BG.add(jLabel317, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, -1, -1));

        jLabel104.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setText("%");
        BG.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, -1));

        lblTotalActivoNoCir5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoNoCir5.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoNoCir5.setText("-------------");
        BG.add(lblTotalActivoNoCir5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, -1, -1));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("$");
        BG.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, -1, -1));

        lblTransporte7.setForeground(new java.awt.Color(255, 255, 255));
        lblTransporte7.setText("0.00");
        BG.add(lblTransporte7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, -1, -1));

        jLabel307.setForeground(new java.awt.Color(255, 255, 255));
        jLabel307.setText("$");
        BG.add(jLabel307, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, -1, -1));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Operación");
        BG.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, -1, -1));

        jLabel337.setForeground(new java.awt.Color(255, 255, 255));
        jLabel337.setText("$");
        BG.add(jLabel337, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 150, -1, -1));

        lblTotalActivoNoCir7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoNoCir7.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoNoCir7.setText("-------------");
        BG.add(lblTotalActivoNoCir7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, -1, -1));

        lblClientes6.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes6.setText("0.00");
        BG.add(lblClientes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, -1, -1));

        lblProveedores8.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores8.setText("0.00");
        BG.add(lblProveedores8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 380, -1, -1));

        lblTotalPasivoNoCir7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoNoCir7.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoNoCir7.setText("-------------");
        BG.add(lblTotalPasivoNoCir7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 480, -1, -1));

        lblBancos4.setForeground(new java.awt.Color(255, 255, 255));
        lblBancos4.setText("0.00");
        BG.add(lblBancos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        lblTransporte5.setForeground(new java.awt.Color(255, 255, 255));
        lblTransporte5.setText("0.00");
        BG.add(lblTransporte5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, -1, -1));

        lblTotalActivo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivo1.setText("4498500.00");
        BG.add(lblTotalActivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 80, -1));

        lblCuentas1.setForeground(new java.awt.Color(255, 255, 255));
        lblCuentas1.setText("15000.00");
        BG.add(lblCuentas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 80, -1));

        lblBancos6.setForeground(new java.awt.Color(255, 255, 255));
        lblBancos6.setText("0.00");
        BG.add(lblBancos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, -1, -1));

        lblMaquinaria7.setForeground(new java.awt.Color(255, 255, 255));
        lblMaquinaria7.setText("0.00");
        BG.add(lblMaquinaria7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, -1, -1));

        jLabel355.setForeground(new java.awt.Color(255, 255, 255));
        jLabel355.setText("$");
        BG.add(jLabel355, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 570, -1, -1));

        jLabel312.setForeground(new java.awt.Color(255, 255, 255));
        jLabel312.setText("$");
        BG.add(jLabel312, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, -1, -1));

        lblUtilidad10.setForeground(new java.awt.Color(255, 255, 255));
        lblUtilidad10.setText("0.00");
        BG.add(lblUtilidad10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 570, -1, -1));

        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("$");
        BG.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, -1));

        lblClientes8.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes8.setText("0.00");
        BG.add(lblClientes8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 130, -1, -1));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("$");
        BG.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 10, -1));

        lblMaquinaria3.setForeground(new java.awt.Color(255, 255, 255));
        lblMaquinaria3.setText("0.00");
        BG.add(lblMaquinaria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("$");
        BG.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 10, -1));

        lblComputo6.setForeground(new java.awt.Color(255, 255, 255));
        lblComputo6.setText("0.00");
        BG.add(lblComputo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, -1, -1));

        jLabel390.setForeground(new java.awt.Color(255, 255, 255));
        jLabel390.setText("$");
        BG.add(jLabel390, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 460, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Equipo de Transporte");
        BG.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 140, -1));

        jLabel386.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel386.setForeground(new java.awt.Color(255, 255, 255));
        jLabel386.setText("$");
        BG.add(jLabel386, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 500, -1, -1));

        lblCapital5.setForeground(new java.awt.Color(255, 255, 255));
        lblCapital5.setText("0.00");
        BG.add(lblCapital5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, -1, -1));

        lblCapital2.setForeground(new java.awt.Color(255, 255, 255));
        lblCapital2.setText("0.00");
        BG.add(lblCapital2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, -1, -1));

        jLabel319.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel319.setForeground(new java.awt.Color(255, 255, 255));
        jLabel319.setText("$");
        BG.add(jLabel319, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, -1, -1));

        lblTotalActivoCir9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoCir9.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoCir9.setText("-------------");
        BG.add(lblTotalActivoCir9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 170, -1, -1));

        lblCaja8.setForeground(new java.awt.Color(255, 255, 255));
        lblCaja8.setText("0.00");
        BG.add(lblCaja8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 90, -1, -1));

        jLabel320.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel320.setForeground(new java.awt.Color(255, 255, 255));
        jLabel320.setText("$");
        BG.add(jLabel320, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, -1, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("+A -P -CC");
        BG.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, -1, -1));

        lblTotalPasivoCir4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoCir4.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoCir4.setText("-------------");
        BG.add(lblTotalPasivoCir4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, -1, -1));

        lblTotalActivo8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivo8.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivo8.setText("-------------");
        BG.add(lblTotalActivo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 330, -1, -1));

        jLabel259.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel259.setForeground(new java.awt.Color(255, 255, 255));
        jLabel259.setText("$");
        BG.add(jLabel259, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

        lblTotalActivoNoCir6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoNoCir6.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoNoCir6.setText("-------------");
        BG.add(lblTotalActivoNoCir6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, -1, -1));

        jLabel305.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel305.setForeground(new java.awt.Color(255, 255, 255));
        jLabel305.setText("$");
        BG.add(jLabel305, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, -1, -1));

        lblTotalPasivoNoCir8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoNoCir8.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoNoCir8.setText("-------------");
        BG.add(lblTotalPasivoNoCir8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 480, -1, -1));

        jLabel338.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel338.setForeground(new java.awt.Color(255, 255, 255));
        jLabel338.setText("$");
        BG.add(jLabel338, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 170, -1, -1));

        lblProveedores6.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores6.setText("0.00");
        BG.add(lblProveedores6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, -1, -1));

        jLabel290.setForeground(new java.awt.Color(255, 255, 255));
        jLabel290.setText("$");
        BG.add(jLabel290, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        jLabel301.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel301.setForeground(new java.awt.Color(255, 255, 255));
        jLabel301.setText("$");
        BG.add(jLabel301, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, -1, -1));

        lblArrendamiento2.setForeground(new java.awt.Color(255, 255, 255));
        lblArrendamiento2.setText("0.00");
        BG.add(lblArrendamiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, -1, -1));

        jLabel308.setForeground(new java.awt.Color(255, 255, 255));
        jLabel308.setText("$");
        BG.add(jLabel308, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, -1, -1));

        jLabel366.setForeground(new java.awt.Color(255, 255, 255));
        jLabel366.setText("$");
        BG.add(jLabel366, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 210, -1, -1));

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("$");
        BG.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        lblUtilidad4.setForeground(new java.awt.Color(255, 255, 255));
        lblUtilidad4.setText("0.00");
        BG.add(lblUtilidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, -1, -1));

        lblSigno6.setForeground(new java.awt.Color(255, 255, 255));
        lblSigno6.setText("$");
        BG.add(lblSigno6, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 110, -1, -1));

        jLabel318.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel318.setForeground(new java.awt.Color(255, 255, 255));
        jLabel318.setText("$");
        BG.add(jLabel318, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, -1, -1));

        lblTotalActivo3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivo3.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivo3.setText("0.00");
        BG.add(lblTotalActivo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("%");
        BG.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        jLabel343.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel343.setForeground(new java.awt.Color(255, 255, 255));
        jLabel343.setText("$");
        BG.add(jLabel343, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 610, -1, -1));

        jLabel83.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("$");
        BG.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, -1, -1));

        lblClientes3.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes3.setText("0.00");
        BG.add(lblClientes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        lblComputo1.setForeground(new java.awt.Color(255, 255, 255));
        lblComputo1.setText("101000.00");
        BG.add(lblComputo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 80, -1));

        lblSigno7.setForeground(new java.awt.Color(255, 255, 255));
        lblSigno7.setText("$");
        BG.add(lblSigno7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 110, -1, -1));

        lblTotalPasivo9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivo9.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivo9.setText("-------------");
        BG.add(lblTotalPasivo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 500, -1, -1));

        lblTotalActivoCir3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoCir3.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoCir3.setText("0.00");
        BG.add(lblTotalActivoCir3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        lblInventario4.setForeground(new java.awt.Color(255, 255, 255));
        lblInventario4.setText("0.00");
        BG.add(lblInventario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        jLabel326.setForeground(new java.awt.Color(255, 255, 255));
        jLabel326.setText("$");
        BG.add(jLabel326, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, -1, -1));

        lblMaquinaria2.setForeground(new java.awt.Color(255, 255, 255));
        lblMaquinaria2.setText("0.00");
        BG.add(lblMaquinaria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        lblSigno2.setForeground(new java.awt.Color(255, 255, 255));
        lblSigno2.setText("$");
        BG.add(lblSigno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        lblClientes7.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes7.setText("0.00");
        BG.add(lblClientes7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, -1, -1));

        lblComputo7.setForeground(new java.awt.Color(255, 255, 255));
        lblComputo7.setText("0.00");
        BG.add(lblComputo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 290, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("2022");
        BG.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        lblTotalPasivoCir5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoCir5.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoCir5.setText("-------------");
        BG.add(lblTotalPasivoCir5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, -1, -1));

        lblCaja5.setForeground(new java.awt.Color(255, 255, 255));
        lblCaja5.setText("0.00");
        BG.add(lblCaja5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, -1, -1));

        jLabel311.setForeground(new java.awt.Color(255, 255, 255));
        jLabel311.setText("$");
        BG.add(jLabel311, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Total Pasivo");
        BG.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 140, -1));

        jLabel281.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel281.setForeground(new java.awt.Color(255, 255, 255));
        jLabel281.setText("$");
        BG.add(jLabel281, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, -1, -1));

        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("$");
        BG.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, -1, -1));

        jLabel335.setForeground(new java.awt.Color(255, 255, 255));
        jLabel335.setText("$");
        BG.add(jLabel335, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, -1, -1));

        lblTotalActivoCir10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoCir10.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoCir10.setText("-------------");
        BG.add(lblTotalActivoCir10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 170, -1, -1));

        lblInventario7.setForeground(new java.awt.Color(255, 255, 255));
        lblInventario7.setText("0.00");
        BG.add(lblInventario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, -1, -1));

        lblTotalActivoCir7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoCir7.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoCir7.setText("-------------");
        BG.add(lblTotalActivoCir7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, -1, -1));

        lblSigno.setForeground(new java.awt.Color(255, 255, 255));
        lblSigno.setText("$");
        BG.add(lblSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 10, -1));

        lblTotalActivoCir8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoCir8.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoCir8.setText("-------------");
        BG.add(lblTotalActivoCir8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 170, -1, -1));

        lblTransporte4.setForeground(new java.awt.Color(255, 255, 255));
        lblTransporte4.setText("0.00");
        BG.add(lblTransporte4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Pasivo Circulante");
        BG.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 140, -1));

        lblCaja10.setForeground(new java.awt.Color(255, 255, 255));
        lblCaja10.setText("0.00");
        BG.add(lblCaja10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 90, -1, -1));

        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("%");
        BG.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));

        jLabel265.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel265.setForeground(new java.awt.Color(255, 255, 255));
        jLabel265.setText("$");
        BG.add(jLabel265, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, -1));

        jLabel256.setForeground(new java.awt.Color(255, 255, 255));
        jLabel256.setText("$");
        BG.add(jLabel256, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        jLabel356.setForeground(new java.awt.Color(255, 255, 255));
        jLabel356.setText("$");
        BG.add(jLabel356, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 90, -1, -1));

        lblCuentas8.setForeground(new java.awt.Color(255, 255, 255));
        lblCuentas8.setText("0.00");
        BG.add(lblCuentas8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 400, -1, -1));

        lblBancos9.setForeground(new java.awt.Color(255, 255, 255));
        lblBancos9.setText("0.00");
        BG.add(lblBancos9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 110, -1, -1));

        jLabel365.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel365.setForeground(new java.awt.Color(255, 255, 255));
        jLabel365.setText("$");
        BG.add(jLabel365, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 330, -1, -1));

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("$");
        BG.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, -1, -1));

        lblCapYPas9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCapYPas9.setForeground(new java.awt.Color(255, 255, 255));
        lblCapYPas9.setText("-------------");
        BG.add(lblCapYPas9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 610, -1, -1));

        lblInventario8.setForeground(new java.awt.Color(255, 255, 255));
        lblInventario8.setText("0.00");
        BG.add(lblInventario8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 150, -1, -1));

        jLabel323.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel323.setForeground(new java.awt.Color(255, 255, 255));
        jLabel323.setText("$");
        BG.add(jLabel323, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 610, -1, -1));

        jLabel284.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel284.setForeground(new java.awt.Color(255, 255, 255));
        jLabel284.setText("$");
        BG.add(jLabel284, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 590, -1, -1));

        lblSigno3.setForeground(new java.awt.Color(255, 255, 255));
        lblSigno3.setText("$");
        BG.add(lblSigno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        jLabel278.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel278.setForeground(new java.awt.Color(255, 255, 255));
        jLabel278.setText("$");
        BG.add(jLabel278, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, -1, -1));

        jLabel391.setForeground(new java.awt.Color(255, 255, 255));
        jLabel391.setText("$");
        BG.add(jLabel391, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 90, -1, -1));

        lblTotalPasivoNoCir1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoNoCir1.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoNoCir1.setText("90000.00");
        BG.add(lblTotalPasivoNoCir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 80, -1));

        lblSignoI1.setForeground(new java.awt.Color(255, 255, 255));
        lblSignoI1.setText("$");
        BG.add(lblSignoI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        lblMobiliario6.setForeground(new java.awt.Color(255, 255, 255));
        lblMobiliario6.setText("0.00");
        BG.add(lblMobiliario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, -1, -1));

        jLabel262.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel262.setForeground(new java.awt.Color(255, 255, 255));
        jLabel262.setText("$");
        BG.add(jLabel262, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, -1, -1));

        jLabel292.setForeground(new java.awt.Color(255, 255, 255));
        jLabel292.setText("$");
        BG.add(jLabel292, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, -1, -1));

        lblInventario2.setForeground(new java.awt.Color(255, 255, 255));
        lblInventario2.setText("0.00");
        BG.add(lblInventario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        jLabel340.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel340.setForeground(new java.awt.Color(255, 255, 255));
        jLabel340.setText("$");
        BG.add(jLabel340, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 420, -1, -1));

        lblSigno5.setForeground(new java.awt.Color(255, 255, 255));
        lblSigno5.setText("$");
        BG.add(lblSigno5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, -1, -1));

        lblComputo9.setForeground(new java.awt.Color(255, 255, 255));
        lblComputo9.setText("0.00");
        BG.add(lblComputo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 290, -1, -1));

        lblMobiliario4.setForeground(new java.awt.Color(255, 255, 255));
        lblMobiliario4.setText("0.00");
        BG.add(lblMobiliario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        jLabel372.setForeground(new java.awt.Color(255, 255, 255));
        jLabel372.setText("$");
        BG.add(jLabel372, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 400, -1, -1));

        lblProveedores9.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores9.setText("0.00");
        BG.add(lblProveedores9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 380, -1, -1));

        jLabel267.setForeground(new java.awt.Color(255, 255, 255));
        jLabel267.setText("$");
        BG.add(jLabel267, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        jLabel295.setForeground(new java.awt.Color(255, 255, 255));
        jLabel295.setText("$");
        BG.add(jLabel295, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, -1, -1));

        lblTransporte9.setForeground(new java.awt.Color(255, 255, 255));
        lblTransporte9.setText("0.00");
        BG.add(lblTransporte9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 250, -1, -1));

        lblTotalCapital7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalCapital7.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCapital7.setText("-------------");
        BG.add(lblTotalCapital7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 590, -1, -1));

        lblSignoI3.setForeground(new java.awt.Color(255, 255, 255));
        lblSignoI3.setText("$");
        BG.add(lblSignoI3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        lblSignoI7.setForeground(new java.awt.Color(255, 255, 255));
        lblSignoI7.setText("$");
        BG.add(lblSignoI7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 130, -1, -1));

        jLabel276.setForeground(new java.awt.Color(255, 255, 255));
        jLabel276.setText("$");
        BG.add(jLabel276, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Total Pasivo Cap.");
        BG.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 140, -1));

        lblCaja1.setForeground(new java.awt.Color(255, 255, 255));
        lblCaja1.setText("7500.00");
        BG.add(lblCaja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 80, -1));

        jLabel377.setForeground(new java.awt.Color(255, 255, 255));
        jLabel377.setText("$");
        BG.add(jLabel377, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 400, -1, -1));

        jLabel263.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel263.setForeground(new java.awt.Color(255, 255, 255));
        jLabel263.setText("$");
        BG.add(jLabel263, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, -1, -1));

        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("$");
        BG.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        jLabel354.setForeground(new java.awt.Color(255, 255, 255));
        jLabel354.setText("$");
        BG.add(jLabel354, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 550, -1, -1));

        lblMaquinaria5.setForeground(new java.awt.Color(255, 255, 255));
        lblMaquinaria5.setText("0.00");
        BG.add(lblMaquinaria5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, -1, -1));

        lblTerreno10.setForeground(new java.awt.Color(255, 255, 255));
        lblTerreno10.setText("0.00");
        BG.add(lblTerreno10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 270, -1, -1));

        lblTotalActivoNoCir4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoNoCir4.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoNoCir4.setText("-------------");
        BG.add(lblTotalActivoNoCir4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, -1));

        lblCapital1.setForeground(new java.awt.Color(255, 255, 255));
        lblCapital1.setText("3600000.00");
        BG.add(lblCapital1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 80, -1));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("$");
        BG.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        jLabel277.setForeground(new java.awt.Color(255, 255, 255));
        jLabel277.setText("$");
        BG.add(jLabel277, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, -1));

        lblTotalCapital5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalCapital5.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCapital5.setText("-------------");
        BG.add(lblTotalCapital5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 590, -1, -1));

        jLabel374.setForeground(new java.awt.Color(255, 255, 255));
        jLabel374.setText("$");
        BG.add(jLabel374, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 550, -1, -1));

        jLabel336.setForeground(new java.awt.Color(255, 255, 255));
        jLabel336.setText("$");
        BG.add(jLabel336, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, -1, -1));

        jLabel260.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel260.setForeground(new java.awt.Color(255, 255, 255));
        jLabel260.setText("$");
        BG.add(jLabel260, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        jLabel303.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel303.setForeground(new java.awt.Color(255, 255, 255));
        jLabel303.setText("$");
        BG.add(jLabel303, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, -1, -1));

        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("%");
        BG.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        jLabel329.setForeground(new java.awt.Color(255, 255, 255));
        jLabel329.setText("$");
        BG.add(jLabel329, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, -1, -1));

        lblCapital7.setForeground(new java.awt.Color(255, 255, 255));
        lblCapital7.setText("0.00");
        BG.add(lblCapital7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, -1, -1));

        lblCapYPas4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCapYPas4.setForeground(new java.awt.Color(255, 255, 255));
        lblCapYPas4.setText("-------------");
        BG.add(lblCapYPas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 610, -1, -1));

        jLabel327.setForeground(new java.awt.Color(255, 255, 255));
        jLabel327.setText("$");
        BG.add(jLabel327, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, -1, -1));

        jLabel361.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel361.setForeground(new java.awt.Color(255, 255, 255));
        jLabel361.setText("$");
        BG.add(jLabel361, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 480, -1, -1));

        jLabel108.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setText("%");
        BG.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, -1, -1));

        lblTerreno8.setForeground(new java.awt.Color(255, 255, 255));
        lblTerreno8.setText("0.00");
        BG.add(lblTerreno8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 270, -1, -1));

        jLabel351.setForeground(new java.awt.Color(255, 255, 255));
        jLabel351.setText("$");
        BG.add(jLabel351, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 380, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Pasivo No Circulante");
        BG.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 140, -1));

        jLabel385.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel385.setForeground(new java.awt.Color(255, 255, 255));
        jLabel385.setText("$");
        BG.add(jLabel385, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 610, -1, -1));

        lblCapital10.setForeground(new java.awt.Color(255, 255, 255));
        lblCapital10.setText("0.00");
        BG.add(lblCapital10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 550, -1, -1));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("$");
        BG.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Capital Social");
        BG.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 140, -1));

        jLabel110.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("%");
        BG.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, -1, -1));

        jLabel322.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel322.setForeground(new java.awt.Color(255, 255, 255));
        jLabel322.setText("$");
        BG.add(jLabel322, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, -1, -1));

        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("%");
        BG.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        lblArrendamiento8.setForeground(new java.awt.Color(255, 255, 255));
        lblArrendamiento8.setText("0.00");
        BG.add(lblArrendamiento8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 460, -1, -1));

        lblCuentas6.setForeground(new java.awt.Color(255, 255, 255));
        lblCuentas6.setText("0.00");
        BG.add(lblCuentas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, -1, -1));

        jLabel257.setForeground(new java.awt.Color(255, 255, 255));
        jLabel257.setText("$");
        BG.add(jLabel257, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        lblInventario5.setForeground(new java.awt.Color(255, 255, 255));
        lblInventario5.setText("0.00");
        BG.add(lblInventario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));

        jLabel353.setForeground(new java.awt.Color(255, 255, 255));
        jLabel353.setText("$");
        BG.add(jLabel353, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 460, -1, -1));

        jLabel242.setBackground(new java.awt.Color(255, 255, 204));
        jLabel242.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel242.setForeground(new java.awt.Color(255, 255, 255));
        jLabel242.setText("DIFERENCIA");
        BG.add(jLabel242, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        lblTotalActivoCir1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoCir1.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoCir1.setText("1526500.00");
        BG.add(lblTotalActivoCir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 80, -1));

        jLabel382.setForeground(new java.awt.Color(255, 255, 255));
        jLabel382.setText("$");
        BG.add(jLabel382, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 210, -1, -1));

        jLabel348.setForeground(new java.awt.Color(255, 255, 255));
        jLabel348.setText("$");
        BG.add(jLabel348, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 250, -1, -1));

        lblUtilidad2.setForeground(new java.awt.Color(255, 255, 255));
        lblUtilidad2.setText("0.00");
        BG.add(lblUtilidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, -1, -1));

        lblSigno1.setForeground(new java.awt.Color(255, 255, 255));
        lblSigno1.setText("$");
        BG.add(lblSigno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("$");
        BG.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 10, -1));

        jLabel296.setForeground(new java.awt.Color(255, 255, 255));
        jLabel296.setText("$");
        BG.add(jLabel296, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, -1, -1));

        lblArrendamiento4.setForeground(new java.awt.Color(255, 255, 255));
        lblArrendamiento4.setText("0.00");
        BG.add(lblArrendamiento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));

        jLabel341.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel341.setForeground(new java.awt.Color(255, 255, 255));
        jLabel341.setText("$");
        BG.add(jLabel341, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 480, -1, -1));

        lblTotalActivo10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivo10.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivo10.setText("-------------");
        BG.add(lblTotalActivo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 330, -1, -1));

        lblProveedores1.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores1.setText("50000.00");
        BG.add(lblProveedores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 80, -1));

        lblTotalPasivoCir6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoCir6.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoCir6.setText("-------------");
        BG.add(lblTotalPasivoCir6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, -1, -1));

        jLabel266.setForeground(new java.awt.Color(255, 255, 255));
        jLabel266.setText("$");
        BG.add(jLabel266, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        lblUtilidad8.setForeground(new java.awt.Color(255, 255, 255));
        lblUtilidad8.setText("0.00");
        BG.add(lblUtilidad8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 570, -1, -1));

        lblTotalPasivo3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivo3.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivo3.setText("0.00");
        BG.add(lblTotalPasivo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));

        jLabel279.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel279.setForeground(new java.awt.Color(255, 255, 255));
        jLabel279.setText("$");
        BG.add(jLabel279, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, -1, -1));

        jLabel342.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel342.setForeground(new java.awt.Color(255, 255, 255));
        jLabel342.setText("$");
        BG.add(jLabel342, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 500, -1, -1));

        jLabel373.setForeground(new java.awt.Color(255, 255, 255));
        jLabel373.setText("$");
        BG.add(jLabel373, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 460, -1, -1));

        lblUtilidad5.setForeground(new java.awt.Color(255, 255, 255));
        lblUtilidad5.setText("0.00");
        BG.add(lblUtilidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Equipo de Cómputo");
        BG.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 140, -1));

        lblTotalActivo5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivo5.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivo5.setText("-------------");
        BG.add(lblTotalActivo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        lblTotalActivo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivo2.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivo2.setText("-------------");
        BG.add(lblTotalActivo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        lblTotalActivoNoCir9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoNoCir9.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoNoCir9.setText("-------------");
        BG.add(lblTotalActivoNoCir9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 310, -1, -1));

        jLabel269.setForeground(new java.awt.Color(255, 255, 255));
        jLabel269.setText("$");
        BG.add(jLabel269, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        jLabel321.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel321.setForeground(new java.awt.Color(255, 255, 255));
        jLabel321.setText("$");
        BG.add(jLabel321, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 480, -1, -1));

        lblCuentas3.setForeground(new java.awt.Color(255, 255, 255));
        lblCuentas3.setText("0.00");
        BG.add(lblCuentas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        lblTotalPasivo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivo1.setText("155000.00");
        BG.add(lblTotalPasivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 80, -1));

        lblMobiliario9.setForeground(new java.awt.Color(255, 255, 255));
        lblMobiliario9.setText("0.00");
        BG.add(lblMobiliario9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 210, -1, -1));

        lblInventario3.setForeground(new java.awt.Color(255, 255, 255));
        lblInventario3.setText("0.00");
        BG.add(lblInventario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        jLabel264.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel264.setForeground(new java.awt.Color(255, 255, 255));
        jLabel264.setText("$");
        BG.add(jLabel264, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 590, -1, -1));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Arrendamiento");
        BG.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 140, -1));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("$");
        BG.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 10, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Total Activo");
        BG.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 140, -1));

        lblTerreno5.setForeground(new java.awt.Color(255, 255, 255));
        lblTerreno5.setText("0.00");
        BG.add(lblTerreno5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, -1, -1));

        lblSigno8.setForeground(new java.awt.Color(255, 255, 255));
        lblSigno8.setText("$");
        BG.add(lblSigno8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 110, -1, -1));

        jLabel395.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel395.setForeground(new java.awt.Color(255, 255, 255));
        jLabel395.setText("$");
        BG.add(jLabel395, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 420, -1, -1));

        jLabel283.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel283.setForeground(new java.awt.Color(255, 255, 255));
        jLabel283.setText("$");
        BG.add(jLabel283, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, -1, -1));

        lblMaquinaria10.setForeground(new java.awt.Color(255, 255, 255));
        lblMaquinaria10.setText("0.00");
        BG.add(lblMaquinaria10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 230, -1, -1));

        jLabel347.setForeground(new java.awt.Color(255, 255, 255));
        jLabel347.setText("$");
        BG.add(jLabel347, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 230, -1, -1));

        jLabel286.setForeground(new java.awt.Color(255, 255, 255));
        jLabel286.setText("$");
        BG.add(jLabel286, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, -1, -1));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Proveedores");
        BG.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 140, -1));

        lblUtilidad6.setForeground(new java.awt.Color(255, 255, 255));
        lblUtilidad6.setText("0.00");
        BG.add(lblUtilidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 570, -1, -1));

        lblTotalPasivoNoCir10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoNoCir10.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoNoCir10.setText("-------------");
        BG.add(lblTotalPasivoNoCir10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 480, -1, -1));

        lblPorcentaje.setForeground(new java.awt.Color(255, 255, 255));
        lblPorcentaje.setText("%");
        BG.add(lblPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jLabel302.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel302.setForeground(new java.awt.Color(255, 255, 255));
        jLabel302.setText("$");
        BG.add(jLabel302, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, -1, -1));

        lblTotalActivoNoCir2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoNoCir2.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoNoCir2.setText("-------------");
        BG.add(lblTotalActivoNoCir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        jLabel273.setForeground(new java.awt.Color(255, 255, 255));
        jLabel273.setText("$");
        BG.add(jLabel273, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, -1, -1));

        lblTerreno9.setForeground(new java.awt.Color(255, 255, 255));
        lblTerreno9.setText("0.00");
        BG.add(lblTerreno9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 270, -1, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Inversión");
        BG.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 70, -1, -1));

        lblUtilidad9.setForeground(new java.awt.Color(255, 255, 255));
        lblUtilidad9.setText("0.00");
        BG.add(lblUtilidad9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 570, -1, -1));

        lblMaquinaria9.setForeground(new java.awt.Color(255, 255, 255));
        lblMaquinaria9.setText("0.00");
        BG.add(lblMaquinaria9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 230, -1, -1));

        jLabel97.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("%");
        BG.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        jLabel261.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel261.setForeground(new java.awt.Color(255, 255, 255));
        jLabel261.setText("$");
        BG.add(jLabel261, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, -1, -1));

        lblTotalActivoCir5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoCir5.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoCir5.setText("-------------");
        BG.add(lblTotalActivoCir5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, -1));

        jLabel268.setForeground(new java.awt.Color(255, 255, 255));
        jLabel268.setText("$");
        BG.add(jLabel268, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        lblTotalPasivo4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivo4.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivo4.setText("-------------");
        BG.add(lblTotalPasivo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, -1));

        lblCapYPas6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCapYPas6.setForeground(new java.awt.Color(255, 255, 255));
        lblCapYPas6.setText("-------------");
        BG.add(lblCapYPas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 610, -1, -1));

        lblMobiliario7.setForeground(new java.awt.Color(255, 255, 255));
        lblMobiliario7.setText("0.00");
        BG.add(lblMobiliario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, -1, -1));

        jLabel272.setForeground(new java.awt.Color(255, 255, 255));
        jLabel272.setText("$");
        BG.add(jLabel272, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));

        lblCapital3.setForeground(new java.awt.Color(255, 255, 255));
        lblCapital3.setText("0.00");
        BG.add(lblCapital3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, -1));

        lblCapYPas3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCapYPas3.setForeground(new java.awt.Color(255, 255, 255));
        lblCapYPas3.setText("0.00");
        BG.add(lblCapYPas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 610, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("2021");
        BG.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        jLabel375.setForeground(new java.awt.Color(255, 255, 255));
        jLabel375.setText("$");
        BG.add(jLabel375, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 570, -1, -1));

        jLabel334.setForeground(new java.awt.Color(255, 255, 255));
        jLabel334.setText("$");
        BG.add(jLabel334, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 550, -1, -1));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Utilidad del Ejercicio");
        BG.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 140, -1));

        lblTotalActivo7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivo7.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivo7.setText("-------------");
        BG.add(lblTotalActivo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, -1, -1));

        jLabel288.setForeground(new java.awt.Color(255, 255, 255));
        jLabel288.setText("$");
        BG.add(jLabel288, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, -1, -1));

        jLabel96.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("%");
        BG.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        lblBancos5.setForeground(new java.awt.Color(255, 255, 255));
        lblBancos5.setText("0.00");
        BG.add(lblBancos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        jLabel297.setForeground(new java.awt.Color(255, 255, 255));
        jLabel297.setText("$");
        BG.add(jLabel297, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Capital Contable");
        BG.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        lblArrendamiento1.setForeground(new java.awt.Color(255, 255, 255));
        lblArrendamiento1.setText("90000.00");
        BG.add(lblArrendamiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 80, -1));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("$");
        BG.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("$");
        BG.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 10, -1));

        jLabel380.setForeground(new java.awt.Color(255, 255, 255));
        jLabel380.setText("$");
        BG.add(jLabel380, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 250, -1, -1));

        jLabel349.setForeground(new java.awt.Color(255, 255, 255));
        jLabel349.setText("$");
        BG.add(jLabel349, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, -1, -1));

        lblInventario10.setForeground(new java.awt.Color(255, 255, 255));
        lblInventario10.setText("0.00");
        BG.add(lblInventario10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 150, -1, -1));

        lblTotalPasivoCir9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoCir9.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoCir9.setText("-------------");
        BG.add(lblTotalPasivoCir9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 420, -1, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Cuentas Por Pagar");
        BG.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 140, -1));

        lblBancos7.setForeground(new java.awt.Color(255, 255, 255));
        lblBancos7.setText("0.00");
        BG.add(lblBancos7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, -1, -1));

        lblTotalActivoNoCir1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoNoCir1.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoNoCir1.setText("2972000.00");
        BG.add(lblTotalActivoNoCir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 80, -1));

        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("$");
        BG.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        lblCuentas5.setForeground(new java.awt.Color(255, 255, 255));
        lblCuentas5.setText("0.00");
        BG.add(lblCuentas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, -1, -1));

        lblCapYPas5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCapYPas5.setForeground(new java.awt.Color(255, 255, 255));
        lblCapYPas5.setText("-------------");
        BG.add(lblCapYPas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 610, -1, -1));

        jLabel381.setForeground(new java.awt.Color(255, 255, 255));
        jLabel381.setText("$");
        BG.add(jLabel381, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 230, -1, -1));

        jLabel371.setForeground(new java.awt.Color(255, 255, 255));
        jLabel371.setText("$");
        BG.add(jLabel371, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 380, -1, -1));

        jLabel95.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("%");
        BG.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        jLabel243.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel243.setForeground(new java.awt.Color(255, 255, 255));
        jLabel243.setText("FLUJO DE EFECTIVO");
        BG.add(jLabel243, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 30, -1, -1));

        jLabel109.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel109.setText("%");
        BG.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 610, -1, -1));

        lblCaja9.setForeground(new java.awt.Color(255, 255, 255));
        lblCaja9.setText("0.00");
        BG.add(lblCaja9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 90, -1, -1));

        lblTotalActivoNoCir3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoNoCir3.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoNoCir3.setText("0.00");
        BG.add(lblTotalActivoNoCir3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        jLabel376.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel376.setForeground(new java.awt.Color(255, 255, 255));
        jLabel376.setText("$");
        BG.add(jLabel376, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 480, -1, -1));

        jLabel280.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel280.setForeground(new java.awt.Color(255, 255, 255));
        jLabel280.setText("$");
        BG.add(jLabel280, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, -1, -1));

        lblTotalPasivo10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivo10.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivo10.setText("-------------");
        BG.add(lblTotalPasivo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 500, -1, -1));

        lblTotalCapital6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalCapital6.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCapital6.setText("-------------");
        BG.add(lblTotalCapital6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 590, -1, -1));

        jLabel294.setForeground(new java.awt.Color(255, 255, 255));
        jLabel294.setText("$");
        BG.add(jLabel294, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, -1, -1));

        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("%");
        BG.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        lblTotalPasivo7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivo7.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivo7.setText("-------------");
        BG.add(lblTotalPasivo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 500, -1, -1));

        jLabel364.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel364.setForeground(new java.awt.Color(255, 255, 255));
        jLabel364.setText("$");
        BG.add(jLabel364, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 590, -1, -1));

        lblTotalCapital1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalCapital1.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCapital1.setText("3643000.00");
        BG.add(lblTotalCapital1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 80, -1));

        jLabel369.setForeground(new java.awt.Color(255, 255, 255));
        jLabel369.setText("$");
        BG.add(jLabel369, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 270, -1, -1));

        lblTotalPasivoNoCir9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoNoCir9.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoNoCir9.setText("-------------");
        BG.add(lblTotalPasivoNoCir9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 480, -1, -1));

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("$");
        BG.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 10, -1));

        jLabel389.setForeground(new java.awt.Color(255, 255, 255));
        jLabel389.setText("$");
        BG.add(jLabel389, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 550, -1, -1));

        lblComputo2.setForeground(new java.awt.Color(255, 255, 255));
        lblComputo2.setText("0.00");
        BG.add(lblComputo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Caja");
        BG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, -1));

        lblTotalCapital10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalCapital10.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCapital10.setText("-------------");
        BG.add(lblTotalCapital10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 590, -1, -1));

        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("$");
        BG.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 10, -1));

        lblTerreno1.setForeground(new java.awt.Color(255, 255, 255));
        lblTerreno1.setText("1200000.00");
        BG.add(lblTerreno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 80, -1));

        lblMaquinaria1.setForeground(new java.awt.Color(255, 255, 255));
        lblMaquinaria1.setText("500000.00");
        BG.add(lblMaquinaria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 80, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Disminución");
        BG.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, -1, -1));

        jLabel367.setForeground(new java.awt.Color(255, 255, 255));
        jLabel367.setText("$");
        BG.add(jLabel367, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 230, -1, -1));

        lblMobiliario1.setForeground(new java.awt.Color(255, 255, 255));
        lblMobiliario1.setText("71000.00");
        BG.add(lblMobiliario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 80, -1));

        jLabel331.setForeground(new java.awt.Color(255, 255, 255));
        jLabel331.setText("$");
        BG.add(jLabel331, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, -1, -1));

        lblTransporte2.setForeground(new java.awt.Color(255, 255, 255));
        lblTransporte2.setText("0.00");
        BG.add(lblTransporte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("$");
        BG.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("%");
        BG.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        lblTotalPasivoNoCir2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoNoCir2.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoNoCir2.setText("-------------");
        BG.add(lblTotalPasivoNoCir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));

        lblProveedores7.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores7.setText("0.00");
        BG.add(lblProveedores7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 380, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Total");
        BG.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 102, -1));

        lblCapYPas10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCapYPas10.setForeground(new java.awt.Color(255, 255, 255));
        lblCapYPas10.setText("-------------");
        BG.add(lblCapYPas10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 610, -1, -1));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("$");
        BG.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 10, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Porcentajes");
        BG.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("$");
        BG.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        lblBancos2.setForeground(new java.awt.Color(255, 255, 255));
        lblBancos2.setText("0.00");
        BG.add(lblBancos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        lblCapYPas1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCapYPas1.setForeground(new java.awt.Color(255, 255, 255));
        lblCapYPas1.setText("3798000.00");
        BG.add(lblCapYPas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, 80, -1));

        jLabel393.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel393.setForeground(new java.awt.Color(255, 255, 255));
        jLabel393.setText("$");
        BG.add(jLabel393, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 170, -1, -1));

        lblMaquinaria6.setForeground(new java.awt.Color(255, 255, 255));
        lblMaquinaria6.setText("0.00");
        BG.add(lblMaquinaria6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, -1, -1));

        lblCapital9.setForeground(new java.awt.Color(255, 255, 255));
        lblCapital9.setText("0.00");
        BG.add(lblCapital9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 550, -1, -1));

        jLabel344.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel344.setForeground(new java.awt.Color(255, 255, 255));
        jLabel344.setText("$");
        BG.add(jLabel344, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 590, -1, -1));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("$");
        BG.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, -1, -1));

        lblTotalCapital3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalCapital3.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCapital3.setText("0.00");
        BG.add(lblTotalCapital3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, -1, -1));

        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("$");
        BG.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 10, -1));

        lblTotalActivo6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivo6.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivo6.setText("-------------");
        BG.add(lblTotalActivo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, -1, -1));

        jLabel350.setForeground(new java.awt.Color(255, 255, 255));
        jLabel350.setText("$");
        BG.add(jLabel350, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 290, -1, -1));

        lblTerreno4.setForeground(new java.awt.Color(255, 255, 255));
        lblTerreno4.setText("0.00");
        BG.add(lblTerreno4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));

        lblTotalCapital9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalCapital9.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCapital9.setText("-------------");
        BG.add(lblTotalCapital9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 590, -1, -1));

        lblCuentas7.setForeground(new java.awt.Color(255, 255, 255));
        lblCuentas7.setText("0.00");
        BG.add(lblCuentas7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 400, -1, -1));

        jLabel258.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel258.setForeground(new java.awt.Color(255, 255, 255));
        jLabel258.setText("$");
        BG.add(jLabel258, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        lblInventario1.setForeground(new java.awt.Color(255, 255, 255));
        lblInventario1.setText("100000.00");
        BG.add(lblInventario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 80, -1));

        jLabel240.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel240.setForeground(new java.awt.Color(255, 255, 255));
        jLabel240.setText("ORIGEN");
        BG.add(jLabel240, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, -1));

        jLabel304.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel304.setForeground(new java.awt.Color(255, 255, 255));
        jLabel304.setText("$");
        BG.add(jLabel304, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, -1, -1));

        lblTerreno7.setForeground(new java.awt.Color(255, 255, 255));
        lblTerreno7.setText("0.00");
        BG.add(lblTerreno7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, -1, -1));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("$");
        BG.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Clientes");
        BG.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 140, -1));

        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("$");
        BG.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 10, -1));

        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("$");
        BG.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        jLabel291.setForeground(new java.awt.Color(255, 255, 255));
        jLabel291.setText("$");
        BG.add(jLabel291, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, -1));

        lblBancos8.setForeground(new java.awt.Color(255, 255, 255));
        lblBancos8.setText("0.00");
        BG.add(lblBancos8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, -1, -1));

        lblClientes5.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes5.setText("0.00");
        BG.add(lblClientes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, -1));

        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("$");
        BG.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 10, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Total");
        BG.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 97, -1));

        lblMobiliario10.setForeground(new java.awt.Color(255, 255, 255));
        lblMobiliario10.setText("0.00");
        BG.add(lblMobiliario10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 210, -1, -1));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("$");
        BG.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, -1));

        btnCalcularTabala.setBackground(new java.awt.Color(94, 12, 12));
        btnCalcularTabala.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcularTabala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calculo.png"))); // NOI18N
        btnCalcularTabala.setText("CALCULAR");
        btnCalcularTabala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularTabalaActionPerformed(evt);
            }
        });
        BG.add(btnCalcularTabala, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 640, -1, -1));

        jLabel275.setForeground(new java.awt.Color(255, 255, 255));
        jLabel275.setText("$");
        BG.add(jLabel275, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, -1, -1));

        jLabel357.setForeground(new java.awt.Color(255, 255, 255));
        jLabel357.setText("$");
        BG.add(jLabel357, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 150, -1, -1));

        jLabel328.setForeground(new java.awt.Color(255, 255, 255));
        jLabel328.setText("$");
        BG.add(jLabel328, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, -1, -1));

        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("%");
        BG.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));

        jLabel384.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel384.setForeground(new java.awt.Color(255, 255, 255));
        jLabel384.setText("$");
        BG.add(jLabel384, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 590, -1, -1));

        lblTotalPasivoCir1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoCir1.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoCir1.setText("65000.00");
        BG.add(lblTotalPasivoCir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 80, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Maquinaria");
        BG.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, -1));

        jLabel330.setForeground(new java.awt.Color(255, 255, 255));
        jLabel330.setText("$");
        BG.add(jLabel330, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, -1, -1));

        lblUtilidad7.setForeground(new java.awt.Color(255, 255, 255));
        lblUtilidad7.setText("0.00");
        BG.add(lblUtilidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, -1, -1));

        lblClientes10.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes10.setText("0.00");
        BG.add(lblClientes10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 130, -1, -1));

        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("$");
        BG.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 10, -1));

        lblTotalCapital4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalCapital4.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCapital4.setText("-------------");
        BG.add(lblTotalCapital4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, -1, -1));

        lblProveedores3.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores3.setText("0.00");
        BG.add(lblProveedores3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("%");
        BG.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Activo Circulante");
        BG.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Inventario");
        BG.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 140, -1));

        lblCaja3.setForeground(new java.awt.Color(255, 255, 255));
        lblCaja3.setText("0.00");
        BG.add(lblCaja3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        lblTotalActivo4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivo4.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivo4.setText("-------------");
        BG.add(lblTotalActivo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));

        jLabel315.setForeground(new java.awt.Color(255, 255, 255));
        jLabel315.setText("$");
        BG.add(jLabel315, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total");
        BG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 103, -1));

        lblArrendamiento3.setForeground(new java.awt.Color(255, 255, 255));
        lblArrendamiento3.setText("0.00");
        BG.add(lblArrendamiento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        lblSignoI6.setForeground(new java.awt.Color(255, 255, 255));
        lblSignoI6.setText("$");
        BG.add(lblSignoI6, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 130, -1, -1));

        lblTotalActivoCir2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalActivoCir2.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalActivoCir2.setText("-------------");
        BG.add(lblTotalActivoCir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel298.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel298.setForeground(new java.awt.Color(255, 255, 255));
        jLabel298.setText("$");
        BG.add(jLabel298, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, -1, -1));

        lblClientes1.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes1.setText("60000.00");
        BG.add(lblClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 80, -1));

        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("$");
        BG.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        lblUtilidad1.setForeground(new java.awt.Color(255, 255, 255));
        lblUtilidad1.setText("43000.00");
        BG.add(lblUtilidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, 80, -1));

        lblCapYPas2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCapYPas2.setForeground(new java.awt.Color(255, 255, 255));
        lblCapYPas2.setText("-------------");
        BG.add(lblCapYPas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 610, -1, -1));

        lblArrendamiento7.setForeground(new java.awt.Color(255, 255, 255));
        lblArrendamiento7.setText("0.00");
        BG.add(lblArrendamiento7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 460, -1, -1));

        lblSignoI8.setForeground(new java.awt.Color(255, 255, 255));
        lblSignoI8.setText("$");
        BG.add(lblSignoI8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 130, -1, -1));

        lblTotalPasivo6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivo6.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivo6.setText("-------------");
        BG.add(lblTotalPasivo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, -1, -1));

        lblCuentas2.setForeground(new java.awt.Color(255, 255, 255));
        lblCuentas2.setText("0.00");
        BG.add(lblCuentas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));

        lblCapital4.setForeground(new java.awt.Color(255, 255, 255));
        lblCapital4.setText("0.00");
        BG.add(lblCapital4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, -1, -1));

        logo.setText("Logo");
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        BG.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 51, 51));

        jLabel333.setForeground(new java.awt.Color(255, 255, 255));
        jLabel333.setText("$");
        BG.add(jLabel333, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 460, -1, -1));

        jLabel285.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel285.setForeground(new java.awt.Color(255, 255, 255));
        jLabel285.setText("$");
        BG.add(jLabel285, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));

        lblCuentas4.setForeground(new java.awt.Color(255, 255, 255));
        lblCuentas4.setText("0.00");
        BG.add(lblCuentas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, -1, -1));

        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("$");
        BG.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, -1, -1));

        lblTotalPasivo5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivo5.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivo5.setText("-------------");
        BG.add(lblTotalPasivo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, -1, -1));

        lblCaja2.setForeground(new java.awt.Color(255, 255, 255));
        lblCaja2.setText("0.00");
        BG.add(lblCaja2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel363.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel363.setForeground(new java.awt.Color(255, 255, 255));
        jLabel363.setText("$");
        BG.add(jLabel363, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 610, -1, -1));

        lblCaja7.setForeground(new java.awt.Color(255, 255, 255));
        lblCaja7.setText("0.00");
        BG.add(lblCaja7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, -1, -1));

        lblMobiliario5.setForeground(new java.awt.Color(255, 255, 255));
        lblMobiliario5.setText("0.00");
        BG.add(lblMobiliario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("$");
        BG.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 10, -1));

        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("$");
        BG.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, -1, -1));

        btnGraficas.setBackground(new java.awt.Color(0, 102, 51));
        btnGraficas.setForeground(new java.awt.Color(255, 255, 255));
        btnGraficas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/graficas.png"))); // NOI18N
        btnGraficas.setText("GRÁFICAS");
        btnGraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficasActionPerformed(evt);
            }
        });
        BG.add(btnGraficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 640, -1, -1));

        lblSignoI5.setForeground(new java.awt.Color(255, 255, 255));
        lblSignoI5.setText("$");
        BG.add(lblSignoI5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, -1, -1));

        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("$");
        BG.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        lblTotalPasivoNoCir3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoNoCir3.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoNoCir3.setText("0.00");
        BG.add(lblTotalPasivoNoCir3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, -1));

        jLabel299.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel299.setForeground(new java.awt.Color(255, 255, 255));
        jLabel299.setText("$");
        BG.add(jLabel299, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, -1, -1));

        jLabel379.setForeground(new java.awt.Color(255, 255, 255));
        jLabel379.setText("$");
        BG.add(jLabel379, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 270, -1, -1));

        jLabel370.setForeground(new java.awt.Color(255, 255, 255));
        jLabel370.setText("$");
        BG.add(jLabel370, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 290, -1, -1));

        lblTotalPasivoNoCir5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoNoCir5.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoNoCir5.setText("-------------");
        BG.add(lblTotalPasivoNoCir5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, -1, -1));

        lblBancos10.setForeground(new java.awt.Color(255, 255, 255));
        lblBancos10.setText("0.00");
        BG.add(lblBancos10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 110, -1, -1));

        lblSignoI.setForeground(new java.awt.Color(255, 255, 255));
        lblSignoI.setText("$");
        BG.add(lblSignoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 10, -1));

        lblCuentas10.setForeground(new java.awt.Color(255, 255, 255));
        lblCuentas10.setText("0.00");
        BG.add(lblCuentas10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 400, -1, -1));

        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("$");
        BG.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 10, -1));

        jLabel368.setForeground(new java.awt.Color(255, 255, 255));
        jLabel368.setText("$");
        BG.add(jLabel368, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 250, -1, -1));

        lblTotalPasivoCir10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoCir10.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoCir10.setText("-------------");
        BG.add(lblTotalPasivoCir10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 420, -1, -1));

        jLabel339.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel339.setForeground(new java.awt.Color(255, 255, 255));
        jLabel339.setText("$");
        BG.add(jLabel339, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 310, -1, -1));

        lblCuentas9.setForeground(new java.awt.Color(255, 255, 255));
        lblCuentas9.setText("0.00");
        BG.add(lblCuentas9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 400, -1, -1));

        lblArrendamiento6.setForeground(new java.awt.Color(255, 255, 255));
        lblArrendamiento6.setText("0.00");
        BG.add(lblArrendamiento6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, -1, -1));

        lblTotalPasivoCir3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoCir3.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoCir3.setText("0.00");
        BG.add(lblTotalPasivoCir3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        jLabel362.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel362.setForeground(new java.awt.Color(255, 255, 255));
        jLabel362.setText("$");
        BG.add(jLabel362, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 500, -1, -1));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        BG.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 640, -1, -1));

        lblCapYPas8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCapYPas8.setForeground(new java.awt.Color(255, 255, 255));
        lblCapYPas8.setText("-------------");
        BG.add(lblCapYPas8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 610, -1, -1));

        lblClientes4.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes4.setText("0.00");
        BG.add(lblClientes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Total");
        BG.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 102, -1));

        jLabel392.setForeground(new java.awt.Color(255, 255, 255));
        jLabel392.setText("$");
        BG.add(jLabel392, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 150, -1, -1));

        lblTotalPasivoNoCir4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivoNoCir4.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivoNoCir4.setText("-------------");
        BG.add(lblTotalPasivoNoCir4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, -1, -1));

        lblTransporte8.setForeground(new java.awt.Color(255, 255, 255));
        lblTransporte8.setText("0.00");
        BG.add(lblTransporte8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, -1, -1));

        lblTransporte10.setForeground(new java.awt.Color(255, 255, 255));
        lblTransporte10.setText("0.00");
        BG.add(lblTransporte10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 250, -1, -1));

        jLabel241.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel241.setForeground(new java.awt.Color(255, 255, 255));
        jLabel241.setText("APLICACIÓN");
        BG.add(jLabel241, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, -1));

        lblTerreno2.setForeground(new java.awt.Color(255, 255, 255));
        lblTerreno2.setText("0.00");
        BG.add(lblTerreno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        jLabel282.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel282.setForeground(new java.awt.Color(255, 255, 255));
        jLabel282.setText("$");
        BG.add(jLabel282, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, -1, -1));

        lblProveedores10.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores10.setText("0.00");
        BG.add(lblProveedores10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 380, -1, -1));

        jLabel332.setForeground(new java.awt.Color(255, 255, 255));
        jLabel332.setText("$");
        BG.add(jLabel332, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, -1, -1));

        lblTotalPasivo8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPasivo8.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPasivo8.setText("-------------");
        BG.add(lblTotalPasivo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 500, -1, -1));

        jLabel106.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setText("%");
        BG.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("+P +CC -A");
        BG.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, -1, -1));

        lblTransporte3.setForeground(new java.awt.Color(255, 255, 255));
        lblTransporte3.setText("0.00");
        BG.add(lblTransporte3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Activo No Circulante");
        BG.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel360.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel360.setForeground(new java.awt.Color(255, 255, 255));
        jLabel360.setText("$");
        BG.add(jLabel360, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 420, -1, -1));

        jLabel287.setForeground(new java.awt.Color(255, 255, 255));
        jLabel287.setText("$");
        BG.add(jLabel287, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, -1));

        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("$");
        BG.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, -1, -1));

        jLabel314.setForeground(new java.awt.Color(255, 255, 255));
        jLabel314.setText("$");
        BG.add(jLabel314, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, -1, -1));

        jLabel383.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel383.setForeground(new java.awt.Color(255, 255, 255));
        jLabel383.setText("$");
        BG.add(jLabel383, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 330, -1, -1));

        jLabel352.setForeground(new java.awt.Color(255, 255, 255));
        jLabel352.setText("$");
        BG.add(jLabel352, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 400, -1, -1));

        jLabel309.setForeground(new java.awt.Color(255, 255, 255));
        jLabel309.setText("$");
        BG.add(jLabel309, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, -1, -1));

        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setText("%");
        BG.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, -1, -1));

        lblArrendamiento9.setForeground(new java.awt.Color(255, 255, 255));
        lblArrendamiento9.setText("0.00");
        BG.add(lblArrendamiento9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 460, -1, -1));

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("$");
        BG.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 10, -1));

        jLabel388.setForeground(new java.awt.Color(255, 255, 255));
        jLabel388.setText("$");
        BG.add(jLabel388, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 570, -1, -1));

        lblCapital8.setForeground(new java.awt.Color(255, 255, 255));
        lblCapital8.setText("0.00");
        BG.add(lblCapital8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 550, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bancos");
        BG.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, -1));

        jLabel378.setForeground(new java.awt.Color(255, 255, 255));
        jLabel378.setText("$");
        BG.add(jLabel378, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 380, -1, -1));

        lblMaquinaria8.setForeground(new java.awt.Color(255, 255, 255));
        lblMaquinaria8.setText("0.00");
        BG.add(lblMaquinaria8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 230, -1, -1));

        jLabel345.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel345.setForeground(new java.awt.Color(255, 255, 255));
        jLabel345.setText("$");
        BG.add(jLabel345, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 330, -1, -1));

        tituloTxt.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        tituloTxt.setForeground(new java.awt.Color(255, 255, 255));
        tituloTxt.setText("Aumentos y disminuciones");
        BG.add(tituloTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        empresaTxt.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        empresaTxt.setForeground(new java.awt.Color(255, 255, 255));
        empresaTxt.setText("TEQUILERA LA CARIÑOSA S.A DE C.V");
        BG.add(empresaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1335, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularTabalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularTabalaActionPerformed
        compararValores();
    }//GEN-LAST:event_btnCalcularTabalaActionPerformed

    private void btnGraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficasActionPerformed
        this.dispose();
        new Graficas().setVisible(true);
    }//GEN-LAST:event_btnGraficasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            //2021
            lblCaja1.setText(cuentasFijo.getCaja()+"");
            lblBancos1.setText(cuentasFijo.getBanco()+"");
            lblClientes1.setText(cuentasFijo.getClientes()+"");
            lblInventario1.setText(cuentasFijo.getInventario()+"");
            lblTotalActivoCir1.setText(cuentasFijo.getTotActCirc()+"");
            lblMobiliario1.setText(cuentasFijo.getMobiliario()+"");
            lblMaquinaria1.setText(cuentasFijo.getMaquinaria()+"");
            lblTransporte1.setText(cuentasFijo.getTransporte()+"");
            lblTerreno1.setText(cuentasFijo.getTerreno()+"");
            lblComputo1.setText(cuentasFijo.getEquipoComp()+"");
            lblTotalActivoNoCir1.setText(cuentasFijo.getTotActNoCirc()+"");
            lblTotalActivo1.setText(cuentasFijo.getTotAct()+"");
            lblProveedores1.setText(cuentasFijo.getProveedores()+"");
            lblCuentas1.setText(cuentasFijo.getCtasPPagar()+"");
            lblTotalPasivoCir1.setText(cuentasFijo.getTotPasCirc()+"");
            lblArrendamiento1.setText(cuentasFijo.getArrendamiento()+"");
            lblTotalPasivoNoCir1.setText(cuentasFijo.getTotPasNoCirc()+"");
            lblTotalPasivo1.setText(cuentasFijo.getTotPas()+"");
            lblCapital1.setText(cuentasFijo.getCapSocial()+"");
            lblUtilidad1.setText(cuentasFijo.getUtilNet()+"");
            lblTotalCapital1.setText(cuentasFijo.getTotPat()+"");
            lblCapYPas1.setText(cuentasFijo.getTotPasMPat()+"");
            //2022
            lblCaja2.setText(cuentas.getCaja()+"");
            lblBancos2.setText(cuentas.getBanco()+"");
            lblClientes2.setText(cuentas.getClientes()+"");
            lblInventario2.setText(cuentas.getInventario()+"");
            lblTotalActivoCir2.setText(cuentas.getTotActCirc()+"");
            lblMobiliario2.setText(cuentas.getMobiliario()+"");
            lblMaquinaria2.setText(cuentas.getMaquinaria()+"");
            lblTransporte2.setText(cuentas.getTransporte()+"");
            lblTerreno2.setText(cuentas.getTerreno()+"");
            lblComputo2.setText(cuentas.getEquipoComp()+"");
            lblTotalActivoNoCir2.setText(cuentas.getTotActNoCirc()+"");
            lblTotalActivo2.setText(cuentas.getTotAct()+"");
            lblProveedores2.setText(cuentas.getProveedores()+"");
            lblCuentas2.setText(cuentas.getCtasPPagar()+"");
            lblTotalPasivoCir2.setText(cuentas.getTotPasCirc()+"");
            lblArrendamiento2.setText(cuentas.getArrendamiento()+"");
            lblTotalPasivoNoCir2.setText(cuentas.getTotPasNoCirc()+"");
            lblTotalPasivo2.setText(cuentas.getTotPas()+"");
            lblCapital2.setText(cuentas.getCapSocial()+"");
            lblUtilidad2.setText(cuentas.getUtilNet()+"");
            lblTotalCapital2.setText(cuentas.getTotPat()+"");
            lblCapYPas2.setText(cuentas.getTotPasMPat()+"");
            //porcentajes
            calcPortcentajes();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_logoMouseClicked

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
            java.util.logging.Logger.getLogger(Aumentos_Y_Disminuciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aumentos_Y_Disminuciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aumentos_Y_Disminuciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aumentos_Y_Disminuciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aumentos_Y_Disminuciones().setVisible(true);
            }
        });
    }
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton btnCalcularTabala;
    private javax.swing.JButton btnGraficas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel empresaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
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
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel307;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel310;
    private javax.swing.JLabel jLabel311;
    private javax.swing.JLabel jLabel312;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel316;
    private javax.swing.JLabel jLabel317;
    private javax.swing.JLabel jLabel318;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel322;
    private javax.swing.JLabel jLabel323;
    private javax.swing.JLabel jLabel324;
    private javax.swing.JLabel jLabel325;
    private javax.swing.JLabel jLabel326;
    private javax.swing.JLabel jLabel327;
    private javax.swing.JLabel jLabel328;
    private javax.swing.JLabel jLabel329;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel330;
    private javax.swing.JLabel jLabel331;
    private javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel333;
    private javax.swing.JLabel jLabel334;
    private javax.swing.JLabel jLabel335;
    private javax.swing.JLabel jLabel336;
    private javax.swing.JLabel jLabel337;
    private javax.swing.JLabel jLabel338;
    private javax.swing.JLabel jLabel339;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel340;
    private javax.swing.JLabel jLabel341;
    private javax.swing.JLabel jLabel342;
    private javax.swing.JLabel jLabel343;
    private javax.swing.JLabel jLabel344;
    private javax.swing.JLabel jLabel345;
    private javax.swing.JLabel jLabel346;
    private javax.swing.JLabel jLabel347;
    private javax.swing.JLabel jLabel348;
    private javax.swing.JLabel jLabel349;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel350;
    private javax.swing.JLabel jLabel351;
    private javax.swing.JLabel jLabel352;
    private javax.swing.JLabel jLabel353;
    private javax.swing.JLabel jLabel354;
    private javax.swing.JLabel jLabel355;
    private javax.swing.JLabel jLabel356;
    private javax.swing.JLabel jLabel357;
    private javax.swing.JLabel jLabel358;
    private javax.swing.JLabel jLabel359;
    private javax.swing.JLabel jLabel360;
    private javax.swing.JLabel jLabel361;
    private javax.swing.JLabel jLabel362;
    private javax.swing.JLabel jLabel363;
    private javax.swing.JLabel jLabel364;
    private javax.swing.JLabel jLabel365;
    private javax.swing.JLabel jLabel366;
    private javax.swing.JLabel jLabel367;
    private javax.swing.JLabel jLabel368;
    private javax.swing.JLabel jLabel369;
    private javax.swing.JLabel jLabel370;
    private javax.swing.JLabel jLabel371;
    private javax.swing.JLabel jLabel372;
    private javax.swing.JLabel jLabel373;
    private javax.swing.JLabel jLabel374;
    private javax.swing.JLabel jLabel375;
    private javax.swing.JLabel jLabel376;
    private javax.swing.JLabel jLabel377;
    private javax.swing.JLabel jLabel378;
    private javax.swing.JLabel jLabel379;
    private javax.swing.JLabel jLabel380;
    private javax.swing.JLabel jLabel381;
    private javax.swing.JLabel jLabel382;
    private javax.swing.JLabel jLabel383;
    private javax.swing.JLabel jLabel384;
    private javax.swing.JLabel jLabel385;
    private javax.swing.JLabel jLabel386;
    private javax.swing.JLabel jLabel387;
    private javax.swing.JLabel jLabel388;
    private javax.swing.JLabel jLabel389;
    private javax.swing.JLabel jLabel390;
    private javax.swing.JLabel jLabel391;
    private javax.swing.JLabel jLabel392;
    private javax.swing.JLabel jLabel393;
    private javax.swing.JLabel jLabel394;
    private javax.swing.JLabel jLabel395;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel lblArrendamiento1;
    private javax.swing.JLabel lblArrendamiento10;
    private javax.swing.JLabel lblArrendamiento2;
    private javax.swing.JLabel lblArrendamiento3;
    private javax.swing.JLabel lblArrendamiento4;
    private javax.swing.JLabel lblArrendamiento5;
    private javax.swing.JLabel lblArrendamiento6;
    private javax.swing.JLabel lblArrendamiento7;
    private javax.swing.JLabel lblArrendamiento8;
    private javax.swing.JLabel lblArrendamiento9;
    private javax.swing.JLabel lblBancos1;
    private javax.swing.JLabel lblBancos10;
    private javax.swing.JLabel lblBancos2;
    private javax.swing.JLabel lblBancos3;
    private javax.swing.JLabel lblBancos4;
    private javax.swing.JLabel lblBancos5;
    private javax.swing.JLabel lblBancos6;
    private javax.swing.JLabel lblBancos7;
    private javax.swing.JLabel lblBancos8;
    private javax.swing.JLabel lblBancos9;
    private javax.swing.JLabel lblCaja1;
    private javax.swing.JLabel lblCaja10;
    private javax.swing.JLabel lblCaja2;
    private javax.swing.JLabel lblCaja3;
    private javax.swing.JLabel lblCaja4;
    private javax.swing.JLabel lblCaja5;
    private javax.swing.JLabel lblCaja6;
    private javax.swing.JLabel lblCaja7;
    private javax.swing.JLabel lblCaja8;
    private javax.swing.JLabel lblCaja9;
    private javax.swing.JLabel lblCapYPas1;
    private javax.swing.JLabel lblCapYPas10;
    private javax.swing.JLabel lblCapYPas2;
    private javax.swing.JLabel lblCapYPas3;
    private javax.swing.JLabel lblCapYPas4;
    private javax.swing.JLabel lblCapYPas5;
    private javax.swing.JLabel lblCapYPas6;
    private javax.swing.JLabel lblCapYPas7;
    private javax.swing.JLabel lblCapYPas8;
    private javax.swing.JLabel lblCapYPas9;
    private javax.swing.JLabel lblCapital1;
    private javax.swing.JLabel lblCapital10;
    private javax.swing.JLabel lblCapital2;
    private javax.swing.JLabel lblCapital3;
    private javax.swing.JLabel lblCapital4;
    private javax.swing.JLabel lblCapital5;
    private javax.swing.JLabel lblCapital6;
    private javax.swing.JLabel lblCapital7;
    private javax.swing.JLabel lblCapital8;
    private javax.swing.JLabel lblCapital9;
    private javax.swing.JLabel lblClientes1;
    private javax.swing.JLabel lblClientes10;
    private javax.swing.JLabel lblClientes2;
    private javax.swing.JLabel lblClientes3;
    private javax.swing.JLabel lblClientes4;
    private javax.swing.JLabel lblClientes5;
    private javax.swing.JLabel lblClientes6;
    private javax.swing.JLabel lblClientes7;
    private javax.swing.JLabel lblClientes8;
    private javax.swing.JLabel lblClientes9;
    private javax.swing.JLabel lblComputo1;
    private javax.swing.JLabel lblComputo10;
    private javax.swing.JLabel lblComputo2;
    private javax.swing.JLabel lblComputo3;
    private javax.swing.JLabel lblComputo4;
    private javax.swing.JLabel lblComputo5;
    private javax.swing.JLabel lblComputo6;
    private javax.swing.JLabel lblComputo7;
    private javax.swing.JLabel lblComputo8;
    private javax.swing.JLabel lblComputo9;
    private javax.swing.JLabel lblCuentas1;
    private javax.swing.JLabel lblCuentas10;
    private javax.swing.JLabel lblCuentas2;
    private javax.swing.JLabel lblCuentas3;
    private javax.swing.JLabel lblCuentas4;
    private javax.swing.JLabel lblCuentas5;
    private javax.swing.JLabel lblCuentas6;
    private javax.swing.JLabel lblCuentas7;
    private javax.swing.JLabel lblCuentas8;
    private javax.swing.JLabel lblCuentas9;
    private javax.swing.JLabel lblInventario1;
    private javax.swing.JLabel lblInventario10;
    private javax.swing.JLabel lblInventario2;
    private javax.swing.JLabel lblInventario3;
    private javax.swing.JLabel lblInventario4;
    private javax.swing.JLabel lblInventario5;
    private javax.swing.JLabel lblInventario6;
    private javax.swing.JLabel lblInventario7;
    private javax.swing.JLabel lblInventario8;
    private javax.swing.JLabel lblInventario9;
    private javax.swing.JLabel lblMaquinaria1;
    private javax.swing.JLabel lblMaquinaria10;
    private javax.swing.JLabel lblMaquinaria2;
    private javax.swing.JLabel lblMaquinaria3;
    private javax.swing.JLabel lblMaquinaria4;
    private javax.swing.JLabel lblMaquinaria5;
    private javax.swing.JLabel lblMaquinaria6;
    private javax.swing.JLabel lblMaquinaria7;
    private javax.swing.JLabel lblMaquinaria8;
    private javax.swing.JLabel lblMaquinaria9;
    private javax.swing.JLabel lblMobiliario1;
    private javax.swing.JLabel lblMobiliario10;
    private javax.swing.JLabel lblMobiliario2;
    private javax.swing.JLabel lblMobiliario3;
    private javax.swing.JLabel lblMobiliario4;
    private javax.swing.JLabel lblMobiliario5;
    private javax.swing.JLabel lblMobiliario6;
    private javax.swing.JLabel lblMobiliario7;
    private javax.swing.JLabel lblMobiliario8;
    private javax.swing.JLabel lblMobiliario9;
    private javax.swing.JLabel lblPorcentaje;
    private javax.swing.JLabel lblProveedores1;
    private javax.swing.JLabel lblProveedores10;
    private javax.swing.JLabel lblProveedores2;
    private javax.swing.JLabel lblProveedores3;
    private javax.swing.JLabel lblProveedores4;
    private javax.swing.JLabel lblProveedores5;
    private javax.swing.JLabel lblProveedores6;
    private javax.swing.JLabel lblProveedores7;
    private javax.swing.JLabel lblProveedores8;
    private javax.swing.JLabel lblProveedores9;
    private javax.swing.JLabel lblSigno;
    private javax.swing.JLabel lblSigno1;
    private javax.swing.JLabel lblSigno2;
    private javax.swing.JLabel lblSigno3;
    private javax.swing.JLabel lblSigno4;
    private javax.swing.JLabel lblSigno5;
    private javax.swing.JLabel lblSigno6;
    private javax.swing.JLabel lblSigno7;
    private javax.swing.JLabel lblSigno8;
    private javax.swing.JLabel lblSignoI;
    private javax.swing.JLabel lblSignoI1;
    private javax.swing.JLabel lblSignoI2;
    private javax.swing.JLabel lblSignoI3;
    private javax.swing.JLabel lblSignoI4;
    private javax.swing.JLabel lblSignoI5;
    private javax.swing.JLabel lblSignoI6;
    private javax.swing.JLabel lblSignoI7;
    private javax.swing.JLabel lblSignoI8;
    private javax.swing.JLabel lblTerreno1;
    private javax.swing.JLabel lblTerreno10;
    private javax.swing.JLabel lblTerreno2;
    private javax.swing.JLabel lblTerreno3;
    private javax.swing.JLabel lblTerreno4;
    private javax.swing.JLabel lblTerreno5;
    private javax.swing.JLabel lblTerreno6;
    private javax.swing.JLabel lblTerreno7;
    private javax.swing.JLabel lblTerreno8;
    private javax.swing.JLabel lblTerreno9;
    private javax.swing.JLabel lblTotalActivo1;
    private javax.swing.JLabel lblTotalActivo10;
    private javax.swing.JLabel lblTotalActivo2;
    private javax.swing.JLabel lblTotalActivo3;
    private javax.swing.JLabel lblTotalActivo4;
    private javax.swing.JLabel lblTotalActivo5;
    private javax.swing.JLabel lblTotalActivo6;
    private javax.swing.JLabel lblTotalActivo7;
    private javax.swing.JLabel lblTotalActivo8;
    private javax.swing.JLabel lblTotalActivo9;
    private javax.swing.JLabel lblTotalActivoCir1;
    private javax.swing.JLabel lblTotalActivoCir10;
    private javax.swing.JLabel lblTotalActivoCir2;
    private javax.swing.JLabel lblTotalActivoCir3;
    private javax.swing.JLabel lblTotalActivoCir4;
    private javax.swing.JLabel lblTotalActivoCir5;
    private javax.swing.JLabel lblTotalActivoCir6;
    private javax.swing.JLabel lblTotalActivoCir7;
    private javax.swing.JLabel lblTotalActivoCir8;
    private javax.swing.JLabel lblTotalActivoCir9;
    private javax.swing.JLabel lblTotalActivoNoCir1;
    private javax.swing.JLabel lblTotalActivoNoCir10;
    private javax.swing.JLabel lblTotalActivoNoCir2;
    private javax.swing.JLabel lblTotalActivoNoCir3;
    private javax.swing.JLabel lblTotalActivoNoCir4;
    private javax.swing.JLabel lblTotalActivoNoCir5;
    private javax.swing.JLabel lblTotalActivoNoCir6;
    private javax.swing.JLabel lblTotalActivoNoCir7;
    private javax.swing.JLabel lblTotalActivoNoCir8;
    private javax.swing.JLabel lblTotalActivoNoCir9;
    private javax.swing.JLabel lblTotalCapital1;
    private javax.swing.JLabel lblTotalCapital10;
    private javax.swing.JLabel lblTotalCapital2;
    private javax.swing.JLabel lblTotalCapital3;
    private javax.swing.JLabel lblTotalCapital4;
    private javax.swing.JLabel lblTotalCapital5;
    private javax.swing.JLabel lblTotalCapital6;
    private javax.swing.JLabel lblTotalCapital7;
    private javax.swing.JLabel lblTotalCapital8;
    private javax.swing.JLabel lblTotalCapital9;
    private javax.swing.JLabel lblTotalPasivo1;
    private javax.swing.JLabel lblTotalPasivo10;
    private javax.swing.JLabel lblTotalPasivo2;
    private javax.swing.JLabel lblTotalPasivo3;
    private javax.swing.JLabel lblTotalPasivo4;
    private javax.swing.JLabel lblTotalPasivo5;
    private javax.swing.JLabel lblTotalPasivo6;
    private javax.swing.JLabel lblTotalPasivo7;
    private javax.swing.JLabel lblTotalPasivo8;
    private javax.swing.JLabel lblTotalPasivo9;
    private javax.swing.JLabel lblTotalPasivoCir1;
    private javax.swing.JLabel lblTotalPasivoCir10;
    private javax.swing.JLabel lblTotalPasivoCir2;
    private javax.swing.JLabel lblTotalPasivoCir3;
    private javax.swing.JLabel lblTotalPasivoCir4;
    private javax.swing.JLabel lblTotalPasivoCir5;
    private javax.swing.JLabel lblTotalPasivoCir6;
    private javax.swing.JLabel lblTotalPasivoCir7;
    private javax.swing.JLabel lblTotalPasivoCir8;
    private javax.swing.JLabel lblTotalPasivoCir9;
    private javax.swing.JLabel lblTotalPasivoNoCir1;
    private javax.swing.JLabel lblTotalPasivoNoCir10;
    private javax.swing.JLabel lblTotalPasivoNoCir2;
    private javax.swing.JLabel lblTotalPasivoNoCir3;
    private javax.swing.JLabel lblTotalPasivoNoCir4;
    private javax.swing.JLabel lblTotalPasivoNoCir5;
    private javax.swing.JLabel lblTotalPasivoNoCir6;
    private javax.swing.JLabel lblTotalPasivoNoCir7;
    private javax.swing.JLabel lblTotalPasivoNoCir8;
    private javax.swing.JLabel lblTotalPasivoNoCir9;
    private javax.swing.JLabel lblTransporte1;
    private javax.swing.JLabel lblTransporte10;
    private javax.swing.JLabel lblTransporte2;
    private javax.swing.JLabel lblTransporte3;
    private javax.swing.JLabel lblTransporte4;
    private javax.swing.JLabel lblTransporte5;
    private javax.swing.JLabel lblTransporte6;
    private javax.swing.JLabel lblTransporte7;
    private javax.swing.JLabel lblTransporte8;
    private javax.swing.JLabel lblTransporte9;
    private javax.swing.JLabel lblUtilidad1;
    private javax.swing.JLabel lblUtilidad10;
    private javax.swing.JLabel lblUtilidad2;
    private javax.swing.JLabel lblUtilidad3;
    private javax.swing.JLabel lblUtilidad4;
    private javax.swing.JLabel lblUtilidad5;
    private javax.swing.JLabel lblUtilidad6;
    private javax.swing.JLabel lblUtilidad7;
    private javax.swing.JLabel lblUtilidad8;
    private javax.swing.JLabel lblUtilidad9;
    private javax.swing.JLabel lblporcen;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel tituloTxt;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
