/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import DAO.ClienteDAO;

/**
 *
 * @author Diego Moreira
 */
public class Cliente {
    
    //SE ADICIONAR OU RETIRAR ALGUM ATRIBUTO, ALTERAR A VARIAVEL DE COUNT_COLUMMS
    private static final int COUNT_COLUMMS = 7;

    public static int getCOUNT_COLUMMS() {
        return COUNT_COLUMMS;
    }
    
    private String nomeRazao;
    private String endereco;
    private int num;
    private String UF;
    private String cpfCNPJ;
    private String telefone;
    private String email;
    
    public String getNomeRazao() {
        return nomeRazao;
    }

    public void setNomeRazao(String nomeRazao) {
        this.nomeRazao = nomeRazao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCpfCNPJ() {
        return cpfCNPJ;
    }

    public void setCpfCNPJ(String cpfCNPJ) {
        this.cpfCNPJ = cpfCNPJ;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void InserirDados(Cliente c) {
        ClienteDAO add = new ClienteDAO();
        add.inserir(c);
    }
}
