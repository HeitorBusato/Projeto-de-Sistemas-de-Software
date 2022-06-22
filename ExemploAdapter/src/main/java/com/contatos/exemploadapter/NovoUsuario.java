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
public class NovoUsuario implements Usuario{
	private String nome;
	private int idade;
	private Endereco endereco;
	
	public String getName() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
        @Override
	public int getIdade() {
		return idade;
	}
	public void idade(int idade) {
		this.idade = idade;
	}
        @Override
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

    @Override
    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
}
