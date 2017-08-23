/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ModeloTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.ApontamentoLogin;
import modeloBeans.BeansData;
import modeloBeans.BeansUsuario;
import modeloConection.ConexaoBD;
import modeloDAO.DaoApontamentoLogin;
import modeloDAO.DaoUsuario;

/**
 *
 * @author Admin
 */
public class Relatorio extends javax.swing.JFrame {

    ConexaoBD con = new ConexaoBD();
    ApontamentoLogin apl = new ApontamentoLogin();
    DaoApontamentoLogin daoAL = new DaoApontamentoLogin();
     BeansUsuario modusu = new BeansUsuario();
     DaoUsuario contUsu = new DaoUsuario();
    public Relatorio() {
        initComponents();
        //String prec = jTextField2.getText();
        //preencherTabela("SELECT a.pont_data, l.hora_login, a.pont_horalocal, a.pont_justificativa FROM usuario AS u INNER JOIN apontamento AS a ON u.cod_usu = a.pont_usu INNER JOIN login AS l ON l.login_codusu = u.cod_usu where a.preccp ='"+prec+"' order by a.pont_data");
    }
     public void recebendo(String recebe){
        jTextField2.setText(recebe);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabelLNome1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelLHoraLimite = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelLPosto1 = new javax.swing.JLabel();
        jLabelLPreccp1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelLNome = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jInternalFrame1.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        jLabelLNome1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(jLabelLNome1);
        jLabelLNome1.setBounds(100, 270, 450, 30);

        jTextField3.setText("01");
        jInternalFrame1.getContentPane().add(jTextField3);
        jTextField3.setBounds(40, 40, 30, 40);

        jButton4.setText("Buscar Relatorio por mês");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton4);
        jButton4.setBounds(50, 110, 230, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Exemplo: 01, 02, 03, 04, 10, 12;");
        jInternalFrame1.getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 80, 320, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("MÊS:");
        jInternalFrame1.getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 50, 40, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Digite o mês que deseja visualizar o apontamento!");
        jInternalFrame1.getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 10, 320, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jTextField2);
        jTextField2.setBounds(80, 50, 210, 30);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(250, 330, 330, 190);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 430, 750, 720);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("MINISTÉRIO BRASILEIRO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 90, 280, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("EXÉRCITO BRASILEIRO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 120, 250, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("COMANDO DA 7ª REGIÃO MILITAR");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 150, 380, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("RELAÇÃO DE APONTAMENTOS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 260, 330, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("HOSPITAL MILITAR DE ÁREA DE RECIFE");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 180, 440, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("(Hospital Militar de Pernambuco/1817)");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(260, 210, 310, 40);

        jLabelLHoraLimite.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jLabelLHoraLimite);
        jLabelLHoraLimite.setBounds(300, 380, 190, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("PREC-CP:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 360, 70, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("NOME:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 340, 70, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("POSTO:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(40, 320, 70, 30);

        jLabelLPosto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jLabelLPosto1);
        jLabelLPosto1.setBounds(90, 320, 70, 30);

        jLabelLPreccp1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jLabelLPreccp1);
        jLabelLPreccp1.setBounds(90, 340, 370, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("HORÁRIO LIMITE PARA O APONTAMENTO:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 380, 270, 30);

        jLabelLNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jLabelLNome);
        jLabelLNome.setBounds(100, 360, 190, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Music\\Dias\\Ministerio da defesa.jpg")); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(380, 10, 80, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/branco2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -10, 1048, 1030);

        setSize(new java.awt.Dimension(847, 965));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       /* String prec = jTextField2.getText();
        String data = jTextField3.getText();
        BeansData datta = new BeansData();      
        preencherTabela("SELECT a.pont_data, l.hora_login, a.pont_horalocal, a.pont_justificativa FROM usuario AS u INNER JOIN apontamento AS a ON u.cod_usu = a.pont_usu INNER JOIN login AS l ON l.login_codusu = u.cod_usu where l.preccp ='"+prec+"' and a.pont_data like '%"+data+"/2017%'");
        modusu.setPesquisa(jTextField2.getText());
      BeansUsuario model = contUsu.buscarUsuario(modusu);
      jLabelLNome.setText(String.valueOf(model.getPreccp()));
      jLabelLPreccp1.setText(model.getNomeUsu());
      jLabelLPosto1.setText(model.getPosto());
      jLabelLHoraLimite.setText(String.valueOf("De "+model.getHoraLimite1()+" Até "+model.getHoraLimite2()));
      jInternalFrame1.dispose();*/
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Data", "Hora login", "Hora Saida","Justificativa"};
        con.conexao();
        con.executaSql(Sql);

        try {
            con.rs.first();
            do {
                dados.add(new Object[]{con.rs.getString("pont_data"), con.rs.getString("hora_login"), con.rs.getString("pont_horalocal"), con.rs.getString("pont_justificativa")});

            } while (con.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList!!" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);

        jTable1.setModel(modelo);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(400);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelLHoraLimite;
    private javax.swing.JLabel jLabelLNome;
    private javax.swing.JLabel jLabelLNome1;
    private javax.swing.JLabel jLabelLPosto1;
    private javax.swing.JLabel jLabelLPreccp1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}