/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversaodependencia;

/**
 *
 * @author Larissa
 */
public class Botao {
    private boolean button;
    private Ventilador ventilador;
    public void acionar(){
        if(button == true){
            ventilador.ligar();
        }
    }
}
