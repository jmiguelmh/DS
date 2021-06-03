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
public class Filtro2 implements Filtro{
    private Comida comida;
    
    public Filtro2(){
        
    }

    @Override
    public void ejecutar() {
        System.out.println("Se ha aplicado un descuento del 50%");
        comida.setPrecio(comida.getPrecio() * 0.5);
    }

    @Override
    public void setComida(Comida c) {
        comida = c;
    }
}
