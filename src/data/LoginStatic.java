package data;

/**
 *
 * @author maxim
 */
public class LoginStatic {
    private static boolean logedin = false;
    
    private static String usuario = "CARINOSA15";
    private static String contra = "TCARINOSA";
    
    private static String usuarioAdm = "Admin";
    private static String contraAdm = "Admin";

    public static void setLogedin(boolean logedin) {
        LoginStatic.logedin = logedin;
    }

    public static boolean isLogedin() {
        return logedin;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static String getContra() {
        return contra;
    }

    public static String getUsuarioAdm() {
        return usuarioAdm;
    }

    public static String getContraAdm() {
        return contraAdm;
    }
    
    
}
