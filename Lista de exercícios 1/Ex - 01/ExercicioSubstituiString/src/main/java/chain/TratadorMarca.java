/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chain;

/**
 *
 * @author Heitor
 */
public interface TratadorMarca{
    boolean aceitar(String texto);
    
    String processar(String texto) throws Exception;
}
