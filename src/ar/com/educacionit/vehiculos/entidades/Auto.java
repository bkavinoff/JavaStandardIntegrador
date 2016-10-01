/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Vehiculo;

/**
 *
 * @author educacionit
 */
public class Auto extends Vehiculo {

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }
 
    private String marca;
    private String modelo;
    private String color;
    
     public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public Auto (String marca,
                        String modelo,
                        String color,
                        int alto,
                        int ancho,
                        int largo){
    super(alto, ancho, largo);//llamo al constructor de la clase padre
    this.marca=marca;
    this.modelo=modelo;
    this.color=color;
    
    }
    
}
