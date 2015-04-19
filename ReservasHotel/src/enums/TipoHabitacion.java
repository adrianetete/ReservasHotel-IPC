package enums;

/**
 * Clase <code>TipoHabitacion</code> que contiene todos los tipos
 * de habitaciones del hotel:
 * 
 * <li>{@link #INDIVIDUAL}</li>
 * <li>{@link #DOBLE}</li>
 * <li>{@link #DOBLE_DE_USO_INDIVIDUAL}</li>
 * <li>{@link #SUPERIOR}</li>
 * <li>{@link #SUITE}</li>
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

public enum TipoHabitacion {
    
    INDIVIDUAL("Individual"),
    DOBLE("Doble"),
    DOBLE_DE_USO_INDIVIDUAL("Doble de uso individual"),
    SUPERIOR("Superior"),
    SUITE("Suite");
    
    private String name;
    
    /**
     * Constructor de la clase TipoHabitacion encargado de asignar el tipo.
     * 
     * @param name 
     */
    private TipoHabitacion(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }

    /**
     * Compara un objeto TipoHabitacion, dado por parámetro, con si mismo
     * 
     * @param tipoHabitacion objeto instanciado de TipoHabitacion
     * @return 
     */
    public boolean coincide(TipoHabitacion tipoHabitacion) {
        boolean coincide = false;
        
        if (tipoHabitacion == null || this == tipoHabitacion){
            coincide = true;
        }
        return coincide;
    }
    
}
