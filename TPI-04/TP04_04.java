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
public class TP04_04 {

    public static void main(String[] args) {
        String txtAltura = JOptionPane.showInputDialog(
                null, "Digite a altura em metros:");

        if (txtAltura == null) {
            return;
        }

        String txtSexo = JOptionPane.showInputDialog(
                null, "Digite seu sexo (M para Masculino ou F para Feminino):");

        if (txtSexo == null || txtSexo.trim().isEmpty()) {
            return;
        }

        try {
            double altura = Double.parseDouble(txtAltura.replace(',', '.'));
            char sexo = txtSexo.toUpperCase().charAt(0);

            calcularPesoAltura(altura, sexo);

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite uma altura");
        }

    }

    public static void calcularPesoAltura(double altura, char sexo) {
        double pesoIdeal;

        if (altura <= 0) {
            JOptionPane.showMessageDialog(null, "A altura deve ser maior que zero.");
            return;
        }
        
        if (sexo == 'M'){
            pesoIdeal = (72.7 * altura) - 58;
        }else if (sexo == 'F'){
            pesoIdeal = (62.1 * altura) - 44.7;
        }else {
            JOptionPane.showMessageDialog(null, "Sexo Invalido. Use M ou F");
            return;
        }
        
        JOptionPane.showMessageDialog(null,String.format("Peso ideal: %.2f kg", pesoIdeal));
    }

}
