/**
 * Revisa automáticamente las respuestas de Ejercicios.java y calcula el puntaje.
 * Ejecutar con:  javac -encoding UTF-8 *.java && java Verificador
 *
 * (Los ejercicios 1 y 12 solo imprimen en pantalla: revisa su formato
 *  con "java Ejercicios". Aquí solo se verifica lo que devuelven los demás.)
 */
public class Verificador {

    static int puntos = 0;

    static void revisar(String nombre, int valor, boolean correcto) {
        if (correcto) {
            puntos += valor;
            System.out.println("[OK]    " + nombre + "  (+" + valor + ")");
        } else {
            System.out.println("[FALLA] " + nombre);
        }
    }

    static boolean mismosElementos(String[] obtenido, String[] esperado) {
        if (obtenido == null || obtenido.length != esperado.length) {
            return false;
        }
        for (int i = 0; i < esperado.length; i++) {
            if (!esperado[i].equals(obtenido[i])) {
                return false;
            }
        }
        return true;
    }

    static Pokemon buscar(String nombre) {
        for (int i = 0; i < Ejercicios.pokemones.length; i++) {
            if (Ejercicios.pokemones[i].nombre.equals(nombre)) {
                return Ejercicios.pokemones[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Ejercicios 1 y 12: revisar visualmente con 'java Ejercicios' (12 pts)\n");

        revisar("Ej 2  contarPorTipo", 8,
                Ejercicios.contarPorTipo("Fuego") == 4
                && Ejercicios.contarPorTipo("Volador") == 7
                && Ejercicios.contarPorTipo("Siniestro") == 0);

        revisar("Ej 3  masFuerte", 8, "Dragonite".equals(Ejercicios.masFuerte()));

        revisar("Ej 4  promedioHp", 6, Math.abs(Ejercicios.promedioHp() - 63.6) < 0.0001);

        revisar("Ej 5  concatenarNombres", 8, ("Bulbasaur, Charmander, Squirtle, Pidgey, Ekans, Pikachu, "
                + "Sandshrew, Vulpix, Jigglypuff, Meowth, Psyduck, Growlithe, Abra, Machop, Tentacool, "
                + "Geodude, Magnemite, Gengar, Onix, Cubone, Scyther, Gyarados, Lapras, Eevee, Snorlax, "
                + "Articuno, Zapdos, Moltres, Dragonite, Mewtwo").equals(Ejercicios.concatenarNombres()));

        Pokemon[] p = Ejercicios.pokemones;
        String primeroOriginal = p[0].nombre;
        String[] esperado = {"Abra", "Articuno", "Bulbasaur", "Charmander", "Cubone", "Dragonite",
                "Eevee", "Ekans", "Gengar", "Geodude", "Growlithe", "Gyarados", "Jigglypuff", "Lapras",
                "Machop", "Magnemite", "Meowth", "Mewtwo", "Moltres", "Onix", "Pidgey", "Pikachu",
                "Psyduck", "Sandshrew", "Scyther", "Snorlax", "Squirtle", "Tentacool", "Vulpix", "Zapdos"};
        Pokemon[] ordenados = Ejercicios.ordenarPorNombre();
        boolean ordenOk = ordenados != null && ordenados.length == esperado.length;
        for (int i = 0; ordenOk && i < esperado.length; i++) {
            ordenOk = ordenados[i] != null && esperado[i].equals(ordenados[i].nombre);
        }
        // El Pokémon completo debe moverse junto (no solo el nombre)
        ordenOk = ordenOk && ordenados[0].numero == 63 && ordenados[29].hp == 90;
        revisar("Ej 6  ordenarPorNombre (sin cambiar el original)", 12,
                ordenOk && p[0].nombre.equals(primeroOriginal));

        revisar("Ej 7  primeroMasRapidoQue", 8,
                "Pikachu".equals(Ejercicios.primeroMasRapidoQue(80))
                && "Ninguno".equals(Ejercicios.primeroMasRapidoQue(200)));

        revisar("Ej 8  listarDobleTipo (cantidad)", 7, Ejercicios.listarDobleTipo() == 15);

        revisar("Ej 9  legendarios", 7, mismosElementos(Ejercicios.legendarios(),
                new String[]{"Articuno", "Zapdos", "Moltres", "Mewtwo"}));

        revisar("Ej 10 invertir / contarVocales", 8,
                "uhcakiP".equals(Ejercicios.invertir("Pikachu"))
                && Ejercicios.contarVocales("Bulbasaur") == 4
                && Ejercicios.contarVocales("ONIX") == 2);

        revisar("Ej 11 debilidad", 6,
                "Agua".equals(Ejercicios.debilidad("Fuego"))
                && "Planta".equals(Ejercicios.debilidad("Agua"))
                && "Fuego".equals(Ejercicios.debilidad("Planta"))
                && "Tierra".equals(Ejercicios.debilidad("Electrico"))
                && "Agua".equals(Ejercicios.debilidad("Roca"))
                && "Desconocida".equals(Ejercicios.debilidad("Hada")));

        Pokemon pikachu = buscar("Pikachu");
        Pokemon charmander = buscar("Charmander");
        Pokemon snorlax = buscar("Snorlax");
        Pokemon onix = buscar("Onix");
        int hpSnorlax = snorlax.hp;
        int hpOnix = onix.hp;
        revisar("Ej 13 batalla", 10,
                "Pikachu".equals(Ejercicios.batalla(pikachu, charmander))
                && "Snorlax".equals(Ejercicios.batalla(snorlax, onix))
                && "Snorlax".equals(Ejercicios.batalla(onix, snorlax))
                && snorlax.hp == hpSnorlax && onix.hp == hpOnix);

        System.out.println("\nPuntaje automático: " + puntos + " / 88  (+12 pts de revisión visual)");
    }
}
