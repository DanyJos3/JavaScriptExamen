import java.util.ArrayList;

/**
 * Revisa automáticamente las respuestas de Ejercicios.java y calcula el puntaje.
 * Ejecutar con:  javac *.java && java Verificador
 *
 * (Los ejercicios 1, 8 y 12 imprimen en pantalla: revisa visualmente su formato
 *  con "java Ejercicios". Aquí solo se verifica lo que devuelven.)
 */
public class Verificador {

    private static int puntos = 0;

    private static void revisar(String nombre, int valor, boolean correcto) {
        if (correcto) {
            puntos += valor;
            System.out.println("[OK]    " + nombre + "  (+" + valor + ")");
        } else {
            System.out.println("[FALLA] " + nombre);
        }
    }

    public static void main(String[] args) {
        Pokemon[] p = Pokedex.obtenerPokemones();
        System.out.println("Ejercicios 1 y 12: revisar visualmente con 'java Ejercicios' (12 pts)\n");

        revisar("Ej 2  contarPorTipo", 8,
                Ejercicios.contarPorTipo(p, "Fuego") == 3
                && Ejercicios.contarPorTipo(p, "Volador") == 4
                && Ejercicios.contarPorTipo(p, "Acero") == 0);

        Pokemon fuerte = Ejercicios.masFuerte(p);
        revisar("Ej 3  masFuerte", 8, fuerte != null && fuerte.getNombre().equals("Dragonite"));

        revisar("Ej 4  promedioHp", 6, Math.abs(Ejercicios.promedioHp(p) - 1253.0 / 18) < 0.0001);

        revisar("Ej 5  concatenarNombres", 8, Ejercicios.concatenarNombres(p).equals(
                "Bulbasaur, Charmander, Squirtle, Pikachu, Vulpix, Jigglypuff, Psyduck, Machop, "
                + "Geodude, Gengar, Onix, Eevee, Snorlax, Articuno, Zapdos, Moltres, Dragonite, Mewtwo"));

        String[] esperado = {"Articuno", "Bulbasaur", "Charmander", "Dragonite", "Eevee", "Gengar",
                "Geodude", "Jigglypuff", "Machop", "Mewtwo", "Moltres", "Onix", "Pikachu",
                "Psyduck", "Snorlax", "Squirtle", "Vulpix", "Zapdos"};
        String[] ordenados = Ejercicios.nombresOrdenados(p);
        boolean ordenOk = ordenados != null && ordenados.length == esperado.length;
        for (int i = 0; ordenOk && i < esperado.length; i++) {
            ordenOk = esperado[i].equals(ordenados[i]);
        }
        revisar("Ej 6  nombresOrdenados", 12, ordenOk);

        Pokemon rapido = Ejercicios.primeroMasRapidoQue(p, 80);
        revisar("Ej 7  primeroMasRapidoQue", 8,
                rapido != null && rapido.getNombre().equals("Pikachu")
                && Ejercicios.primeroMasRapidoQue(p, 200) == null);

        revisar("Ej 8  listarDobleTipo (cantidad)", 7, Ejercicios.listarDobleTipo(p) == 9);

        ArrayList<String> leg = Ejercicios.legendarios(p);
        revisar("Ej 9  legendarios", 7, leg != null && leg.toString().equals("[Articuno, Zapdos, Moltres, Mewtwo]"));

        revisar("Ej 10 invertir / contarVocales", 8,
                Ejercicios.invertir("Pikachu").equals("uhcakiP")
                && Ejercicios.contarVocales("Bulbasaur") == 4
                && Ejercicios.contarVocales("ONIX") == 2);

        revisar("Ej 11 debilidad", 6,
                Ejercicios.debilidad("Fuego").equals("Agua")
                && Ejercicios.debilidad("Agua").equals("Planta")
                && Ejercicios.debilidad("Planta").equals("Fuego")
                && Ejercicios.debilidad("Electrico").equals("Tierra")
                && Ejercicios.debilidad("Roca").equals("Agua")
                && Ejercicios.debilidad("Hada").equals("Desconocida"));

        revisar("Ej 13 batalla", 10,
                Ejercicios.batalla(p[3], p[1]).equals("Pikachu")     // Pikachu vs Charmander
                && Ejercicios.batalla(p[12], p[10]).equals("Snorlax")  // Snorlax vs Onix
                && Ejercicios.batalla(p[10], p[12]).equals("Snorlax"));

        System.out.println("\nPuntaje automático: " + puntos + " / 88  (+12 pts de revisión visual)");
    }
}
