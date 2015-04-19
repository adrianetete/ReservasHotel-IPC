/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author garciparedes
 */
public enum TipoHabitacion {
    
    INDIVIDUAL("Individual"),
    DOBLE("Doble"),
    DOBLE_DE_USO_INDIVIDUAL("Doble de uso individual"),
    SUPERIOR("Superior"),
    SUITE("Suite");
    
    private String name;
    
    private TipoHabitacion(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }

    public boolean coincide(TipoHabitacion tipoHabitacion) {
        boolean coincide = false;
        
        if (tipoHabitacion == null || this == tipoHabitacion){
            coincide = true;
        }
        return coincide;
    }
    
}
