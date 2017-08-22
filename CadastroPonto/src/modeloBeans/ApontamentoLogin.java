/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

/**
 *
 * @author Admin
 */
public class ApontamentoLogin {
    private Integer cod_aponlogin;
    private String dataAponLog;
    private Integer horaLog;
    private Integer horaApont;
    private String justificativaApont;
    private String pesquisa;

    /**
     * @return the cod_aponlogin
     */
    public Integer getCod_aponlogin() {
        return cod_aponlogin;
    }

    /**
     * @param cod_aponlogin the cod_aponlogin to set
     */
    public void setCod_aponlogin(Integer cod_aponlogin) {
        this.cod_aponlogin = cod_aponlogin;
    }

    /**
     * @return the dataAponLog
     */
    public String getDataAponLog() {
        return dataAponLog;
    }

    /**
     * @param dataAponLog the dataAponLog to set
     */
    public void setDataAponLog(String dataAponLog) {
        this.dataAponLog = dataAponLog;
    }

    /**
     * @return the horaLog
     */
    public Integer getHoraLog() {
        return horaLog;
    }

    /**
     * @param horaLog the horaLog to set
     */
    public void setHoraLog(Integer horaLog) {
        this.horaLog = horaLog;
    }

    /**
     * @return the horaApont
     */
    public Integer getHoraApont() {
        return horaApont;
    }

    /**
     * @param horaApont the horaApont to set
     */
    public void setHoraApont(Integer horaApont) {
        this.horaApont = horaApont;
    }

    /**
     * @return the justificativaApont
     */
    public String getJustificativaApont() {
        return justificativaApont;
    }

    /**
     * @param justificativaApont the justificativaApont to set
     */
    public void setJustificativaApont(String justificativaApont) {
        this.justificativaApont = justificativaApont;
    }

    /**
     * @return the pesquisar
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisar to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
}
