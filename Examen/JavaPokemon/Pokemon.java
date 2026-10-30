/**
 * Ficha de un Pokémon (NO es necesario modificar ni entender este archivo).
 *
 * Es el equivalente a cada objeto de la lista JSON:
 *   { "numero": 1, "nombre": "Bulbasaur", "tipos": ["Planta", "Veneno"],
 *     "hp": 45, "ataque": 49, "defensa": 49, "velocidad": 45,
 *     "habilidades": ["Espesura", "Clorofila"], "legendario": false }
 *
 * Para leer un dato se usa el punto, igual que en JavaScript:
 *   pokemones[0].nombre    -> "Bulbasaur"
 *   pokemones[0].tipos[1]  -> "Veneno"
 *   pokemones[0].hp        -> 45
 */
public class Pokemon {
    int numero;
    String nombre;
    String[] tipos;
    int hp;
    int ataque;
    int defensa;
    int velocidad;
    String[] habilidades;
    boolean legendario;

    Pokemon(int numero, String nombre, String[] tipos, int hp, int ataque, int defensa,
            int velocidad, String[] habilidades, boolean legendario) {
        this.numero = numero;
        this.nombre = nombre;
        this.tipos = tipos;
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.habilidades = habilidades;
        this.legendario = legendario;
    }
}
