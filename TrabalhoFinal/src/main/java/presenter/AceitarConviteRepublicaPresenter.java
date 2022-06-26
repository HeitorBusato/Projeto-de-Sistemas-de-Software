/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import collection.RepublicaCollection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AceitarConviteRepublicaView;

/**
 *
 * @author Heitor
 */
public class AceitarConviteRepublicaPresenter {

    private AceitarConviteRepublicaView view;
    private RepublicaCollection republicas;

    public AceitarConviteRepublicaPresenter() {
        view = new AceitarConviteRepublicaView();
        this.republicas = RepublicaCollection.instance();

        this.view.getBtnAceitar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }

        });

        this.view.getBtnRecusar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }
    
}
