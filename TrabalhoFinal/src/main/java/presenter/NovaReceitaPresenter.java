/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.NovaReceitaView;

/**
 *
 * @author Heitor
 */
public class NovaReceitaPresenter {

    private NovaReceitaView view;

    public NovaReceitaPresenter(NovaReceitaView view) {
        view = new NovaReceitaView();

        this.view.getBtnConfirmar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

    }
    
}
