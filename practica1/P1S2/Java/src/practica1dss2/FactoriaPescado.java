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
public class FactoriaPescado implements FactoriaProducto{
    private Comida pescado;
    private Tienda pescaderia;

    @Override
    public Comida crearComida() {
        pescado = new Pescado();
        System.out.println("Creado pescado");
        return pescado;
    }

    @Override
    public Tienda crearTienda(int num) {
        pescaderia = new Pescaderia((Pescado)crearComida(), num);
        System.out.println("Creado pescaderia " +num);
        return pescaderia;
    }
    
}
