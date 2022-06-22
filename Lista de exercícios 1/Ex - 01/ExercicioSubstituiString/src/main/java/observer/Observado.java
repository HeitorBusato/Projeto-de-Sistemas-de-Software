/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;

/**
 *
 * @author Heitor
 */
public interface Observado {
    void adicionarObservador(Observador o);
    void removerObservador(Observador o);
    void notificarObservador();
}
