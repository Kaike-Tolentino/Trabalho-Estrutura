package com.mycompany.trabalhopaulin;

import javax.swing.JOptionPane;
import java.util.Random;
import newpackage.Bolha;
import newpackage.Insercao;
import newpackage.Selecao;

public class TrabalhoPaulin {

    public static void main(String[] args) {
        String mensagem1 = "Vetor Inicial: ";
        String mensagem2 = "Vetor Final: ";

        while (true) {
            int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o tamanho desejado para o vetor: "));
            int forma = Integer.parseInt(JOptionPane.showInputDialog("Voce quer preencher o vetor de forma \n1-Forma Manual\n2-Forma Random"));

            int[] v = new int[tamanho];
            Random random = new Random();
            switch (forma) {
                case 1:
                    for (int i = 0; i < v.length; i++) {
                        v[i] = Integer.parseInt(JOptionPane.showInputDialog(
                                "Informe um numero para inserir no vetor: "));
                    }
                    break;
                case 2:
                    for (int i = 0; i < tamanho; i++) {
                        v[i] = random.nextInt(999);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    continue;
            }

            int[] vInicial = v.clone();

            int forma_ordenacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a forma de ordenação:\n 1-Inserção\n2-Seleção\n3-Bolha"));
            switch (forma_ordenacao) {
                case 1:
                    Insercao.Insercao(v);
                    break;
                case 2:
                    Selecao.Selecao(v);
                    break;
                case 3:
                    Bolha.Bolha(v);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    continue;
            }

            for (int i = 0; i < vInicial.length; i++) {
                mensagem1 += vInicial[i] + " ";
            }
            JOptionPane.showMessageDialog(null, mensagem1);

            for (int i = 0; i < v.length; i++) {
                mensagem2 += v[i] + " ";
            }
            JOptionPane.showMessageDialog(null, mensagem2);

            switch (forma_ordenacao) {
                case 1:
                    JOptionPane.showMessageDialog(null, String.valueOf(Insercao.getTempoexInsercao()));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, String.valueOf(Selecao.getTempoexSelecao()));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, String.valueOf(Bolha.getTempoexBolha()));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }

            int continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (continuar != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }
}