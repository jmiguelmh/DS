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
public class Filtro1 implements Filtro{
    
    private Comida comida;
    
    public Filtro1(){
        
    }

    @Override
    public void ejecutar() {
        System.out.println("Se ha descontado el 21% del IVA");
        comida.setPrecio(comida.getPrecio() * 0.79);
    }

    @Override
    public void setComida(Comida c) {
        comida = c;
    }
    
}
