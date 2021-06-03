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
public class Cliente {
    
    public Cliente(){
        
    }
    
    public void crearProducto(FactoriaProducto factoria, int num){
        //Comida comida = factoria.crearComida();
        Tienda tienda = factoria.crearTienda(num);
        tienda.start();
    }
}
