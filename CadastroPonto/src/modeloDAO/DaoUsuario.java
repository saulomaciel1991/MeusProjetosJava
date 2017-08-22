/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.math.BigInteger;
import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansUsuario;

/**
 *
 * @author Gustavo
 */
public class DaoUsuario {
    ConexaoBD conex = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();
    
    public void Salvar(BeansUsuario mod){
        conex.conexao();
        try {
            System.out.println("teste: "+ mod.getPreccp());
            PreparedStatement pst = conex.con.prepareStatement("insert into usuario (preccp,senha_usu,nome_usu,setor_usu,sexo_usu,posto_usu,hora_entrada,hora_saida, apon_dgtfamiliar) values(?,?,?,?,?,?,?,?,?)");
        pst.setInt(1,(mod.getPreccp()));
        pst.setString(2, mod.getSenha());
        pst.setString(3, mod.getNome());
        pst.setString(4, mod.getSetor());
        pst.setString(5, mod.getSexo());
        pst.setString(6, mod.getPosto());
        pst.setInt(7, mod.getHoraEntrada());
        pst.setInt(8, mod.getHoraSaida());
        pst.setString(9, mod.getDgtFamiliar());
        pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Usuario!!!\n"+ex);
        }
        conex.desconecta();
    }
    /*public void SalvarPrec(BeansUsuario mod){
        try {
            System.out.println("teste: "+ mod.getPreccp());
            PreparedStatement pst = conex.con.prepareStatement("insert into usuario (preccp) values(?)");
        pst.setInt(1,(mod.getPreccp()));
        pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Usuario!!!\n"+ex);
        }
    }
       public void Pontear(BeansUsuario mod){
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into ponteamento (codPonto,posto_pont,nome_pont) values(?,?,?)");//nome_usu,hora_usu,justificativa_usu
        //pst.setInt(1, mod.getcodPonto());
        //pst.setString(2, mod.getNomeUsu());
        //pst.setInt(3, mod.getHora());
        //pst.setString(4, mod.getJustificativa());
        pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao efetuar ponteamento!!!\n"+ex);
        }
       }
    public void Excluir(BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from usuario where preccp=?");
            pst.setString(1, mod.getPreccp());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Usuario!!!\n"+ex);
        }
        
        conex.desconecta();
    }*/
    public void Editar(BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update usuario set senha_usu=?,nome_usu=?,setor_usu=?,sexo_usu=?,posto_usu=?,hora_entrada=?,hora_saida=?, apon_dgtfamiliar=? where preccp=?");
        pst.setString(1, mod.getSenha());
        pst.setString(2, mod.getNome());
        pst.setString(3, mod.getSetor());
        pst.setString(4, mod.getSexo());
        pst.setString(5, mod.getPosto());
        pst.setInt(6, mod.getHoraEntrada());
        pst.setInt(7, mod.getHoraSaida());
        pst.setString(8, mod.getDgtFamiliar());
        pst.setInt(9, mod.getPreccp()); 
        pst.execute();
        JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ero ao editar Usuario!!!\n"+ex);
        }
        conex.desconecta();
    }
    
    public BeansUsuario buscarUsuario(BeansUsuario mod){
        conex.conexao();
        conex.executaSql("select * from usuario where nome_usu like'%"+mod.getPesquisar()+"%'");
        try {
            conex.rs.first();
            mod.setPreccp(conex.rs.getInt("preccp"));
            mod.setSenha(conex.rs.getString("senha_usu"));
            mod.setNome(conex.rs.getString("nome_usu"));
            mod.setSetor(conex.rs.getString("setor_usu"));
            mod.setSexo(conex.rs.getString("sexo_usu"));
            mod.setPosto(conex.rs.getString("posto_usu"));   
            mod.setHoraEntrada(conex.rs.getInt("hora_entrada")); 
            mod.setHoraSaida(conex.rs.getInt("hora_saida"));
            mod.setDgtFamiliar(conex.rs.getString("apon_dgtfamiliar"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Usuario!!:\n"+ex.getMessage());
        }
        
        conex.desconecta();
        return mod;
    }/*
    public BeansUsuario buscarUsuarioNome(BeansUsuario mod){
        conex.conexao();
        conex.executaSql("select * from usuario where nome_usu like'%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setPreccp(conex.rs.getString("preccp"));
            mod.setSenha(conex.rs.getString("senha_usu"));
            mod.setNomeUsu(conex.rs.getString("nome_usu"));
            mod.setSetor(conex.rs.getString("setor_usu"));
            mod.setSexo(conex.rs.getString("sexo_usu"));
            mod.setPosto(conex.rs.getString("posto_usu"));   
            mod.setHoraLimite1(conex.rs.getInt("horalimite_usu")); 
            mod.setHoraLimite2(conex.rs.getInt("horalimite2_usu"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Usuario!!:\n"+ex.getMessage());
        }
        
        conex.desconecta();
        return mod;
    }
        public void SalvarLogin(BeansUsuario mod){
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into login (data_login,hora_login where login) values(?,?)");
        pst.setString(1,(mod.getData()));
        pst.setInt(2, mod.getHora());
        pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Usuario!!!\n"+ex);
        }
    }*/
     
    }

