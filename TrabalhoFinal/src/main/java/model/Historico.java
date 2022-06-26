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
public class Historico {

    private String nomeRepAnterior;
    private String nomeRepublica;
    private double mediaReputacao;
    private String nomeRepAtual;
    private String nomeRepublicaAtual;
    private String contatoRepAtual;
    private Morador morador;

    public Historico() {
    }

    public Historico(String nomeRepAnterior, String nomeRepublica, double mediaReputacao, String nomeRepAtual, String nomeRepublicaAtual, String contatoRepAtual, Morador morador) {
        this.nomeRepAnterior = nomeRepAnterior;
        this.nomeRepublica = nomeRepublica;
        this.mediaReputacao = mediaReputacao;
        this.nomeRepAtual = nomeRepAtual;
        this.nomeRepublicaAtual = nomeRepublicaAtual;
        this.contatoRepAtual = contatoRepAtual;
        this.morador = morador;
    }

    public String getNomeRepAnterior() {
        return nomeRepAnterior;
    }

    public void setNomeRepAnterior(String nomeRepAnterior) {
        this.nomeRepAnterior = nomeRepAnterior;
    }

    public String getNomeRepublica() {
        return nomeRepublica;
    }

    public void setNomeRepublica(String nomeRepublica) {
        this.nomeRepublica = nomeRepublica;
    }

    public double getMediaReputacao() {
        return mediaReputacao;
    }

    public void setMediaReputacao(double mediaReputacao) {
        this.mediaReputacao = mediaReputacao;
    }

    public String getNomeRepAtual() {
        return nomeRepAtual;
    }

    public void setNomeRepAtual(String nomeRepAtual) {
        this.nomeRepAtual = nomeRepAtual;
    }

    public String getNomeRepublicaAtual() {
        return nomeRepublicaAtual;
    }

    public void setNomeRepublicaAtual(String nomeRepublicaAtual) {
        this.nomeRepublicaAtual = nomeRepublicaAtual;
    }

    public String getContatoRepAtual() {
        return contatoRepAtual;
    }

    public void setContatoRepAtual(String contatoRepAtual) {
        this.contatoRepAtual = contatoRepAtual;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }
    
}
