/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Entity.Cliente;
import Entity.Cliente;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class AddClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddClientes
     */
    public AddClientes() {
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

        lblCNPJ = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblNomeContato = new javax.swing.JLabel();
        txtNomeContato = new javax.swing.JTextField();
        lblEmailContato = new javax.swing.JLabel();
        txtEmailContato = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        txtUF = new javax.swing.JTextField();
        cadastrarCliente = new javax.swing.JButton();
        resetarCliente = new javax.swing.JToggleButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Adicionar Cliente");

        lblCNPJ.setText("CNPJ/CPF:");

        lblTelefone.setText("Telefone:");

        lblNomeContato.setText("Nome/Razão Social:");

        lblEmailContato.setText("Email Contato");

        lblEndereco.setText("Endereço:");

        lblNumero.setText("Número:");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        lblUF.setText("UF:");

        cadastrarCliente.setText("Cadastrar Fornecedor");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });

        resetarCliente.setText("Resetar Formulário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeContato)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeContato)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cadastrarCliente)
                                .addGap(18, 18, 18)
                                .addComponent(resetarCliente))
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCNPJ))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCNPJ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(lblTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblEndereco))
                            .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmailContato)
                                .addGap(195, 230, Short.MAX_VALUE))
                            .addComponent(txtEmailContato)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNumero)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtNumero))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblUF)
                                        .addGap(125, 125, 125))
                                    .addComponent(txtUF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmailContato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmailContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCNPJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarCliente)
                    .addComponent(resetarCliente))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    //ação do botão "cadastrar cliente"
    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
        validaCamposPreenchidos();
    }//GEN-LAST:event_cadastrarClienteActionPerformed

    public void validaCamposPreenchidos() {  
       int j;
       if (txtNomeContato.getText().length() <= 0) {  
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
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarCliente;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblEmailContato;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNomeContato;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JToggleButton resetarCliente;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtEmailContato;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeContato;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables

    private void cadastraCampos() {
       //criando objeto cliente
        Cliente cliente  = new Cliente();
        
        //pegando valores dos inputs e atribuindo ao objeto cliente
        String addNome = txtNomeContato.getText();
        cliente.setNomeRazao(addNome);
        
        String addTelefone = txtTelefone.getText();
        cliente.setTelefone(addTelefone);
        
        String addEmail = txtEmailContato.getText();
        cliente.setEmail(addEmail);
        
        String addEndereco = txtEndereco.getText();
        cliente.setEndereco(addEndereco);
        
        int addNumero = Integer.parseInt(txtNumero.getText());
        cliente.setNum(addNumero);
        
        String addUF = txtUF.getText();
        cliente.setUF(addUF);
        
        String addCPFCNPJ = txtCNPJ.getText();
        cliente.setCpfCNPJ(addCPFCNPJ);
        
        cliente.InserirDados(cliente);
    }
}
