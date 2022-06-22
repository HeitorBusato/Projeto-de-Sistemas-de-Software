/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.contatos.exemploadapter;

/**
 *
 * @author Heitor
 */
public class Endereco {
    
	private String Endereco;
	private int Numero;
	private int CEP;
	private String Cidade;

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }
		
        @Override
	public String toString(){
		return " Endereco: "+this.getEndereco()+"\n"+" Numero: "+this.getNumero()+"\n"+
				" CEP: "+this.getCEP()+"\n"+" Cidade: "+this.getCidade();
	}
}
