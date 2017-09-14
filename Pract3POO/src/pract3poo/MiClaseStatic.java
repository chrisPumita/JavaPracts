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
public class MiClaseStatic {

    static int atributoEntero;
    static boolean atributoBool;
    static String cadena;

    public static String regresaCadena() {
        return "Hola el valor de la cadena de la clase es : " + cadena;
    }
    
    public static int incrementa(int param){
        return atributoEntero += param;
    }
    
}


