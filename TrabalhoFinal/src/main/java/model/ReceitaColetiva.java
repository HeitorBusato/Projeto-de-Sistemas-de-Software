/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Heitor
 */
public class ReceitaColetiva {

    private double SaldoMes;
    private double saldoAcumulado;

    public ReceitaColetiva() {
    }

    public double getSaldoMes() {
        return SaldoMes;
    }

    public void setSaldoMes(double SaldoMes) {
        this.SaldoMes = SaldoMes;
    }

    public double getSaldoAcumulado() {
        return saldoAcumulado;
    }

    public void setSaldoAcumulado(double saldoAcumulado) {
        this.saldoAcumulado = saldoAcumulado;
    }
        
}
