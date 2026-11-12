import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ProveedorIdentidad> proveedores = new ArrayList<>();

        proveedores.add(new AuthGoogle());
        proveedores.add(new AuthGitHub());
        proveedores.add(new AuthApple());

        List<String> tokens = new ArrayList<>();

        tokens.add("GOOG-123456");
        tokens.add("GIT-789456");
        tokens.add("APPLE-654321");

        System.out.println("=== SISTEMA DE AUTENTICACIÓN ===");

        for (int i = 0; i < proveedores.size(); i++) {

            ProveedorIdentidad proveedor = proveedores.get(i);

            System.out.println("\nProveedor: " + proveedor.nombreProveedor);

            boolean acceso = proveedor.validarToken(tokens.get(i));

            if (acceso) {
                System.out.println("Acceso concedido.");
            } else {
                System.out.println("Acceso denegado.");
            }

            System.out.println("-----------------------------");
        }
    }
}