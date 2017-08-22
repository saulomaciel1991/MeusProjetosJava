/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansApontamento;
import modeloConection.ConexaoBD;

/**
 *
 * @author Admin
 */
public class DaoApontamento {
        BeansApontamento logusu = new BeansApontamento();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexUsuario = new ConexaoBD();

    int codUsu;
    int codLog;
    
    
    
    
    public void Salvar(BeansApontamento apont) {
        BuscarUsu(apont.getPontpreccpusu());
        BuscarLogin(apont.getPontpreccpusu());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into apontamento (pont_usu,pont_log,pont_postousu,pont_nomeusu,preccp,pont_hora,pont_horalocal,pont_data,pont_justificativa,pont_hora2) values(?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, codUsu);
            pst.setInt(2, codLog);
            pst.setString(3, apont.getPontpostousu());
            pst.setString(4, apont.getPontnomeusu());
            pst.setString(5, apont.getPontpreccpusu());
            pst.setInt(6, apont.getPonthora());
            pst.setInt(7, apont.getPonthoralocal());
            pst.setString(8, apont.getPontdata());
            pst.setString(9, apont.getPontjustificativa());
            pst.setInt(10, apont.getPonthora2());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso de Apontamento!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Aponamento!!!\n" + ex);
        }
    }
    
     public void BuscarUsu(String precUsu) {
        conexUsuario.conexao();
        conexUsuario.executaSql("select * from usuario where preccp ='" + precUsu + "'");
        try {
            conexUsuario.rs.first();
            codUsu = conexUsuario.rs.getInt("cod_usu");
        } catch (SQLException ex) {
            Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexUsuario.desconecta();
    }
      public void BuscarLogin(String preclogin) {
        conexUsuario.conexao();
        conexUsuario.executaSql("select * from login where preccp ='" + preclogin + "'");
        try {
            conexUsuario.rs.first();
            codLog = conexUsuario.rs.getInt("cod_login");
        } catch (SQLException ex) {
            Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexUsuario.desconecta();
    }
      
}


