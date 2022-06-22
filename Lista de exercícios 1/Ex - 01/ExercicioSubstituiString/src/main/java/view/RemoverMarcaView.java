package view;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextPane;

public class RemoverMarcaView extends javax.swing.JFrame {

    /**
     * Creates new form RemoverMarcaView
     */
    public RemoverMarcaView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneTextoProcessado = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneTextoOriginal = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListMarcas = new javax.swing.JList<>();
        jButtonDeletarMarca = new javax.swing.JButton();
        jButtonProcessarTexto1 = new javax.swing.JButton();
        jButtonAddMarca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Remover Nome Fantasia");
        setResizable(false);

        jScrollPane1.setViewportView(jTextPaneTextoProcessado);

        jScrollPane2.setViewportView(jTextPaneTextoOriginal);

        jListMarcas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jListMarcas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jListMarcas.setPreferredSize(new java.awt.Dimension(49, 120));
        jScrollPane3.setViewportView(jListMarcas);

        jButtonDeletarMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonDeletarMarca.setText("Remover Marca");
        jButtonDeletarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarMarcaActionPerformed(evt);
            }
        });

        jButtonProcessarTexto1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonProcessarTexto1.setText("Processar texto");
        jButtonProcessarTexto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcessarTexto1ActionPerformed(evt);
            }
        });

        jButtonAddMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAddMarca.setText("Adicionar Marca");
        jButtonAddMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMarcaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Texto processado:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Informe o Texto a ser processado:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Marcas Disponiveis para Remoção:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(104, 104, 104))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(jButtonProcessarTexto1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonAddMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeletarMarca)
                .addGap(211, 211, 211))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddMarca)
                    .addComponent(jButtonDeletarMarca))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(jButtonProcessarTexto1)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeletarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeletarMarcaActionPerformed

    private void jButtonProcessarTexto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcessarTexto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProcessarTexto1ActionPerformed

    private void jButtonAddMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddMarcaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddMarca;
    private javax.swing.JButton jButtonDeletarMarca;
    private javax.swing.JButton jButtonProcessarTexto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jListMarcas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPaneTextoOriginal;
    private javax.swing.JTextPane jTextPaneTextoProcessado;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables

    public JButton getjButtonAddMarca() {
        return jButtonAddMarca;
    }

    public JButton getjButtonDeletarMarca() {
        return jButtonDeletarMarca;
    }

    public JButton getjButtonProcessarTexto1() {
        return jButtonProcessarTexto1;
    }

    public JList<String> getjListMarcas() {
        return jListMarcas;
    }

    public JTextPane getjTextPaneTextoOriginal() {
        return jTextPaneTextoOriginal;
    }

    public JTextPane getjTextPaneTextoProcessado() {
        return jTextPaneTextoProcessado;
    }
}
