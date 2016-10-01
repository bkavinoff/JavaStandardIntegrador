/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Persona;

/**
 *
 * @author educacionit
 */
public class Vendedor extends Persona{

    @Override
    public String toString() {
        return "Vendedor{" + "cantAutosVendidos=" + cantAutosVendidos + '}';
    }

    int cantAutosVendidos;
    public int getCantAutosVendidos() {
        return cantAutosVendidos;
    }

    public void setCantAutosVendidos(int cantAutosVendidos) {
        this.cantAutosVendidos = cantAutosVendidos;
    }
    
    public Vendedor (String nombre, String apellido, String dni, int cantAutosVendidos){
        super(nombre, apellido, dni);
        this.cantAutosVendidos=cantAutosVendidos;
    }
}
