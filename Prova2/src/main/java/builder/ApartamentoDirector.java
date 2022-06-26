/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder;

/**
 *
 * @author Heitor
 */
public class ApartamentoDirector {
    
    ApartamentoBuilder builder;

    public ApartamentoDirector(ApartamentoBuilder builder) {
        this.builder = builder;
    }
    
    public Componente buildApartamento() {
        builder.criarApartamento();
        builder.addComodo();
        builder.addComodoDecorator();
        return builder.Apartamento();
    }
    
}
