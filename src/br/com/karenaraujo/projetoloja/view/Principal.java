/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.karenaraujo.projetoloja.view;

/**
 *
 * @author ezio_joao
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btFuncionario = new javax.swing.JButton();
        btVenda = new javax.swing.JButton();
        btProduto = new javax.swing.JButton();
        btCliente1 = new javax.swing.JButton();
        btAssiatencia = new javax.swing.JButton();
        btCategoriaProduto = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        imAjuda = new javax.swing.JMenuItem();
        imSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        btFuncionario.setBackground(new java.awt.Color(51, 255, 255));
        btFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/87789789.png"))); // NOI18N
        btFuncionario.setText("Funcionario");
        btFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionarioActionPerformed(evt);
            }
        });

        btVenda.setBackground(new java.awt.Color(51, 255, 255));
        btVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sale-icon.png"))); // NOI18N
        btVenda.setText("Venda");
        btVenda.setMaximumSize(new java.awt.Dimension(87, 23));
        btVenda.setMinimumSize(new java.awt.Dimension(87, 23));
        btVenda.setPreferredSize(new java.awt.Dimension(87, 23));
        btVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVendaActionPerformed(evt);
            }
        });

        btProduto.setBackground(new java.awt.Color(51, 255, 255));
        btProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/87878.png"))); // NOI18N
        btProduto.setText("Produto");
        btProduto.setMaximumSize(new java.awt.Dimension(87, 23));
        btProduto.setMinimumSize(new java.awt.Dimension(87, 23));
        btProduto.setPreferredSize(new java.awt.Dimension(87, 23));
        btProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdutoActionPerformed(evt);
            }
        });

        btCliente1.setBackground(new java.awt.Color(51, 255, 255));
        btCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/56464.png"))); // NOI18N
        btCliente1.setText("Cliente");
        btCliente1.setMaximumSize(new java.awt.Dimension(87, 23));
        btCliente1.setMinimumSize(new java.awt.Dimension(87, 23));
        btCliente1.setPreferredSize(new java.awt.Dimension(87, 23));
        btCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCliente1ActionPerformed(evt);
            }
        });

        btAssiatencia.setBackground(new java.awt.Color(51, 255, 255));
        btAssiatencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ast.png"))); // NOI18N
        btAssiatencia.setText("As.Tecnica");
        btAssiatencia.setMaximumSize(new java.awt.Dimension(87, 23));
        btAssiatencia.setMinimumSize(new java.awt.Dimension(87, 23));
        btAssiatencia.setPreferredSize(new java.awt.Dimension(87, 23));
        btAssiatencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAssiatenciaActionPerformed(evt);
            }
        });

        btCategoriaProduto.setBackground(new java.awt.Color(51, 255, 255));
        btCategoriaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/5454654.png"))); // NOI18N
        btCategoriaProduto.setText("Categoria Produto");
        btCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCategoriaProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAssiatencia, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCategoriaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAssiatencia, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 255));

        jMenu1.setText("Ajuda");

        imAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        imAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Help-and-Support-icon.png"))); // NOI18N
        imAjuda.setText("Ajuda");
        imAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imAjudaActionPerformed(evt);
            }
        });
        jMenu1.add(imAjuda);

        imSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        imSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Error-icon.png"))); // NOI18N
        imSair.setText("Sair");
        imSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imSairActionPerformed(evt);
            }
        });
        jMenu1.add(imSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imSairActionPerformed

    private void imAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imAjudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imAjudaActionPerformed

    private void btFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionarioActionPerformed
        PesquisaFuncionario f = new PesquisaFuncionario();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }//GEN-LAST:event_btFuncionarioActionPerformed

    private void btCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCliente1ActionPerformed

    private void btProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdutoActionPerformed
        PesquisarProduto cp = new PesquisarProduto();
        cp.setLocationRelativeTo(null);
        cp.setVisible(true);
    }//GEN-LAST:event_btProdutoActionPerformed

    private void btVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btVendaActionPerformed

    private void btAssiatenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAssiatenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAssiatenciaActionPerformed

    private void btCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCategoriaProdutoActionPerformed
        PesquisarCategoriaProduto pcp = new PesquisarCategoriaProduto();
        pcp.setLocationRelativeTo(null);
        pcp.setVisible(true);
    }//GEN-LAST:event_btCategoriaProdutoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAssiatencia;
    private javax.swing.JButton btCategoriaProduto;
    private javax.swing.JButton btCliente1;
    private javax.swing.JButton btFuncionario;
    private javax.swing.JButton btProduto;
    private javax.swing.JButton btVenda;
    private javax.swing.JMenuItem imAjuda;
    private javax.swing.JMenuItem imSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
