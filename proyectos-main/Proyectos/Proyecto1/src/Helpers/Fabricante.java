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
public class Fabricante {
    private String nombre;
    
    public Fabricante(String nombre)
    {
        this.nombre = "Volkswagen";
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Automovil fabricar(Marca marca)
    {
        return new Automovil(marca);
    }
}
