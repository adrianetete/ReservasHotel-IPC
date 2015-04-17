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
    DOBLEDEUSOINDIVIDUAL("Doble de uso individual"),
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
    
}
