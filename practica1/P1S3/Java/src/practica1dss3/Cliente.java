/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1dss3;

/**
 *
 * @author USUARIO
 */
public class Cliente {
    private FilterManager gestorFiltros;
    
    public Cliente(FilterManager f){
        gestorFiltros = f;
    }
    
    public void Request(){
        gestorFiltros.ejecutarFiltros();
    }
}
