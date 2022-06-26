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
public class Suite extends Componente{
    
    Componente elementoDecorado;
    
     public Suite(Componente elementoDecorado) {
        this.elementoDecorado = elementoDecorado;
    }

    @Override
    public double getArea() {
        return this.elementoDecorado.getArea()+ 10;
    }

    @Override
    public String getDescricao() {
        return this.elementoDecorado.getDescricao() + ", suite com duas cubas e duas duchas totalizando 10m²";
    }

    @Override
    public Componente reverter() {
        return (Componente) elementoDecorado;
    }
}
