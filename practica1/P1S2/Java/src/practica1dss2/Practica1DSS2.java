/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1dss2;

/**
 *
 * @author USUARIO
 */
public class Practica1DSS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        FactoriaProducto factoria;
        int rand;
        
        for(int i=0; i<4; i++){
            rand = (int)Math.floor(Math.random()*2);
            if(rand == 0)
                factoria = new FactoriaCarne();
            else
                factoria = new FactoriaPescado();
            
            cliente.crearProducto(factoria, i);
        }
            
    }
    
}
