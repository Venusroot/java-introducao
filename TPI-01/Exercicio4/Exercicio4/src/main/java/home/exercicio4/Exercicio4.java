/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package home.exercicio4;


import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exercicio4 {

    public static void main(String[] args) {

        float c, f;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura (Centigrados): ");
        c = input.nextFloat();

        f = ((9 * c) + 160) / 5;

        System.out.printf("\n A temperatura em Fahrenheit e = %.2f", f);
    }
}
