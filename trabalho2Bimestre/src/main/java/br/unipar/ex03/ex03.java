/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.unipar.ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author maico
 */
public class ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();

    while (true) {
        String[] opcoes = {"Adicionar Livro", "Listar Livros", "Retirar Livro", "Sair"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu da Biblioteca",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        switch (escolha) {
            case 0:
                String titulo = JOptionPane.showInputDialog("Informe o título do livro:");
                String autor = JOptionPane.showInputDialog("Informe o autor do livro:");
                biblioteca.adicionarLivro(titulo, autor);
                break;
            case 1:
                biblioteca.listarLivros();
                break;
            case 2:
                biblioteca.retirarLivro();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }
}
}

