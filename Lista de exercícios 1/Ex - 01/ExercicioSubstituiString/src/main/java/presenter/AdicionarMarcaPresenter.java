/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import collections.MarcasCollection;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JOptionPane;
import view.AdicionarMarcaView;


/**
 *
 * @author Heitor
 */
public final class AdicionarMarcaPresenter {
    
    private AdicionarMarcaView view;
    private MarcasCollection marcasCollection;

    public AdicionarMarcaPresenter() {
        configurarTela();
    }
    
    private void configurarTela() {
        this.marcasCollection = MarcasCollection.getInstance();
        this.view = new AdicionarMarcaView();
        
        this.view.getjButtonAddMarca().addActionListener(l -> {
            salvarMarca();
        });
        
        this.view.addComponentListener(new ComponentAdapter() {
           
            @Override
            public void componentMoved(ComponentEvent e) {
                view.setLocationRelativeTo(null);
            }
            
        });
        
        this.view.setResizable(false);
        this.view.setVisible(true);
    }

    private void salvarMarca() {
        String marca = this.view.getjTextFieldMarca().getText();
        
        System.out.println("Marca: " + marca);
        
        try {
            this.marcasCollection.addMarca(marca);
        } catch (Exception m) {
            
            JOptionPane.showMessageDialog(this.view, "<html><body>"
                    + "<h3>"
                    + "<font face='Arial'>" + m.getMessage() + "</font>"
                    + "</h3>"
                    + "</body></html>", "MENSAGEM", 1);
        }
        
        this.view.getjTextFieldMarca().setText("");
    }
}
