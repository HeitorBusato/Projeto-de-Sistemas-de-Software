/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ListarReceitasView;

/**
 *
 * @author Heitor
 */
public class ListarSugestaoPresenter {

    private ListarReceitasView view;
    
    public ListarSugestaoPresenter(ListarReceitasView view) {
        view = new ListarReceitasView();
        
        this.view.getBtnEditar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        this.view.getBtnEstorno().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }            
        });
        
        this.view.getBtnInformacoes().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }            
        });
        
        this.view.getBtnNovaReceita().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }            
        });
    }
    
}
