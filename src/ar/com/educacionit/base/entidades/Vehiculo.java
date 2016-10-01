/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.base.entidades;

/**
 *
 * @author educacionit
 */
public abstract class Vehiculo {
    //PROPIEDADES DEL METODO:
    private int alto;
    private int ancho;
    private int largo;
    
    //CONSTRUCTOR:
    public Vehiculo(int alto,int ancho,int largo){
        this.alto=alto;
        this.ancho=ancho;
        this.largo=largo;
    }
    
    //GETTERS y SETTERS
    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
}
