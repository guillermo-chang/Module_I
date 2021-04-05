/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

/**
 *
 * @author proyectos
 */
public class Direccion {
    private static int contadorId = 0;
    private int id;
    private String calle;
    private String vecindario;
    private String ciudad;
    private String codigoPostal;
    private String complemento;

    public Direccion()
    {
        this.id = ++Direccion.contadorId;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the vecindario
     */
    public String getVecindario() {
        return vecindario;
    }

    /**
     * @param vecindario the vecindario to set
     */
    public void setVecindario(String vecindario) {
        this.vecindario = vecindario;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the codigoPostal
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return To String
     */
    public String toString()
    {
       return "[ID: " + this.getId() + ", Calle: " + this.getCalle() + ", Vecindario: " + this.getVecindario() + ", Ciudad: " + this.getCiudad() + ", Código postal: " + this.getCodigoPostal() + ", Complemento: " + this.getComplemento() + "]";
    }
}
