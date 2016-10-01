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
public abstract class Persona {
    //PROPIEDADES DEL METODO:
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    
    //CONSTRUCTOR:
    public Persona(String nombre,String apellido,String numeroDocumento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numeroDocumento=numeroDocumento;
    }
    
    //SETTERS Y GETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    
    //public boolean equals(Object obj){
    //    return this.nombre.equals(obj.nombre) & this.apellido.equals(obj.apellido) & this.numeroDocumento.equals(obj.numeroDocumento); 
    //}
    
}
