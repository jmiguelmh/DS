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
public class Pescaderia extends Tienda{
    private Pescado pescado;
    private int num;
            
    public Pescaderia(Pescado pes, int n){
        pescado = pes;
        num = n;
    }
    
    @Override
    public void run(){
        while(true){
            System.out.println("Pescadería " +num+ " creando pescado: ");
            if(pescado.getEstaMalo() == 0){
                System.out.println("El pescado está malo, se tira.");
                try{
                    sleep(1000);
                }catch(InterruptedException e){
                
                }
            }else{
                System.out.println("Se prepara el pescado.");
                
                try{
                    sleep(2500);
                }catch(InterruptedException e){
                
                }
            }
        }
    }
}
