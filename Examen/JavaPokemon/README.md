# Prueba de Java básico: Pokémon

Prueba de fundamentos de Java con un "Pokédex" en lugar de la lista JSON de Pokémon.

## Sin clases ni objetos

La prueba solo usa lo que se ve **antes** de programación orientada a objetos: variables, `if`, `switch`, `for`, `while`, arrays (también un array de arrays), Strings y métodos `static`. Los datos de cada Pokémon están en **arrays paralelos**: la posición `i` de cada array corresponde al mismo Pokémon.

```java
nombres[0]   = "Bulbasaur"
tipos[0]     = {"Planta", "Veneno"}
hp[0]        = 45
ataque[0]    = 49
legendario[0] = false
```

## Archivos

| Archivo | Para quién | Descripción |
|---|---|---|
| `Ejercicios.java` | Estudiante | **La prueba.** Los datos de 18 Pokémon arriba y 13 métodos con `TODO` para completar. |
| `Verificador.java` | Estudiante / Profesor | Corrige automáticamente y muestra el puntaje. |
| `Soluciones.java` | **Solo profesor** | Soluciones. **Bórralo antes de entregar la prueba.** |

## Cómo ejecutar

```bash
javac -encoding UTF-8 *.java
java Ejercicios     # ver los resultados propios
java Verificador    # corrección automática
```

Funciona con Java 8 o más reciente (no usa `var`, `record` ni el `switch` con flechas).

## Reglas para el estudiante

- No usar `Arrays.sort()`, `String.join()`, `ArrayList` ni streams.
- Comparar Strings con `equals()` / `compareTo()`, nunca con `==`.
- No cambiar los nombres ni los parámetros de los métodos.

## Ejercicios y puntaje (100 pts)

| # | Tema | Qué se pide | Pts |
|---|---|---|---|
| 1 | `for` clásico | Listar nombres numerados (`1. Bulbasaur`) | 5 |
| 2 | Array de arrays, ciclos anidados, `equals` | Contar Pokémon de un tipo | 8 |
| 3 | Máximo (guardar la posición) | Nombre del Pokémon con mayor ataque | 8 |
| 4 | Acumulador, casteo a `double` | Promedio de HP | 6 |
| 5 | Concatenar Strings | Nombres separados por `", "` sin coma final | 8 |
| 6 | Copiar un array, burbuja, `compareTo` | Nombres en orden alfabético sin modificar el original | 12 |
| 7 | `while` con salida temprana | Primer Pokémon con velocidad mayor a X | 8 |
| 8 | `if`, largo de un array | Mostrar los que tienen dos tipos: `Bulbasaur (Planta/Veneno)` | 7 |
| 9 | Crear y llenar un array del tamaño justo | Nombres de los legendarios | 7 |
| 10 | `charAt`, recorrer un String | Invertir un nombre y contar vocales | 8 |
| 11 | `switch` | Debilidad según el tipo | 6 |
| 12 | `printf` | Tabla con número, nombre, HP, ataque y total | 7 |
| 13 | **Desafío:** `while` y lógica | Batalla por turnos entre dos Pokémon (recibe sus posiciones) | 10 |

El verificador revisa 88 puntos de forma automática. Los ejercicios 1 y 12 (12 pts) se revisan a mano mirando la salida de `java Ejercicios`. Del ejercicio 8 el verificador solo revisa la cantidad devuelta; el formato también se mira en pantalla.

### Detalles a los que conviene poner atención al corregir

- **Ej. 4:** `suma / pokemones.length` con dos `int` da `69.0` en vez de `69.61...`.
- **Ej. 5:** el error típico es dejar una `", "` al final.
- **Ej. 6:** si ordenan directamente `nombres` sin copiarlo, el verificador lo marca como falla. El orden correcto pone `Gengar` antes que `Geodude` (se compara letra por letra). Sirve para ver si entendieron `compareTo`.
- **Ej. 13:** la división `defensa / 2` es entera. Se prueba en los dos órdenes de parámetros (`Snorlax` vs `Onix` y `Onix` vs `Snorlax`) para comprobar que empieza el más rápido, y se revisa que no modifiquen el array `hp`.

## Variantes (para hacer otra versión de la prueba)

- Ej. 2 con `"Normal"` (3) o `"Agua"` (2).
- Ej. 3 con la mayor **defensa** (Onix, 160) o el menor HP (Pikachu, 35).
- Ej. 6 en orden inverso (Z → A) o por número de ataque.
- Ej. 7 con `do-while`.
- Buscar los Pokémon que tienen una habilidad concreta, por ejemplo `"Presion"`.
