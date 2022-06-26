/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ConvidarMoradorView;

/**
 *
 * @author Heitor
 */
public class ConvidarMoradorPresenter {

    private ConvidarMoradorView view;

    public ConvidarMoradorPresenter(ConvidarMoradorView view) {
        view = new ConvidarMoradorView();

        this.view.getBtnAceitar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        this.view.getBtnConvidar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        this.view.getBtnRecusar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

    }
    
}
