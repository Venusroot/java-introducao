package com.mycompany.exemplo;

import javax.swing.*;

public class TP04_01 {

    public static double desconto(double p, double q) {
        double desc;

        if (q <= 10) {
            desc = p * q;
        } else if (q > 10 && q <= 20) {
            desc = (p * q) * 0.10;
            desc = (p * q) - desc;
        } else if (q >= 21 && q <= 50) {
            desc = (p * q) * 0.20;
            desc = (p * q) - desc;
        } else {
            desc = (p * q) * 0.25;
            desc = (p * q) - desc;
        }

        return desc;
    }

    public static void main(String[] args) {
        double a, b, c;

        String nome = JOptionPane.showInputDialog(
                null, "Digite o nome do produto:");

        String p = JOptionPane.showInputDialog(
                null, "Digite o preco do produto:");

        String q = JOptionPane.showInputDialog(
                null, "Digite a quantidade da compra:");

        // Aceita virgula ou ponto
        p = p.replace(',', '.');

        a = Double.parseDouble(p);
        b = Double.parseDouble(q);

        c = desconto(a, b);

        JOptionPane.showMessageDialog(
                null,
                "Nome do produto = " + nome
                + "\nValor a pagar: "
                + String.format("R$ %.2f", c).replace('.', ',')
        );
    }
}
