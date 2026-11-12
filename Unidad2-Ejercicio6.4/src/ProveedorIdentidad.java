public abstract class ProveedorIdentidad {

    protected String nombreProveedor;

    public ProveedorIdentidad(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public abstract boolean validarToken(String tokenAcceso);

    protected boolean validarTokenVacio(String tokenAcceso) {

        if (tokenAcceso == null || tokenAcceso.isBlank()) {
            System.out.println("Error: el token no puede estar vacío.");
            return false;
        }

        return true;
    }
}