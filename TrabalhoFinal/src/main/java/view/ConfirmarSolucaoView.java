package view;

import javax.swing.JButton;

/**
 *
 * @author Heitor
 */
public class ConfirmarSolucaoView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConfirmarSolucao
     */
    public ConfirmarSolucaoView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnMarcarResolvido = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnConfirmarSolucao = new javax.swing.JButton();

        setTitle("Confirmação / Resolução de Reclamações");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Descrição", "Data de Abertura", "Resolvida (Sim / Não)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(170);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        btnMarcarResolvido.setText("Marcar como Resolvida ");
        btnMarcarResolvido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarResolvidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMarcarResolvido)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMarcarResolvido)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Resolução", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Autor", "Descrição", "Data de Abertura", "Data de Solução"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Autor");
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(170);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(170);
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Data de Soluçao");
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 901, 420));

        btnConfirmarSolucao.setText("Confirmar Solução");
        btnConfirmarSolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarSolucaoActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfirmarSolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, -1, -1));

        jTabbedPane1.addTab("Confirmação", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMarcarResolvidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarResolvidoActionPerformed
       
    }//GEN-LAST:event_btnMarcarResolvidoActionPerformed

    private void btnConfirmarSolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarSolucaoActionPerformed
        
    }//GEN-LAST:event_btnConfirmarSolucaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarSolucao;
    private javax.swing.JButton btnMarcarResolvido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnConfirmarSolucao() {
        return btnConfirmarSolucao;
    }

    public JButton getBtnMarcarResolvido() {
        return btnMarcarResolvido;
    }




}
