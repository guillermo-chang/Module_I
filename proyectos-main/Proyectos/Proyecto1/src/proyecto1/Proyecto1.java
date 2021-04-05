/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import Helpers.Automovil;
import Helpers.Direccion;
import Helpers.Marca;
import Helpers.Fabricante;
import Helpers.Propietario;

/**
 *
 * @author proyectos
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         * Creación de automóviles.
         */
        Fabricante volkswagen = new Fabricante("Volkswaguen");
        Automovil va1 = volkswagen.fabricar(new Marca("v3", "2020"));
        
        Fabricante ford = new Fabricante("Ford");
        Automovil fa1 = ford.fabricar(new Marca("PX64", "2018"));
        
        /*
         * Creación de propietarios.
         */
        Direccion d1 = new Direccion();
        Propietario p1 = new Propietario("proyectos", "cpf", "rg", d1, va1);
        p1.setFechaNacimiento("1998");
        
        Direccion d2 = new Direccion();
        Propietario p2 = new Propietario("proyectosberth", "cpf", "rg", d2, va1);
        p1.setFechaNacimiento("1997");
        
        Direccion d3 = new Direccion();
        d3.setCalle("El último suspiro.");
        Propietario p3 = new Propietario("Alfredo", "cpf", "rg", d3, fa1);
        p1.setFechaNacimiento("1998");
        
        /*
         * Impresiones
         */
        Proyecto1.imprimirPropietario(p1);
        Proyecto1.imprimirPropietario(p2);
        Proyecto1.imprimirPropietario(p3);
    }
    
    /**
     * Imprime los propietarios.
     */
    private static void imprimirPropietario(Propietario propietario)
    {
        System.out.println("====================================================");
        System.out.println("Persona " + propietario.toString());
        System.out.println("Dirección: " + propietario.getDireccion());
        System.out.println("Auto "+ propietario.getAutomovil().toString());
        System.out.println("Marca "+ propietario.getAutomovil().getMarca().toString());
    }
}
