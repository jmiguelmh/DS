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
public class FactoriaCarne implements FactoriaProducto {
    private Carne carne;
    private Carniceria carniceria;

    @Override
    public Comida crearComida() {
        carne = new Carne();
        System.out.println("Creada carne");
        return carne;
    }

    @Override
    public Tienda crearTienda(int num) {
        carniceria = new Carniceria((Carne)crearComida(), num);
        System.out.println("Creada carniceria " +num);
        return carniceria;
    }
    
}
