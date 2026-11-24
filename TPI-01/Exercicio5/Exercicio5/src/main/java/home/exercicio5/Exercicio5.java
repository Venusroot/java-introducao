/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package home.exercicio5;

import java.util.Scanner;

/* 5. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
VOLUME = 3.14159 * R2 * ALTURA */

public class Exercicio5 {

    public static void main(String[] args) {

        float h, r, v, pi;
        Scanner input = new Scanner(System.in);
        pi = 3.14159f;

        System.out.print("Digite a altura da lata: ");
        h = input.nextFloat();

        System.out.print("Digite o raio da lata: ");
        r = input.nextFloat();

        v = pi * (r * r) * h;

        System.out.printf("\n O volume da lata de oleo é = %.2f", v);
   }
}
