/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package surigamesdao;

import Presentation.AddClientes;
import Presentation.ListarClientes;
import Presentation.AddFornecedores;
import Presentation.ListarFornecedores;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import Presentation.AddJogos;
import Presentation.ListarJogos;

/**
 *
 * @author Diego
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ContactEditorUI
     */
    public MenuPrincipal() {
        initComponents();
    }
    
    private void setMaximumSize(JInternalFrame jInternalFrame) {
        try {
            jInternalFrame.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuClientes = new javax.swing.JMenu();
        BtnAddClientes = new javax.swing.JMenuItem();
        BtnListarClientes = new javax.swing.JMenuItem();
        MenuFornecedores = new javax.swing.JMenu();
        BtnAddFornecedor = new javax.swing.JMenuItem();
        BtnListarFornecedor = new javax.swing.JMenuItem();
        MenuJogos = new javax.swing.JMenu();
        BtnAddJogo = new javax.swing.JMenuItem();
        BtnListarJogos = new javax.swing.JMenuItem();
        BtnListarJogosVendidos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SuriGames - Gerenciador de Vendas de Jogos");

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );

        MenuClientes.setText("Clientes");

        BtnAddClientes.setText("Adicionar Cliente");
        BtnAddClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddClientesActionPerformed(evt);
            }
        });
        MenuClientes.add(BtnAddClientes);
        BtnAddClientes.getAccessibleContext().setAccessibleDescription("");

        BtnListarClientes.setText("Listar Clientes");
        BtnListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarClientesActionPerformed(evt);
            }
        });
        MenuClientes.add(BtnListarClientes);

        jMenuBar1.add(MenuClientes);

        MenuFornecedores.setText("Fornecedores");

        BtnAddFornecedor.setText("Adicionar Fornecedor");
        BtnAddFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddFornecedorActionPerformed(evt);
            }
        });
        MenuFornecedores.add(BtnAddFornecedor);

        BtnListarFornecedor.setText("Listar Fornecedores");
        BtnListarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarFornecedorActionPerformed(evt);
            }
        });
        MenuFornecedores.add(BtnListarFornecedor);

        jMenuBar1.add(MenuFornecedores);

        MenuJogos.setText("Jogos");

        BtnAddJogo.setText("Adicionar Jogo");
        BtnAddJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddJogoActionPerformed(evt);
            }
        });
        MenuJogos.add(BtnAddJogo);

        BtnListarJogos.setText("Listar Jogos");
        BtnListarJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarJogosActionPerformed(evt);
            }
        });
        MenuJogos.add(BtnListarJogos);

        BtnListarJogosVendidos.setText("Listar Jogos Vendidos");
        BtnListarJogosVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarJogosVendidosActionPerformed(evt);
            }
        });
        MenuJogos.add(BtnListarJogosVendidos);

        jMenuBar1.add(MenuJogos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddFornecedorActionPerformed
        AddFornecedores addFornecedores = new AddFornecedores();
        PanelPrincipal.add(addFornecedores);
        addFornecedores.setVisible(true);
    }//GEN-LAST:event_BtnAddFornecedorActionPerformed

    private void BtnAddClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddClientesActionPerformed
        AddClientes addClientes = new AddClientes();
        PanelPrincipal.add(addClientes);
        addClientes.setVisible(true);
        setMaximumSize(addClientes);
    }//GEN-LAST:event_BtnAddClientesActionPerformed

    private void BtnListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarClientesActionPerformed
        ListarClientes listarClientes = new ListarClientes();
        PanelPrincipal.add(listarClientes);
        listarClientes.setVisible(true);
        setMaximumSize(listarClientes);
    }//GEN-LAST:event_BtnListarClientesActionPerformed

    private void BtnListarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarFornecedorActionPerformed
        ListarFornecedores listarFornecedores = new ListarFornecedores();
        PanelPrincipal.add(listarFornecedores);
        listarFornecedores.setVisible(true);
        setMaximumSize(listarFornecedores);
    }//GEN-LAST:event_BtnListarFornecedorActionPerformed

    private void BtnAddJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddJogoActionPerformed
        AddJogos addJogos = new AddJogos();
        PanelPrincipal.add(addJogos);
        addJogos.setVisible(true);
        setMaximumSize(addJogos);
    }//GEN-LAST:event_BtnAddJogoActionPerformed

    private void BtnListarJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarJogosActionPerformed
        ListarJogos listarJogos = new ListarJogos();
        PanelPrincipal.add(listarJogos);
        listarJogos.setVisible(true);
        setMaximumSize(listarJogos);
    }//GEN-LAST:event_BtnListarJogosActionPerformed

    private void BtnListarJogosVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarJogosVendidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnListarJogosVendidosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BtnAddClientes;
    private javax.swing.JMenuItem BtnAddFornecedor;
    private javax.swing.JMenuItem BtnAddJogo;
    private javax.swing.JMenuItem BtnListarClientes;
    private javax.swing.JMenuItem BtnListarFornecedor;
    private javax.swing.JMenuItem BtnListarJogos;
    private javax.swing.JMenuItem BtnListarJogosVendidos;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenu MenuFornecedores;
    private javax.swing.JMenu MenuJogos;
    private javax.swing.JDesktopPane PanelPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
