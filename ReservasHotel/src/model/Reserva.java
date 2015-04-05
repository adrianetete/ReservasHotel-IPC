/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author adri
 */
public class Reserva {
    
    private String nomHotel;
    private String provincia;
    private String poblacion;
    private String calle;
    private String codPostal;

    public Reserva(String nomHotel, String provincia, String poblacion, String calle, String codPostal) {
        this.nomHotel = nomHotel;
        this.provincia = provincia;
        this.poblacion = poblacion;
        this.calle = calle;
        this.codPostal = codPostal;
    }

    public String getCalle() {
        return calle;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public String getNomHotel() {
        return nomHotel;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public void setNomHotel(String nomHotel) {
        this.nomHotel = nomHotel;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
}
