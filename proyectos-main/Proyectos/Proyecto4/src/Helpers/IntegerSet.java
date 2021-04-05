/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * @author proyectos
 */
public class IntegerSet {
    
    private ArrayList<ArrayList<Boolean>> conjunto;
    private int tamanioConjunto;
    
    public IntegerSet()
    {
        this.tamanioConjunto = 10;
        this.conjunto = new ArrayList<>();
        this.init();
    }
    
    /**
     * Inicializa el conjunto.
     */
    private void init()
    {
        for (int i = 0; i < 4; i++) {
            this.getConjunto().add(new ArrayList<>() );
            
            for (int j = 0; j < this.getTamanioConjunto(); j++) {
                this.getConjunto().get(i).add(false);    
            }
        }
    }
    
    /**
     * Almacena los enteros entre el rango 0 a 100
     */
    public void almacenar()
    {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < this.getTamanioConjunto(); j++) {
               int numero = ThreadLocalRandom.current().nextInt(0, 170 + 1);
               if (numero >= 0 && numero <= 100){
                   this.getConjunto().get(i).set(j,true);
               }
            }
        }
    }
            
    /**
     * @return the conjunto
     */
    public ArrayList<ArrayList<Boolean>> getConjunto() {
        return conjunto;
    }

    /**
     * @param conjunto the conjunto to set
     */
    public void setConjunto(ArrayList<ArrayList<Boolean>> conjunto) {
        this.conjunto = conjunto;
    }
    
    /**
     * @return the tamanioConjunto
     */
    public int getTamanioConjunto() {
        return tamanioConjunto;
    }

    /**
     * @param tamanioConjunto the tamanioConjunto to set
     */
    public void setTamanioConjunto(int tamanioConjunto) {
        this.tamanioConjunto = tamanioConjunto;
    }
    
    /**
     * Inserta un nuevo elemento entero k en un conjunto (estableciendo [k] en verdadero)
     */
    public void insertElement(int elemento)
    {
        this.setTamanioConjunto(this.getTamanioConjunto() + 1);
        
        // Inserta un elemento en el conjunto i
        this.getConjunto().get(0).add(true);    
        
        // Inserta un elemento en el conjunto j
        this.getConjunto().get(1).add(true);
        
        this.union();
        this.interseccion();
    }
    
    /**
     * Elimina un elemento
     */
    public void deleteElemento(int posicionElemento)
    {
        if (posicionElemento >= 0 && posicionElemento < this.getTamanioConjunto()){
            this.setTamanioConjunto(this.getTamanioConjunto() - 1);
            
            for (int i = 0; i < this.getConjunto().size(); i++) {
                this.getConjunto().get(i).remove(posicionElemento);
                break;
            }
        }
        
        // Actualiza el conjunto
        this.union();
        this.interseccion();
    }
    
    /**
     * Unión entre i y j
     */
    public void union(){
        this.getConjunto().add(new ArrayList<>() );
        
        for (int i = 0; i < this.getTamanioConjunto(); i++) {
            // Aplicación de la función lógica O sobnre el conjunto i (0) y j (1)
            this.getConjunto().get(2).add(this.getConjunto().get(0).get(i) || this.getConjunto().get(1).get(i));
        }
    }
    
    /**
     * Intersección entre i y j
     */
    public void interseccion(){
        this.getConjunto().add(new ArrayList<>() );
        
        for (int i = 0; i < this.getTamanioConjunto(); i++) {
            // Aplicación de la función lógica AND sobnre el conjunto i (0) y j (1)
            this.getConjunto().get(3).add(this.getConjunto().get(0).get(i) && this.getConjunto().get(1).get(i));
        }
    }
    
    /**
     * Determina si dos conjuntos son iguales
     * 
     * @return 
     */
    public boolean ehIgualTo(ArrayList<Boolean> conjunto1, ArrayList<Boolean> conjunto2){
        
        for (int i = 0; i < conjunto1.size(); i++) {
            if ( conjunto1.get(i) != conjunto2.get(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Imprime el conjunto
     */
    public void imprimir()
    {
        System.out.println(">>> Conjunto i");
        for (int i = 0; i < this.getTamanioConjunto(); i++) {
            System.out.print(this.getConjunto().get(0).get(i) + ", ");
        }
        
        System.out.println("\n>>> Conjunto j");
        for (int i = 0; i < this.getTamanioConjunto(); i++) {
            System.out.print(this.getConjunto().get(1).get(i) + ", ");
        }
        
        System.out.println("\n>>> Unión de i y j");
        for (int i = 0; i < this.getTamanioConjunto(); i++) {
            System.out.print(this.getConjunto().get(2).get(i) + ", ");
        }
        
        System.out.println("\n>>> Intersección de i y j");
        for (int i = 0; i < this.getTamanioConjunto(); i++) {
            System.out.print(this.getConjunto().get(3).get(i) + ", ");
        }
    }
}
