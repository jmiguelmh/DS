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
public class Filtro3 implements Filtro{
    private Comida comida;
    
    public Filtro3(){
        
    }

    @Override
    public void ejecutar() {
        System.out.println("Se ha agotado el stock");
        comida.cambioStock();
    }

    @Override
    public void setComida(Comida c) {
        comida = c;
    }
}
