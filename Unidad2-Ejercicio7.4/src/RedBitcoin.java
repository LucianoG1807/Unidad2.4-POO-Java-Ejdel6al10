public class RedBitcoin implements RedBlockchain {

    @Override
    public double verificarSaldo(String direccionWallet) {

        if (!direccionWallet.matches("^(1|3|bc1)[a-zA-HJ-NP-Z0-9]{25,87}$")) {
            throw new IllegalArgumentException("Dirección Bitcoin inválida.");
        }

        System.out.println("Consultando saldo en la red Bitcoin...");

        return 2.5;
    }

    @Override
    public boolean ejecutarTransaccion(String origen, String destino, double monto) {

        if (origen == null || destino == null ||
                !origen.matches("^(1|3|bc1)[a-zA-HJ-NP-Z0-9]{25,87}$") ||
                !destino.matches("^(1|3|bc1)[a-zA-HJ-NP-Z0-9]{25,87}$")) {
            System.out.println("Error: dirección Bitcoin inválida.");
            return false;
        }

        if (monto <= 0) {
            System.out.println("Error: el monto debe ser mayor a cero.");
            return false;
        }

        double saldo = verificarSaldo(origen);

        if (saldo < monto) {
            System.out.println("Saldo insuficiente.");
            return false;
        }

        System.out.println("Procesando transacción Bitcoin...");
        System.out.println("Calculando tarifa de red...");
        System.out.println("Transacción Bitcoin confirmada.");

        return true;
    }
}