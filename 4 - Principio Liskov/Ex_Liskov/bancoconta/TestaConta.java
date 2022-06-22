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
public class TestaConta {
    
     public static void main(String[] args) {
        Conta contapoupanca = new ContaPoupanca();
        contapoupanca.depositar(new BigDecimal(10000.00));
        AplicativoBanco pagarConta = new AplicativoBanco(contapoupanca);
        pagarConta.realizarPagamentos(new BigDecimal(100.00));
        
        //ContaPoupanca não suporta realizarPagamentos
    }
}
