/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.questao2;

/**
 *
 * @author Heitor
 */
public final class Requisicao {
    private String mensagem;

     
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Requisicao(Usuario remetente, String mensagem){
         setMensagem(remetente.getNome()+": "+ mensagem);      
    }
}
