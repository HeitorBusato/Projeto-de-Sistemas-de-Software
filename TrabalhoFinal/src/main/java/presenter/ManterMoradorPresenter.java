/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ManterMoradorView;

/**
 *
 * @author Heitor
 */
public class ManterMoradorPresenter {

     private ManterMoradorView view;

    public ManterMoradorPresenter(ManterMoradorView view) {
        view = new ManterMoradorView();

        this.view.getBtnConvidar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        this.view.getBtnEditar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        this.view.getBtnHistorico().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        this.view.getBtnRemoverRepublica().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

    }
    
}
