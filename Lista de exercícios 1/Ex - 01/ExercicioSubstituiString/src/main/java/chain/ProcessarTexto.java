/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chain;

/**
 *
 * @author Heitor
 */

import java.util.ArrayList;
import java.util.List;

public final class ProcessarTexto {
    
    private static ProcessarTexto INSTANCE = null;
    private final List<TratadorMarca> tratadores = new ArrayList();

    private ProcessarTexto() {
    }
    
    public static ProcessarTexto getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ProcessarTexto();
        }
        return INSTANCE;
    }
    
    public void addTratador(TratadorMarca tratador) throws Exception {
        if (tratador != null) {
            this.tratadores.add(tratador);
        } else {
            throw new Exception("Tratador inválido");
        }
    }
    
    public void removerTratadores() {
       this.tratadores.clear();
    }
    
    public String processarTexto(String texto) throws Exception {
        for (TratadorMarca tratador : this.tratadores) {
            if (tratador.aceitar(texto)) {
                texto = tratador.processar(texto);
            }
        }
        return texto;
    }
}

