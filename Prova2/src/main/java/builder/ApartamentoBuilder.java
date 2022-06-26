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

public abstract class ApartamentoBuilder {
    
    protected Componente componente;

    public abstract void criarApartamento();

    public abstract void addComodo();

    public abstract void addComodoDecorator();

    public Componente Apartamento() {
        return componente;
    }
}
