/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.RegistrarConclusaoView;

/**
 *
 * @author Heitor
 */
public class RegistrarConclusaoPresenter {

     private RegistrarConclusaoView view;

    public RegistrarConclusaoPresenter(RegistrarConclusaoView view) {
        view = new RegistrarConclusaoView();

        this.view.getBtnRealizada().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
    
}
