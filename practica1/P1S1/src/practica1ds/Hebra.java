/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1ds;

/**
 *
 * @author USUARIO
 */
public class Hebra extends Thread {
    private Elementos observable;
    private int nuevoElemento;
    
    public Hebra(Elementos obs){
        observable = obs;
    }
    
    @Override
    public void run(){
        while(true){
            nuevoElemento = (int)Math.floor(Math.random()*10);
            observable.setElemento(nuevoElemento);
            System.out.println(nuevoElemento);
            try{
                sleep(5000);
            }catch(InterruptedException e){
                
            }
        }
    }
}
