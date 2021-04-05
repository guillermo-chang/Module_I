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
public class Propietario {
    private static int contadorId = 0;
    private int id;
    private String nombre;
    private String cpf;
    private String rg;
    private String fechaNacimiento;
    private Direccion direccion;
    private Automovil automovil;

    public Propietario(String nombre, String cpf, String rg, Direccion direccion, Automovil automovil) {
        this.id = ++Propietario.contadorId;
        this.nombre = nombre;
        this.cpf = cpf;
        this.rg = rg;
        this.direccion = direccion;
        this.automovil = automovil;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return this.id;
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

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the automovil
     */
    public Automovil getAutomovil() {
        return automovil;
    }

    /**
     * @param automovil the automovil to set
     */
    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }
    
    /**
     * To String
     */
    public String toString()
    {
       return "[ID: " + this.getId() + ", Nombre: " + this.getNombre() + ", CPF: " + this.getCpf() + "RG: " + this.getRg() + ", Fecha de nacimiento: " +  this.getFechaNacimiento() + "]";
    }
}
