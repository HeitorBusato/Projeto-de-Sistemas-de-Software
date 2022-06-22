/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_abertofechado;

import java.security.InvalidParameterException;

public class Calculadora {
    
    public void calcular(CalculadoraOperacao operacao) {
        if (operacao == null) {
            throw new InvalidParameterException("Operacao nao pode ser realizada");
        }

        if (operacao instanceof Multiplicacao) {
            Multiplicacao multiplicacao = (Multiplicacao) operacao;
            multiplicacao.setResultado(multiplicacao.getNum1() * multiplicacao.getNum2());
        } else if (operacao instanceof Divisao) {
            Divisao divisao = (Divisao) operacao;
            divisao.setResultado(divisao.getNum1() / divisao.getNum2());
        }
    }
}
//Não é possivel mudar o metodo calcular da classe calculadora, para realizar outras funcionalidades de divisao ou multiplicacao.