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
public interface Dispositivo {
    
     public void ligar();
    
     public void desligar();
}
//Da forma como estava modelado o problema nâo era possivel adicionar outros dispositivos, pois botao conhecia os detalhes de implementação de lampada.
//Tanto Botão quanto Lampada passam a depender da abstração Dispositivo.
