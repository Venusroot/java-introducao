package home.desconto_produto;

import java.util.Scanner;

public class Desconto_Produto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String produto = entrada.nextLine();

        System.out.print("Valor do produto: R$ ");
        double valor = entrada.nextDouble();

        double novoValor = valor * 0.91; // aplica 9% de desconto

        System.out.println("\nProduto: " + produto);
        System.out.printf("Valor com 9%% de desconto: R$ %.2f%n", novoValor);

        entrada.close();
    }
}