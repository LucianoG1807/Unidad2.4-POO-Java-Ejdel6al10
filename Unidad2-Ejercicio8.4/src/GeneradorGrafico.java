import java.util.List;

public abstract class GeneradorGrafico {

    protected List<Double> datos;

    public GeneradorGrafico(List<Double> datos) {
        this.datos = datos;
    }

    public abstract void renderizarGrafico();

    protected boolean validarDatos() {

        if (datos == null || datos.isEmpty()) {
            System.out.println("Error: no hay datos para renderizar el gráfico.");
            return false;
        }

        return true;
    }
}