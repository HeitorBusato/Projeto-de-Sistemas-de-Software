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
public class main {
    public static void main(String[] args) {
        UsuarioAntigo usuarioAntigo = new UsuarioAntigo();
		usuarioAntigo.setNome("Heitor");
		usuarioAntigo.setIdade("18");
		usuarioAntigo.setEndereco("Centro,12,29500-000,Alegre");
		
		Usuario usuario = new UsuarioAdapter(usuarioAntigo);
		System.out.println(usuario.getNome());
		System.out.println(usuario.getIdade());
		System.out.println(usuario.getEndereco());
    }
}
