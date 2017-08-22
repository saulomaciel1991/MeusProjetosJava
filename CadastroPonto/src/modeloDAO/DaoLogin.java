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
import modeloBeans.BeansLogin;
import modeloBeans.BeansUsuario;
import modeloConection.ConexaoBD;

/**
 *
 * @author Admin
 */
public class DaoLogin {

    BeansLogin logusu = new BeansLogin();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexUsuario = new ConexaoBD();

    int codUsu;

    public void Salvar(BeansLogin logusu) {
        BuscarUsu(logusu.getPreccpusu());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into login (hora_login,data_login,preccp) values(?,?,?)");
            pst.setInt(1, logusu.getHoralogin());
            pst.setString(2, logusu.getDatalogin());
            pst.setInt(3, codUsu);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso de Login!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Login!!!\n" + ex);
        }
    }

    public void BuscarUsu(String nomeUsu) {
        conexUsuario.conexao();
        conexUsuario.executaSql("select * from usuario where preccp ='" + nomeUsu + "'");
        try {
            conexUsuario.rs.first();
            codUsu = conexUsuario.rs.getInt("preccp");
        } catch (SQLException ex) {
            Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexUsuario.desconecta();
    }
}
