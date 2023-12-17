package data;

/**
 * @author maxim
 */
public class EstaticCuentas {
    private static Cuentas cuentasFijo = new Cuentas(//Datos periodo anterior
            //activos
            7500, 1359000, 60000, 100000,
            71000, 500000, 1100000, 1200000, 101000,
            //pasivos
            50000, 15000,
            90000,
            //patrimonio
            3600000, 43000);
    //private static Cuentas cuentasDyn;
    private static Cuentas cuentasDyn = new Cuentas(//Datos de prueba
            //activos
            6200, 1520000, 72000, 150000,
            75000, 500000, 1100000, 1200000, 110000,
            //pasivos
            62000, 13000,
            98000,
            //patrimonio
            3800000, 45000);
    private static PorcentajesCuentas porcentajeCuentas;
    //private static Resultados valoresResultados;
    private static Resultados valoresResultados = new Resultados(//datos de prueba
            930000,
            380000,
            510000,
            42000,
            12000,
            340000,
            120000
    );
    
    public static Cuentas getCuentasFijo() {
        return cuentasFijo;
    }

    public static Cuentas getCuentasDyn() {
        return cuentasDyn;
    }

    public static void setCuentasDyn(Cuentas cuentas) {
        EstaticCuentas.cuentasDyn = cuentas;
    }

    public static PorcentajesCuentas getPorcentajeCuentas() {
        return porcentajeCuentas;
    }

    public static void setPorcentajeCuentas(PorcentajesCuentas porcentajeCuentas) {
        EstaticCuentas.porcentajeCuentas = porcentajeCuentas;
    }

    public static Resultados getValoresResultados() {
        return valoresResultados;
    }

    public static void setValoresResultados(Resultados valoresResultados) {
        EstaticCuentas.valoresResultados = valoresResultados;
    }
}
