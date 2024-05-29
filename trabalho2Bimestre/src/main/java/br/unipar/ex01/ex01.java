/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.unipar.ex01;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author maico
 */
public class ex01 {

    public static void main(String[] args) {
        Clinica clinica = new Clinica();

        while (true) {
            JPanel panel = new JPanel();
            JLabel label = new JLabel("Escolha uma opção:");
            String[] opcoes = {"Adicionar Paciente", "Chamar Paciente", "Sair"};
            JComboBox<String> comboBox = new JComboBox<>(opcoes);
            panel.add(label);
            panel.add(comboBox);

            int escolha = JOptionPane.showConfirmDialog
             (null, panel, "Menu da Clínica", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (escolha == JOptionPane.OK_OPTION) {
            String opcaoSelecionada = (String) comboBox.getSelectedItem();

        switch (opcaoSelecionada) {
        case "Adicionar Paciente":
            if (clinica.estaCheia()) {
                JOptionPane.showMessageDialog(null, "A fila está cheia!");
            } else {
                String nomePaciente = JOptionPane.showInputDialog("Informe o nome do paciente:");
                if (nomePaciente != null && !nomePaciente.trim().isEmpty()) {
                    clinica.adicionarPaciente(nomePaciente.trim());
                } else {
                    JOptionPane.showMessageDialog(null, "Nome do paciente não pode ser vazio. Por favor, tente novamente.");
                }
            }
                break;
            case "Chamar Paciente":
                clinica.chamarProximoPaciente();
                break;
            case "Sair":
                JOptionPane.showMessageDialog(null, "Encerrando o sistema.");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Escolha novamente.");
                break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Encerrando o sistema.");
            System.exit(0);
            }
        }
    }
}
