import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> datos = new ArrayList<>();

        datos.add(10.0);
        datos.add(20.0);
        datos.add(15.0);
        datos.add(30.0);
        datos.add(25.0);

        List<GeneradorGrafico> graficos = new ArrayList<>();

        graficos.add(new GraficoBarras(datos));
        graficos.add(new GraficoCircular(datos));
        graficos.add(new GraficoLineal(datos));

        System.out.println("=== GENERADORES DE GRÁFICOS ESTADÍSTICOS ===");

        for (GeneradorGrafico grafico : graficos) {

            grafico.renderizarGrafico();

            System.out.println("-----------------------------");
        }
    }
}