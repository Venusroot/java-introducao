/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home.atividades;

import javax.swing.*;

/**
 *
 * @author Mota
 */
public class TP05_05 {

    public static void main(String[] args) {
        String txtAno = JOptionPane.showInputDialog(null, "Digite o ano de fabricação do Carro:"
        );

        if (txtAno == null) {
            return;
        }

        String txtPreco = JOptionPane.showInputDialog(null, "Digite o valor da Tabel FIPE do carro:");

        if (txtPreco == null) {
            return;
        }

        try {
            int ano = Integer.parseInt(txtAno);
            double preco = Double.parseDouble(txtPreco.replace(',', '.'));
            double imposto = taxaDetran(ano, preco);

            if (imposto < 0) {
                JOptionPane.showMessageDialog(null, "O preço não pode ser nagativo");
            } else {
                 JOptionPane.showMessageDialog(null, String.format("Taxa a pagar: R$ %.2f", imposto));
            }
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite ano e preço validos");
        }
    }

    // Calcula e Devolve a taxa
    public static double taxaDetran(int ano, double preco) {
        if (preco < 0) {
            return -1;
        }

        if (ano < 1990) {
            return preco * 0.01; // 1%
        }
        return preco * 0.015;    // 1,5%
    }
}
