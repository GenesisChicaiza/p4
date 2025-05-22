package src.aplicacion;
import src.mates.*;

/**
 * @author Genesis Chicaiza
 * Esta clase es una prueba
 */

public class Principal {
    public static void main(String[] args) {
        // probando
        String let1 = "terror";
        String let2 = "error";
        System.out.println("Distancia de edición entre '" + let1 + "' y '" + let2 + "': " + Matematicas.distance(let1, let2));
    }
}