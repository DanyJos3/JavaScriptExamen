import java.util.ArrayList;

/**
 * SOLUCIONES de la prueba (para el profesor).
 * Borrar este archivo antes de entregar la prueba a los estudiantes.
 */
public class Soluciones {

    // EJERCICIO 1
    public static void listarNombres(Pokemon[] pokemones) {
        for (int i = 0; i < pokemones.length; i++) {
            System.out.println((i + 1) + ". " + pokemones[i].getNombre());
        }
    }

    // EJERCICIO 2
    public static int contarPorTipo(Pokemon[] pokemones, String tipo) {
        int contador = 0;
        for (Pokemon p : pokemones) {
            for (String t : p.getTipos()) {
                if (t.equals(tipo)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    // EJERCICIO 3
    public static Pokemon masFuerte(Pokemon[] pokemones) {
        Pokemon mejor = pokemones[0];
        for (int i = 1; i < pokemones.length; i++) {
            if (pokemones[i].getAtaque() > mejor.getAtaque()) {
                mejor = pokemones[i];
            }
        }
        return mejor;
    }

    // EJERCICIO 4
    public static double promedioHp(Pokemon[] pokemones) {
        int suma = 0;
        for (Pokemon p : pokemones) {
            suma += p.getHp();
        }
        return (double) suma / pokemones.length;
    }

    // EJERCICIO 5
    public static String concatenarNombres(Pokemon[] pokemones) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pokemones.length; i++) {
            sb.append(pokemones[i].getNombre());
            if (i < pokemones.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    // EJERCICIO 6 (método burbuja)
    public static String[] nombresOrdenados(Pokemon[] pokemones) {
        String[] nombres = new String[pokemones.length];
        for (int i = 0; i < pokemones.length; i++) {
            nombres[i] = pokemones[i].getNombre();
        }
        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = 0; j < nombres.length - 1 - i; j++) {
                if (nombres[j].compareTo(nombres[j + 1]) > 0) {
                    String aux = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = aux;
                }
            }
        }
        return nombres;
    }

    // EJERCICIO 7
    public static Pokemon primeroMasRapidoQue(Pokemon[] pokemones, int velocidad) {
        int i = 0;
        while (i < pokemones.length) {
            if (pokemones[i].getVelocidad() > velocidad) {
                return pokemones[i];
            }
            i++;
        }
        return null;
    }

    // EJERCICIO 8
    public static int listarDobleTipo(Pokemon[] pokemones) {
        int contador = 0;
        for (Pokemon p : pokemones) {
            String[] tipos = p.getTipos();
            if (tipos.length == 2) {
                System.out.println(p.getNombre() + " (" + tipos[0] + "/" + tipos[1] + ")");
                contador++;
            }
        }
        return contador;
    }

    // EJERCICIO 9
    public static ArrayList<String> legendarios(Pokemon[] pokemones) {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Pokemon p : pokemones) {
            if (p.isLegendario()) {
                resultado.add(p.getNombre());
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
    public static void imprimirTabla(Pokemon[] pokemones) {
        System.out.printf("%-4s %-12s %-4s %-4s %s%n", "#", "Nombre", "HP", "ATQ", "TOTAL");
        for (Pokemon p : pokemones) {
            int total = p.getHp() + p.getAtaque() + p.getDefensa() + p.getVelocidad();
            System.out.printf("%-4d %-12s %-4d %-4d %d%n",
                    p.getNumero(), p.getNombre(), p.getHp(), p.getAtaque(), total);
        }
    }

    // EJERCICIO 13
    public static String batalla(Pokemon a, Pokemon b) {
        Pokemon atacante = a;
        Pokemon defensor = b;
        if (b.getVelocidad() > a.getVelocidad()) {
            atacante = b;
            defensor = a;
        }
        int hpAtacante = atacante.getHp();
        int hpDefensor = defensor.getHp();
        int turno = 1;

        while (hpAtacante > 0 && hpDefensor > 0) {
            int dano = atacante.getAtaque() - defensor.getDefensa() / 2;
            if (dano < 1) {
                dano = 1;
            }
            hpDefensor -= dano;
            System.out.println("Turno " + turno + ": " + atacante.getNombre() + " ataca a "
                    + defensor.getNombre() + " y le quita " + dano + " HP (le quedan "
                    + Math.max(hpDefensor, 0) + ")");

            if (hpDefensor <= 0) {
                return atacante.getNombre();
            }

            // Intercambiar roles para el siguiente turno
            Pokemon auxP = atacante;
            atacante = defensor;
            defensor = auxP;
            int auxHp = hpAtacante;
            hpAtacante = hpDefensor;
            hpDefensor = auxHp;
            turno++;
        }
        return atacante.getNombre();
    }

    public static void main(String[] args) {
        Pokemon[] pokemones = Pokedex.obtenerPokemones();
        listarNombres(pokemones);
        System.out.println(contarPorTipo(pokemones, "Fuego") + " " + contarPorTipo(pokemones, "Volador"));
        System.out.println(masFuerte(pokemones));
        System.out.println(promedioHp(pokemones));
        System.out.println(concatenarNombres(pokemones));
        System.out.println(String.join(" ", nombresOrdenados(pokemones)));
        System.out.println(primeroMasRapidoQue(pokemones, 80) + " " + primeroMasRapidoQue(pokemones, 200));
        System.out.println(listarDobleTipo(pokemones));
        System.out.println(legendarios(pokemones));
        System.out.println(invertir("Pikachu") + " " + contarVocales("Bulbasaur"));
        System.out.println(debilidad("Fuego") + " " + debilidad("Hada"));
        imprimirTabla(pokemones);
        System.out.println("Ganador: " + batalla(pokemones[3], pokemones[1]));
        System.out.println("Ganador: " + batalla(pokemones[12], pokemones[10]));
    }
}
