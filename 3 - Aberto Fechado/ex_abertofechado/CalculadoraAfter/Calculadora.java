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
        operacao.realizar();
    }
}
//Não será necessário modificar a classe para atender a novos operadores.