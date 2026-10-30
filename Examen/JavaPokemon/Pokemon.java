/**
 * Representa un Pokémon con sus datos básicos.
 * (Equivalente a cada objeto de la lista JSON de Pokémon.)
 */
public class Pokemon {

    private int numero;
    private String nombre;
    private String[] tipos;       // 1 o 2 tipos, ej: {"Planta", "Veneno"}
    private int hp;
    private int ataque;
    private int defensa;
    private int velocidad;
    private String[] habilidades; // poderes / habilidades
    private boolean legendario;

    public Pokemon(int numero, String nombre, String[] tipos, int hp, int ataque,
                   int defensa, int velocidad, String[] habilidades, boolean legendario) {
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

    public int getNumero() { return numero; }
    public String getNombre() { return nombre; }
    public String[] getTipos() { return tipos; }
    public int getHp() { return hp; }
    public int getAtaque() { return ataque; }
    public int getDefensa() { return defensa; }
    public int getVelocidad() { return velocidad; }
    public String[] getHabilidades() { return habilidades; }
    public boolean isLegendario() { return legendario; }

    @Override
    public String toString() {
        return "#" + numero + " " + nombre;
    }
}
