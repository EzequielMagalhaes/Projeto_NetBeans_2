/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulabancodedados.DTO;

import java.util.Date;

/**
 *
 * @author autologon
 */
public class ClienteDTO {
    private long cliID;
    private String cliNome;
    private Date cliDtInclusao;
    private String cliEndereco;
    private String cliBairro;
    private String cliEmail;
    private String cliTel;
    private String cliCidade;
    private String cliUF;

    public long getCliID() {
        return cliID;
    }

    public void setCliID(long cliID) {
        this.cliID = cliID;
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        this.cliNome = cliNome;
    }

    public Date getCliDtInclusao() {
        return cliDtInclusao;
    }

    public void setCliDtInclusao(Date cliDtInclusao) {
        this.cliDtInclusao = cliDtInclusao;
    }

    public String getCliEndereco() {
        return cliEndereco;
    }

    public void setCliEndereco(String cliEndereco) {
        this.cliEndereco = cliEndereco;
    }

    public String getCliBairro() {
        return cliBairro;
    }

    public void setCliBairro(String cliBairro) {
        this.cliBairro = cliBairro;
    }

    public String getCliEmail() {
        return cliEmail;
    }

    public void setCliEmail(String cliEmail) {
        this.cliEmail = cliEmail;
    }

    public String getCliTel() {
        return cliTel;
    }

    public void setCliTel(String cliTel) {
        this.cliTel = cliTel;
    }

    public String getCliCidade() {
        return cliCidade;
    }

    public void setCliCidade(String cliCidade) {
        this.cliCidade = cliCidade;
    }

    public String getCliUF() {
        return cliUF;
    }

    public void setCliUF(String cliUF) {
        this.cliUF = cliUF;
    }
}
