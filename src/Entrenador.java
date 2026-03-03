public class Entrenador {
    //Atributos
    private int id;
    private String nombre;
    private String especialidad;
    private int anosExperiencia;

    //private int totalEntrenadores = 1;

    /** CONSTRUCTOR:
     * @param id
     * @param nombre
     * @param especialidad
     * @param anosExperiencia
     */
    public Entrenador(int id, String nombre, String especialidad, int anosExperiencia) {
        this.id = id;//totalEntrenadores;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperiencia;

        //totalEntrenadores++;
    }

    //Get
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder infoEntrenador = new StringBuilder("Entrenador:");
        infoEntrenador.append(" Id: " + id);
        infoEntrenador.append(" Nombre: " + nombre);
        infoEntrenador.append(" Especialidad: " + especialidad + "(" + anosExperiencia + ")");

        return infoEntrenador.toString();
    }
}
