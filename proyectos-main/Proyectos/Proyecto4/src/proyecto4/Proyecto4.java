/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4;

import Helpers.IntegerSet;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author proyectos
 */
public class Proyecto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntegerSet is = new IntegerSet();

        is.almacenar();
        is.union();
        is.interseccion();
        System.out.println("=================== Unión + Intersección =================== ");
        is.imprimir();
        
        System.out.println("\n\n===================  insertElement =================== \n");
        is.insertElement(100);
        is.insertElement(26);
        is.imprimir();
        
        System.out.println("\n\n ===================  deleteElemento =================== \n");
        is.deleteElemento(0);
        is.imprimir();
        
        System.out.println("\n\n ===================  Comparación de conjuntos =================== \n");
        
        ArrayList<Boolean> conjunto1 = new ArrayList<>();
        conjunto1.add(true);
        conjunto1.add(true);
        conjunto1.add(true);
        
        ArrayList<Boolean> conjunto2 = new ArrayList<>();
        conjunto2.add(true);
        conjunto2.add(true);
        conjunto2.add(false);
        
        System.out.println("¿Iguales?: " + is.ehIgualTo(conjunto1, conjunto2));
    }
    
}
