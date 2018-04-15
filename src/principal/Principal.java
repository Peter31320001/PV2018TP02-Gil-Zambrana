/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

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
        System.out.println("1:Punto1");
        System.out.println("2:Punto2");
        System.out.println("3:Punto3");
        System.out.println("4:Salir");
        Scanner in = new Scanner(System.in);
        int op = in.nextInt();
        switch(op){
            case 1: 
                main(null);
            case 2:
                main(null);
            case 3:
                main(null);
            case 4: exit(0);
        }
    }
    
    public static void devolverEdadEnSemanas() {
        Punto02 unaFecha = new Punto02();
        unaFecha.ingrFecha();
    }
    
}
