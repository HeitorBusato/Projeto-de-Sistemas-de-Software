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
public abstract class Componente {

    protected double valorM2 = 3188.98;
    protected String descricao;
    protected double area;

    public Componente() {
    }

    public abstract double getArea();
    
    public abstract String getDescricao();

    public abstract Componente reverter();
    
    @Override
    public String toString() {
        return getDescricao() + "\n" +"Área total: "+ getArea()+" m²"+"\nValor m²: "+ valorM2+"\nValor total do imóvel: "+ (getArea()*valorM2);
    }

}
