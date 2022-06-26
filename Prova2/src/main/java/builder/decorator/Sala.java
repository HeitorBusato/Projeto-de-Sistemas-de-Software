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
public class Sala extends Componente{

    Componente elementoDecorado;
    
     public Sala(Componente elementoDecorado) {
        this.elementoDecorado = elementoDecorado;
    }

    @Override
    public double getArea() {
        return this.elementoDecorado.getArea()+ 12;
    }

    @Override
    public String getDescricao() {
        return this.elementoDecorado.getDescricao() + ", sala com piso vinílico de 12m²";
    }
    
    @Override
    public Componente reverter() {
        return (Componente) elementoDecorado;
    }
       
}
