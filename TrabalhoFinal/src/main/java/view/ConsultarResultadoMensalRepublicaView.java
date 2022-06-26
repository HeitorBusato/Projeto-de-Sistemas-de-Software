/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;

/**
 *
 * @author Heitor
 */
public class ConsultarResultadoMensalRepublicaView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarResultadoRepublica
     */
    public ConsultarResultadoMensalRepublicaView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGrafico = new javax.swing.JButton();

        setTitle("Resultado Mensal da República");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos os Meses", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 100, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mês / Ano", "Saldo do mês anterior", "Total de despesas (TD)", "Total de despesas pagas (TDP)", "Total de Receitas recebidas (TRR)", "Saldo Total (TD - TDP + TRR)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 850, 310));

        btnGrafico.setText("Visualizar gráfico");
        btnGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficoActionPerformed
        
    }//GEN-LAST:event_btnGraficoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGrafico;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnGrafico() {
        return btnGrafico;
    }



}
