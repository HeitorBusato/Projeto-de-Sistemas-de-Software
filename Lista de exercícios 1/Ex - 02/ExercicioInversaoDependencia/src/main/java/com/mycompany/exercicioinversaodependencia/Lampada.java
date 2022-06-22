/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicioinversaodependencia;

/**
 *
 * @author Heitor
 */

public class Lampada implements Dispositivo{
    
    @Override
    public void ligar() {
        throw new UnsupportedOperationException("Lampada Ligada!!");
    }

    @Override
    public void desligar() {
        throw new UnsupportedOperationException("Lampada Desligada!!");
    }
}
