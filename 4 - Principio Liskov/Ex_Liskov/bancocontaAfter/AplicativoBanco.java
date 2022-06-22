/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoconta;

import java.math.BigDecimal;


public class AplicativoBanco {
      private ContaCorrente conta;

    public AplicativoBanco(ContaCorrente conta) {
        this.conta = conta;
    }
       
    public void Sacar(BigDecimal quantia) {
        conta.sacar(quantia);
    }
    
     public void realizarPagamentos(BigDecimal quantia) {
        conta.realizarPagamentos(quantia);
    }
 
}
