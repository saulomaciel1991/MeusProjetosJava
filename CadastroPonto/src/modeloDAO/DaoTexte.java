/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansTexte;
import modeloConection.ConexaoBD;

/**
 *
 * @author Admin
 */
public class DaoTexte {
    ConexaoBD conex = new ConexaoBD();
     public void SalvarPrec(BeansTexte mod){
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuario (preccp) values(?)");
        pst.setInt(1,(mod.getPreccp()));
        pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Usuario!!!\n"+ex);
        }
    }
}
