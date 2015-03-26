/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Entity.Fornecedor;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class AddFornecedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddFornecedores
     */
    public AddFornecedores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomeContato = new javax.swing.JTextField();
        lblEmailContato = new javax.swing.JLabel();
        txtEmailContato = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        txtUF = new javax.swing.JTextField();
        lblCNPJ = new javax.swing.JLabel();
        lblRazaoSocial = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        txtRazaoSocial = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        cadastrarCliente = new javax.swing.JButton();
        lblNomeContato = new javax.swing.JLabel();
        resetarCliente = new javax.swing.JToggleButton();

        lblEmailContato.setText("Email Contato");

        lblEndereco.setText("Endereço:");

        lblNumero.setText("Número:");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        lblUF.setText("UF:");

        lblCNPJ.setText("CNPJ:");

        lblRazaoSocial.setText("Razão Social:");

        lblTelefone.setText("Telefone:");

        cadastrarCliente.setText("Cadastrar Fornecedor");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });

        lblNomeContato.setText("Nome Contato:");

        resetarCliente.setText("Resetar Formulário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRazaoSocial))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEmailContato, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEndereco))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTelefone)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTelefone)
                                .addGap(224, 224, 224)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNomeContato)
                                .addGap(0, 239, Short.MAX_VALUE))
                            .addComponent(txtNomeContato)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCNPJ)
                                .addGap(180, 180, 180)
                                .addComponent(lblRazaoSocial))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNumero)
                                .addGap(58, 58, 58)
                                .addComponent(lblUF))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmailContato)
                                .addGap(216, 216, 216)
                                .addComponent(lblEndereco))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cadastrarCliente)
                                .addGap(18, 18, 18)
                                .addComponent(resetarCliente)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCNPJ)
                    .addComponent(lblRazaoSocial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(lblNomeContato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailContato)
                    .addComponent(lblEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(lblUF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarCliente)
                    .addComponent(resetarCliente))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
        validaCamposPreenchidos();
    }//GEN-LAST:event_cadastrarClienteActionPerformed

    private void cadastraCampos() {
       //criando objeto fornecedor
        Fornecedor fornecedor  = new Fornecedor();
        
        //pegando valores dos inputs e atribuindo ao objeto fornecedor
        String addNome = txtRazaoSocial.getText();
        fornecedor.setNomeRazao(addNome);
        
        String addNomeContato = txtNomeContato.getText();
        fornecedor.setNomeContato(addNome);
        
        String addTelefone = txtTelefone.getText();
        fornecedor.setTelefone(addTelefone);
        
        String addEmail = txtEmailContato.getText();
        fornecedor.setEmailContato(addEmail);
        
        String addEndereco = txtEndereco.getText();
        fornecedor.setEndereco(addEndereco);
        
        int addNumero = Integer.parseInt(txtNumero.getText());
        fornecedor.setNum(addNumero);
        
        String addUF = txtUF.getText();
        fornecedor.setUF(addUF);
        
        String addCPFCNPJ = txtCNPJ.getText();
        fornecedor.setCpfCNPJ(addCPFCNPJ);
        
        fornecedor.InserirDados(fornecedor);
    }
    
    public void validaCamposPreenchidos() {  
       int j;
       if (txtRazaoSocial.getText().length() <= 0) {  
           Object[] options = {"OK"};  
           j = JOptionPane.showOptionDialog(null, "Informe o Campo Razão Social", "Erro de validação",  
                   JOptionPane.ERROR_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
           if (j == JOptionPane.ERROR_MESSAGE) {  
               txtRazaoSocial.setBackground(Color.RED);  
               //jTabbedPane1.setSelectedIndex(1);  
               txtRazaoSocial.requestFocus();
           }
       } else if (txtNomeContato.getText().length() <= 0) {  
           Object[] options = {"OK"};  
           j = JOptionPane.showOptionDialog(null, "Informe o Campo NOME", "Erro de validação",  
                   JOptionPane.ERROR_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
           if (j == JOptionPane.ERROR_MESSAGE) {  
               txtNomeContato.setBackground(Color.RED);  
               //jTabbedPane1.setSelectedIndex(1);  
               txtNomeContato.requestFocus();
           }
       } else if (txtTelefone.getText().length() <= 0) {  
           Object[] options = {"OK"};  
           j = JOptionPane.showOptionDialog(null, "Informe o Campo Telefone", "Erro de validação",  
                   JOptionPane.ERROR_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
           if (j == JOptionPane.ERROR_MESSAGE) {  
               txtTelefone.setBackground(Color.RED);  
               //jTabbedPane1.setSelectedIndex(1);  
               txtTelefone.requestFocus();
           }
       } else if (txtEmailContato.getText().length() <= 0) {  
           Object[] options = {"OK"};  
           j = JOptionPane.showOptionDialog(null, "Informe o Campo Email Contato", "Erro de validação",  
                   JOptionPane.ERROR_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
           if (j == JOptionPane.ERROR_MESSAGE) {  
               txtEmailContato.setBackground(Color.RED);  
               //jTabbedPane1.setSelectedIndex(1);  
               txtEmailContato.requestFocus();
           }
       } else if (txtEndereco.getText().length() <= 0) {  
           Object[] options = {"OK"};  
           j = JOptionPane.showOptionDialog(null, "Informe o Campo Endereço", "Erro de validação",  
                   JOptionPane.ERROR_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
           if (j == JOptionPane.ERROR_MESSAGE) {  
               txtEndereco.setBackground(Color.RED);  
               //jTabbedPane1.setSelectedIndex(1);  
               txtEndereco.requestFocus();
           }
       } else if (txtNumero.getText().length() <= 0) {  
           Object[] options = {"OK"};  
           j = JOptionPane.showOptionDialog(null, "Informe o Campo Número", "Erro de validação",  
                   JOptionPane.ERROR_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
           if (j == JOptionPane.ERROR_MESSAGE) {  
               txtNumero.setBackground(Color.RED);  
               //jTabbedPane1.setSelectedIndex(1);  
               txtNumero.requestFocus();
           }
       } else if (txtUF.getText().length() <= 0) {  
           Object[] options = {"OK"};  
           j = JOptionPane.showOptionDialog(null, "Informe o Campo UF", "Erro de validação",  
                   JOptionPane.ERROR_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
           if (j == JOptionPane.ERROR_MESSAGE) {  
               txtUF.setBackground(Color.RED);
               //jTabbedPane1.setSelectedIndex(1);  
               txtUF.requestFocus();
           }
       } else if (txtCNPJ.getText().length() <= 0) {  
           Object[] options = {"OK"};  
           j = JOptionPane.showOptionDialog(null, "Informe o Campo CNPJ/CPF", "Erro de validação",  
                   JOptionPane.ERROR_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
           if (j == JOptionPane.ERROR_MESSAGE) {  
               txtCNPJ.setBackground(Color.RED);
               //jTabbedPane1.setSelectedIndex(1);  
               txtCNPJ.requestFocus();
           }
       } else {  
            cadastraCampos();
       }  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarCliente;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblEmailContato;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNomeContato;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRazaoSocial;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JToggleButton resetarCliente;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtEmailContato;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeContato;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables
}
