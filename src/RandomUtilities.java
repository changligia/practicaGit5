import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomUtilities {
    static int generarRandomInt(int max, int min, Random random) {
        return random.nextInt(max - min + 1) + min;
    }

    static double generarRandomDouble(double max, double min, Random random) {
        return (max - min + 1) * random.nextDouble() + min;
    }

    static int[] generarRandomArrayInt(int n, int max, int min, Random random) {
        final var array = new int[n];

        for (var i = 0; i < n; i++) {
            array[i] = generarRandomInt(max, min, random);
        }

        return array;
    }

    static double[] generarRandomArrayDouble(int n, int max, int min, Random random) {
        final var array = new double[n];

        for (var i = 0; i < n; i++) {
            array[i] = generarRandomDouble(max, min, random);
        }

        return array;
    }

    static List<Integer> generarListaIntAleatoria(int n, int max, int min, Random random) {
        final var listaAleatoria = new ArrayList<Integer>();

        for (var i = 0; i < n; i++) {
            listaAleatoria.add(generarRandomInt(max, min, random));
        }

        return listaAleatoria;
    }

    static List<Double> generarListaDoubleAleatoria(int n, int max, int min, Random random) {
        final var listaAleatoria = new ArrayList<Double>();

        for (var i = 0; i < n; i++) {
            listaAleatoria.add(generarRandomDouble(max, min, random));
        }

        return listaAleatoria;
    }
}
