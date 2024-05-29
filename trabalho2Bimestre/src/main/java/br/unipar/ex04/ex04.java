/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.unipar.ex04;

import javax.swing.JOptionPane;

/**
 *
 * @author maico
 */
public class ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Deposito deposito = new Deposito();

    while (true) {
        String[] opcoes = {"Adicionar Produto", "Despachar Produto", "Sair"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu da Transportadora",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        switch (escolha) {
            case 0:
                int codProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto:"));
                String descricao = JOptionPane.showInputDialog("Informe a descrição do produto:");
                String ufOrigem = JOptionPane.showInputDialog("Informe a UF de origem do produto:");
                String ufDestino = JOptionPane.showInputDialog("Informe a UF de destino do produto:");
                Produto produto = new Produto(codProduto, descricao, ufOrigem, ufDestino);
                deposito.adicionarProduto(produto);
                break;
            case 1:
                deposito.despacharProduto();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
        }
    }
    }}