
/**
 * Clase que representa las características de un coche
 * 
 * @author Marina
 * @version 1.0
 */
public class Coche{
    //Atributos de la clase Coche
    String marca;
    int velocidad;
    
    /**
     * Constructor de la clase Coche
     * @param laMarca marca del coche
     */
    public Coche(String laMarca){
        marca = laMarca;
        velocidad = 0;
    }
    
    /**
     * Método acelerar el coche
     * @param aumentoVelocidad determina cuánto se aumenta la velocidad
     */
    public void acelerar(int aumentoVelocidad){
        velocidad = aumentoVelocidad;
    }    
}   