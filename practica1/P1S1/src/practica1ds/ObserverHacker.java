/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1ds;

import GUI.VentanaHacker;
import GUI.VentanaNumElementos;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author USUARIO
 */
public class ObserverHacker implements Observer{
        private VentanaHacker ventana;
        private Elementos observable;

        public ObserverHacker(Elementos el, VentanaHacker vent) {
            observable = el;
            ventana = vent;
        }
        
        @Override
	public void update(Observable aO, Object aArg) {
            ventana.setNumElementos(aO.toString());
            System.out.println("Se cambia");
	}
}
