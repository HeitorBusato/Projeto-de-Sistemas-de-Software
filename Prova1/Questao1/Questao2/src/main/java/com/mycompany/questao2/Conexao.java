/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.questao2;
import state.Desconectada;
import state.Estado;

/**
 *
 * @author Heitor
 */
public class Conexao {
    private Estado estado;
    private boolean desconectada;

    public Conexao() {
        estado = new Desconectada(this);
    }   
    
     public void conectar() throws Exception {
        estado.conectar();
    }

    public void desconectar() throws Exception {
        estado.desconectar();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public void enviarRequisicao (Requisicao requisicao){
        System.out.println("Enviando a Requisicao...");
        System.out.println(requisicao.getMensagem());
    }
    
//   public Resposta receberResposta(){ //Não consegui relacionar a assinatura do método do diagrama com a solução.
//           
//       return Resposta;
//   }
    
    public void receberResposta(Resposta resposta){
        System.out.println("Recebendo Resposta..."+"\n"+resposta.getResposta());        
   }
    
   
    @Override
    public String toString() {
        return "\nStatus: " + estado.getClass().getSimpleName().toLowerCase();
    }
    
}
