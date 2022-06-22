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
public abstract class Conta {
    
    protected abstract void depositar(BigDecimal quantia);
    
    protected abstract void sacar(BigDecimal quantia);
    
    protected abstract void realizarPagamentos(BigDecimal quantia);/// especifico de conta corrente
}
