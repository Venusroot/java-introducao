/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo;
import javax.swing.*;
/**
 *
 * @author labs
 */
public class TP04_03 {
    public static boolean triangulo(double x, double y, double z) {
        return x > 0 && y > 0 && z > 0
                && x < y + z
                && y < x + z
                && z < x + y;
    }

    public static void main(String[] args) {

        double x = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor de X:")
        );

        double y = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor de Y:")
        );

        double z = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor de Z:")
        );

        if (!triangulo(x, y, z)) {

            JOptionPane.showMessageDialog(
                    null,
                    "Os valores não formam um triângulo."
            );

        } else if (x == y && y == z) {

            JOptionPane.showMessageDialog(
                    null,
                    "O triângulo é equilátero."
            );

        } else if (x == y || x == z || y == z) {

            JOptionPane.showMessageDialog(
                    null,
                    "O triângulo é isósceles."
            );

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "O triângulo é escaleno."
            );
        }
    }
}

