
/**
 * Clase que representa las características de un coche
 * 
 * @author Marina
 * @version 1.0
 */
public class Coche{
    //Atributos de la clase Coche
    String marca;
    int velocidadActual;
    
    /**
     * Constructor de la clase Coche
     * @param laMarca marca del coche
     */
    public Coche(String laMarca){
        marca = laMarca;
        velocidadActual = 0;
    }
    
    /**
     * Método acelerar el coche
     * @param aumentoVelocidad determina cuánto se aumenta la velocidad
     */
    public void acelerar(int aumentoVelocidad){
        velocidadActual = aumentoVelocidad;
    }  
    
    /**
     * Método que simula la revisión de un coche
     */
    public void revisarMotor(){
        String reporteGeneral = "Iniciando revisión de diagnóstico";
        System.out.println(reporteGeneral);
        
        if (velocidadActual == 0){
            String diagnosticoMotor = "Motor detenido. Se puede revisar."; 
            System.out.println(diagnosticoMotor);
        }else{
            String diagnosticoMotor = "Motor en marcha. Revisión no posible."; 
            System.out.println(diagnosticoMotor);
        }
    }
}   