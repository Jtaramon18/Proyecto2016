package proyecto;

/**
 *
 * @author USUARIO
 */
import java.io.*;

public class Warshall {

    //declaracion e inicialización de la matriz de acuerdo a la distribución de los cajeros
    //El uno indica que hay un camino entre un par de nodos y el cero indica que no lo hay
    static int[][] warshall = {{0, 1, 1, 1, 0}, {1, 0, 1, 0, 1}, {1, 1, 0, 1, 1}, {1, 0, 1, 0, 1}, {0, 1, 1, 1, 0}};
    static int n = 5;
    static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

    ;

   
    public void calcular_caminos() {

        for (int k = 0; k <= n - 1; k++) {
            for (int i = 0; i <= n - 1; i++) {
                for (int j = 0; j <= n - 1; j++) {
                    warshall[i][j] = funcionwar(i, j, k);
                }
            }

        }
        System.out.println();
        System.out.println();
        System.out.println("Matriz de adyacencia correspondiente:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(warshall[i][j]);
            }
            System.out.println();
        }
    }

    public static int funcionwar(int i, int j, int k) {
        if ((warshall[i][j] == 1) || ((warshall[i][k] == 1) && (warshall[k][j] == 1))) {
            return 1;
        } else {
            return 0;
        }
    }

}
