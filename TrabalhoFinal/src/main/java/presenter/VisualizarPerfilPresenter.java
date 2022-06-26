/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.EditarPerfilView;
import view.TelaInicial;
import view.VisualizarPerfilView;

/**
 *
 * @author Heitor
 */
public class VisualizarPerfilPresenter {

     private VisualizarPerfilView view;

    public VisualizarPerfilPresenter(VisualizarPerfilView view) {
        view = new VisualizarPerfilView();
        
       this.view.getBtnEditar().addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                EditarPerfilView a = new EditarPerfilView();
                TelaInicial.Desktop.add(a);
                a.setVisible(true);
            }    
        });
       
       this.view.getBtnExcluir().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
       
       this.view.getBtnHistorico().addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
            }    
        });
    }
    
}
