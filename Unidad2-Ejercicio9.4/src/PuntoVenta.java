public class PuntoVenta {

    private LectorOptico lector;

    public PuntoVenta(LectorOptico lector) {
        this.lector = lector;
    }

    public void setLector(LectorOptico lector) {
        this.lector = lector;
    }

    public void procesarProducto() {

        if (lector == null) {
            System.out.println("Error: no hay ningún lector conectado.");
            return;
        }

        String codigo = lector.escanearCodigo();

        System.out.println("Código detectado: " + codigo);
        System.out.println("Producto procesado correctamente.");
    }
}