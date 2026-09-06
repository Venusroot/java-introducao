package com.mycompany.exemplo;

import javax.swing.*;

public class TP04_02 {

    public static double saldoAtual(double saldo, double debito, double credito) {
        double atual;

        atual = saldo - debito + credito;

        return atual;
    }

    public static void main(String[] args) {
        double conta, saldo, debito, credito, atual;

        String c = JOptionPane.showInputDialog(null, "Digite o número da conta:");

        String s = JOptionPane.showInputDialog(null, "Digite o saldo:");

        String d = JOptionPane.showInputDialog(null, "Digite o débito:");

        String cr = JOptionPane.showInputDialog(null, "Digite o crédito:");

        conta = Double.parseDouble(c);
        saldo = Double.parseDouble(s.replace(',', '.'));
        debito = Double.parseDouble(d.replace(',', '.'));
        credito = Double.parseDouble(cr.replace(',', '.'));

        atual = saldoAtual(saldo, debito, credito);

        if (atual >= 0) {
            JOptionPane.showMessageDialog(
                    null,
                    "Número da conta = " + conta
                    + "\nSaldo atual = "
                    + String.format("R$ %.2f", atual).replace('.', ',')
                    + "\nSaldo Positivo"
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Número da conta = " + conta
                    + "\nSaldo atual = "
                    + String.format("R$ %.2f", atual).replace('.', ',')
                    + "\nSaldo Negativo"
            );
        }
    }
}