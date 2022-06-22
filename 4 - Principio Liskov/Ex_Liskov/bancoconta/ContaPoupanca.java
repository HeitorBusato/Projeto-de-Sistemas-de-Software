/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoconta;

import java.math.BigDecimal;

/**
 *
 * @author Larissa
 */
public class ContaPoupanca extends Conta{

    @Override
    protected void depositar(BigDecimal quantia) {
    }

    @Override
    protected void sacar(BigDecimal quantia) {
    }

    @Override
    protected void realizarPagamentos(BigDecimal quantia) {
        throw new UnsupportedOperationException("pagamentos permitos apenas em conta corrente!!"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
