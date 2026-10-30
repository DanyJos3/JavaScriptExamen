/**
 * SOLUCIONES de la prueba (para el profesor).
 * Borrar este archivo antes de entregar la prueba a los estudiantes.
 */
public class Soluciones {

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



    // EJERCICIO 1
    public static void listarNombres() {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + ". " + nombres[i]);
        }
    }

    // EJERCICIO 2
    public static int contarPorTipo(String tipo) {
        int contador = 0;
        for (int i = 0; i < tipos.length; i++) {
            for (int j = 0; j < tipos[i].length; j++) {
                if (tipos[i][j].equals(tipo)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    // EJERCICIO 3
    public static String masFuerte() {
        int posMayor = 0;
        for (int i = 1; i < ataque.length; i++) {
            if (ataque[i] > ataque[posMayor]) {
                posMayor = i;
            }
        }
        return nombres[posMayor];
    }

    // EJERCICIO 4
    public static double promedioHp() {
        int suma = 0;
        for (int i = 0; i < hp.length; i++) {
            suma += hp[i];
        }
        return (double) suma / hp.length;
    }

    // EJERCICIO 5
    public static String concatenarNombres() {
        String resultado = "";
        for (int i = 0; i < nombres.length; i++) {
            resultado += nombres[i];
            if (i < nombres.length - 1) {
                resultado += ", ";
            }
        }
        return resultado;
    }

    // EJERCICIO 6 (método burbuja)
    public static String[] nombresOrdenados() {
        String[] copia = new String[nombres.length];
        for (int i = 0; i < nombres.length; i++) {
            copia[i] = nombres[i];
        }
        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = 0; j < copia.length - 1 - i; j++) {
                if (copia[j].compareTo(copia[j + 1]) > 0) {
                    String aux = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = aux;
                }
            }
        }
        return copia;
    }

    // EJERCICIO 7
    public static String primeroMasRapidoQue(int minimo) {
        int i = 0;
        while (i < velocidad.length) {
            if (velocidad[i] > minimo) {
                return nombres[i];
            }
            i++;
        }
        return "Ninguno";
    }

    // EJERCICIO 8
    public static int listarDobleTipo() {
        int contador = 0;
        for (int i = 0; i < nombres.length; i++) {
            if (tipos[i].length == 2) {
                System.out.println(nombres[i] + " (" + tipos[i][0] + "/" + tipos[i][1] + ")");
                contador++;
            }
        }
        return contador;
    }

    // EJERCICIO 9
    public static String[] legendarios() {
        int cantidad = 0;
        for (int i = 0; i < legendario.length; i++) {
            if (legendario[i]) {
                cantidad++;
            }
        }
        String[] resultado = new String[cantidad];
        int pos = 0;
        for (int i = 0; i < legendario.length; i++) {
            if (legendario[i]) {
                resultado[pos] = nombres[i];
                pos++;
            }
        }
        return resultado;
    }

    // EJERCICIO 10
    public static String invertir(String texto) {
        String resultado = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }
        return resultado;
    }

    public static int contarVocales(String texto) {
        int contador = 0;
        String minusculas = texto.toLowerCase();
        for (int i = 0; i < minusculas.length(); i++) {
            char c = minusculas.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    // EJERCICIO 11
    public static String debilidad(String tipo) {
        switch (tipo) {
            case "Fuego":
                return "Agua";
            case "Agua":
                return "Planta";
            case "Planta":
                return "Fuego";
            case "Electrico":
                return "Tierra";
            case "Roca":
                return "Agua";
            default:
                return "Desconocida";
        }
    }

    // EJERCICIO 12
    public static void imprimirTabla() {
        System.out.printf("%-4s %-12s %-4s %-4s %s%n", "#", "Nombre", "HP", "ATQ", "TOTAL");
        for (int i = 0; i < nombres.length; i++) {
            int total = hp[i] + ataque[i] + defensa[i] + velocidad[i];
            System.out.printf("%-4d %-12s %-4d %-4d %d%n", numeros[i], nombres[i], hp[i], ataque[i], total);
        }
    }

    // EJERCICIO 13
    public static String batalla(int a, int b) {
        int atacante = a;
        int defensor = b;
        if (velocidad[b] > velocidad[a]) {
            atacante = b;
            defensor = a;
        }
        int hpAtacante = hp[atacante];
        int hpDefensor = hp[defensor];
        int turno = 1;

        while (hpAtacante > 0 && hpDefensor > 0) {
            int dano = ataque[atacante] - defensa[defensor] / 2;
            if (dano < 1) {
                dano = 1;
            }
            hpDefensor -= dano;
            int quedan = hpDefensor;
            if (quedan < 0) {
                quedan = 0;
            }
            System.out.println("Turno " + turno + ": " + nombres[atacante] + " ataca a "
                    + nombres[defensor] + " y le quita " + dano + " HP (le quedan " + quedan + ")");

            if (hpDefensor <= 0) {
                return nombres[atacante];
            }

            // Intercambiar roles para el siguiente turno
            int aux = atacante;
            atacante = defensor;
            defensor = aux;
            aux = hpAtacante;
            hpAtacante = hpDefensor;
            hpDefensor = aux;
            turno++;
        }
        return nombres[atacante];
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
