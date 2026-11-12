public class AuthApple extends ProveedorIdentidad {

    public AuthApple() {
        super("Apple");
    }

    @Override
    public boolean validarToken(String tokenAcceso) {

        if (!validarTokenVacio(tokenAcceso)) {
            return false;
        }

        System.out.println("Conectando con la API de Apple...");

        return tokenAcceso.startsWith("APPLE-");
    }
}