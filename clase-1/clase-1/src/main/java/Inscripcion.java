public class Inscripcion {
    private final Alumno alumno;
    private final Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public boolean aprobada() {
        for (Materia correlativa : this.materia.getCorrelativas()) {
            if (!this.alumno.aproboMateria(correlativa)) {
                return false;
            }
        }
        return true;
    }
}
