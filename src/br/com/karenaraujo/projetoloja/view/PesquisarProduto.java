/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.karenaraujo.projetoloja.view;

import br.com.karenaraujo.projetoloja.controller.CategoriaProdutoController;
import br.com.karenaraujo.projetoloja.controller.FuncionarioController;
import br.com.karenaraujo.projetoloja.controller.ProdutoController;
import br.com.karenaraujo.projetoloja.model.CategoriaProduto;
import br.com.karenaraujo.projetoloja.model.Funcionario;
import br.com.karenaraujo.projetoloja.model.Produto;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ezio_joao
 */
public class PesquisarProduto extends javax.swing.JFrame {

    private JTable tabela;
    private DefaultTableModel tabelmodelo = new DefaultTableModel();

    public PesquisarProduto() {
        initComponents();
        criaJTable();
        PaineldeRolagem.setViewportView(tabela);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PaineldeRolagem = new javax.swing.JScrollPane();
        btRemover = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove.png"))); // NOI18N
        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/insert.png"))); // NOI18N
        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atualizar.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(btRemover)
                .addGap(18, 18, 18)
                .addComponent(btInserir)
                .addGap(18, 18, 18)
                .addComponent(btAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addComponent(PaineldeRolagem)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PaineldeRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInserir)
                    .addComponent(btRemover))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idProduto = (int) tabela.getValueAt(linhaSelecionada, 0);
            ProdutoController pc = new ProdutoController();
            if (pc.remover(idProduto)) {
                tabelmodelo.removeRow(linhaSelecionada);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha foi selecionada");

        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        CadastrarProdutoGUI cp = new CadastrarProdutoGUI(tabelmodelo);
        cp.setLocationRelativeTo(null);
        cp.setVisible(true);
    }//GEN-LAST:event_btInserirActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idProduto = (int) tabela.getValueAt(linhaSelecionada, 0);
            CadastrarProdutoGUI cp = new CadastrarProdutoGUI(tabelmodelo, linhaSelecionada, idProduto);
            cp.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha foi selecionada.");
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PaineldeRolagem;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btRemover;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void criaJTable() {
        tabela = new JTable(tabelmodelo);
        tabelmodelo.addColumn("Código");
        tabelmodelo.addColumn("Nome");
        tabelmodelo.addColumn("Q estoque");
        tabelmodelo.addColumn("valor");
         tabelmodelo.addColumn("Data fabricacao");
          tabelmodelo.addColumn("Categoria do Produto");
        
        preencherJTable();
    }

    private void preencherJTable() {
        ProdutoController pc = new ProdutoController();
        for (Produto p : pc.listarTodos()) {
            tabelmodelo.addRow(new Object[]{p.getCodigo(), p.getNome(),p.getQntEstoque(),
                p.getValor(), p.getDatafabricacao(),
                p.getCategoriaproduto() });
        }
    }
}
