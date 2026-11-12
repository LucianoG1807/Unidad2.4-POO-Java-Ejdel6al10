public class RedSolana implements RedBlockchain {

    @Override
    public double verificarSaldo(String direccionWallet) {

        if (direccionWallet == null ||
                !direccionWallet.matches("^[1-9A-HJ-NP-Za-km-z]{32,44}$")) {
            throw new IllegalArgumentException("Dirección Solana inválida.");
        }

        System.out.println("Consultando saldo en la red Solana...");

        return 10.0;
    }

    @Override
    public boolean ejecutarTransaccion(String origen, String destino, double monto) {

        if (origen == null || destino == null ||
                !origen.matches("^[1-9A-HJ-NP-Za-km-z]{32,44}$") ||
                !destino.matches("^[1-9A-HJ-NP-Za-km-z]{32,44}$")) {
            System.out.println("Error: dirección Solana inválida.");
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

        System.out.println("Procesando transacción Solana...");
        System.out.println("Calculando tarifa de red...");
        System.out.println("Transacción Solana confirmada.");

        return true;
    }
}