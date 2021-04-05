/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

import Helpers.Empleado;
import Helpers.Empleo;

/**
 *
 * @author proyectos
 */
public class Proyecto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleo empleo = new Empleo();
        
        Empleado e1 = new Empleado("Nayi", "Ramirez", 18000);
        empleo.addEmpleado(e1);
        
        Empleado e2 = new Empleado("Alfredo", "Ramirez", 15000);
        empleo.addEmpleado(e2);
        
        empleo.imprimir();
        
        /**
         * Aumento del %10
         */
        e1.aumentar(10);
        e2.aumentar(10);
        
        empleo.imprimir();
        
        System.out.println("=====================");
        System.out.println("Número de empleados que han pasado en la empresa: " + empleo.getEmpleados().size());
    }
}
