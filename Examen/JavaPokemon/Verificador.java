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

    public static void main(String[] args) {
        System.out.println("Ejercicios 1 y 12: revisar visualmente con 'java Ejercicios' (12 pts)\n");

        revisar("Ej 2  contarPorTipo", 8,
                Ejercicios.contarPorTipo("Fuego") == 3
                && Ejercicios.contarPorTipo("Volador") == 4
                && Ejercicios.contarPorTipo("Acero") == 0);

        revisar("Ej 3  masFuerte", 8, "Dragonite".equals(Ejercicios.masFuerte()));

        revisar("Ej 4  promedioHp", 6, Math.abs(Ejercicios.promedioHp() - 1253.0 / 18) < 0.0001);

        revisar("Ej 5  concatenarNombres", 8, ("Bulbasaur, Charmander, Squirtle, Pikachu, Vulpix, "
                + "Jigglypuff, Psyduck, Machop, Geodude, Gengar, Onix, Eevee, Snorlax, Articuno, "
                + "Zapdos, Moltres, Dragonite, Mewtwo").equals(Ejercicios.concatenarNombres()));

        Pokemon[] p = Ejercicios.pokemones;
        String primeroOriginal = p[0].nombre;
        String[] esperado = {"Articuno", "Bulbasaur", "Charmander", "Dragonite", "Eevee", "Gengar",
                "Geodude", "Jigglypuff", "Machop", "Mewtwo", "Moltres", "Onix", "Pikachu",
                "Psyduck", "Snorlax", "Squirtle", "Vulpix", "Zapdos"};
        Pokemon[] ordenados = Ejercicios.ordenarPorNombre();
        boolean ordenOk = ordenados != null && ordenados.length == esperado.length;
        for (int i = 0; ordenOk && i < esperado.length; i++) {
            ordenOk = ordenados[i] != null && esperado[i].equals(ordenados[i].nombre);
        }
        // El Pokémon completo debe moverse junto (no solo el nombre)
        ordenOk = ordenOk && ordenados[0].numero == 144 && ordenados[17].hp == 90;
        revisar("Ej 6  ordenarPorNombre (sin cambiar el original)", 12,
                ordenOk && p[0].nombre.equals(primeroOriginal));

        revisar("Ej 7  primeroMasRapidoQue", 8,
                "Pikachu".equals(Ejercicios.primeroMasRapidoQue(80))
                && "Ninguno".equals(Ejercicios.primeroMasRapidoQue(200)));

        revisar("Ej 8  listarDobleTipo (cantidad)", 7, Ejercicios.listarDobleTipo() == 9);

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

        int hpSnorlax = p[12].hp;
        int hpOnix = p[10].hp;
        revisar("Ej 13 batalla", 10,
                "Pikachu".equals(Ejercicios.batalla(p[3], p[1]))       // Pikachu vs Charmander
                && "Snorlax".equals(Ejercicios.batalla(p[12], p[10]))  // Snorlax vs Onix
                && "Snorlax".equals(Ejercicios.batalla(p[10], p[12]))  // Onix vs Snorlax
                && p[12].hp == hpSnorlax && p[10].hp == hpOnix);

        System.out.println("\nPuntaje automático: " + puntos + " / 88  (+12 pts de revisión visual)");
    }
}
