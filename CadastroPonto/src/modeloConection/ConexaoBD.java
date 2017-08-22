/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBD {
        
        public static Statement stm;
        public static ResultSet rs;
        private String driver = "org.postgresql.Driver";
        private String caminho = "jdbc:postgresql://localhost:5432/Apontamento";
        private String usuario = "postgres";
        private String senha = "tth8u4r3";
        public static Connection con;
        
        public void conexao(){
            try {
                System.setProperty("jdbc.Drivers", driver); // setar a propriedade
                con = DriverManager.getConnection(caminho, usuario, senha);
                //JOptionPane.showMessageDialog(null, "Conexão Efetuada com sucesso!!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao tentar se conectar com o banco de dados!!!:\n"+ex.getMessage());
            }
        }
        
        public void desconecta(){
            try {
                con.close();
               // JOptionPane.showMessageDialog(null, "BD desconectado com sucesso!!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com BD!!:\n"+ex.getMessage());
            }
        }
        public void executaSql (String sql){
            try {
                stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
                rs = stm.executeQuery(sql);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao executar SQL!!:\n"+ex.getStackTrace());
            }
            
        }
        
}
