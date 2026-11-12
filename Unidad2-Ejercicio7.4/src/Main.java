public class Main {

    public static void main(String[] args) {

        RedBlockchain red;

        String origenBitcoin = "1BoatSLRHtKNngkdXEeobR76b53LETtpyT";
        String destinoBitcoin = "1BitcoinEaterAddressDontSendf59kuE";

        String origenEthereum = "0x1234567890abcdef1234567890abcdef12345678";
        String destinoEthereum = "0xabcdefabcdefabcdefabcdefabcdefabcdefabcd";

        String origenSolana = "So11111111111111111111111111111111111111112";
        String destinoSolana = "11111111111111111111111111111111";

        System.out.println("=== SISTEMA DE TRANSFERENCIAS BLOCKCHAIN ===");

        System.out.println("\n--- RED BITCOIN ---");

        red = new RedBitcoin();
        red.ejecutarTransaccion(origenBitcoin, destinoBitcoin, 1.0);

        System.out.println("\n--- RED ETHEREUM ---");

        red = new RedEthereum();
        red.ejecutarTransaccion(origenEthereum, destinoEthereum, 2.0);

        System.out.println("\n--- RED SOLANA ---");

        red = new RedSolana();
        red.ejecutarTransaccion(origenSolana, destinoSolana, 3.0);
    }
}