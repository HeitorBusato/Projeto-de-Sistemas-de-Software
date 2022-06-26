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
public class Republica {

    private String nome;
    private Date dataFundacao;
    private Date dataExtinsao;
    private String vantagens;
    private double despesasMediaMorador;
    private int vagasTotal;
    private int vagasOcupadas;
    private int vagasDisponivel;
    private String estatuto;
    
    private Endereco endereco;
    

    public Republica() {
    }

    public Republica(String nome, Date dataFundacao, String vantagens, double despesasMediaMorador, int vagasOcupadas, int vagasDisponivel, Endereco endereco) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.vantagens = vantagens;
        this.despesasMediaMorador = despesasMediaMorador;
        this.vagasOcupadas = vagasOcupadas;
        this.vagasDisponivel = vagasDisponivel;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Date getDataExtinsao() {
        return dataExtinsao;
    }

    public void setDataExtinsao(Date dataExtinsao) {
        this.dataExtinsao = dataExtinsao;
    }

    public String getVantagens() {
        return vantagens;
    }

    public void setVantagens(String vantagens) {
        this.vantagens = vantagens;
    }

    public double getDespesasMediaMorador() {
        return despesasMediaMorador;
    }

    public void setDespesasMediaMorador(double despesasMediaMorador) {
        this.despesasMediaMorador = despesasMediaMorador;
    }

    public int getVagasTotal() {
        return vagasTotal;
    }

    public void setVagasTotal(int vagasTotal) {
        this.vagasTotal = vagasTotal;
    }

    public int getVagasOcupadas() {
        return vagasOcupadas;
    }

    public void setVagasOcupadas(int vagasOcupadas) {
        this.vagasOcupadas = vagasOcupadas;
    }

    public int getVagasDisponivel() {
        
        return vagasDisponivel ;
    }

    public void setVagasDisponivel(int vagasTotal, int vagasOcupadas) {
        int disponivel = this.vagasTotal - this.vagasOcupadas;
        this.vagasDisponivel = disponivel;
    }

    public String getEstatuto() {
        return estatuto;
    }

    public void setEstatuto(String estatuto) {
        this.estatuto = estatuto;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Republica{" + "nome: " + nome + ", dataFundacao: " + dataFundacao + ", dataExtinsao: " + dataExtinsao + ", vantagens: " + vantagens + ", despesasMediaMorador: " + despesasMediaMorador + ", vagasTotal: " + vagasTotal + ", vagasOcupadas: " + vagasOcupadas + ", vagasDisponivel: " + vagasDisponivel + ", estatuto: " + estatuto + ", endereco: " + endereco + '}';
    }
    
}
