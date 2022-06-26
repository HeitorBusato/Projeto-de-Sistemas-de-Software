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
public class Quarto extends Componente{
      
    @Override
    public double getArea() {
       return 12;
    }

    @Override
    public String getDescricao() {
        return "Apartamento com: Quarto padrão com piso em laminado de 12m²";
    }
    
    @Override
    public Componente reverter() {
        return this;
    }
}
