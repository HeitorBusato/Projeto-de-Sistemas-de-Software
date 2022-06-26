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
public class Churrasqueira extends Decorador{

     public Churrasqueira(Componente elementoDecorado) {
        super(elementoDecorado);
    }

    @Override
    public double getArea() {
        return this.elementoDecorado.getArea()+ 20;
    }

    @Override
    public String getDescricao() {
        return this.elementoDecorado.getDescricao() + ", churrasqueira padrão alvenaria totalizando uma área construida de 20m²";
    }
    
    @Override
    public Componente reverter() {
        return (Componente) elementoDecorado;
    }
}
