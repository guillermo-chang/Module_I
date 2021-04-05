/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import java.util.ArrayList;

/**
 *
 * @author proyectos
 */
public class Empleo {
    private ArrayList<Empleado> empleados;
    
    public Empleo()
    {
        this.empleados = new ArrayList<Empleado>();
    }

    /**
     * @return the empleados
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * @param empleados the empleados to set
     */
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    /**
     * @return 
     */
    public boolean addEmpleado(Empleado empleado) {
        return this.getEmpleados().add(empleado);
    }
    
     /**
     * @return the empleados
     */
    public void imprimir() {
        for (Empleado e : this.getEmpleados()) {
            System.out.println("========================================");
            System.out.println(e.toString());
            System.out.println("Salario mensual: $" + String.format("%,.2f", e.getSalario()));
            System.out.println("Salario anual: $" + String.format("%,.2f", e.getSalarioAnual()));
        }
    }
}
