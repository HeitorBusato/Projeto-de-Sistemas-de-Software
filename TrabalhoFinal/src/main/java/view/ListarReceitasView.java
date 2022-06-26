package view;

import javax.swing.JButton;


/**
 *
 * @author Heitor
 */
public class ListarReceitasView extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form ManterTarefa
     */
    public ListarReceitasView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnNovaReceita = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnInformacoes = new javax.swing.JButton();
        btnEstorno = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Listar Receitas/Despesas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Descrição", "Data Vencimento", "Valor", "Periodicidade", "Moradores", "Valor Dividido", "Valor Recebido/Pago", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(80);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(5).setMinWidth(150);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 53, 910, 204));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa", "Data" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, 123, -1));

        btnNovaReceita.setText("Cadastrar Nova Receita/Despesa");
        btnNovaReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaReceitaActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovaReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 210, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 10, 680, -1));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 88, -1));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, 88, -1));

        btnInformacoes.setText("Ver Informações");
        btnInformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacoesActionPerformed(evt);
            }
        });
        getContentPane().add(btnInformacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, -1, -1));

        btnEstorno.setText("Realizar Estorno");
        btnEstorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstornoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, -1));

        setBounds(0, 0, 942, 356);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnNovaReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaReceitaActionPerformed
        NovaReceitaView cad = new NovaReceitaView();
        TelaInicial.Desktop.add(cad);
        cad.setVisible(true);
    }//GEN-LAST:event_btnNovaReceitaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        NovaReceitaView cad = new NovaReceitaView();
        TelaInicial.Desktop.add(cad);
        cad.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacoesActionPerformed
        VisualizarReceitaView v = new VisualizarReceitaView();
        TelaInicial.Desktop.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_btnInformacoesActionPerformed

    private void btnEstornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstornoActionPerformed
        RealizarEstornoView cad = new RealizarEstornoView();
        TelaInicial.Desktop.add(cad);
        cad.setVisible(true);
    }//GEN-LAST:event_btnEstornoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEstorno;
    private javax.swing.JButton btnInformacoes;
    private javax.swing.JButton btnNovaReceita;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public JButton getBtnEstorno() {
        return btnEstorno;
    }

    public JButton getBtnInformacoes() {
        return btnInformacoes;
    }

    public JButton getBtnNovaReceita() {
        return btnNovaReceita;
    }



}
