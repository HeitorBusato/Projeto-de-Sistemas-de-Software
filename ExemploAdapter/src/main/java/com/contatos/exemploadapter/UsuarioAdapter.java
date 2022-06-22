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

public class UsuarioAdapter extends NovoUsuario implements Usuario{
	private UsuarioAntigo usuarioAntigo;
	
	public UsuarioAdapter(UsuarioAntigo usuarioAntigo){
		this.usuarioAntigo = usuarioAntigo;
		this.adapterDados();
	}
	
	private void adapterDados(){
		this.setNome(usuarioAntigo.getNome());
		this.setIdade(Integer.valueOf(usuarioAntigo.getIdade()));
		Endereco endereco = new Endereco();
		String[] EnderecoAntigo = usuarioAntigo.getEndereco().split(",");
		
		endereco.setEndereco(EnderecoAntigo[0]);
		endereco.setNumero(Integer.valueOf(EnderecoAntigo[1]));
		endereco.setCEP(Integer.valueOf(EnderecoAntigo[2]));
		endereco.setCidade(EnderecoAntigo[3]);
		this.setEndereco(endereco);
	}

    private void setIdade(Integer valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
}

