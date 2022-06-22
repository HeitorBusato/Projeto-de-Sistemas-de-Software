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
public class main {
    public static void main(String[] args) {
        
		IBM ibm = new IBM();
		Microsoft microsoft = new Microsoft();
		Apple apple = new Apple();
		
		//Observers
		Mobile mobile = new Mobile();
		Desktop tela = new Desktop();
		
		
		ibm.registrarObserver(mobile);
		ibm.registrarObserver(tela);
		
		microsoft.registrarObserver(mobile);
		microsoft.registrarObserver(tela);
		
		apple.registrarObserver(mobile);
		apple.registrarObserver(tela);
		
		//Setando os preços de forma aleatória
		for(int i =0; i<30; i++){
			ibm.updatePrecoEstoque((int)(Math.random()*101)+1);
			microsoft.updatePrecoEstoque((int)(Math.random()*101)+1);
			apple.updatePrecoEstoque((int)(Math.random()*101)+1);
		}
    }
}
