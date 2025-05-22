package src.mates;

/**
 *@author Genesis Chicaiza
 * clase que contiene los calculos realizados para calcular la distancia
 */


public class Matematicas{
    /**
     * @param: Calcula la distancia entre dos cadenas let1 y let2
     * @return: distancia entre las cadenas
     */
    public static int distance(String let1, String let2) {
        // matriz
        int[][] distance = new int[let1.length() + 1][let2.length() + 1];

        // fila / columna de matriz
        for (int i = 0; i <= let1.length(); i++) {
            distance[i][0] = i;
        }
        for (int j = 0; j <= let2.length(); j++) {
            distance[0][j] = j;
        }


        for (int i = 1; i <= let1.length(); i++) {
            for (int j = 1; j <= let2.length(); j++) {
                if (let1.charAt(i - 1) == let2.charAt(j - 1)) {
                    distance[i][j] = distance[i - 1][j - 1];
                } else {
                    distance[i][j] = Math.min(distance[i][j - 1] + 1, // add
                            Math.min(distance[i - 1][j] + 1, // delete
                                    distance[i - 1][j - 1] + 2)); // edit
                }

            }
        }

        //donde se encuentra la distancia en la matriz
        return distance[let1.length()][let2.length()];
    }

}