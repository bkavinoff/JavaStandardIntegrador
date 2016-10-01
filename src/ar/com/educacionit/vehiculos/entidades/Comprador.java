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
public class Comprador extends Persona{

    @Override
    public String toString() {
        return "Comprador{" + "Presupuesto=" + Presupuesto + '}';
    }

    public double getPresupuesto() {
        return Presupuesto;
    }

    public void setPresupuesto(double Presupuesto) {
        this.Presupuesto = Presupuesto;
    }
    double Presupuesto;
    public Comprador(String nombre, String apellido, String dni, double presupuesto){
        super(nombre, apellido, dni);
        this.Presupuesto=presupuesto;
        
    }
}
