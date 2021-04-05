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
public class Factura {
    private String numero;
    private String descripcion;
    private int cantidad;
    private double precio;

    /**
     * 
     * @param cantidad
     * @param precio 
     */
    public Factura(int cantidad, double precio)
    {
        this.numero = this.generarNumero();
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    /**
     * 
     * @param cantidad
     * @param precio
     * @param descripcion 
     */
    public Factura(int cantidad, double precio, String descripcion)
    {
        this.numero = this.generarNumero();
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    /**
     * Genera el número de la factura.
     * 
     * @return 
     */
    public String generarNumero() {
        int longitud = 10;
        StringBuilder builder = new StringBuilder();
        String caracteres = "0123456789abcdefghijklmnopqrstuvwyz";
        
        while (longitud-- != 0) {
            int character = (int)(Math.random()*caracteres.length());
            builder.append(caracteres.charAt(character));
        }
        
        return builder.toString();
    }
    
    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /**
     * Calcula el total de la factura.
     * 
     * @return 
     */
    public double getTotalFactura()
    {
        double total = (double) Math.round(this.getCantidad() * this.getPrecio() * 100) / 100;
        
        return total > 0 ? total : 0.0;
    }
}
