public class RedEthereum implements RedBlockchain {

    @Override
    public double verificarSaldo(String direccionWallet) {

        if (direccionWallet == null ||
                !direccionWallet.matches("^0x[a-fA-F0-9]{40}$")) {
            throw new IllegalArgumentException("Dirección Ethereum inválida.");
        }

        System.out.println("Consultando saldo en la red Ethereum...");

        return 5.0;
    }

    @Override
    public boolean ejecutarTransaccion(String origen, String destino, double monto) {

        if (origen == null || destino == null ||
                !origen.matches("^0x[a-fA-F0-9]{40}$") ||
                !destino.matches("^0x[a-fA-F0-9]{40}$")) {
            System.out.println("Error: dirección Ethereum inválida.");
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

        System.out.println("Procesando transacción Ethereum...");
        System.out.println("Calculando tarifa de gas...");
        System.out.println("Transacción Ethereum confirmada.");

        return true;
    }
}