# AyiGroup_Academy_c05

1) Se tiene un vector de tamaño 100 de números aleatorios (Valores entre 1 y 500)

    Se solicita:

    ● Crear una matriz 35x11

    ● En la matriz, en los primeros 100 lugares, guardar los datos del vector
multiplicado por 3.

    ● En los siguientes 50 lugares, agregar los datos del vector en forma
inversa y sumando las posiciones pares con las impares, agregar dicho
resultado a la matriz.

    ● En los últimos 150 lugares, agregar los primeros 150 celdas de la matriz
pero en forma invertida.


2) Se solicita realizar un programa que solicite al usuario el ingreso de una cadena
   de caracteres correspondiente a una número romano, se solicita informar de qué
   número de se trata.

   Recuerde la tabla de números romanos:

        I = 1

        V = 5

        X = 10

        L = 50

        C = 100

        D = 500

        M = 1000

Ejemplo de entrada:
XX
XVII
IV

Ejemplo de salida:
20
17
4

El programa tiene que funcionar para todos los casos posibles.

3) Se solicita realizar un programa que lea por teclado un número entero (Rango
   entre 1 y 5000) y devuelva el mismo número pero en romano.

Ejemplo de entrada:
3
77
1002

Ejemplo de salida
III
LXXVII
MII

El programa tiene que funcionar para todos los casos posibles en el
rango dado.


4) Realizar un programa que lea dos cadenas de caracteres ingresada por
   teclado.

   Se solicita:
- Verificar que en cada una de las cadenas ingresadas, haya valores numéricos. En
  caso de que una cadena no contenga un valor numérico, solicitar el ingreso de la
  misma nuevamente.
- De preferencia utilizar para la lectura de datos por teclado la clase
  BufferedReader.
- Extraer los valores numéricos de cada una de las cadenas. (Se
  deben extraer todos juntos, uno a continuación del otro).

Por ejemplo:

“El número 1 más el número 2 es igual al número 3, y si le restamos el número
1, quedaría como resultado el número 2”

Extracción:
12312
- Verificar si los valores numéricos extraídos de las cadenas son narcisistas
  (Número que es igual a la suma de sus dígitos cada uno elevado a la potencia de
  la cantidad de dígitos en el número).

Por ejemplo:

153

1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
- Si son narcisistas, sumar dichos números e informar su resultado.
- Si no son narcisistas, informar con un mensaje.