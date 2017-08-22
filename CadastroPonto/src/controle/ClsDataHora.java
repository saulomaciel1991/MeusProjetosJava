/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Gustavo
 */
public class ClsDataHora {

    public String MostraData() {
        Date data = new Date();
        SimpleDateFormat dformatador = new SimpleDateFormat("dd/MM/yyyy");
        String sData = dformatador.format(data);
        return sData;
    }

    public String MostraHora() {
        Date data = new Date();     
            SimpleDateFormat hformatador = new SimpleDateFormat("HHmm");
          String sHora = hformatador.format(data);        
        return sHora;
    }
    public String MostraDataMes() {
        Date data = new Date();
        SimpleDateFormat dformatador = new SimpleDateFormat("MM");
        String sData = dformatador.format(data);
        return sData;   
}
}
