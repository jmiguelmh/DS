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
public class Carniceria extends Tienda{
    private Carne carne;
    private int num;
            
    public Carniceria(Carne car, int n){
        carne = car;
        num = n;
    }
    
    @Override
    public void run(){
        while(true){
            System.out.println("Carnicería " +num +" creando carne: ");
            if(carne.getEstaMalo() == 0){
                System.out.println("La carne está mala, se tira.");
                try{
                    sleep(1000);
                }catch(InterruptedException e){
                
                }
            }else{
                System.out.println("Se prepara la carne.");
                
                try{
                    sleep(4500);
                }catch(InterruptedException e){
                
                }
            }
        }
    }
}
