public class CentroDeportivo {

    //Atributos
    private Entrenador[] entrenadores;
    private final int NUM_MAX_ENTRENADORES;

    public CentroDeportivo(int numMaxEntrenadores) {
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
        boolean registrado = false;
        Entrenador buscar;
        int posicion;

        buscar = buscarEntrenador(entrenador.getId());

        if (buscar == null){
            posicion = buscarPrimerHuecoLibre();
            if (posicion != -1){
                entrenadores[posicion] = entrenador;
                registrado = true;
            }
        }
        return registrado;
    }

    /**
     *
     * @return
     */
    public String mostrarEntrenadores(){
        StringBuilder infoEntrenadores = new StringBuilder("Entrenadores: ");
        for (int i = 0; i < NUM_MAX_ENTRENADORES; i++) {
            if (entrenadores[i] != null){
                infoEntrenadores.append(entrenadores[i].toString());
            }
        }

        return infoEntrenadores.toString();
    }

    /**
     *
     * @return
     */
    public int contarEntrenadores(){
        int contador = 0;

        for (int i = 0; i < NUM_MAX_ENTRENADORES; i++) {
            if (entrenadores[i] != null){
                contador++;
            }
        }

        return contador;
    }

    public Entrenador borrarEntrenador(int id){
        Entrenador entrenadorBorrado = null;

        if (buscarEntrenador(id) != null){
            for (int i = 0; i < NUM_MAX_ENTRENADORES; i++) {
                if (entrenadores[i] != null && entrenadores[i].getId() == id) {
                    entrenadorBorrado = entrenadores[i];
                    entrenadores[i] = null;
                }
            }
        }

        return entrenadorBorrado;
    }

    public Entrenador borrarEntrenador(Entrenador entrenador){

        if (buscarEntrenador(entrenador.getId()) != null){
            for (int i = 0; i < NUM_MAX_ENTRENADORES; i++) {
                if (entrenadores[i] != null && entrenadores[i] == entrenador) {
                    entrenadores[i] = null;
                }
            }
        }

        return entrenador;
    }
}
