package EjemploArrayMetodos;

public class Main {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        String z = "Hola";
        Double[] arrayDeEntrada = {1d, 2d, 3d};

        System.out.println(x);
        System.out.println(z);

        int[][] datosRetorno = metodo(x, y, z, arrayDeEntrada);

        System.out.println(x);
        System.out.println(z);

    }

    static int [][] metodo(int x, int y, String z, Double[] arrayDeEntrada) {
        x = 3;
        z = "Adios";
        arrayDeEntrada[0] = 1d;
        arrayDeEntrada[1] = 2d;
        arrayDeEntrada[2] = 3d;
        return new int[2][2];
    }

}