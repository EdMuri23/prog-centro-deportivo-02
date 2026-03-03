public class CentroDeportivo {

    //Atributos
    private Entrenador[] entrenadores;
    private final int NUM_MAX_ENTRENADORES;

    public CentroDeportivo(Entrenador[] entrenadores, int numMaxEntrenadores) {
        //this.NUM_MAX_ENTRENADORES = 15;
        if (numMaxEntrenadores < 0 && numMaxEntrenadores > 15) {
            numMaxEntrenadores = 15;
        }

        this.NUM_MAX_ENTRENADORES = numMaxEntrenadores;
        this.entrenadores = new Entrenador[NUM_MAX_ENTRENADORES];
    }

    /**
     *
     * @param id
     * @return
     */
    public Entrenador buscarEntrenador(int id){
        boolean encontrado = false;
        Entrenador entrenadorBuscado = null;
        int i = 0;

        while (!encontrado && i < NUM_MAX_ENTRENADORES) {
            if (entrenadores[i] != null && entrenadores[i].getId() == id) {
                entrenadorBuscado = entrenadores[i];
                encontrado = true;
            }

            i++;
        }

        return entrenadorBuscado;
    }

    /**
     *
     * @return
     */
    private int buscarPrimerHuecoLibre(){
        boolean encontrado = false;
        int primerHuecoLibre = -1;
        int i = 0;

        while (!encontrado && i < NUM_MAX_ENTRENADORES) {
            if (entrenadores[i] == null){
                primerHuecoLibre = i;
                encontrado = true;
            }

            i++;
        }

        return primerHuecoLibre;
    }

    /**
     *
     * @param entrenador
     * @return
     */
    public boolean registrarEntrenador(Entrenador entrenador){

    }
    public String mostrarEntrenadores()
    public int contarEntrenadores()
}
