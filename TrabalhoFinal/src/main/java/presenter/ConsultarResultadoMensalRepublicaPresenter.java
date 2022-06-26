/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ConsultarResultadoMensalRepublicaView;

/**
 *
 * @author Heitor
 */
public class ConsultarResultadoMensalRepublicaPresenter {

    private ConsultarResultadoMensalRepublicaView view;

    public ConsultarResultadoMensalRepublicaPresenter(ConsultarResultadoMensalRepublicaView view) {
        view = new ConsultarResultadoMensalRepublicaView();

        this.view.getBtnBuscar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        this.view.getBtnGrafico().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

    }
    
}
