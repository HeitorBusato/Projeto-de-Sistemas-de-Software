/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ConfirmarSolucaoView;

/**
 *
 * @author Heitor
 */
public class ConfirmarSolucaoPresenter {

     private ConfirmarSolucaoView view;

    public ConfirmarSolucaoPresenter(ConfirmarSolucaoView view) {
        view = new ConfirmarSolucaoView();
        
        
        this.view.getBtnConfirmarSolucao().addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
                
           }
        });
        
        
        this.view.getBtnMarcarResolvido().addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
                
           }
        });
    
}
}
