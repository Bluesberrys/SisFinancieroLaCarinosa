package data;

/**
 * @author maxim
 */
public class Cuentas {
    //Cuentas - activos
    //activo circulante
    private float caja, banco, clientes, inventario, totActCirc;
    //activo no circulante
    private float mobiliario, maquinaria, transporte, terreno, equipoComp, totActNoCirc;
    //pasivos
    //pasivo circulante
    private float proveedores, ctasPPagar, totPasCirc;
    //pasivo no circulante
    private float arrendamiento, totPasNoCirc;
    //patrimonio
    private float capSocial, utilNet, totPat;
    //totales
    private float totAct, totPas, totPasMPat;
    
    //constructor
    public Cuentas() {
    }

    public Cuentas(float caja, float banco, float clientes, float inventario, float mobiliario, float maquinaria, float transporte, float terreno, float equipoComp, float proveedores, float ctasPPagar, float arrendamiento, float capSocial, float utilNet) {
        this.caja = caja;
        this.banco = banco;
        this.clientes = clientes;
        this.inventario = inventario;
        this.mobiliario = mobiliario;
        this.maquinaria = maquinaria;
        this.transporte = transporte;
        this.terreno = terreno;
        this.equipoComp = equipoComp;
        this.proveedores = proveedores;
        this.ctasPPagar = ctasPPagar;
        this.arrendamiento = arrendamiento;
        this.capSocial = capSocial;
        this.utilNet = utilNet;
        calcTotalActivos();
        calcTotalPasivosMPatrimonio();
        /*System.out.println("act circ: " + totActCirc);
        System.out.println("act no circ: " + totActNoCirc);
        System.out.println("acts: " + totAct);
        System.out.println("pas circ: " + totPasCirc);
        System.out.println("pas no circ: " + totPasNoCirc);
        System.out.println("pasvs: " + totPas);
        System.out.println("pat: " + totPat);
        System.out.println("pas + pat: " + totPasMPat);*/
    }

    public void setTotActCirc(float totActCirc) {
        this.totActCirc = totActCirc;
    }

    public void setTotActNoCirc(float totActNoCirc) {
        this.totActNoCirc = totActNoCirc;
    }

    public void setTotPasCirc(float totPasCirc) {
        this.totPasCirc = totPasCirc;
    }

    public void setTotPasNoCirc(float totPasNoCirc) {
        this.totPasNoCirc = totPasNoCirc;
    }

    public void setTotPat(float totPat) {
        this.totPat = totPat;
    }

    public void setTotAct(float totAct) {
        this.totAct = totAct;
    }

    public void setTotPas(float totPas) {
        this.totPas = totPas;
    }

    public void setTotPasMPat(float totPasMPat) {
        this.totPasMPat = totPasMPat;
    }

    
    //setters
    public void setCaja(float caja) {
        this.caja = caja;
    }

    public void setBanco(float banco) {
        this.banco = banco;
    }

    public void setClientes(float clientes) {
        this.clientes = clientes;
    }

    public void setInventario(float inventario) {
        this.inventario = inventario;
    }

    public void setMobiliario(float mobiliario) {
        this.mobiliario = mobiliario;
    }

    public void setMaquinaria(float maquinaria) {
        this.maquinaria = maquinaria;
    }

    public void setTransporte(float transporte) {
        this.transporte = transporte;
    }

    public void setTerreno(float terreno) {
        this.terreno = terreno;
    }

    public void setEquipoComp(float equipoComp) {
        this.equipoComp = equipoComp;
    }

    public void setProveedores(float proveedores) {
        this.proveedores = proveedores;
    }

    public void setCtasPPagar(float ctasPPagar) {
        this.ctasPPagar = ctasPPagar;
    }

    public void setArrendamiento(float arrendamiento) {
        this.arrendamiento = arrendamiento;
    }

    public void setCapSocial(float capSocial) {
        this.capSocial = capSocial;
    }

    public void setUtilNet(float utilNet) {
        this.utilNet = utilNet;
    }
    //getters
    public float getCaja() {
        return caja;
    }

    public float getBanco() {
        return banco;
    }

    public float getClientes() {
        return clientes;
    }

    public float getInventario() {
        return inventario;
    }

    public float getTotActCirc() {
        calcTotalActivoCirculante();
        return totActCirc;
    }

    public float getMobiliario() {
        return mobiliario;
    }

    public float getMaquinaria() {
        return maquinaria;
    }

    public float getTransporte() {
        return transporte;
    }

    public float getTerreno() {
        return terreno;
    }

    public float getEquipoComp() {
        return equipoComp;
    }

    public float getTotActNoCirc() {
        calcTotalActivoNoCirculante();
        return totActNoCirc;
    }

    public float getProveedores() {
        return proveedores;
    }

    public float getCtasPPagar() {
        return ctasPPagar;
    }

    public float getTotPasCirc() {
        calcTotalPasivoCirculante();
        return totPasCirc;
    }

    public float getArrendamiento() {
        return arrendamiento;
    }

    public float getTotPasNoCirc() {
        calcTotalPasivoNoCirculante();
        return totPasNoCirc;
    }

    public float getCapSocial() {
        return capSocial;
    }

    public float getUtilNet() {
        return utilNet;
    }

    public float getTotPat() {
        calcTotalPatrimonio();
        return totPat;
    }

    public float getTotAct() {
        calcTotalActivos();
        return totAct;
    }

    public float getTotPas() {
        calcTotalPasivos();
        return totPas;
    }
    
    public float getTotPasMPat() {
        calcTotalPasivosMPatrimonio();
        return totPasMPat;
    }
    
    //funciones calculo totales
    private void calcTotalActivoCirculante (){
        this.totActCirc = caja + banco + clientes + inventario;
    }
    private void calcTotalActivoNoCirculante (){
        this.totActNoCirc = mobiliario + maquinaria + transporte + terreno + equipoComp;
    }
    private void calcTotalPasivoCirculante (){
        this.totPasCirc = proveedores + ctasPPagar;
    }
    private void calcTotalPasivoNoCirculante (){
        this.totPasNoCirc = arrendamiento;
    }
    private void calcTotalPatrimonio (){
        this.totPat = capSocial + utilNet;
    }
    private void calcTotalActivos (){
        calcTotalActivoNoCirculante();
        calcTotalActivoCirculante();
        this.totAct = totActCirc + totActNoCirc;
    }
    private void calcTotalPasivos (){
        calcTotalPasivoCirculante();
        calcTotalPasivoNoCirculante();
        this.totPas = totPasCirc + totPasNoCirc;
    }
    private void calcTotalPasivosMPatrimonio (){
        calcTotalPasivos();
        calcTotalPatrimonio();
        this.totPasMPat = totPas + totPat;
    }
}
