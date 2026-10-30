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

        String primeroOriginal = Ejercicios.nombres[0];
        String[] esperado = {"Articuno", "Bulbasaur", "Charmander", "Dragonite", "Eevee", "Gengar",
                "Geodude", "Jigglypuff", "Machop", "Mewtwo", "Moltres", "Onix", "Pikachu",
                "Psyduck", "Snorlax", "Squirtle", "Vulpix", "Zapdos"};
        revisar("Ej 6  nombresOrdenados (sin cambiar el original)", 12,
                mismosElementos(Ejercicios.nombresOrdenados(), esperado)
                && Ejercicios.nombres[0].equals(primeroOriginal));

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

        int hpSnorlax = Ejercicios.hp[12];
        revisar("Ej 13 batalla", 10,
                "Pikachu".equals(Ejercicios.batalla(3, 1))       // Pikachu vs Charmander
                && "Snorlax".equals(Ejercicios.batalla(12, 10))  // Snorlax vs Onix
                && "Snorlax".equals(Ejercicios.batalla(10, 12))  // Onix vs Snorlax
                && Ejercicios.hp[12] == hpSnorlax);

        System.out.println("\nPuntaje automático: " + puntos + " / 88  (+12 pts de revisión visual)");
    }
}
