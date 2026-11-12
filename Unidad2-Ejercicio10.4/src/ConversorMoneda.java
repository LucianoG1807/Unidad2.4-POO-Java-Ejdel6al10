public class ConversorMoneda {

    private ProveedorTasaCambio proveedor;

    public ConversorMoneda(ProveedorTasaCambio proveedor) {
        this.proveedor = proveedor;
    }

    public double convertir(double monto, String monedaOrigen, String monedaDestino) {

        if (monto < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo.");
        }

        double tasa = proveedor.obtenerTasa(monedaOrigen, monedaDestino);

        return monto * tasa;
    }
}