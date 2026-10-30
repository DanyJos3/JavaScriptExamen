import java.util.ArrayList;

/**
 * PRUEBA DE JAVA BÁSICO - POKÉMON
 *
 * Completa cada método donde dice "TODO". No cambies los nombres ni los
 * parámetros de los métodos. Puedes agregar métodos auxiliares si quieres.
 *
 * Reglas:
 *  - NO usar Arrays.sort(), Collections.sort(), String.join() ni streams/lambdas.
 *    (La idea es practicar ciclos y lógica "a mano".)
 *  - Para comparar Strings usar equals() / compareTo(), nunca ==.
 *
 * Compilar y ejecutar:
 *    javac *.java
 *    java Ejercicios      (ver tus resultados)
 *    java Verificador     (revisar automáticamente tus respuestas)
 */
public class Ejercicios {

    // =====================================================================
    // EJERCICIO 1 (5 pts) - Ciclo for clásico
    // Imprime todos los Pokémon numerados, uno por línea, usando un for con índice:
    //    1. Bulbasaur
    //    2. Charmander
    //    ...
    // =====================================================================
    public static void listarNombres(Pokemon[] pokemones) {
        // TODO
    }

    // =====================================================================
    // EJERCICIO 2 (8 pts) - for-each + comparar Strings
    // Devuelve cuántos Pokémon tienen el tipo indicado (en cualquiera de sus tipos).
    //    contarPorTipo(pokemones, "Fuego")   -> 3
    //    contarPorTipo(pokemones, "Volador") -> 4
    // Pista: cada Pokémon tiene un ARRAY de tipos -> necesitas un ciclo dentro de otro.
    // =====================================================================
    public static int contarPorTipo(Pokemon[] pokemones, String tipo) {
        // TODO
        return 0;
    }

    // =====================================================================
    // EJERCICIO 3 (8 pts) - Buscar el máximo
    // Devuelve el Pokémon con MAYOR ataque.
    //    -> Dragonite (134)
    // =====================================================================
    public static Pokemon masFuerte(Pokemon[] pokemones) {
        // TODO
        return null;
    }

    // =====================================================================
    // EJERCICIO 4 (6 pts) - Acumuladores y promedio
    // Devuelve el promedio de HP de todos los Pokémon (como double, con decimales).
    //    -> 69.61111111111111  (1253 / 18)
    // Cuidado con la división entera.
    // =====================================================================
    public static double promedioHp(Pokemon[] pokemones) {
        // TODO
        return 0;
    }

    // =====================================================================
    // EJERCICIO 5 (8 pts) - Concatenar Strings
    // Devuelve un String con todos los nombres separados por ", "
    // SIN coma al final:
    //    "Bulbasaur, Charmander, Squirtle, ..., Mewtwo"
    // Puedes usar + o StringBuilder.
    // =====================================================================
    public static String concatenarNombres(Pokemon[] pokemones) {
        // TODO
        return "";
    }

    // =====================================================================
    // EJERCICIO 6 (12 pts) - Ordenar alfabéticamente (sin Arrays.sort)
    // Devuelve un NUEVO array de Strings con los nombres en orden alfabético.
    //    -> {"Articuno", "Bulbasaur", "Charmander", "Dragonite", ...}
    // Pista: método burbuja + compareTo():
    //    a.compareTo(b) < 0  significa que "a" va antes que "b".
    // =====================================================================
    public static String[] nombresOrdenados(Pokemon[] pokemones) {
        // TODO
        return new String[0];
    }

    // =====================================================================
    // EJERCICIO 7 (8 pts) - Ciclo while
    // Recorre la lista CON UN WHILE y devuelve el PRIMER Pokémon cuya velocidad
    // sea MAYOR a la indicada. Debe detenerse apenas lo encuentre.
    // Si no hay ninguno, devuelve null.
    //    primeroMasRapidoQue(pokemones, 80)  -> Pikachu (90)
    //    primeroMasRapidoQue(pokemones, 200) -> null
    // =====================================================================
    public static Pokemon primeroMasRapidoQue(Pokemon[] pokemones, int velocidad) {
        // TODO
        return null;
    }

    // =====================================================================
    // EJERCICIO 8 (7 pts) - Condicionales + arrays dentro de objetos
    // Imprime SOLO los Pokémon que tienen DOS tipos, con este formato:
    //    Bulbasaur (Planta/Veneno)
    //    Jigglypuff (Normal/Hada)
    //    ...
    // Además, devuelve cuántos imprimiste.  -> 9
    // =====================================================================
    public static int listarDobleTipo(Pokemon[] pokemones) {
        // TODO
        return 0;
    }

    // =====================================================================
    // EJERCICIO 9 (7 pts) - ArrayList
    // Devuelve un ArrayList con los NOMBRES de los Pokémon legendarios.
    //    -> [Articuno, Zapdos, Moltres, Mewtwo]
    // =====================================================================
    public static ArrayList<String> legendarios(Pokemon[] pokemones) {
        // TODO
        return new ArrayList<String>();
    }

    // =====================================================================
    // EJERCICIO 10 (8 pts) - Recorrer un String con charAt()
    // a) Devuelve el nombre al revés:      invertir("Pikachu") -> "uhcakiP"
    // b) Cuenta las vocales (a e i o u, mayúsculas o minúsculas):
    //                                      contarVocales("Bulbasaur") -> 4
    // =====================================================================
    public static String invertir(String texto) {
        // TODO
        return "";
    }

    public static int contarVocales(String texto) {
        // TODO
        return 0;
    }

    // =====================================================================
    // EJERCICIO 11 (6 pts) - switch
    // Devuelve el tipo al que es débil el tipo recibido, usando un switch:
    //    "Fuego"     -> "Agua"
    //    "Agua"      -> "Planta"
    //    "Planta"    -> "Fuego"
    //    "Electrico" -> "Tierra"
    //    "Roca"      -> "Agua"
    //    cualquier otro -> "Desconocida"
    // =====================================================================
    public static String debilidad(String tipo) {
        // TODO
        return "";
    }

    // =====================================================================
    // EJERCICIO 12 (7 pts) - Formato de salida
    // Imprime una tabla con número, nombre, HP, ataque y la SUMA de
    // hp + ataque + defensa + velocidad ("total"). Usa System.out.printf.
    //
    //    #    Nombre       HP   ATQ  TOTAL
    //    1    Bulbasaur    45   49   188
    //    4    Charmander   39   52   199
    //    ...
    // Pista: printf("%-4d %-12s %-4d %-4d %d%n", ...)
    // =====================================================================
    public static void imprimirTabla(Pokemon[] pokemones) {
        // TODO
    }

    // =====================================================================
    // EJERCICIO 13 (10 pts) - DESAFÍO: Batalla Pokémon (while + condicionales)
    // Simula una batalla por turnos entre a y b y devuelve el NOMBRE del ganador.
    // Reglas:
    //  - Empieza el más rápido (si empatan en velocidad, empieza "a").
    //  - En cada turno el atacante le quita al otro:
    //        daño = ataque_atacante - (defensa_defensor / 2)
    //    Si el daño es menor a 1, el daño es 1.
    //  - Se turnan hasta que el HP de alguno llegue a 0 o menos.
    //  - Usa variables locales para el HP (los Pokémon no se modifican).
    //  - Imprime cada turno, por ejemplo:
    //        Turno 1: Pikachu ataca a Charmander y le quita 34 HP (le quedan 5)
    //
    //    batalla(pikachu, charmander) -> "Pikachu"
    // =====================================================================
    public static String batalla(Pokemon a, Pokemon b) {
        // TODO
        return "";
    }


    // =====================================================================
    // Programa principal: ejecuta todos los ejercicios (NO es necesario modificarlo)
    // =====================================================================
    public static void main(String[] args) {
        Pokemon[] pokemones = Pokedex.obtenerPokemones();

        System.out.println("=== Ejercicio 1 ===");
        listarNombres(pokemones);

        System.out.println("\n=== Ejercicio 2 ===");
        System.out.println("Tipo Fuego: " + contarPorTipo(pokemones, "Fuego"));
        System.out.println("Tipo Volador: " + contarPorTipo(pokemones, "Volador"));

        System.out.println("\n=== Ejercicio 3 ===");
        System.out.println("Más fuerte: " + masFuerte(pokemones));

        System.out.println("\n=== Ejercicio 4 ===");
        System.out.println("Promedio HP: " + promedioHp(pokemones));

        System.out.println("\n=== Ejercicio 5 ===");
        System.out.println(concatenarNombres(pokemones));

        System.out.println("\n=== Ejercicio 6 ===");
        String[] ordenados = nombresOrdenados(pokemones);
        for (String nombre : ordenados) {
            System.out.println(nombre);
        }

        System.out.println("\n=== Ejercicio 7 ===");
        System.out.println("Primero con velocidad > 80: " + primeroMasRapidoQue(pokemones, 80));
        System.out.println("Primero con velocidad > 200: " + primeroMasRapidoQue(pokemones, 200));

        System.out.println("\n=== Ejercicio 8 ===");
        System.out.println("Total con doble tipo: " + listarDobleTipo(pokemones));

        System.out.println("\n=== Ejercicio 9 ===");
        System.out.println("Legendarios: " + legendarios(pokemones));

        System.out.println("\n=== Ejercicio 10 ===");
        System.out.println(invertir("Pikachu"));
        System.out.println("Vocales en Bulbasaur: " + contarVocales("Bulbasaur"));

        System.out.println("\n=== Ejercicio 11 ===");
        System.out.println("Fuego es débil a: " + debilidad("Fuego"));
        System.out.println("Hada es débil a: " + debilidad("Hada"));

        System.out.println("\n=== Ejercicio 12 ===");
        imprimirTabla(pokemones);

        System.out.println("\n=== Ejercicio 13 ===");
        System.out.println("Ganador: " + batalla(pokemones[3], pokemones[1]));
    }
}
