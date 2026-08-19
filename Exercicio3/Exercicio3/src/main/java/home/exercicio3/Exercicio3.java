/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package home.exercicio3;

import java.util.Scanner;

/**
 *
 * @author user
 */

/*3. Faça um programa que leia dois valores e informe a média entre eles. (use float
como tipo de dado).*/

public class Exercicio3 {
    public static void main(String[] args) {

        float v1, v2, media;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        v1 = input.nextFloat();

        System.out.print("Digite o valor 2: ");
        v2 = input.nextFloat();

        media = (v1 + v2) / 2;

        System.out.printf("\nMedia = %f", media);
     }
}