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
public interface Observavel {
	public void registrarObserver(Observer observer);
	public void notificarObservers();
	public void removerObserver(Observer observer);
}
