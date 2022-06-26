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
public class Cozinha extends Componente{
        
    Componente elementoDecorado;
    
     public Cozinha(Componente elementoDecorado) {
        this.elementoDecorado = elementoDecorado;
    }

    @Override
    public double getArea() {
        return this.elementoDecorado.getArea()+ 6;
    }

    @Override
    public String getDescricao() {
        return this.elementoDecorado.getDescricao() + ", cozinha com ilha e bancada em granito totalizando 10m²";
    }
    
    @Override
    public Componente reverter() {
        return (Componente) elementoDecorado;
    }
    
}

