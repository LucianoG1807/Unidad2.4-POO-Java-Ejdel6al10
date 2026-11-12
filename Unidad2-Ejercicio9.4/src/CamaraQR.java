public class CamaraQR implements LectorOptico {

    @Override
    public String escanearCodigo() {

        System.out.println("Escaneando código QR con cámara...");

        return "QR-PRODUCTO-001";
    }
}