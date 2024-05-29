/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.ex04;

import java.time.LocalDate;

/**
 *
 * @author maico
 */
class Produto {
    private int codProduto;
    private String descricao;
    private LocalDate dataEntrada;
    private String ufOrigem;
    private String ufDestino;

    public Produto(int codProduto, String descricao, String ufOrigem, String ufDestino) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.dataEntrada = LocalDate.now();
        this.ufOrigem = ufOrigem;
        this.ufDestino = ufDestino;
    }

    @Override
    public String toString() {
        return "Produto " + codProduto + ": " + descricao + " - Origem: " + ufOrigem + ", Destino: " + ufDestino;
    }
}
