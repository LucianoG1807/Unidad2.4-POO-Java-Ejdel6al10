import java.util.List;

public class GraficoLineal extends GeneradorGrafico {

    public GraficoLineal(List<Double> datos) {
        super(datos);
    }

    @Override
    public void renderizarGrafico() {

        if (!validarDatos()) {
            return;
        }

        System.out.println("=== GRÁFICO LINEAL ===");

        for (int i = 0; i < datos.size(); i++) {

            System.out.println(
                    "Punto " + (i + 1) + ": (" +
                            (i + 1) + ", " + datos.get(i) + ")"
            );

            if (i < datos.size() - 1) {
                System.out.println("       |");
                System.out.println("       |");
            }
        }
    }
}