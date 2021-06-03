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
public class FilterManager {
    private FilterChain cadena;
    
    public FilterManager(FilterChain c){
        cadena = c;
    }
    
    public void añadirFiltro(Filtro f){
        cadena.añadirFiltro(f);
    }
    
    public void ejecutarFiltros(){
        cadena.ejecutarFiltros();
    }
    
    public void vaciarFiltros(){
        cadena.vaciarFiltros();
    }
}
