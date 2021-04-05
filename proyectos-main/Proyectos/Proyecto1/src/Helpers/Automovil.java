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
public class Automovil {
    private static int contadorId = 0;
    private int id;
    private String modelo;
    private String color;
    private String chasis;
    private String duenio;
    private int velocidadMaxima;
    private int velocidadActual;
    private int velocidadMaximaReversa;
    private int numeroPuertos;
    private boolean techoSolar;
    private int numeroEngranes;
    private int cajaCambiosAutomatica;
    private int cajaCambioActual;
    private int volumenCombustible;
    private Marca marca;

    public Automovil(Marca marca)
    {
        this.id = ++Automovil.contadorId;
        this.velocidadActual = 0;
        this.cajaCambiosAutomatica = 6;
        this.cajaCambioActual = 0;
        this.marca = marca;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return  the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return  the chasis.
     */
    public String getChasis() {
        return chasis;
    }

    /**
     * @param chasis the chasis to set
     */
    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    /**
     * @return  the dueño.
     */
    public String getDuenio() {
        return duenio;
    }

    /**
     * @param duenio the duenio to set
     */
    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    /**
     * @return  the velocidadMaxima.
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * @param velocidadMaxima the velocidadMaxima
     */
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * @return  the velocidadActual
     */
    public int getVelocidadActual() {
        return velocidadActual;
    }

    /**
     * @param velocidadActual the velocidadActual to set
     */
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    /**
     * Acelera la velocidad del automóvil.
     */
    public void acelerar()
    {
        if (this.isMarchaAdelante() ) {
            if (this.getVelocidadActual() < this.getVelocidadMaxima()) {
                this.setVelocidadActual(this.getVelocidadActual() + 1);    
            } else {
                System.err.println("Velocidad máxima.");
            }  
        } else {
            if (this.getVelocidadActual() > this.getVelocidadMaximaReversa()) {
                this.setVelocidadActual(this.getVelocidadActual() - 1);    
            } else {
                System.err.println("Velocidad máxima de reversa.");
            }  
        }
    }

    /**
     * Cambia de marcha.
     */
    public void cambiarMarcha(int caja)
    {
        
        if (caja == -1 && this.getVelocidadActual() > 0) {
            System.err.println("No se puede conectar la marcha atrás.");
        } else {
            this.setCajaCambiosAutomatica(caja);
        }
    }

    /**
     * Ralentiza el automóvil.
     */
    public void _ralentiza()
    {        
        if (this.getVelocidadActual() != 0) {
            if (this.isMarchaAdelante() ) {
                this.setVelocidadActual(this.velocidadActual - 1);
            } else {
                this.setVelocidadActual(this.velocidadActual + 1);
            }
        }
    }

    /**
     * Frena el automóvil.
     */
    public void frenar()
    {
        this.setVelocidadActual(0);
    }

    /**
     * @return  the numeroPuertos.
     */
    public int getNumeroPuertos() {
        return numeroPuertos;
    }

    /**
     * @param numeroPuertos the numeroPuertos to set
     */
    public void setNumeroPuertos(int numeroPuertos) {
        this.numeroPuertos = numeroPuertos;
    }

    /**
     * @return the techoSolar
     */
    public boolean isTechoSolar() {
        return techoSolar;
    }

    /**
     * @param techoSolar the techoSolar to set
     */
    public void setTechoSolar(boolean techoSolar) {
        this.techoSolar = techoSolar;
    }

    /**
     * @return  the numeroEngranes
     */
    public int getNumeroEngranes() {
        return numeroEngranes;
    }

    /**
     * @param numeroEngranes the numeroEngranes
     */
    public void setNumeroEngranes(int numeroEngranes) {
        this.numeroEngranes = numeroEngranes;
    }

    /**
     * @return  the cajaCambiosAutomatica
     */
    public int getCajaCambiosAutomatica() {
        return cajaCambiosAutomatica;
    }

    /**
     * @param cajaCambiosAutomatica the cajaCambiosAutomatica to set
     */
    public void setCajaCambiosAutomatica(int cajaCambiosAutomatica) {
        this.cajaCambiosAutomatica = cajaCambiosAutomatica;
    }

    /**
     * @return marchaAdelante
     */
    public boolean isMarchaAdelante() {
        return this.getCajaCambiosAutomatica() > 0;
    }
    
    /**
     * @return  the volumenCombustible
     */
    public int getVolumenCombustible() {
        return volumenCombustible;
    }

    /**
     * @param volumenCombustible the volumenCombustible
     */
    public void setVolumenCombustible(int volumenCombustible) {
        this.volumenCombustible = volumenCombustible;
    }


    /**
     * @return the velocidadMaximaReversa.
     */
    public int getVelocidadMaximaReversa() {
        return velocidadMaximaReversa;
    }

    /**
     * @param velocidadMaximaReversa velocidadMaximaReversa
     */
    public void setVelocidadMaximaReversa(int velocidadMaximaReversa) {
        this.velocidadMaximaReversa = velocidadMaximaReversa;
    }

    /**
     * @return the caja de cambio actual.
     */
    public int getCajaCambioActual() {
        return cajaCambioActual;
    }

    /**
     * @param cajaCambioActual the cajaCambioActual
     */
    public void setCajaCambioActual(int cajaCambioActual) {
        this.cajaCambioActual = cajaCambioActual;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    /**
     * @return To String
     */
    public String toString()
    {
       return "[ID: " + this.getId() + ", Modelo: " + this.getModelo() + ", Color: " + this.getColor() + ", Chasis: " + this.getChasis() + ", Dueño: " + this.getDuenio() + ", Velocidad máxima: " + this.getVelocidadMaxima() + ", Velocidad actual: " + this.getVelocidadActual() + ", Velocidad máximam reversa" + this.getVelocidadMaximaReversa();
    }
}
