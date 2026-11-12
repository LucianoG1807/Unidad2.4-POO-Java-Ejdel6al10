public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE PUNTO DE VENTA ===");

        PuntoVenta puntoVenta = new PuntoVenta(new EscanerLaser());

        System.out.println("\n--- LECTOR LÁSER ---");

        puntoVenta.procesarProducto();

        System.out.println("\n--- CÁMARA QR ---");

        puntoVenta.setLector(new CamaraQR());

        puntoVenta.procesarProducto();
    }
}