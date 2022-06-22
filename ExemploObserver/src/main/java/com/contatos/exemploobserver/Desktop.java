/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.contatos.exemploobserver;

/**
 *
 * @author Heitor
 */
public class Desktop implements Observer{

	@Override
	public void update(Estoque estoque) {
	System.out.println("DESKTOP - Os precos dos produtos "+estoque.getNomeEstoque()+" foram alterados para:"+estoque.getPrecoEstoque());
	}

}
