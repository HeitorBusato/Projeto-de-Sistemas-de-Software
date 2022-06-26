/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.EditarPerfilView;

/**
 *
 * @author Heitor
 */
public class EditarPerfilPresenter {

    private EditarPerfilView view;

    public EditarPerfilPresenter(EditarPerfilView view) {
        view = new EditarPerfilView();

        this.view.getBtnConfirmar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
    
}
