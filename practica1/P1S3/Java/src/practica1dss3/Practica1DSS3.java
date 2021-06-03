/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1dss3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class Practica1DSS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventana.setVisible(true);
            }
        });
        
        FilterChain cadenaFiltros = new FilterChain();
        FilterManager gestorFiltros = new FilterManager(cadenaFiltros);
        Cliente cliente = new Cliente(gestorFiltros);
        int rand;
        
        Filtro filtro1 = new Filtro1();
        Filtro filtro2 = new Filtro2();
        Filtro filtro3 = new Filtro3();
        Comida comida;
        boolean f1 = false, f2 = false, f3 = false;
        
        while(true){
            rand = (int)Math.floor(Math.random()*2);
            
            if(rand==0){
                comida = new Carne();   
            }else{
                comida = new Pescado();
            }
            
            filtro1.setComida(comida);
            filtro2.setComida(comida);
            filtro3.setComida(comida);
            
            rand = (int)Math.floor(Math.random()*2);
            
            if(rand==0){
                gestorFiltros.añadirFiltro(filtro1);
                f1 = true;
            }
                
            rand = (int)Math.floor(Math.random()*2);
            
            if(rand==0){
                gestorFiltros.añadirFiltro(filtro2);
                f2 = true;
            }
            
            rand = (int)Math.floor(Math.random()*2);
            
            if(rand==0){
                gestorFiltros.añadirFiltro(filtro3);
                f3 = true;
            }
            
            gestorFiltros.ejecutarFiltros();
            System.out.println(comida.toString());
            ventana.nuevo(f1, f2, f3, comida.toString());
            gestorFiltros.vaciarFiltros();
            f1 = false; f2 = false; f3 = false;
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
