/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import java.util.ArrayList;

/**
 *
 * @author Heitor
 */
public class CadeiaHierarquica {
    
    private ArrayList<TratadorAbstrato> tratadores = new ArrayList<>();

    public void addTratador(TratadorAbstrato tratador) throws Exception {
        if (tratador != null) {
            tratadores.add(tratador);
        } else {
            throw new Exception("Insira um tratador válido");
        }
    }

    public boolean aprovaPagamento(double valorDouble) throws Exception {
        for (TratadorAbstrato superior : tratadores) {
            if (superior.accept(valorDouble)) {
                superior.handleRequest(valorDouble);
                return true;
            }
        }
        throw new Exception("Pagamento não autorizado");
    }

}
