public class Main {

    public static void main(String[] args) {

        double monto = 100;

        String monedaOrigen = "USD";
        String monedaDestino = "ARS";

        ProveedorTasaCambio bancoCentral = new TasaBancoCentral();
        ProveedorTasaCambio mercadoLibre = new TasaMercadoLibre();

        ConversorMoneda conversor;

        System.out.println("=== SISTEMA DE CONVERSIÓN DE DIVISAS ===");

        try {

            System.out.println("\n--- BANCO CENTRAL ---");

            conversor = new ConversorMoneda(bancoCentral);

            double resultadoBanco = conversor.convertir(
                    monto, monedaOrigen, monedaDestino
            );

            System.out.println("Monto original: " + monto + " " + monedaOrigen);
            System.out.println("Monto convertido: " + resultadoBanco + " " + monedaDestino);

            System.out.println("\n--- MERCADO LIBRE ---");

            conversor = new ConversorMoneda(mercadoLibre);

            double resultadoMercado = conversor.convertir(
                    monto, monedaOrigen, monedaDestino
            );

            System.out.println("Monto original: " + monto + " " + monedaOrigen);
            System.out.println("Monto convertido: " + resultadoMercado + " " + monedaDestino);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}