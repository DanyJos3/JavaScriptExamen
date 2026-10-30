/**
 * PRUEBA DE JAVA BÁSICO - POKÉMON
 *
 * Completa cada método donde dice "TODO". No cambies los nombres ni los
 * parámetros de los métodos. Puedes agregar métodos auxiliares si quieres.
 *
 * Reglas:
 *  - NO usar Arrays.sort(), String.join(), ArrayList ni streams.
 *    (La idea es practicar ciclos y arrays "a mano".)
 *  - Para comparar Strings usar equals() / compareTo(), nunca ==.
 *
 * Compilar y ejecutar:
 *    javac -encoding UTF-8 *.java
 *    java Ejercicios      (ver tus resultados)
 *    java Verificador     (revisar automáticamente tus respuestas)
 */
public class Ejercicios {

    // =====================================================================
    // DATOS (NO MODIFICAR)
    // Es la "lista JSON" de Pokémon guardada en arrays paralelos:
    // la posición i de cada array corresponde al MISMO Pokémon.
    //   Ej: nombres[0] = "Bulbasaur", tipos[0] = {"Planta", "Veneno"}, hp[0] = 45 ...
    // =====================================================================
    static int[] numeros = {1, 4, 7, 25, 37, 39, 54, 66, 74, 94, 95, 133, 143, 144, 145, 146, 149, 150};

    static String[] nombres = {
        "Bulbasaur", "Charmander", "Squirtle", "Pikachu", "Vulpix", "Jigglypuff",
        "Psyduck", "Machop", "Geodude", "Gengar", "Onix", "Eevee",
        "Snorlax", "Articuno", "Zapdos", "Moltres", "Dragonite", "Mewtwo"
    };

    // Cada Pokémon tiene 1 o 2 tipos (array de arrays)
    static String[][] tipos = {
        {"Planta", "Veneno"}, {"Fuego"}, {"Agua"}, {"Electrico"}, {"Fuego"}, {"Normal", "Hada"},
        {"Agua"}, {"Lucha"}, {"Roca", "Tierra"}, {"Fantasma", "Veneno"}, {"Roca", "Tierra"}, {"Normal"},
        {"Normal"}, {"Hielo", "Volador"}, {"Electrico", "Volador"}, {"Fuego", "Volador"},
        {"Dragon", "Volador"}, {"Psiquico"}
    };

    static int[] hp        = { 45, 39, 44, 35, 38, 115, 50, 70,  40,  60,  35, 55, 160,  90,  90,  90,  91, 106};
    static int[] ataque    = { 49, 52, 48, 55, 41,  45, 52, 80,  80,  65,  45, 55, 110,  85,  90, 100, 134, 110};
    static int[] defensa   = { 49, 43, 65, 40, 40,  20, 48, 50, 100,  60, 160, 50,  65, 100,  85,  90,  95,  90};
    static int[] velocidad = { 45, 65, 43, 90, 65,  20, 55, 35,  20, 110,  70, 55,  30,  85, 100,  90,  80, 130};

    static boolean[] legendario = {
        false, false, false, false, false, false, false, false, false,
        false, false, false, false, true, true, true, false, true
    };


    // =====================================================================
    // EJERCICIO 1 (5 pts) - Ciclo for clásico
    // Imprime todos los Pokémon numerados, uno por línea, usando un for con índice:
    //    1. Bulbasaur
    //    2. Charmander
    //    ...
    // =====================================================================
    public static void listarNombres() {
        // TODO
    }

    // =====================================================================
    // EJERCICIO 2 (8 pts) - Array de arrays + comparar Strings
    // Devuelve cuántos Pokémon tienen el tipo indicado (en cualquiera de sus tipos).
    //    contarPorTipo("Fuego")   -> 3
    //    contarPorTipo("Volador") -> 4
    // Pista: tipos[i] es a su vez un array -> necesitas un ciclo dentro de otro.
    // =====================================================================
    public static int contarPorTipo(String tipo) {
        // TODO
        return 0;
    }

    // =====================================================================
    // EJERCICIO 3 (8 pts) - Buscar el máximo
    // Devuelve el NOMBRE del Pokémon con MAYOR ataque.
    //    -> "Dragonite" (134)
    // Pista: guarda la POSICIÓN del mayor, no solo el valor.
    // =====================================================================
    public static String masFuerte() {
        // TODO
        return "";
    }

    // =====================================================================
    // EJERCICIO 4 (6 pts) - Acumuladores y promedio
    // Devuelve el promedio de HP de todos los Pokémon (como double, con decimales).
    //    -> 69.61111111111111  (1253 / 18)
    // Cuidado con la división entera.
    // =====================================================================
    public static double promedioHp() {
        // TODO
        return 0;
    }

    // =====================================================================
    // EJERCICIO 5 (8 pts) - Concatenar Strings
    // Devuelve un String con todos los nombres separados por ", "
    // SIN coma al final:
    //    "Bulbasaur, Charmander, Squirtle, ..., Mewtwo"
    // =====================================================================
    public static String concatenarNombres() {
        // TODO
        return "";
    }

    // =====================================================================
    // EJERCICIO 6 (12 pts) - Ordenar alfabéticamente (sin Arrays.sort)
    // Devuelve un NUEVO array con los nombres en orden alfabético.
    // El array "nombres" original NO debe cambiar (primero cópialo).
    //    -> {"Articuno", "Bulbasaur", "Charmander", "Dragonite", ...}
    // Pista: método burbuja + compareTo():
    //    a.compareTo(b) < 0  significa que "a" va antes que "b".
    // =====================================================================
    public static String[] nombresOrdenados() {
        // TODO
        return new String[0];
    }

    // =====================================================================
    // EJERCICIO 7 (8 pts) - Ciclo while
    // Recorre los Pokémon CON UN WHILE y devuelve el nombre del PRIMERO cuya
    // velocidad sea MAYOR a la indicada. Debe detenerse apenas lo encuentre.
    // Si no hay ninguno, devuelve "Ninguno".
    //    primeroMasRapidoQue(80)  -> "Pikachu" (90)
    //    primeroMasRapidoQue(200) -> "Ninguno"
    // =====================================================================
    public static String primeroMasRapidoQue(int minimo) {
        // TODO
        return "";
    }

    // =====================================================================
    // EJERCICIO 8 (7 pts) - Condicionales + largo de un array
    // Imprime SOLO los Pokémon que tienen DOS tipos, con este formato:
    //    Bulbasaur (Planta/Veneno)
    //    Jigglypuff (Normal/Hada)
    //    ...
    // Además, devuelve cuántos imprimiste.  -> 9
    // =====================================================================
    public static int listarDobleTipo() {
        // TODO
        return 0;
    }

    // =====================================================================
    // EJERCICIO 9 (7 pts) - Crear y llenar un array nuevo
    // Devuelve un array con los NOMBRES de los Pokémon legendarios.
    // El array debe tener el tamaño JUSTO (ni más ni menos espacios).
    //    -> {"Articuno", "Zapdos", "Moltres", "Mewtwo"}
    // Pista: primero cuenta cuántos hay, crea el array y luego llénalo.
    // =====================================================================
    public static String[] legendarios() {
        // TODO
        return new String[0];
    }

    // =====================================================================
    // EJERCICIO 10 (8 pts) - Recorrer un String con charAt()
    // a) Devuelve el texto al revés:       invertir("Pikachu") -> "uhcakiP"
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
    public static void imprimirTabla() {
        // TODO
    }

    // =====================================================================
    // EJERCICIO 13 (10 pts) - DESAFÍO: Batalla Pokémon (while + condicionales)
    // Recibe las POSICIONES de dos Pokémon (a y b) en los arrays.
    // Simula una batalla por turnos y devuelve el NOMBRE del ganador.
    // Reglas:
    //  - Empieza el más rápido (si empatan en velocidad, empieza a).
    //  - En cada turno el atacante le quita al otro:
    //        daño = ataque del atacante - (defensa del defensor / 2)
    //    Si el daño es menor a 1, el daño es 1.
    //  - Se turnan hasta que el HP de alguno llegue a 0 o menos.
    //  - Usa variables locales para el HP (el array hp NO se modifica).
    //  - Imprime cada turno, por ejemplo:
    //        Turno 1: Pikachu ataca a Charmander y le quita 34 HP (le quedan 5)
    //
    //    batalla(3, 1)  (Pikachu vs Charmander) -> "Pikachu"
    // =====================================================================
    public static String batalla(int a, int b) {
        // TODO
        return "";
    }


    // =====================================================================
    // Programa principal: ejecuta todos los ejercicios (NO es necesario modificarlo)
    // =====================================================================
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 1 ===");
        listarNombres();

        System.out.println("\n=== Ejercicio 2 ===");
        System.out.println("Tipo Fuego: " + contarPorTipo("Fuego"));
        System.out.println("Tipo Volador: " + contarPorTipo("Volador"));

        System.out.println("\n=== Ejercicio 3 ===");
        System.out.println("Más fuerte: " + masFuerte());

        System.out.println("\n=== Ejercicio 4 ===");
        System.out.println("Promedio HP: " + promedioHp());

        System.out.println("\n=== Ejercicio 5 ===");
        System.out.println(concatenarNombres());

        System.out.println("\n=== Ejercicio 6 ===");
        String[] ordenados = nombresOrdenados();
        for (int i = 0; i < ordenados.length; i++) {
            System.out.println(ordenados[i]);
        }

        System.out.println("\n=== Ejercicio 7 ===");
        System.out.println("Primero con velocidad > 80: " + primeroMasRapidoQue(80));
        System.out.println("Primero con velocidad > 200: " + primeroMasRapidoQue(200));

        System.out.println("\n=== Ejercicio 8 ===");
        System.out.println("Total con doble tipo: " + listarDobleTipo());

        System.out.println("\n=== Ejercicio 9 ===");
        String[] leg = legendarios();
        System.out.println("Legendarios (" + leg.length + "):");
        for (int i = 0; i < leg.length; i++) {
            System.out.println("  " + leg[i]);
        }

        System.out.println("\n=== Ejercicio 10 ===");
        System.out.println(invertir("Pikachu"));
        System.out.println("Vocales en Bulbasaur: " + contarVocales("Bulbasaur"));

        System.out.println("\n=== Ejercicio 11 ===");
        System.out.println("Fuego es débil a: " + debilidad("Fuego"));
        System.out.println("Hada es débil a: " + debilidad("Hada"));

        System.out.println("\n=== Ejercicio 12 ===");
        imprimirTabla();

        System.out.println("\n=== Ejercicio 13 ===");
        System.out.println("Ganador: " + batalla(3, 1));
    }
}
