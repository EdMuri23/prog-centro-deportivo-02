void main() {

    //Zona declarativa
    Entrenador entrenador1;
    Entrenador entrenador2;
    Entrenador entrenador3;
    Entrenador entrenador4;
    Entrenador entrenador5;
    Entrenador entrenador6;
    Entrenador entrenador7;
    Entrenador entrenador8;
    Entrenador entrenador9;
    Entrenador entrenador10;

    CentroDeportivo centroDeportivo;

    //Zona ejecutiva
    entrenador8 = new Entrenador(8, "pedro", "crossfit", 3);
    entrenador3 = new Entrenador(3, "elena", "flexibilidad", 1);
    entrenador1 = new Entrenador(1, "juan", "cardio", 3);
    entrenador6 = new Entrenador(6, "carlos", "fuerza", 7);
    entrenador10 = new Entrenador(10, "miguel", "natacion", 6);
    entrenador5 = new Entrenador(5, "maria", "yoga", 2);
    entrenador2 = new Entrenador(2, "ana", "cardio", 6);
    entrenador9 = new Entrenador(9, "sofia", "flexibilidad", 4);
    entrenador7 = new Entrenador(7, "laura", "cardio", 5);
    entrenador4 = new Entrenador(4, "david", "fuerza", 4);

    centroDeportivo = new CentroDeportivo(12);

    System.out.println(centroDeportivo.registrarEntrenador(entrenador8));
    System.out.println(centroDeportivo.registrarEntrenador(entrenador3));
    System.out.println(centroDeportivo.registrarEntrenador(entrenador1));
    System.out.println(centroDeportivo.registrarEntrenador(entrenador6));
    System.out.println(centroDeportivo.registrarEntrenador(entrenador10));
    System.out.println(centroDeportivo.registrarEntrenador(entrenador5));
    System.out.println(centroDeportivo.registrarEntrenador(entrenador2));
    System.out.println(centroDeportivo.registrarEntrenador(entrenador9));
    System.out.println(centroDeportivo.registrarEntrenador(entrenador7));
    System.out.println(centroDeportivo.registrarEntrenador(entrenador4));
    System.out.println(centroDeportivo.registrarEntrenador(entrenador4));

    System.out.println(centroDeportivo.mostrarEntrenadores());

    centroDeportivo.borrarEntrenador(4);

    System.out.println(centroDeportivo.registrarEntrenador(entrenador4));

    centroDeportivo.borrarEntrenador(10);

    centroDeportivo.imprimirArray();
    centroDeportivo.ordenarEntrenadores();

    System.out.println(centroDeportivo.mostrarEntrenadores());

}
