/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.ex03;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author maico
 */
public class Biblioteca {
   private Stack<Livro> pilhaLivros;

    public Biblioteca() {
        this.pilhaLivros = new Stack<>();
    }

    public void adicionarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        pilhaLivros.push(livro);
        JOptionPane.showMessageDialog(null, "Livro adicionado: " + livro.getTitulo());
    }

    public void listarLivros() {
        String lista = "Livros na pilha:\n";
        for (Livro livro : pilhaLivros) {
            lista += livro.getTitulo() + " - " + livro.getAutor() + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    public void retirarLivro() {
        if (!pilhaLivros.isEmpty()) {
            Livro livro = pilhaLivros.pop();
            JOptionPane.showMessageDialog(null, "Livro retirado: " + livro.getTitulo());
        } else {
            JOptionPane.showMessageDialog(null, "Pilha de livros vazia.");
        }
    }
}