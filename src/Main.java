void main() {

    //Zona declarativa
    Entrenador entrenador1;
    Entrenador entrenador2;
    Entrenador entrenador3;
    Entrenador entrenador4;

    CentroDeportivo centroDeportivo;

    //Zona ejecutiva
    entrenador1 = new Entrenador(1, "juan", "cardio", 3);
    entrenador2 = new Entrenador(2, "ana", "cardio", 6);
    entrenador3 = new Entrenador(3, "elena", "flexibilidad", 1);
    entrenador4 = new Entrenador(4, "david", "fuerza", 4);

    centroDeportivo = new CentroDeportivo(15);

    System.out.println(centroDeportivo.registrarEntrenador(entrenador1));
    System.out.println(centroDeportivo.registrarEntrenador(entrenador2));
    System.out.println(centroDeportivo.registrarEntrenador(entrenador3));
    System.out.println(centroDeportivo.registrarEntrenador(entrenador4));

    System.out.println(centroDeportivo.mostrarEntrenadores());

    centroDeportivo.borrarEntrenador(4);

    System.out.println(centroDeportivo.mostrarEntrenadores());

}
