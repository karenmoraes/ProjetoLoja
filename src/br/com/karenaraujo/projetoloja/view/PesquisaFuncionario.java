/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.karenaraujo.projetoloja.view;

import br.com.karenaraujo.projetoloja.model.Funcionario;
import br.com.karenaraujo.projetoloja.controller.FuncionarioController;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ezio_joao
 */
public class PesquisaFuncionario extends javax.swing.JFrame {

    private JTable tabela;
    private DefaultTableModel tabelmodelo = new DefaultTableModel();

    public PesquisaFuncionario() {
        initComponents();
        criaJTable();
        paineldeRolagem.setViewportView(tabela);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        paineldeRolagem = new javax.swing.JScrollPane();
        btRemover = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        paineldeRolagem.setBackground(new java.awt.Color(51, 255, 255));

        btRemover.setBackground(new java.awt.Color(51, 255, 255));
        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove.png"))); // NOI18N
        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btInserir.setBackground(new java.awt.Color(51, 255, 255));
        btInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/insert.png"))); // NOI18N
        btInserir.setText("Iserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        Atualizar.setBackground(new java.awt.Color(51, 255, 255));
        Atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atualizar.png"))); // NOI18N
        Atualizar.setText("Atualizar");
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineldeRolagem)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(btRemover)
                .addGap(31, 31, 31)
                .addComponent(btInserir)
                .addGap(27, 27, 27)
                .addComponent(Atualizar)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(paineldeRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRemover)
                    .addComponent(btInserir)
                    .addComponent(Atualizar))
                .addGap(46, 46, 46))
        );

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

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idFuncionario = (int) tabela.getValueAt(linhaSelecionada, 0);
            FuncionarioController uc = new FuncionarioController();
            if (uc.remover(idFuncionario)) {
                tabelmodelo.removeRow(linhaSelecionada);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha foi selecionada");

        }

    }//GEN-LAST:event_btRemoverActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        CadastrarFuncionarioGUI fi = new CadastrarFuncionarioGUI(tabelmodelo);
        fi.setLocationRelativeTo(null);
        fi.setVisible(true);
    }//GEN-LAST:event_btInserirActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idFuncionario = (int) tabela.getValueAt(linhaSelecionada, 0);
            CadastrarFuncionarioGUI ui = new CadastrarFuncionarioGUI(tabelmodelo, linhaSelecionada, idFuncionario);
            ui.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha foi selecionada.");
        }
    }//GEN-LAST:event_AtualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btRemover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane paineldeRolagem;
    // End of variables declaration//GEN-END:variables

    private void criaJTable() {
        tabela = new JTable(tabelmodelo);
        tabelmodelo.addColumn("Código");
        tabelmodelo.addColumn("Nome");
        tabelmodelo.addColumn("Cpf");
        tabelmodelo.addColumn("Usuario");
        preencherJTable();
    }

    private void preencherJTable() {
        FuncionarioController fc = new FuncionarioController();
        for (Funcionario f : fc.listarTodos()) {
            tabelmodelo.addRow(new Object[]{f.getCodigo(), f.getNome(), f.getCpf(), f.getLogin()});
        }
    }
}
