package enums;

/**
 * Clase <code>TipoEstancia</code> que contiene todos los tipos
 * de estancias del hotel:
 * 
 * <li>{@link #SA}</li>
 * <li>{@link #AD}</li>
 * <li>{@link #MP}</li>
 * <li>{@link #PC}</li>
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

public enum TipoEstancia {
    
    
    SA("Solo Alojamiento"),
    AD("Alojamiento y desayuno"),
    MP("Media pensión"),
    PC("Pensión Completa");
    
    private String name;
    
    /**
     * Constructor de la clase TipoEstancia encargado de asignar el tipo.
     * 
     * @param name 
     */
    private TipoEstancia(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    /**
     * Compara un objeto TipoEstancia, dado por parámetro, con si mismo
     * 
     * @param tipoEstancia objeto instanciado de TipoEstancia
     * @return 
     */
    public boolean coincide(TipoEstancia tipoEstancia){
        boolean coincide = false;
        
        if (tipoEstancia == null || this == tipoEstancia){
            coincide = true;
        }
        return coincide;
    }
  
}
