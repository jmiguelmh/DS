package practica1ds;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Elementos extends Observable {
        private int elemento;
        
        public Elementos(){
            elemento = 0;
        }

	public int getElemento(){
            return elemento;
        }
        
        public void setElemento(int el){
            elemento = el;
            setChanged();
            notifyObservers();
        }
        
        public String toString(){
            return ""+elemento;
        }
}