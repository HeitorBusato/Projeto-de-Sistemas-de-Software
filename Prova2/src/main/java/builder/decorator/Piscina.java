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
public class Piscina extends Decorador{

     public Piscina(Componente elementoDecorado) {
        super(elementoDecorado);
    }

    @Override
    public double getArea() {
        return this.elementoDecorado.getArea()+ 18;
    }

    @Override
    public String getDescricao() {
        return this.elementoDecorado.getDescricao() + ", piscina padrão alvenaria com área rasa totalizando 18m²";
    }
    
    @Override
    public Componente reverter() {
        return (Componente) elementoDecorado;
    }
    
}
