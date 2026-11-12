public class EscanerLaser implements LectorOptico {

    @Override
    public String escanearCodigo() {

        System.out.println("Escaneando código de barras con láser...");

        return "7791234567890";
    }
}