/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.unipar.ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author maico
 */
public class ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         SistemaBanco sistemaBanco = new SistemaBanco();

        while (true) {
        String[] opcoes = {"Adicionar Cliente", "Chamar Cliente", "Sair"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu do Banco",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

    switch (escolha) {
        case 0:
            String nome = JOptionPane.showInputDialog("Informe o nome do cliente:");
            if (nome != null && !nome.trim().isEmpty()) {
            String anoNascimentoStr = JOptionPane.showInputDialog("Informe o ano de nascimento do cliente:");
            if (anoNascimentoStr != null && !anoNascimentoStr.trim().isEmpty()) {
                int anoNascimento;
                try {
                    anoNascimento = Integer.parseInt(anoNascimentoStr);
                    sistemaBanco.adicionarCliente(nome.trim(), anoNascimento);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ano de nascimento inválido. Por favor, tente novamente.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ano de nascimento inválido. Por favor, tente novamente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nome do cliente inválido.");
        }
        break;

            case 1:
                sistemaBanco.chamarCliente();
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Encerrando o sistema.");
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha novamente.");
                break;
            }
        }
    }
}