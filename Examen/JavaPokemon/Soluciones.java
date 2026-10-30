/**
 * SOLUCIONES de la prueba (para el profesor).
 * Borrar este archivo antes de entregar la prueba a los estudiantes.
 */
public class Soluciones {

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
        //          #    nombre        tipos                                   HP  ATQ  DEF  VEL  habilidades                                              legendario
        new Pokemon(1,   "Bulbasaur",  new String[]{"Planta", "Veneno"},       45,  49,  49,  45, new String[]{"Espesura", "Clorofila"},                   false),
        new Pokemon(4,   "Charmander", new String[]{"Fuego"},                  39,  52,  43,  65, new String[]{"Mar Llamas", "Poder Solar"},               false),
        new Pokemon(7,   "Squirtle",   new String[]{"Agua"},                   44,  48,  65,  43, new String[]{"Torrente", "Cura Lluvia"},                 false),
        new Pokemon(16,  "Pidgey",     new String[]{"Normal", "Volador"},      40,  45,  40,  56, new String[]{"Vista Lince", "Tumbos"},                   false),
        new Pokemon(23,  "Ekans",      new String[]{"Veneno"},                 35,  60,  44,  55, new String[]{"Intimidacion", "Mudar"},                   false),
        new Pokemon(25,  "Pikachu",    new String[]{"Electrico"},              35,  55,  40,  90, new String[]{"Electricidad Estatica", "Pararrayos"},     false),
        new Pokemon(27,  "Sandshrew",  new String[]{"Tierra"},                 50,  75,  85,  40, new String[]{"Velo Arena"},                              false),
        new Pokemon(37,  "Vulpix",     new String[]{"Fuego"},                  38,  41,  40,  65, new String[]{"Absorbe Fuego"},                           false),
        new Pokemon(39,  "Jigglypuff", new String[]{"Normal", "Hada"},        115,  45,  20,  20, new String[]{"Gran Encanto", "Tenacidad"},               false),
        new Pokemon(52,  "Meowth",     new String[]{"Normal"},                 40,  45,  35,  90, new String[]{"Recogida", "Experto"},                     false),
        new Pokemon(54,  "Psyduck",    new String[]{"Agua"},                   50,  52,  48,  55, new String[]{"Humedad", "Aclimatacion"},                 false),
        new Pokemon(58,  "Growlithe",  new String[]{"Fuego"},                  55,  70,  45,  60, new String[]{"Intimidacion", "Absorbe Fuego"},           false),
        new Pokemon(63,  "Abra",       new String[]{"Psiquico"},               25,  20,  15,  90, new String[]{"Sincronia", "Foco Interno"},               false),
        new Pokemon(66,  "Machop",     new String[]{"Lucha"},                  70,  80,  50,  35, new String[]{"Agallas", "Indefenso"},                    false),
        new Pokemon(72,  "Tentacool",  new String[]{"Agua", "Veneno"},         40,  40,  35,  70, new String[]{"Cuerpo Puro", "Lodo Liquido"},             false),
        new Pokemon(74,  "Geodude",    new String[]{"Roca", "Tierra"},         40,  80, 100,  20, new String[]{"Cabeza Roca", "Robustez"},                 false),
        new Pokemon(81,  "Magnemite",  new String[]{"Electrico", "Acero"},     25,  35,  70,  45, new String[]{"Iman", "Robustez"},                        false),
        new Pokemon(94,  "Gengar",     new String[]{"Fantasma", "Veneno"},     60,  65,  60, 110, new String[]{"Cuerpo Maldito"},                          false),
        new Pokemon(95,  "Onix",       new String[]{"Roca", "Tierra"},         35,  45, 160,  70, new String[]{"Cabeza Roca", "Robustez"},                 false),
        new Pokemon(104, "Cubone",     new String[]{"Tierra"},                 50,  50,  95,  35, new String[]{"Cabeza Roca", "Pararrayos"},               false),
        new Pokemon(123, "Scyther",    new String[]{"Bicho", "Volador"},       70, 110,  80, 105, new String[]{"Enjambre", "Experto"},                     false),
        new Pokemon(130, "Gyarados",   new String[]{"Agua", "Volador"},        95, 125,  79,  81, new String[]{"Intimidacion"},                            false),
        new Pokemon(131, "Lapras",     new String[]{"Agua", "Hielo"},         130,  85,  80,  60, new String[]{"Absorbe Agua", "Caparazon"},               false),
        new Pokemon(133, "Eevee",      new String[]{"Normal"},                 55,  55,  50,  55, new String[]{"Fuga", "Adaptable"},                       false),
        new Pokemon(143, "Snorlax",    new String[]{"Normal"},                160, 110,  65,  30, new String[]{"Inmunidad", "Sebo"},                       false),
        new Pokemon(144, "Articuno",   new String[]{"Hielo", "Volador"},       90,  85, 100,  85, new String[]{"Presion"},                                 true),
        new Pokemon(145, "Zapdos",     new String[]{"Electrico", "Volador"},   90,  90,  85, 100, new String[]{"Presion"},                                 true),
        new Pokemon(146, "Moltres",    new String[]{"Fuego", "Volador"},       90, 100,  90,  90, new String[]{"Presion"},                                 true),
        new Pokemon(149, "Dragonite",  new String[]{"Dragon", "Volador"},      91, 134,  95,  80, new String[]{"Foco Interno"},                            false),
        new Pokemon(150, "Mewtwo",     new String[]{"Psiquico"},              106, 110,  90, 130, new String[]{"Presion"},                                 true)
    };


    // EJERCICIO 1
    public static void listarNombres() {
        for (int i = 0; i < pokemones.length; i++) {
            System.out.println((i + 1) + ". " + pokemones[i].nombre);
        }
    }

    // EJERCICIO 2
    public static int contarPorTipo(String tipo) {
        int contador = 0;
        for (int i = 0; i < pokemones.length; i++) {
            for (int j = 0; j < pokemones[i].tipos.length; j++) {
                if (pokemones[i].tipos[j].equals(tipo)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    // EJERCICIO 3
    public static String masFuerte() {
        Pokemon mayor = pokemones[0];
        for (int i = 1; i < pokemones.length; i++) {
            if (pokemones[i].ataque > mayor.ataque) {
                mayor = pokemones[i];
            }
        }
        return mayor.nombre;
    }

    // EJERCICIO 4
    public static double promedioHp() {
        int suma = 0;
        for (int i = 0; i < pokemones.length; i++) {
            suma += pokemones[i].hp;
        }
        return (double) suma / pokemones.length;
    }

    // EJERCICIO 5
    public static String concatenarNombres() {
        String resultado = "";
        for (int i = 0; i < pokemones.length; i++) {
            resultado += pokemones[i].nombre;
            if (i < pokemones.length - 1) {
                resultado += ", ";
            }
        }
        return resultado;
    }

    // EJERCICIO 6 (método burbuja)
    public static Pokemon[] ordenarPorNombre() {
        Pokemon[] copia = new Pokemon[pokemones.length];
        for (int i = 0; i < pokemones.length; i++) {
            copia[i] = pokemones[i];
        }
        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = 0; j < copia.length - 1 - i; j++) {
                if (copia[j].nombre.compareTo(copia[j + 1].nombre) > 0) {
                    Pokemon aux = copia[j];
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
        while (i < pokemones.length) {
            if (pokemones[i].velocidad > minimo) {
                return pokemones[i].nombre;
            }
            i++;
        }
        return "Ninguno";
    }

    // EJERCICIO 8
    public static int listarDobleTipo() {
        int contador = 0;
        for (int i = 0; i < pokemones.length; i++) {
            Pokemon p = pokemones[i];
            if (p.tipos.length == 2) {
                System.out.println(p.nombre + " (" + p.tipos[0] + "/" + p.tipos[1] + ")");
                contador++;
            }
        }
        return contador;
    }

    // EJERCICIO 9
    public static String[] legendarios() {
        int cantidad = 0;
        for (int i = 0; i < pokemones.length; i++) {
            if (pokemones[i].legendario) {
                cantidad++;
            }
        }
        String[] resultado = new String[cantidad];
        int pos = 0;
        for (int i = 0; i < pokemones.length; i++) {
            if (pokemones[i].legendario) {
                resultado[pos] = pokemones[i].nombre;
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
        for (int i = 0; i < pokemones.length; i++) {
            Pokemon p = pokemones[i];
            int total = p.hp + p.ataque + p.defensa + p.velocidad;
            System.out.printf("%-4d %-12s %-4d %-4d %d%n", p.numero, p.nombre, p.hp, p.ataque, total);
        }
    }

    // EJERCICIO 13
    public static String batalla(Pokemon a, Pokemon b) {
        Pokemon atacante = a;
        Pokemon defensor = b;
        if (b.velocidad > a.velocidad) {
            atacante = b;
            defensor = a;
        }
        int hpAtacante = atacante.hp;
        int hpDefensor = defensor.hp;
        int turno = 1;

        while (hpAtacante > 0 && hpDefensor > 0) {
            int dano = atacante.ataque - defensor.defensa / 2;
            if (dano < 1) {
                dano = 1;
            }
            hpDefensor -= dano;
            int quedan = hpDefensor;
            if (quedan < 0) {
                quedan = 0;
            }
            System.out.println("Turno " + turno + ": " + atacante.nombre + " ataca a "
                    + defensor.nombre + " y le quita " + dano + " HP (le quedan " + quedan + ")");

            if (hpDefensor <= 0) {
                return atacante.nombre;
            }

            // Intercambiar roles para el siguiente turno
            Pokemon auxPokemon = atacante;
            atacante = defensor;
            defensor = auxPokemon;
            int auxHp = hpAtacante;
            hpAtacante = hpDefensor;
            hpDefensor = auxHp;
            turno++;
        }
        return atacante.nombre;
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
        System.out.println("Ganador: " + batalla(pokemones[5], pokemones[1]));
    }
}
