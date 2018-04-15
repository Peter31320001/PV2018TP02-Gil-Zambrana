/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracteres;

import java.util.Scanner;

/**
 *
 * @author PC-Gamer
 */
public class Vocales {
    private String a;

    public Vocales() {
        
    }
public String pedirDato(){
    Scanner ingreso = new Scanner(System.in);
    System.out.println("Ingrese palabra a contar");
    a = ingreso.nextLine();
    return a;
}
public  int contarVoc(){
    int cont=0;
    int i,p;
    p = a.length();
    for(i=0;i<p;i++){
        if ((a.charAt(i)=='a')||(a.charAt(i)=='A')||(a.charAt(i)=='e')||(a.charAt(i)=='E')||(a.charAt(i)=='i')||(a.charAt(i)=='I')||(a.charAt(i)=='o')||(a.charAt(i)=='O')||(a.charAt(i)=='u')||(a.charAt(i)=='U')){
            cont=cont+1;
        }
    }
    return cont;
}
    
  
    
    /**
     * @return the a
     */
    public String getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(String a) {
        this.a = a;
    }
    
    
}

