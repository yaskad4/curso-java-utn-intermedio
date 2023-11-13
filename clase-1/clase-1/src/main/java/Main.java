
public class Main {
    public static void main(String[] args) {
        // Crear materias
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia paradigmas = new Materia("Paradigmas de Programación");
        Materia diseno = new Materia("Diseño de Sistemas");

        // Establecer correlatividades
        paradigmas.agregarCorrelativa(algoritmos);
        diseno.agregarCorrelativa(paradigmas);

        // Crear un alumno
        Alumno juan = new Alumno("Juan");

        // Juan aprueba Algoritmos
        juan.agregarMateriaAprobada(algoritmos);

        // Juan intenta inscribirse a Diseño de Sistemas
        Inscripcion inscripcion = new Inscripcion(juan, diseno);

        // Verificar si la inscripción es válida
        System.out.println(inscripcion.aprobada());  // Esto imprimirá "false" porque Juan no ha aprobado Paradigmas de Programación

        // Juan aprueba Paradigmas de Programación
        juan.agregarMateriaAprobada(paradigmas);

        // Verificar nuevamente si la inscripción es válida
        System.out.println(inscripcion.aprobada());  // Ahora esto imprimirá "true"
    }
}