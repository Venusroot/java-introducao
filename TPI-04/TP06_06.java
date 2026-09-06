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
public class TP06_06 {

    public static void main(String[] args) {
        String txtNum = JOptionPane.showInputDialog(null, "Digite um numero:");

        if (txtNum == null) {
            return;
        }

        try {
            int num = Integer.parseInt(txtNum);
            int soma = somarTabuada(num);

            JOptionPane.showMessageDialog(null, "Soma da tabuada = " + soma);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um numero inteiro valido");
        }

    }
    
    public static int somarTabuada(int num){
        int soma = 0;
        
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            soma += num * multiplicador;
        }
        
        return soma;
    }

}
