/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder;

import builder.decorator.ComodoIntegrado;
import builder.decorator.Quarto;

/**
 *
 * @author Heitor
 */
public class KitnetBuilder extends ApartamentoBuilder{
    
    @Override
    public void criarApartamento() {
        componente = new Quarto();
    }

    @Override
    public void addComodo() {
        componente = new ComodoIntegrado(componente);
    }

    @Override
    public void addComodoDecorator() {
        
    }
    
}
