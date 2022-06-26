/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.LoginView;

/**
 *
 * @author Heitor
 */
public class LoginPresenter {

    private LoginView view;

    public LoginPresenter(LoginView view) {
        this.view = view;
        
        
        this.view.getBtnEntrar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        this.view.getBtnNovoUsuario().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
    }
    
}
