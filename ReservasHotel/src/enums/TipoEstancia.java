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
public enum TipoEstancia {
    
    SA("Solo Alojamiento"),
    AD("Alojamiento y desayuno"),
    MP("Media pensión"),
    PC("Pensión Completa");
    
    private String name;
    
    private TipoEstancia(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    public boolean coincide(TipoEstancia tipoEstancia){
        boolean coincide = false;
        
        if (tipoEstancia == null || this == tipoEstancia){
            coincide = true;
        }
        return coincide;
    }
  
}
