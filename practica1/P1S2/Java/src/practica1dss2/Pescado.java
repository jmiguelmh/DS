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
public class Pescado extends Comida{
    private int estaMalo;
    
    public Pescado(){
        estaMalo = (int)Math.floor(Math.random()*2);
    }
    
    public int getEstaMalo(){
        return estaMalo;
    }
}
