package data;

/**
 * @author maxim
 */
public class Resultados {
    private float ventas,costVentas,gastosOp,gastosFinc,otrosGastos,otrosIngresos,impuestos;

    public Resultados() {
    }

    public Resultados(float ventas, float costVentas, float gastosOp, float gastosFinc, float otrosGastos, float otrosIngresos, float impuestos) {
        this.ventas = ventas;
        this.costVentas = costVentas;
        this.gastosOp = gastosOp;
        this.gastosFinc = gastosFinc;
        this.otrosGastos = otrosGastos;
        this.otrosIngresos = otrosIngresos;
        this.impuestos = impuestos;
    }

    public float getVentas() {
        return ventas;
    }

    public float getCostVentas() {
        return costVentas;
    }

    public float getGastosOp() {
        return gastosOp;
    }

    public float getGastosFinc() {
        return gastosFinc;
    }

    public float getOtrosGastos() {
        return otrosGastos;
    }

    public float getOtrosIngresos() {
        return otrosIngresos;
    }

    public float getImpuestos() {
        return impuestos;
    }

    public void setVentas(float ventas) {
        this.ventas = ventas;
    }

    public void setCostVentas(float costVentas) {
        this.costVentas = costVentas;
    }

    public void setGastosOp(float gastosOp) {
        this.gastosOp = gastosOp;
    }

    public void setGastosFinc(float gastosFinc) {
        this.gastosFinc = gastosFinc;
    }

    public void setOtrosGastos(float otrosGastos) {
        this.otrosGastos = otrosGastos;
    }

    public void setOtrosIngresos(float otrosIngresos) {
        this.otrosIngresos = otrosIngresos;
    }

    public void setImpuestos(float impuestos) {
        this.impuestos = impuestos;
    }
    
    
}
