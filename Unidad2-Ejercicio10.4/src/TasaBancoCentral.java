public class TasaBancoCentral extends ProveedorTasaCambio {

    @Override
    public double obtenerTasa(String monedaOrigen, String monedaDestino) {

        if (monedaOrigen.equalsIgnoreCase("USD") &&
                monedaDestino.equalsIgnoreCase("ARS")) {
            return 1000.0;
        }

        if (monedaOrigen.equalsIgnoreCase("EUR") &&
                monedaDestino.equalsIgnoreCase("ARS")) {
            return 1100.0;
        }

        if (monedaOrigen.equalsIgnoreCase("ARS") &&
                monedaDestino.equalsIgnoreCase("USD")) {
            return 0.001;
        }

        throw new IllegalArgumentException("Conversión no disponible.");
    }
}