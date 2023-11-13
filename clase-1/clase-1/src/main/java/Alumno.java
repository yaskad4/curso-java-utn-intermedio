import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private final List<Materia> materiasAprobadas;

    public Alumno(String nombre) {
        this.materiasAprobadas = new ArrayList<>();
    }

    public void agregarMateriaAprobada(Materia materia) {
        this.materiasAprobadas.add(materia);
    }

    public boolean aproboMateria(Materia materia) {
        return this.materiasAprobadas.contains(materia);
    }
}