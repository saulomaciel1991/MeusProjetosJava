/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ClsDataHora;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansLogin;
import modeloBeans.BeansUsuario;
import modeloConection.ConexaoBD;
import modeloDAO.DaoLogin;
import modeloDAO.DaoUsuario;

/**
 *
 * @author Gustavo
 */
public class TelaLogin extends javax.swing.JFrame {

    ConexaoBD conecta = new ConexaoBD();
    ClsDataHora objDataHora = new ClsDataHora();
    DaoUsuario contUsu = new DaoUsuario();
    BeansUsuario modusu = new BeansUsuario();
    BeansLogin log = new BeansLogin();
    DaoLogin login = new DaoLogin();
    TelaPrincipal enviatexto;

    public TelaLogin() {
        initComponents();
        conecta.conexao();
        jTextFieldData1.setText(objDataHora.MostraData());
        jTextFieldHora.setText(objDataHora.MostraHora());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEntrarLogin = new javax.swing.JButton();
        jButtonSairLogin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPasswordFieldSenhaLogin = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelFundoLogin = new javax.swing.JLabel();
        jTextFieldHora = new javax.swing.JTextField();
        jTextFieldData1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonEntrarLogin.setText("Entrar");
        jButtonEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrarLogin);
        jButtonEntrarLogin.setBounds(150, 290, 80, 40);

        jButtonSairLogin.setText("Sair");
        jButtonSairLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairLogin);
        jButtonSairLogin.setBounds(260, 290, 80, 40);

        jButton1.setText("Cadastre-se");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 340, 190, 30);
        getContentPane().add(jPasswordFieldSenhaLogin);
        jPasswordFieldSenhaLogin.setBounds(150, 250, 190, 30);

        jTextField1.setToolTipText("Login");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(150, 200, 190, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("SENHA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 230, 50, 17);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("(sem o digito familiar)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 183, 100, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("PREC-CP");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 170, 60, 17);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela login.png"))); // NOI18N
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 480, 450);
        getContentPane().add(jTextFieldHora);
        jTextFieldHora.setBounds(490, 240, 80, 30);
        getContentPane().add(jTextFieldData1);
        jTextFieldData1.setBounds(490, 200, 80, 30);

        setSize(new java.awt.Dimension(487, 475));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarLoginActionPerformed
        conecta.conexao();
        try {
            conecta.executaSql("select * from usuario where preccp = " + (jTextField1.getText()) + "");
            conecta.rs.first();
            if (conecta.rs.getString("senha_usu").equals(jPasswordFieldSenhaLogin.getText())) {

                if (enviatexto == null) {
                    enviatexto = new TelaPrincipal();
                    enviatexto.setVisible(true);
                    enviatexto.recebendo(Integer.parseInt(jTextField1.getText()));
                } else {
                    enviatexto.setVisible(true);
                    enviatexto.setState(TelaPrincipal.NORMAL);
                }              
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta!!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario não cadastrado no sistema!!");
        }
                log.setHoralogin(Integer.parseInt(jTextFieldHora.getText()));
                log.setDatalogin(jTextFieldData1.getText());
                login.Salvar(log);
                conecta.desconecta();
                dispose();
        
    }//GEN-LAST:event_jButtonEntrarLoginActionPerformed

    private void jButtonSairLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairLoginActionPerformed
        conecta.desconecta();
        System.exit(0);
    }//GEN-LAST:event_jButtonSairLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaCadastro tela = new TelaCadastro();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEntrarLogin;
    private javax.swing.JButton jButtonSairLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JPasswordField jPasswordFieldSenhaLogin;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldData1;
    private javax.swing.JTextField jTextFieldHora;
    // End of variables declaration//GEN-END:variables
}
