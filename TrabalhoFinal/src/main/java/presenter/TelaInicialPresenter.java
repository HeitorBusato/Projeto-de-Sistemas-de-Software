/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AceitarConviteRepublicaView;
import view.ConfirmarSolucaoView;
import view.ConvidarMoradorView;
import view.ListarReceitasView;
import view.ManterMoradorView;
import view.ManterRepublicaView;
import view.ManterTarefaView;
import view.NovaReceitaView;
import view.NovaRepublicaView;
import view.RealizarEstornoView;
import view.TelaInicial;
import static view.TelaInicial.Desktop;
import view.VisualizarReceitaView;

/**
 *
 * @author Heitor
 */
public class TelaInicialPresenter {

    private TelaInicial view;

    public TelaInicialPresenter(TelaInicial view) {
        view = new TelaInicial();
        
        this.view.getSair().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fechar();
            }            
        });
        
        
        this.view.getMenuBuscarVagas().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }            
        });
        
        this.view.getMenuCriarRepublica().addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {   
                NovaRepublicaView a = new NovaRepublicaView();
                Desktop.add(a);
                a.setVisible(true);
            }            
        });
        
        this.view.getMenuManterRepublica().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                  ManterRepublicaView a = new ManterRepublicaView();
                  Desktop.add(a);
                  a.setVisible(true);
            }            
        });
        
        this.view.getMenuResultadoMensal().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }            
        });
        
        this.view.getMenuManterMorador().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 ManterMoradorView a = new ManterMoradorView();
                 Desktop.add(a);
                 a.setVisible(true);
            }            
        });
        
        this.view.getMenuAceitarConvite().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AceitarConviteRepublicaView a = new AceitarConviteRepublicaView();
                Desktop.add(a);
                a.setVisible(true);
            }            
        });
        
        this.view.getMenuConvidarMorador().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConvidarMoradorView a = new ConvidarMoradorView();
                Desktop.add(a);
                a.setVisible(true);
                
            }            
        });
        
        this.view.getMenuManterPerfil().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManterMoradorView a = new ManterMoradorView();
                Desktop.add(a);
                a.setVisible(true);
            }            
        });
        
        this.view.getMenuRegistrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NovaReceitaView a = new NovaReceitaView();
                Desktop.add(a);
                a.setVisible(true);
            }            
        });
        
        this.view.getMenuManterTarefa().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManterTarefaView mt = new ManterTarefaView();
                Desktop.add(mt);
                mt.setVisible(true);
            }            
        });
        
        this.view.getMenuManterReceita().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListarReceitasView a = new ListarReceitasView();
                Desktop.add(a);
                a.setVisible(true);
            }            
        });
        
        this.view.getMenuFazerEstorno().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RealizarEstornoView a = new  RealizarEstornoView();
                Desktop.add(a);
                a.setVisible(true);
            }            
        });
        
        this.view.getMenuConsultarReceita().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VisualizarReceitaView a = new VisualizarReceitaView();
                Desktop.add(a);
                a.setVisible(true);
            }            
        });
        
        this.view.getMenuRegistrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NovaReceitaView a = new NovaReceitaView();
                Desktop.add(a);
                a.setVisible(true);            }            
        });
        
        this.view.getMenuConfirmarReclamacao().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConfirmarSolucaoView a = new ConfirmarSolucaoView();
                Desktop.add(a);
                a.setVisible(true);
            }            
        });
        
        this.view.getMenuManterReclamacao().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }            
        });
 
    }
    
    
    private void fechar() {
        view.dispose();
    }
    
}
