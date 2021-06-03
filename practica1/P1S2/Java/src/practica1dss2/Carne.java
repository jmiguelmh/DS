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
public class Carne extends Comida{
    private int estaMalo;
    
    public Carne(){
        estaMalo = (int)Math.floor(Math.random()*2);
    }
    
    public int getEstaMalo(){
        return estaMalo;
    }
}
