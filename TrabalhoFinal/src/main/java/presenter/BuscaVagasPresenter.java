/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaVagasView;

/**
 *
 * @author Heitor
 */
public class BuscaVagasPresenter {

    private BuscaVagasView view;

    public BuscaVagasPresenter(BuscaVagasView view) {
        view = new BuscaVagasView();

        this.view.getBtnInformacoes().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        this.view.getBtnSolicitarMoradia().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

    }
    
}
