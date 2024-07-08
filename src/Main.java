import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final var array = RandomUtilities.generarRandomArrayInt(10000, 100000, 2, new Random());
        final var listaCapicuas = new ArrayList<Integer>();

        for (var numero : array) {
            if (esCapicua(numero)) {
                listaCapicuas.add(numero);
            }
        }

        System.out.printf("La lista de números capicuas es: %s%n", listaCapicuas);
        System.out.printf("El tamaño de la lista es: %s%n", listaCapicuas.size());

    }

    private static int invertirEntero(int n) {
        var aux = n;
        var inverso = 0;
        while (aux != 0) {
            final var residuo = aux % 10;
            inverso = inverso * 10 + residuo;
            aux = aux / 10;
        }
        return inverso;
    }

    private static boolean esCapicua(int numOriginal) {
        final var numInvertido = invertirEntero(numOriginal);
        return numOriginal == numInvertido;
    }
}
