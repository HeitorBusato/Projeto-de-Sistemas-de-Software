/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder.decorator;

import builder.Componente;

/**
 *
 * @author Heitor
 */
public abstract class Decorador extends Componente {

    Componente elementoDecorado;

    public Decorador(Componente elementoDecorado) {
        this.elementoDecorado = elementoDecorado;
    }

    @Override
    public Componente reverter() {
        return (Componente) elementoDecorado;
    }
}
