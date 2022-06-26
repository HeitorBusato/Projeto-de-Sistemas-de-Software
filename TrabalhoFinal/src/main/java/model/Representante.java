/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;

/**
 *
 * @author Heitor
 */
public class Representante {

    private Date dataInicio;
    private Date dataFinal;
    private Morador representante;

    public Representante() {
    }

    public Representante(Date dataInicio, Date dataFinal, Morador representante) {
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.representante = representante;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
        
}
