package view;

import javax.swing.JButton;

/**
 *
 * @author Heitor
 */
public class ConvidarMoradorView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConvidarAceitar
     */
    public ConvidarMoradorView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnRecusar = new javax.swing.JButton();
        btnAceitar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnConvidar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Convidar Morador / Aceitar Solicitação");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Solução de Reclamação", "Realização de Tarefas", "Compromisso com Pagamentos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 410));

        btnRecusar.setText("Recusar");
        btnRecusar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecusarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRecusar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 120, -1));

        btnAceitar.setText("Aceitar Solicitação");
        btnAceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceitarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, -1, -1));

        jTabbedPane1.addTab("Aceitar Solicitações", jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Solução de Reclamação", "Realização de Tarefas", "Compromisso com Pagamentos", "Convidado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(8);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 410));

        btnConvidar.setText("Convidar");
        btnConvidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvidarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConvidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 110, -1));

        jTabbedPane1.addTab("Convidar Usuários", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecusarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecusarActionPerformed
        
    }//GEN-LAST:event_btnRecusarActionPerformed

    private void btnAceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceitarActionPerformed
       
    }//GEN-LAST:event_btnAceitarActionPerformed

    private void btnConvidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvidarActionPerformed
       
    }//GEN-LAST:event_btnConvidarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceitar;
    private javax.swing.JButton btnConvidar;
    private javax.swing.JButton btnRecusar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAceitar() {
        return btnAceitar;
    }

    public JButton getBtnRecusar() {
        return btnRecusar;
    }

    public JButton getBtnConvidar() {
        return btnConvidar;
    }
    





}

