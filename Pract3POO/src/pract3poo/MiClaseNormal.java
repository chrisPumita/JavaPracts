/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract3poo;

/**
 *
 * @author alumno
 */
public class MiClaseNormal {
    int atributoEntero;
    boolean atributoBool;
    String cadena;
    
    public String regresaCadena(){
        return "Hola como estas, la cadena de instancia es: "+this.cadena;
    }
    
    public int incrementa(int param){
        return this.atributoEntero += param;
    }
    
}
