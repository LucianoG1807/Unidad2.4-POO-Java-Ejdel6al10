public class AuthGoogle extends ProveedorIdentidad {

    public AuthGoogle() {
        super("Google");
    }

    @Override
    public boolean validarToken(String tokenAcceso) {

        if (!validarTokenVacio(tokenAcceso)) {
            return false;
        }

        System.out.println("Conectando con la API de Google...");

        return tokenAcceso.startsWith("GOOG-");
    }
}