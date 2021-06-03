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
public class Pescado implements Comida{
    private double precio;
    private boolean hayStock;
    
    public Pescado(){
        precio = 3.0;
        hayStock = true;
    }
    
    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double p) {
        precio = p;
    }
    
    @Override
    public String toString(){
        if(hayStock)
            return("El pescado cuesta " + getPrecio());
        else
            return("Ya no queda pescado");
    }

    @Override
    public void cambioStock() {
        hayStock = false;
    }
}
