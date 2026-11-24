package home.salariominimo;

import java.util.Scanner;

public class SalarioMinimo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = entrada.nextDouble();

        System.out.print("Digite o salário da pessoa: ");
        double salarioPessoa = entrada.nextDouble();

        double quantidade = salarioPessoa / salarioMinimo;

        System.out.printf(
            "A pessoa ganha %.2f salários mínimos.%n",
            quantidade
        );

        entrada.close();
    }
}