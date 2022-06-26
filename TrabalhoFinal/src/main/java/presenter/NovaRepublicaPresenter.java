/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.NovaRepublicaView;

/**
 *
 * @author Heitor
 */
public class NovaRepublicaPresenter {

    private NovaRepublicaView view;

    public NovaRepublicaPresenter(NovaRepublicaView view) {
        view = new NovaRepublicaView();

        this.view.getBtnConfirmar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
    
}

