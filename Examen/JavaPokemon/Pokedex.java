/**
 * "Base de datos" de Pokémon: el equivalente en Java a la lista JSON.
 *
 * En JSON sería algo como:
 *   { "numero": 1, "nombre": "Bulbasaur", "tipos": ["Planta", "Veneno"],
 *     "hp": 45, "ataque": 49, "defensa": 49, "velocidad": 45,
 *     "habilidades": ["Espesura", "Clorofila"], "legendario": false }
 *
 * NO modificar este archivo durante la prueba.
 */
public class Pokedex {

    public static Pokemon[] obtenerPokemones() {
        Pokemon[] lista = {
            //          #   nombre        tipos                                       HP  ATQ  DEF  VEL  habilidades                                         legendario
            new Pokemon(1,   "Bulbasaur",  new String[]{"Planta", "Veneno"},          45,  49,  49,  45, new String[]{"Espesura", "Clorofila"},             false),
            new Pokemon(4,   "Charmander", new String[]{"Fuego"},                     39,  52,  43,  65, new String[]{"Mar Llamas", "Poder Solar"},         false),
            new Pokemon(7,   "Squirtle",   new String[]{"Agua"},                      44,  48,  65,  43, new String[]{"Torrente", "Cura Lluvia"},           false),
            new Pokemon(25,  "Pikachu",    new String[]{"Electrico"},                 35,  55,  40,  90, new String[]{"Electricidad Estatica", "Pararrayos"}, false),
            new Pokemon(37,  "Vulpix",     new String[]{"Fuego"},                     38,  41,  40,  65, new String[]{"Absorbe Fuego"},                     false),
            new Pokemon(39,  "Jigglypuff", new String[]{"Normal", "Hada"},           115,  45,  20,  20, new String[]{"Gran Encanto", "Tenacidad"},         false),
            new Pokemon(54,  "Psyduck",    new String[]{"Agua"},                      50,  52,  48,  55, new String[]{"Humedad", "Aclimatacion"},           false),
            new Pokemon(66,  "Machop",     new String[]{"Lucha"},                     70,  80,  50,  35, new String[]{"Agallas", "Indefenso"},              false),
            new Pokemon(74,  "Geodude",    new String[]{"Roca", "Tierra"},            40,  80, 100,  20, new String[]{"Cabeza Roca", "Robustez"},           false),
            new Pokemon(94,  "Gengar",     new String[]{"Fantasma", "Veneno"},        60,  65,  60, 110, new String[]{"Cuerpo Maldito"},                    false),
            new Pokemon(95,  "Onix",       new String[]{"Roca", "Tierra"},            35,  45, 160,  70, new String[]{"Cabeza Roca", "Robustez"},           false),
            new Pokemon(133, "Eevee",      new String[]{"Normal"},                    55,  55,  50,  55, new String[]{"Fuga", "Adaptable"},                 false),
            new Pokemon(143, "Snorlax",    new String[]{"Normal"},                   160, 110,  65,  30, new String[]{"Inmunidad", "Sebo"},                 false),
            new Pokemon(144, "Articuno",   new String[]{"Hielo", "Volador"},          90,  85, 100,  85, new String[]{"Presion"},                           true),
            new Pokemon(145, "Zapdos",     new String[]{"Electrico", "Volador"},      90,  90,  85, 100, new String[]{"Presion"},                           true),
            new Pokemon(146, "Moltres",    new String[]{"Fuego", "Volador"},          90, 100,  90,  90, new String[]{"Presion"},                           true),
            new Pokemon(149, "Dragonite",  new String[]{"Dragon", "Volador"},         91, 134,  95,  80, new String[]{"Foco Interno"},                      false),
            new Pokemon(150, "Mewtwo",     new String[]{"Psiquico"},                 106, 110,  90, 130, new String[]{"Presion"},                           true)
        };
        return lista;
    }
}
