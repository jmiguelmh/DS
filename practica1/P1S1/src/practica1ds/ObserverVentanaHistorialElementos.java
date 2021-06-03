/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1ds;

import GUI.VentanaHistorialElementos;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author USUARIO
 */
public class ObserverVentanaHistorialElementos extends Thread implements Observer {
    private VentanaHistorialElementos ventana;
    private int nuevoElemento;
    private Elementos observable;
    private ArrayList<Integer> cola;

    public ObserverVentanaHistorialElementos(Elementos el, VentanaHistorialElementos vent) {
        cola = new ArrayList<>();
        observable = el;
        ventana = vent;
    }
    
    public void anyadeElemento(int elemento){
        cola.add(elemento);
        if(cola.size() > 5)
            cola.remove(0);
    }
    
    public String toString(){
        String res = "";
        for(int i=0; i<cola.size(); i++)
            res += cola.get(i) + " ";
        
        return res;
    }

    @Override
        public void run(){
            while(true){
                nuevoElemento = observable.getElemento();
                anyadeElemento(nuevoElemento);
                ventana.setHistorialElementos(toString());
                System.out.println(nuevoElemento);
                try{
                    sleep(7500);
                }catch(InterruptedException e){

                }
            }
        }

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
