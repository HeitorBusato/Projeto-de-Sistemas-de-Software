
import com.mycompany.questao2.Conexao;
import com.mycompany.questao2.Requisicao;
import com.mycompany.questao2.Resposta;
import com.mycompany.questao2.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heitor
 */
public class Cliente {
    public static void main(String[] args) {
        try {
            
            Usuario usuarioA = new Usuario("Joao");
            Usuario usuarioB = new Usuario("Maria");
            
            Conexao conexao = new Conexao();
            System.out.println(conexao);
            
            Requisicao requisicao = new Requisicao(usuarioA, "OLA");
            Resposta resposta = new Resposta(usuarioB, "OLA");
            
            conexao.conectar();
            System.out.println(conexao);
            
            conexao.enviarRequisicao(requisicao);
            conexao.receberResposta(resposta);
                        
        } catch (Exception ex) {
            System.out.println("Falha: " + ex.getMessage());
        }

    }
}

