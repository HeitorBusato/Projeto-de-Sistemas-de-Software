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
public final class Resposta {
    private String resposta;
    
    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Resposta(Usuario remetente, String resposta){
         setResposta(remetente.getNome()+": "+ resposta); 
    }
}
