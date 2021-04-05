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
public class Marca {
    private static int contadorId = 0;
    private int id;
    private String marca;
    private String anio;

    public Marca(String marca, String anio)
    {
        this.id = ++Marca.contadorId;
        this.marca = marca;
        this.anio = anio;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    /**
     * @return the anio
     */
    public String getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(String anio) {
        this.anio = anio;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
     * @return To String
     */
    public String toString()
    {
        return "[ID: " + this.getId() + ", Marca: " + this.getMarca() + ", Año: " + this.getAnio() + "]";
    }
}
