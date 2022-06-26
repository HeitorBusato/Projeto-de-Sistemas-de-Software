/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder;

import builder.decorator.Banheiro;
import builder.decorator.Churrasqueira;
import builder.decorator.Cozinha;
import builder.decorator.Piscina;
import builder.decorator.Quarto;
import builder.decorator.Sala;
import builder.decorator.Suite;

/**
 *
 * @author Heitor
 */
public class CoberturaBuilder extends ApartamentoBuilder{

    @Override
    public void criarApartamento() {
       componente = new Quarto();
    }

    @Override
    public void addComodo() {
        componente = new Banheiro(componente);
        componente = new Suite(componente);
        componente = new Cozinha(componente);
        componente = new Sala(componente);
    }

    @Override
    public void addComodoDecorator() {
        componente = new Piscina(componente);
        componente = new Churrasqueira(componente);
    }
    
}
