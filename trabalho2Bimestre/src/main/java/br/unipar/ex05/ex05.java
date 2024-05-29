/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.unipar.ex05;

import javax.swing.JOptionPane;

/**
 *
 * @author maico
 */
public class ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Deposito1 deposito = new Deposito1();

    while (true) {
        String[] opcoes = {"Adicionar Produto", "Despachar Produto", "Sair"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu da Transportadora",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        switch (escolha) {
            case 0:
                int pilhaAdd = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da pilha (0 a 4):"));
                int codProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto:"));
                String descricao = JOptionPane.showInputDialog("Informe a descrição do produto:");
                String ufOrigem = JOptionPane.showInputDialog("Informe a UF de origem do produto:");
                String ufDestino = JOptionPane.showInputDialog("Informe a UF de destino do produto:");
                Produto1 produtoAdd = new Produto1(codProduto, descricao, ufOrigem, ufDestino);
                deposito.adicionarProduto(pilhaAdd, produtoAdd);
                break;
            case 1:
                int pilhaDesp = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da pilha (0 a 4):"));
                deposito.despacharProduto(pilhaDesp);
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
}
}
