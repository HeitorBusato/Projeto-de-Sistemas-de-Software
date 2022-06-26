/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Heitor
 */
public class Tarefa {

    private Date dataAgendamento;
    private ArrayList<Morador> responsaveis = new ArrayList<Morador>();
    private String descricao;
    private Date dataTermino;
    private String status ;

    public Tarefa() {
    }

    public Tarefa(Date dataAgendamento, String descricao, Date dataTermino, String status) {
        this.dataAgendamento = dataAgendamento;
        this.descricao = descricao;
        this.dataTermino = dataTermino;
        this.status = status;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public ArrayList<Morador> getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(ArrayList<Morador> responsaveis) {
        this.responsaveis = responsaveis;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
