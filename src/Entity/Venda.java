/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import DAO.VendasDAO;

/**
 *
 * @author Diego Moreira
 */
public class Venda {
    private int idProd;
    private int idCliente;
    private int qtdProduto;
    private float valorVenda;
    private int qtdAntiga;
    
    public void InserirDados(Venda v) {
        VendasDAO add = new VendasDAO();
        add.inserir(v);
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getQtdAntiga() {
        return qtdAntiga;
    }

    public void setQtdAntiga(int qtdAntiga) {
        this.qtdAntiga = qtdAntiga;
    }
}
