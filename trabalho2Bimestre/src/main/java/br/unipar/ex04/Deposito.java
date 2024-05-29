/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.ex04;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author maico
 */
public class Deposito {
      private Stack<Produto> pilhaProdutos = new Stack<>();

    public void adicionarProduto(Produto produto) {
        if (pilhaProdutos.size() < 10) {
            pilhaProdutos.push(produto);
            exibirPilha();
        } else {
            JOptionPane.showMessageDialog(null, "O depósito está cheio.");
        }
    }

    public void despacharProduto() {
        if (!pilhaProdutos.isEmpty()) {
            Produto produtoDespachado = pilhaProdutos.pop();
            JOptionPane.showMessageDialog(null, "Produto despachado: " + produtoDespachado);
            exibirPilha();
        } else {
            JOptionPane.showMessageDialog(null, "O depósito está vazio.");
        }
    }

    private void exibirPilha() {
        StringBuilder lista = new StringBuilder("Produtos no depósito:\n");
        for (Produto produto : pilhaProdutos) {
            lista.append(produto).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }
}
