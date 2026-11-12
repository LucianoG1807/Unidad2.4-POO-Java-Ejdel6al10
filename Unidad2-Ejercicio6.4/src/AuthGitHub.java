public class AuthGitHub extends ProveedorIdentidad {

    public AuthGitHub() {
        super("GitHub");
    }

    @Override
    public boolean validarToken(String tokenAcceso) {

        if (!validarTokenVacio(tokenAcceso)) {
            return false;
        }

        System.out.println("Conectando con la API de GitHub...");

        return tokenAcceso.startsWith("GIT-");
    }
}