/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.ex01;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author maico
 */
public class Clinica {

    private Queue<String> fila = new LinkedList<>();
    private final int TAMANHO_MAXIMO = 20;

    public boolean estaCheia() {
        return fila.size() == TAMANHO_MAXIMO;
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    public void adicionarPaciente(String nome) {
        if (estaCheia()) {
            JOptionPane.showMessageDialog(null, "A fila está cheia!");
        } else {
            fila.add(nome);
            JOptionPane.showMessageDialog(null, "Paciente " + nome + " foi adicionado à fila.");
        }
    }

    public void chamarProximoPaciente() {
        if (estaVazia()) {
            JOptionPane.showMessageDialog(null, "A fila está vazia!");
        } else {
            String proximoPaciente = fila.poll();
            JOptionPane.showMessageDialog(null, "Por favor, chame o próximo paciente: " + proximoPaciente);
        }
    }
}
