/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import caracteres.CantChar;
import caracteres.Invertir;
import caracteres.Vocales;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
        
        // TODO code application logic here
    }
    public static void menu(){
        System.out.println("1:Punto1.1");
        System.out.println("2:Punto1.2");
        System.out.println("3:Punto1.3");
        System.out.println("4:Punto2.1");
        System.out.println("5:Punto2.2");
        System.out.println("6:Punto2.3");
        System.out.println("7:Punto2.4");
        System.out.println("8:Punto3");
        System.out.println("9:Salir");
        Scanner in = new Scanner(System.in);
        int op = in.nextInt();
        switch(op){
            case 1: vocales();
                main(null);
            case 2: invertir();
                main(null);
            case 3: cantidadCarac();
                main(null);
            case 4: devolverEdadEnSemanas();
                main(null);
            case 5: oEstacion();
                main(null);
            case 6: oDomingos();
                main(null);
            case 7: odDias();
                main(null);
            case 8: agregarDias();
                main(null);
            case 9: exit(0);
        }
    }
    
    public static void vocales(){
        Vocales vocale = new Vocales();
        vocale.pedirDato();
        vocale.contarVoc();
        System.out.println("La cantidad de vocales es: "+vocale.contarVoc());
        
    }
    
    public static void invertir(){
        Invertir invertido = new Invertir();
        invertido.setCad("hola");
        invertido.invertir();
    }
    
    public static void cantidadCarac(){
        CantChar cantidad = new CantChar();
        cantidad.setCad("hooola");
        cantidad.cantidadCaracter();
    }
    
    public static void devolverEdadEnSemanas() {
        Punto02 unaFecha = new Punto02();
        unaFecha.ingrFecha();
        unaFecha.devolverLaEdadEnSemana();
    }
    public static void oEstacion() {
        Punto02 unaFecha = new Punto02();
        unaFecha.ingrFecha();
        System.out.println(unaFecha.obtEstacion());
    }
    public static void oDomingos(){
        Punto02 unaFecha = new Punto02();
        System.out.println("La diferencia es de: " + unaFecha.obtenerDom()+ " domingos");
    }
    public static void odDias(){
        Punto02 unaFecha = new Punto02();
        System.out.println("Diferencia: "+ unaFecha.devDifDias());
        
    }
    
    public static void agregarDias() {
        Punto03 recibirFecha = new Punto03();
        recibirFecha.devolveragregado();
    }
}
