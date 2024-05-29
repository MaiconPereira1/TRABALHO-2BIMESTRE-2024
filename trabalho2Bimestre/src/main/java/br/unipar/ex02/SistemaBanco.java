/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.ex02;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author maico
 */
public class SistemaBanco {
      private Queue<Cliente> fila = new LinkedList<>();
    private int senhaAtual = 1;

    public void adicionarCliente(String nome, int anoNascimento) {
        fila.add(new Cliente(senhaAtual++, nome, anoNascimento));
        JOptionPane.showMessageDialog(null, "Cliente adicionado à fila.\nÚltima senha: " + (senhaAtual - 1));
    }

    public void chamarCliente() {
        if (!fila.isEmpty()) {
            Cliente cliente = fila.poll();
            JOptionPane.showMessageDialog(null, "Chamando cliente: " + cliente);
        } else {
            JOptionPane.showMessageDialog(null, "Não há clientes na fila.");
        }
    }
}