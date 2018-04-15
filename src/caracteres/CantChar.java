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
public class CantChar {
    private String cad;

    public CantChar() {
        
    }
public void cantidadCaracter(){
    String x=getCad();
	char comp='o';
	int veces=0;
	char []caracteres=x.toCharArray();
	for(int i=0;i<=caracteres.length-1;i++){
            if(comp ==caracteres[i]){
		veces++;
            }
				
	}
    System.out.println("Se encontro: "+veces+" veces");
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
