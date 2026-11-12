import java.util.List;

public class GraficoCircular extends GeneradorGrafico {

    public GraficoCircular(List<Double> datos) {
        super(datos);
    }

    @Override
    public void renderizarGrafico() {

        if (!validarDatos()) {
            return;
        }

        double total = 0;

        for (double dato : datos) {
            total += dato;
        }

        if (total <= 0) {
            System.out.println("Error: el total de los datos debe ser mayor a cero.");
            return;
        }

        System.out.println("=== GRÁFICO CIRCULAR ===");

        for (int i = 0; i < datos.size(); i++) {

            double porcentaje = (datos.get(i) / total) * 100;

            System.out.printf(
                    "Dato %d: %.2f%% %n",
                    i + 1,
                    porcentaje
            );
        }
    }
}