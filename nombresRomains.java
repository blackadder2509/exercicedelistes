/*Ecrire une fonction qui transforme les nombres arabes en nombres romains

Rappel des nombres romains :

I -> 1
V -> 5
X -> 10
L -> 50
C -> 100
D -> 500
M -> 1000

Exemples :

pour 5, le résultat attendu est "V"
pour 6, le résultat attendu est "VI"
pour 42, le résultat attendu est "XXXXII"

normalement, pour 4, le résultat attendu est "IV". dans un premier temps, le résultat attendu est "IIII".
*/
class NombresRomains{

  public static void main (String[] args){
    int nombre = 2683;

    int millier = nombre/1000; // millier = 2
    int reste = nombre % 1000; // reste = 631
    int d = reste / 500; // d =  1
    reste = reste % 500; //  reste = 131
    int c = reste / 100; // c = 1
    reste = reste % 100; //
    int l = reste / 50;
    reste = reste % 50;
    int x = reste / 10;
    reste = reste % 10;
    int v = reste / 5;
    reste = reste % 5;
    int i = reste;
    Print (millier * "M" d * "D" c * "C" l * "L" x * "X" v * "V" i * "I");
  }

}
