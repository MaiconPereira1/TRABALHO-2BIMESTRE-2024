/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author maico
 */
public class Deposito1 {
     private List<Stack<Produto1>> pilhasProdutos;

    public Deposito1() {
        this.pilhasProdutos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            pilhasProdutos.add(new Stack<>());
        }
    }

    public void adicionarProduto(int pilha, Produto1 produto) {
        if (pilha >= 0 && pilha < 5) {
            Stack<Produto1> pilhaSelecionada = pilhasProdutos.get(pilha);
            if (pilhaSelecionada.size() < 10) {
                pilhaSelecionada.push(produto);
                exibirPilhas();
            } else {
                JOptionPane.showMessageDialog(null, "A pilha " + pilha + " está cheia.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pilha inválida.");
        }
    }

    public void despacharProduto(int pilha) {
        if (pilha >= 0 && pilha < 5) {
            Stack<Produto1> pilhaSelecionada = pilhasProdutos.get(pilha);
            if (!pilhaSelecionada.isEmpty()) {
                Produto1 produtoDespachado = pilhaSelecionada.pop();
                JOptionPane.showMessageDialog(null, "Produto despachado da pilha " + pilha + ": " + produtoDespachado);
                exibirPilhas();
            } else {
                JOptionPane.showMessageDialog(null, "A pilha " + pilha + " está vazia.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pilha inválida.");
        }
    }

    private void exibirPilhas() {
        StringBuilder lista = new StringBuilder("Pilhas de produtos:\n");
        for (int i = 0; i < 5; i++) {
            lista.append("Pilha ").append(i).append(": ");
            Stack<Produto1> pilha = pilhasProdutos.get(i);
            if (!pilha.isEmpty()) {
                lista.append(pilha.peek()).append("\n"); // Mostra o produto no topo da pilha
            } else {
                lista.append("Vazia\n");
            }
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }
}
