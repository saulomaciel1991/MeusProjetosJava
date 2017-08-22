/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.ApontamentoLogin;
import modeloConection.ConexaoBD;

/**
 *
 * @author Admin
 */
public class DaoApontamentoLogin {
    ConexaoBD conex = new ConexaoBD();
    public ApontamentoLogin buscarUsua(ApontamentoLogin mod){
        conex.conexao();
        conex.executaSql("SELECT a.pont_data, l.hora_login, a.pont_horalocal, a.pont_justificativa FROM usuario AS u INNER JOIN apontamento AS a ON u.cod_usu = a.pont_usu INNER JOIN login AS l ON l.login_codusu = u.cod_usu where a.preccp like'%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setDataAponLog(conex.rs.getString("pont_data"));
            mod.setHoraLog(conex.rs.getInt("hora_log"));
            mod.setHoraApont(conex.rs.getInt("pont_horalocal"));
            mod.setJustificativaApont(conex.rs.getString("pont_justificativa"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Usuario!!:\n"+ex.getMessage());
        }
        
        conex.desconecta();
        return mod;
    }
}
