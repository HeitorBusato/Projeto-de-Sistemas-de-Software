/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.NovoUsuarioView;

/**
 *
 * @author Heitor
 */
public class NovoUsuarioPresenter {

     private NovoUsuarioView view;

    public NovoUsuarioPresenter(NovoUsuarioView view) {
        view = new NovoUsuarioView();
        
        this.view.getBtnCancelar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        this.view.getBtnSalvar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
    
}
}
