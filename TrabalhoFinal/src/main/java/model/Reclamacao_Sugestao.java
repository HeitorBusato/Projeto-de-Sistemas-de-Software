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
public class Reclamacao_Sugestao {

    private Date data;
    private Morador autor;
    private String descricao;
    private Date dataSolucao;
    private int idade;
    private String tag;

    public Reclamacao_Sugestao() {
    }

    public Reclamacao_Sugestao(Date data, Morador autor, String descricao, Date dataSolucao, int idade, String tag) {
        this.data = data;
        this.autor = autor;
        this.descricao = descricao;
        this.dataSolucao = dataSolucao;
        this.idade = idade;
        this.tag = tag;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
         this.data = data; 
    }

    public Morador getAutor() {
        return autor;
    }

    public void setAutor(Morador autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataSolucao() {
        return dataSolucao;
    }

    public void setDataSolucao(Date dataSolucao) {
        this.dataSolucao = dataSolucao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
}
