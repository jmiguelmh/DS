/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1dss3;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class FilterChain {
    private ArrayList<Filtro> filtros;
    
    public FilterChain(){
        filtros = new ArrayList<>();
    }
    
    public void añadirFiltro(Filtro f){
        filtros.add(f);
    }
    
    public void ejecutarFiltros(){
        for(int i=0; i<filtros.size(); i++)
            filtros.get(i).ejecutar();
    }
   
    public void vaciarFiltros(){
        filtros.clear();
    }
}
