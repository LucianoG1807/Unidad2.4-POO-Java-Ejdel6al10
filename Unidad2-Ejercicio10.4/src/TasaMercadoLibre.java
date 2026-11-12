public class TasaMercadoLibre extends ProveedorTasaCambio {

    @Override
    public double obtenerTasa(String monedaOrigen, String monedaDestino) {

        if (monedaOrigen.equalsIgnoreCase("USD") &&
                monedaDestino.equalsIgnoreCase("ARS")) {
            return 1200.0;
        }

        if (monedaOrigen.equalsIgnoreCase("EUR") &&
                monedaDestino.equalsIgnoreCase("ARS")) {
            return 1300.0;
        }

        if (monedaOrigen.equalsIgnoreCase("ARS") &&
                monedaDestino.equalsIgnoreCase("USD")) {
            return 0.00083;
        }

        throw new IllegalArgumentException("Conversión no disponible.");
    }
}