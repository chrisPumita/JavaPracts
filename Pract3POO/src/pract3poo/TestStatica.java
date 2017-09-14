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
public class TestStatica {

    public static void main(String[] args) {
        MiClaseNormal cn1 = new MiClaseNormal();
        MiClaseNormal cn2 = new MiClaseNormal();
        MiClaseNormal cn3 = new MiClaseNormal();

        MiClaseStatic cs1 = new MiClaseStatic();
        MiClaseStatic cs2 = new MiClaseStatic();

        cn1.atributoEntero = 100;
        cn1.cadena = "Jazmin";

        cn3.atributoEntero = 30;
        cn3.cadena = "NENITA";

        cn2.atributoEntero = 50;
        cn2.cadena = "Torres";

        cs1.atributoEntero = 100;
        cs1.cadena = "Julian";

        cs2.atributoEntero = 60;
        cs2.cadena = "José";

        System.out.println(cn1.atributoEntero + " " + cn1.regresaCadena());
        System.out.println(cn2.atributoEntero + " " + cn2.regresaCadena());
        System.out.println(cn3.atributoEntero + " " + cn3.regresaCadena());

        System.out.println(cs1.atributoEntero + " " + cs1.regresaCadena());
        System.out.println(cs2.atributoEntero + " " + cs2.regresaCadena());

        System.out.println("Objeto Statico SN " + MiClaseStatic.atributoEntero + " " + MiClaseStatic.regresaCadena());

    }
}
