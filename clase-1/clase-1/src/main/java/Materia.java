import java.util.ArrayList;
import java.util.List;

public class Materia {
    private final List<Materia> correlativas;

    public Materia(String nombre) {
        this.correlativas = new ArrayList<>();
    }

    public void agregarCorrelativa(Materia materia) {
        this.correlativas.add(materia);
    }

    public List<Materia> getCorrelativas() {
        return this.correlativas;
    }
}
