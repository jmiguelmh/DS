/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JLabel;
import practica1ds.Elementos;

/**
 *
 * @author USUARIO
 */
public class VentanaHacker extends javax.swing.JFrame {
    
    private int elementoActual;
    private Elementos observable;
    
    /**
     * Creates new form VentanaHacker
     */
    public VentanaHacker(Elementos obs) {
        initComponents();
        observable = obs;
    }

    public JLabel getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(String numElementos) {
        this.numElementos.setText(numElementos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numElementos = new javax.swing.JLabel();
        botonMasDiez = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numElementos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        botonMasDiez.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonMasDiez.setText("+10");
        botonMasDiez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasDiezActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMasDiez))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(numElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonMasDiez)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMasDiezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasDiezActionPerformed
        elementoActual = Integer.parseInt(numElementos.getText());
        elementoActual += 10;
        numElementos.setText(""+elementoActual);
        observable.setElemento(elementoActual);
    }//GEN-LAST:event_botonMasDiezActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMasDiez;
    private javax.swing.JLabel numElementos;
    // End of variables declaration//GEN-END:variables
}
