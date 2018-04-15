/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracteres;

/**
 *
 * @author PC-Gamer
 */
public class Invertir {
    private String cad;
    
    public Invertir() {
    
    }
    
    public void invertir() {
        int i;
        String aux = "";
        for(i=getCad().length()-1;i>=0;i--){
            aux= aux + getCad().charAt(i);
        }
        System.out.println("La frase invertida es: " + aux);
    }

    /**
     * @return the cad
     */
    public String getCad() {
        return cad;
    }

    /**
     * @param cad the cad to set
     */
    public void setCad(String cad) {
        this.cad = cad;
    }
    
}
