/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package state;

import com.mycompany.questao2.Conexao;

/**
 *
 * @author Heitor
 */
public class Desconectada extends Estado{
   
    Conexao conexao;
    
    public Desconectada(Conexao conexao) {
        this.conexao = conexao;
        System.out.println("\nServiço de Mensagem Desconectado!");
    }
        @Override
    public void conectar(){
        this.conexao.setEstado(new Conectada(conexao));
    }
}
