/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.contatos.exemploobserver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Heitor
 */
public abstract class Estoque implements Observavel{
	private List<Observer> observers;
	
	public Estoque(){
		observers = new ArrayList<Observer>();
	}
	
	private String nome;
	private int preco;
	
	public String getNomeEstoque(){
		return nome;
	}

	@Override
	public void registrarObserver(Observer observer) {
		if(observer != null){
			this.observers.add(observer);
		}
	}

	@Override
	public void notificarObservers() {
		Iterator<Observer> it = observers.iterator();
		while(it.hasNext()){
			Observer observer = it.next();
			observer.update(this);
		}
	}

	@Override
	public void removerObserver(Observer observer) {
		if(observer != null){
			this.observers.remove(observer);
		}
	}
	
	public int getPrecoEstoque(){
		return preco;
	}
	
	public void updatePrecoEstoque(int PrecoEstoque){
		this.preco = PrecoEstoque;
		this.notificarObservers();
	}
	
	public void setNome(String NomeEstoque){
		this.nome = NomeEstoque;
	}
}
