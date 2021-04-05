/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import Helpers.Factura;

/**
 *
 * @author proyectos
 */
public class TestInvoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura f1 = new Factura(16, 0);
        Factura f2 = new Factura(149, 98.998);
        Factura f3 = new Factura(98, -1.175, "Cajas de clips.");
        
        TestInvoice.imprimir(f1);
        TestInvoice.imprimir(f2);
        TestInvoice.imprimir(f3);
    }
    
    /**
     * Imprime la factura.
     * 
     * @return
     */
    private static void imprimir(Factura factura)
    {
        System.out.println("================================");
                  
        System.out.println("Número: " + factura.getNumero());
        System.out.println("Descripción: " + factura.getDescripcion());
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio: " + factura.getPrecio());
        System.out.println("Total: $" + String.format("%,.2f", factura.getTotalFactura()));
    }
    
}
