/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;
import modeloDAO.DaoUsuario;
import modeloBeans.BeansUsuario;
import java.util.Random;

/**
 *
 * @author Gustavo
 */
public class DadosPessoais extends javax.swing.JFrame {

    ConexaoBD conecta = new ConexaoBD();
    DaoUsuario contUsu = new DaoUsuario();
    BeansUsuario modusu = new BeansUsuario();
    Random aleatorio = new Random();
    
    public DadosPessoais() {
        initComponents();
        conecta.conexao();      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelDetalherodapeprin = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPreccpCad2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNomeCad = new javax.swing.JTextField();
        jTextFieldPreccpCad = new javax.swing.JTextField();
        jComboBoxPosto = new javax.swing.JComboBox<String>();
        jTextFieldSetorCad = new javax.swing.JTextField();
        jTextFieldSenhaCad = new javax.swing.JTextField();
        jButtonCadasdro = new javax.swing.JButton();
        jComboBoxSexo = new javax.swing.JComboBox<String>();
        jLabelFundoPrincipal = new javax.swing.JLabel();
        jTextFieldHora1 = new javax.swing.JTextField();
        jTextFieldhora2 = new javax.swing.JTextField();
        jTextFieldPreccpCad1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Alterar dados pessoais");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 280, 40);

        jLabelDetalherodapeprin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/370987.png"))); // NOI18N
        getContentPane().add(jLabelDetalherodapeprin);
        jLabelDetalherodapeprin.setBounds(-10, 260, 710, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Nome:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 80, 41, 17);
        getContentPane().add(jTextFieldPreccpCad2);
        jTextFieldPreccpCad2.setBounds(70, 80, 260, 30);

        jButton1.setText("Pesquisar Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 80, 160, 30);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome Completo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Preccp:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Posto:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Setor:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Senha:");

        jTextFieldNomeCad.setEnabled(false);
        jTextFieldNomeCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCadActionPerformed(evt);
            }
        });

        jTextFieldPreccpCad.setEnabled(false);

        jComboBoxPosto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SD", "CB", "SGT", "ST", "ASP OF", "TEN", "CAP", "MAJ", "TEN CEL", "CEL" }));
        jComboBoxPosto.setEnabled(false);

        jTextFieldSetorCad.setEnabled(false);

        jTextFieldSenhaCad.setEnabled(false);

        jButtonCadasdro.setText("Alterar");
        jButtonCadasdro.setEnabled(false);
        jButtonCadasdro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadasdroActionPerformed(evt);
            }
        });

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        jComboBoxSexo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeCad))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldSenhaCad, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCadasdro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldSetorCad)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jTextFieldPreccpCad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(13, 13, 13)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxPosto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSexo, 0, 108, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNomeCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPreccpCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jComboBoxPosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSetorCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSenhaCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jButtonCadasdro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 120, 560, 140);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundologin_1.png"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(-40, -30, 740, 520);

        jTextFieldHora1.setText("0000");
        getContentPane().add(jTextFieldHora1);
        jTextFieldHora1.setBounds(440, 200, 80, 20);

        jTextFieldhora2.setText("0000");
        getContentPane().add(jTextFieldhora2);
        jTextFieldhora2.setBounds(470, 200, 120, 20);
        getContentPane().add(jTextFieldPreccpCad1);
        jTextFieldPreccpCad1.setBounds(0, 0, 6, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Preccp:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 47, 17);

        setSize(new java.awt.Dimension(597, 310));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeCadActionPerformed

    private void jButtonCadasdroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadasdroActionPerformed
   /*     modusu.setPreccp(Integer.parseInt(jTextFieldPreccpCad.getText()));
        modusu.setSenha(jTextFieldSenhaCad.getText());
        modusu.setNomeUsu(jTextFieldNomeCad.getText());
        modusu.setSetor(jTextFieldSetorCad.getText());
        modusu.setSexo((String) jComboBoxSexo.getSelectedItem());
        modusu.setPosto((String) jComboBoxPosto.getSelectedItem());
        modusu.setHoraLimite1(Integer.parseInt(jTextFieldHora1.getText()));
        modusu.setHoraLimite2(Integer.parseInt(jTextFieldHora1.getText()));
        contUsu.Salvar(modusu);  */
                JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso!");
                TelaPrincipal  tela = new TelaPrincipal();
                tela.setVisible(true);
                dispose();
    }//GEN-LAST:event_jButtonCadasdroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                   jTextFieldNomeCad.setEnabled(true);
            jTextFieldPreccpCad.setEnabled(true);
            jTextFieldSenhaCad.setEnabled(true);
            jTextFieldSetorCad.setEnabled(true);
            jComboBoxPosto.setEnabled(true);
            jComboBoxSexo.setEnabled(true);
            jButtonCadasdro.setEnabled(true);          
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DadosPessoais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosPessoais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosPessoais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosPessoais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosPessoais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCadasdro;
    private javax.swing.JComboBox<String> jComboBoxPosto;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDetalherodapeprin;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldHora1;
    private javax.swing.JTextField jTextFieldNomeCad;
    private javax.swing.JTextField jTextFieldPreccpCad;
    private javax.swing.JTextField jTextFieldPreccpCad1;
    private javax.swing.JTextField jTextFieldPreccpCad2;
    private javax.swing.JTextField jTextFieldSenhaCad;
    private javax.swing.JTextField jTextFieldSetorCad;
    private javax.swing.JTextField jTextFieldhora2;
    // End of variables declaration//GEN-END:variables
}