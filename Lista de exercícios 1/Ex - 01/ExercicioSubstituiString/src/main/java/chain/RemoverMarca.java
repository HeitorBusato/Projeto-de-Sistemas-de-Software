/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chain;

import utils.UtilitarioString;

/**
 *
 * @author Heitor
 */
public class RemoverMarca implements TratadorMarca {

    private final String marca;

    public RemoverMarca(String stringTratada) {
        this.marca = stringTratada;
    }

    @Override
    public boolean aceitar(String texto) {
        return texto.contains(this.marca);
    }

    @Override
    public String processar(String texto) throws Exception {
        return UtilitarioString.getInstance().substituirTexto(texto, marca, "*");
    }
    
}
