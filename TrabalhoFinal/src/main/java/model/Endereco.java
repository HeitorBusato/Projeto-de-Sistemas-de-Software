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
public class Endereco {

    private String cep;
    private String bairro;
    private String pontoReferencia;

    public Endereco() {
    }
    
    public Endereco(String cep, String bairro, String pontoReferencia) {
        this.cep = cep;
        this.bairro = bairro;
        this.pontoReferencia = pontoReferencia;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    @Override
    public String toString() {
        return "Endereco{" + "cep: " + cep + ", bairro: " + bairro + ", pontoReferencia: " + pontoReferencia + '}';
    }
    
}
