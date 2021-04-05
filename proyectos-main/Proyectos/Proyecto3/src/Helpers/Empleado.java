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
public class Empleado {
    private static int contadorId = 0;
    private int id;
    private String nombre;
    private String apellido;
    private double salario;
    
    public Empleado(String nombre, String apellido, double salario)
    {
        this.id = ++Empleado.contadorId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    /**
     * @return the salario
     */
    public double getSalarioAnual() {
        return this.salario * 12;
    }
        
    /**
     * 
     * @param porcentaje
     * @return 
     */
    public double aumentar(int porcentaje) {
        this.setSalario( this.getSalario() * (1 + (porcentaje / 100.0)) );
        
        return this.getSalario();
    }
    
    /**
     * To string
     * @return 
     */
    public String toString()
    {
        return "ID " + this.getId() + ": " + this.getNombre() + " " + this.getApellido();
    }
}
