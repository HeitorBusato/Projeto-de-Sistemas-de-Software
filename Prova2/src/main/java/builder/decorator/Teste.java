/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder.decorator;

import builder.ApartamentoBuilder;
import builder.ApartamentoDirector;
import builder.ApartamentoPadraoBuilder;
import builder.CoberturaBuilder;
import builder.Componente;
import builder.KitnetBuilder;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Heitor
 */
public class Teste {
    public static void main(String[] args) throws FileNotFoundException {
        
        ApartamentoBuilder ap = new CoberturaBuilder();
        ApartamentoDirector ad = new ApartamentoDirector(ap);
        Componente apartamento = ad.buildApartamento();
        
        System.out.println(apartamento);
//        try (PrintWriter out = new PrintWriter("instancia.txt")) {
//            out.println(apartamento);
//        }
    }
}
