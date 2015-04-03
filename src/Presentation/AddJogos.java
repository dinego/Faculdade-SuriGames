/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Entity.Jogo;
import Entity.Venda;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class AddJogos extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddJogos
     */
    public AddJogos() {
        initComponents();
    }
    
    public void validaCamposPreenchidos() {  
       int j;
       if (nomeJogo.getText().length() <= 0) {  
           Object[] options = {"OK"};  
           j = JOptionPane.showOptionDialog(null, "Informe o Campo Nome do Jogo", "Erro de validação",  
                   JOptionPane.ERROR_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
           if (j == JOptionPane.ERROR_MESSAGE) {  
               nomeJogo.setBackground(Color.RED);  
               //jTabbedPane1.setSelectedIndex(1);  
               nomeJogo.requestFocus();
           }
       } else if (genero.getText().length() <= 0) {  
           Object[] options = {"OK"};  
           j = JOptionPane.showOptionDialog(null, "Informe o Campo Gênero", "Erro de validação",  
                   JOptionPane.ERROR_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
           if (j == JOptionPane.ERROR_MESSAGE) {  
               genero.setBackground(Color.RED);  
               //jTabbedPane1.setSelectedIndex(1);  
               genero.requestFocus();
           }
       } else if (qtde.getText().length() <= 0) {  
           Object[] options = {"OK"};  
           j = JOptionPane.showOptionDialog(null, "Informe o Campo Quantidade", "Erro de validação",  
                   JOptionPane.ERROR_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
           if (j == JOptionPane.ERROR_MESSAGE) {  
               qtde.setBackground(Color.RED);  
               //jTabbedPane1.setSelectedIndex(1);  
               qtde.requestFocus();
           }
       } else if (distribuidora.getText().length() <= 0) {  
           Object[] options = {"OK"};  
           j = JOptionPane.showOptionDialog(null, "Informe o Campo Distribuidora", "Erro de validação",  
                   JOptionPane.ERROR_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
           if (j == JOptionPane.ERROR_MESSAGE) {  
               distribuidora.setBackground(Color.RED);  
               //jTabbedPane1.setSelectedIndex(1);  
               distribuidora.requestFocus();
           }
       } else if (valor.getText().length() <= 0) {  
           Object[] options = {"OK"};  
           j = JOptionPane.showOptionDialog(null, "Informe o Campo Valor", "Erro de validação",  
                   JOptionPane.ERROR_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
           if (j == JOptionPane.ERROR_MESSAGE) {  
               valor.setBackground(Color.RED);  
               //jTabbedPane1.setSelectedIndex(1);  
               valor.requestFocus();
           }
       } else if (fornecedor.getText().length() <= 0) {  
           Object[] options = {"OK"};  
           j = JOptionPane.showOptionDialog(null, "Informe o Campo Fornecedor", "Erro de validação",  
                   JOptionPane.ERROR_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
           if (j == JOptionPane.ERROR_MESSAGE) {  
               fornecedor.setBackground(Color.RED);
               //jTabbedPane1.setSelectedIndex(1);  
               fornecedor.requestFocus();
           }
       } else if (codInterno.getText().length() <= 0) {  
           Object[] options = {"OK"};  
           j = JOptionPane.showOptionDialog(null, "Informe o Campo Código", "Erro de validação",  
                   JOptionPane.ERROR_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
           if (j == JOptionPane.ERROR_MESSAGE) {  
               codInterno.setBackground(Color.RED);
               //jTabbedPane1.setSelectedIndex(1);  
               codInterno.requestFocus();
           }
       } else {  
            cadastraCampos();
       }
    }
    
    private void cadastraCampos() {
       //criando objeto cliente
        Jogo jogo  = new Jogo();
        
        //pegando valores dos inputs e atribuindo ao objeto cliente
        String addNomeJogo = nomeJogo.getText();
        jogo.setNomeJogo(addNomeJogo);
        
        String addGenero = genero.getText();
        jogo.setGenero(addGenero);
        
        String addDistribuidora = distribuidora.getText();
        jogo.setDistribuidora(addDistribuidora);
        
        float addValor = Float.parseFloat(valor.getText().trim());
        jogo.setValor(addValor);
        
        int addQtde = Integer.parseInt(qtde.getText());
        jogo.setQtde(addQtde);
        
        String addFornecedor = fornecedor.getText();
        jogo.setFornecedor(addFornecedor);
        
        int addCodInterno = Integer.parseInt(codInterno.getText());
        jogo.setCodInterno(addCodInterno);
        
        jogo.InserirDados(jogo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeJogo = new javax.swing.JLabel();
        nomeJogo = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        genero = new javax.swing.JTextField();
        lblDistribuidora = new javax.swing.JLabel();
        distribuidora = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        lblQtde = new javax.swing.JLabel();
        qtde = new javax.swing.JTextField();
        lblFornecedor = new javax.swing.JLabel();
        fornecedor = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        codInterno = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Adicionar novo Jogo");

        lblNomeJogo.setText("Nome do Jogo");

        lblGenero.setText("Gênero");

        lblDistribuidora.setText("Distribuidora");

        lblValor.setText("Valor em R$");

        lblQtde.setText("Quantidade em Estoque");

        qtde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdeActionPerformed(evt);
            }
        });

        lblFornecedor.setText("Fornecedor");

        fornecedor.setEditable(false);
        fornecedor.setText("Fulano");
        fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedorActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        jLabel1.setText("Código do Jogo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNomeJogo)
                            .addComponent(lblDistribuidora)
                            .addComponent(nomeJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(distribuidora))
                        .addGap(18, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblGenero)
                            .addComponent(lblValor)
                            .addComponent(valor, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(genero, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar))
                            .addComponent(lblQtde)
                            .addComponent(qtde, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fornecedor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFornecedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(codInterno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeJogo)
                            .addComponent(lblGenero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQtde)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDistribuidora)
                            .addComponent(lblValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(distribuidora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(codInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnCancelar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qtdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdeActionPerformed

    private void fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedorActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        validaCamposPreenchidos();
    }//GEN-LAST:event_btnCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField codInterno;
    private javax.swing.JTextField distribuidora;
    private javax.swing.JTextField fornecedor;
    private javax.swing.JTextField genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDistribuidora;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNomeJogo;
    private javax.swing.JLabel lblQtde;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField nomeJogo;
    private javax.swing.JTextField qtde;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
