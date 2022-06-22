/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversaodependencia;

public class Botao {
    private boolean button;
    private Dispositivo dispositivo;
    public void acionar(){
        if(button == true){
            dispositivo.ligar();
        }
    }
}
