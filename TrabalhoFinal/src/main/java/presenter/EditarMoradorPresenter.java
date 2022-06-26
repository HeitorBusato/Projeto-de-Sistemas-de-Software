/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.EditarMoradorView;

/**
 *
 * @author Heitor
 */
public class EditarMoradorPresenter {

    private EditarMoradorView view;

    public EditarMoradorPresenter(EditarMoradorView view) {
        view = new EditarMoradorView();

        this.view.getBtnSalvar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
    
}
