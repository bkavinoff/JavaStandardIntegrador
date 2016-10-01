/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.vehiculos.pruebas;

import ar.com.educacionit.base.entidades.Persona;
import ar.com.educacionit.base.entidades.Vehiculo;
import ar.com.educacionit.vehiculos.entidades.Auto;
import ar.com.educacionit.vehiculos.entidades.Comprador;
import ar.com.educacionit.vehiculos.entidades.Vendedor;

/**
 *
 * @author educacionit
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* COMENTO TODO LO DE LA FASE 1
        Auto auto=new Auto("","","",1,2,4);
        System.out.println("Auto:");
        System.out.println("Alto: "+auto.getAlto());
        System.out.println("Ancho: "+auto.getAncho());
        System.out.println("Largo: "+auto.getLargo());
        
        Persona tipo=new Persona("Juan","Perez","11223344");
        System.out.println("Persona:");
        System.out.println("Nombre: "+tipo.getNombre());
        System.out.println("Apellido: "+tipo.getApellido());
        System.out.println("Largo: "+tipo.getNumeroDocumento());
        Persona tipo2=new Persona("Juan","Perez","11223344");
        /*  NO SE PUEDEN COMPARAR DOS OBJETOS, porque se compara la posicion en memoria
        if (tipo == tipo2){
            System.out.println("son iguales");
        }
        */
       /*
        //para poder comparar objetos se debe crear un método. (se utiliza el metodo equals)
        //en este caso se debe crear el metodo equals en la clase.
        */
       Auto auto=new Auto("Ford","Fiesta", "Rojo", 11,11,11);
       System.out.println(auto.toString());
       
       Comprador comprador=new Comprador("Juan", "Perez", "1111111", 25000);
        System.out.println(comprador.toString());
        
       Vendedor vendedor=new Vendedor("Jose", "Gonzalez", "1111111",20);
        System.out.println(vendedor.toString());
    }
    
}
