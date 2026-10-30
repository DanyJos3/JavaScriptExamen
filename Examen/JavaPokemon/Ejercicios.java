/**
 * PRUEBA DE JAVA BÁSICO - POKÉMON
 *
 * Completa cada método donde dice "TODO". No cambies los nombres ni los
 * parámetros de los métodos. Puedes agregar métodos auxiliares si quieres.
 *
 * Reglas:
 *  - NO usar Arrays.sort(), String.join(), ArrayList ni streams.
 *    (La idea es practicar ciclos y arrays "a mano".)
 *  - No modificar los datos de los Pokémon.
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
    // Es la "lista JSON" de Pokémon: un array de objetos Pokemon.
    // Cada Pokémon tiene: numero, nombre, tipos (array), hp, ataque, defensa,
    // velocidad, habilidades (array) y legendario (true/false).
    //
    // Se leen con punto, igual que en JavaScript:
    //    pokemones[0].nombre    -> "Bulbasaur"
    //    pokemones[0].tipos[1]  -> "Veneno"
    //    pokemones[0].hp        -> 45
    // =====================================================================
    static Pokemon[] pokemones = {
        //          #    nombre        tipos                                 HP   ATQ  DEF  VEL  habilidades                                             legendario
        new Pokemon(1,   "Bulbasaur",  new String[]{"Planta", "Veneno"},     45,  49,  49,  45, new String[]{"Espesura", "Clorofila"},                 false),
        new Pokemon(4,   "Charmander", new String[]{"Fuego"},                39,  52,  43,  65, new String[]{"Mar Llamas", "Poder Solar"},             false),
        new Pokemon(7,   "Squirtle",   new String[]{"Agua"},                 44,  48,  65,  43, new String[]{"Torrente", "Cura Lluvia"},               false),
        new Pokemon(25,  "Pikachu",    new String[]{"Electrico"},            35,  55,  40,  90, new String[]{"Electricidad Estatica", "Pararrayos"},   false),
        new Pokemon(37,  "Vulpix",     new String[]{"Fuego"},                38,  41,  40,  65, new String[]{"Absorbe Fuego"},                         false),
        new Pokemon(39,  "Jigglypuff", new String[]{"Normal", "Hada"},      115,  45,  20,  20, new String[]{"Gran Encanto", "Tenacidad"},             false),
        new Pokemon(54,  "Psyduck",    new String[]{"Agua"},                 50,  52,  48,  55, new String[]{"Humedad", "Aclimatacion"},               false),
        new Pokemon(66,  "Machop",     new String[]{"Lucha"},                70,  80,  50,  35, new String[]{"Agallas", "Indefenso"},                  false),
        new Pokemon(74,  "Geodude",    new String[]{"Roca", "Tierra"},       40,  80, 100,  20, new String[]{"Cabeza Roca", "Robustez"},               false),
        new Pokemon(94,  "Gengar",     new String[]{"Fantasma", "Veneno"},   60,  65,  60, 110, new String[]{"Cuerpo Maldito"},                        false),
        new Pokemon(95,  "Onix",       new String[]{"Roca", "Tierra"},       35,  45, 160,  70, new String[]{"Cabeza Roca", "Robustez"},               false),
        new Pokemon(133, "Eevee",      new String[]{"Normal"},               55,  55,  50,  55, new String[]{"Fuga", "Adaptable"},                     false),
        new Pokemon(143, "Snorlax",    new String[]{"Normal"},              160, 110,  65,  30, new String[]{"Inmunidad", "Sebo"},                     false),
        new Pokemon(144, "Articuno",   new String[]{"Hielo", "Volador"},     90,  85, 100,  85, new String[]{"Presion"},                               true),
        new Pokemon(145, "Zapdos",     new String[]{"Electrico", "Volador"}, 90,  90,  85, 100, new String[]{"Presion"},                               true),
        new Pokemon(146, "Moltres",    new String[]{"Fuego", "Volador"},     90, 100,  90,  90, new String[]{"Presion"},                               true),
        new Pokemon(149, "Dragonite",  new String[]{"Dragon", "Volador"},    91, 134,  95,  80, new String[]{"Foco Interno"},                          false),
        new Pokemon(150, "Mewtwo",     new String[]{"Psiquico"},            106, 110,  90, 130, new String[]{"Presion"},                               true)
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
    // EJERCICIO 2 (8 pts) - Ciclos anidados + comparar Strings
    // Devuelve cuántos Pokémon tienen el tipo indicado (en cualquiera de sus tipos).
    //    contarPorTipo("Fuego")   -> 3
    //    contarPorTipo("Volador") -> 4
    // Pista: pokemones[i].tipos es a su vez un array -> necesitas un ciclo dentro de otro.
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
    // EJERCICIO 6 (12 pts) - Ordenar objetos alfabéticamente (sin Arrays.sort)
    // Devuelve un NUEVO array de Pokemon ordenado por nombre (A -> Z).
    // El array "pokemones" original NO debe cambiar de orden (primero cópialo).
    //    -> Articuno, Bulbasaur, Charmander, Dragonite, ...
    // Pistas:
    //  - Método burbuja comparando los nombres con compareTo():
    //        a.compareTo(b) > 0  significa que "a" va DESPUÉS de "b".
    //  - Al intercambiar, se intercambia el Pokémon COMPLETO, no solo el nombre:
    //        Pokemon aux = copia[j];
    // =====================================================================
    public static Pokemon[] ordenarPorNombre() {
        // TODO
        return new Pokemon[0];
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
    // EJERCICIO 8 (7 pts) - Condicionales + largo de un array dentro de un objeto
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
    // Recibe dos Pokémon (a y b). Simula una batalla por turnos y devuelve el NOMBRE del ganador.
    // Reglas:
    //  - Empieza el más rápido (si empatan en velocidad, empieza a).
    //  - En cada turno el atacante le quita al otro:
    //        daño = ataque del atacante - (defensa del defensor / 2)
    //    Si el daño es menor a 1, el daño es 1.
    //  - Se turnan hasta que el HP de alguno llegue a 0 o menos.
    //  - Usa variables locales para el HP (NO cambies a.hp ni b.hp).
    //  - Imprime cada turno, por ejemplo:
    //        Turno 1: Pikachu ataca a Charmander y le quita 34 HP (le quedan 5)
    //
    //    batalla(pokemones[3], pokemones[1])  (Pikachu vs Charmander) -> "Pikachu"
    // =====================================================================
    public static String batalla(Pokemon a, Pokemon b) {
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
        Pokemon[] ordenados = ordenarPorNombre();
        for (int i = 0; i < ordenados.length; i++) {
            System.out.println(ordenados[i].nombre);
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
        System.out.println("Ganador: " + batalla(pokemones[3], pokemones[1]));
    }
}
