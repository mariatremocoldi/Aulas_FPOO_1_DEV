package aulasestruturadecisao;

import java.util.Scanner;

public class CalculoPrecoAlmoco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o prato desejado:");
        System.out.println("1 - Arroz, feijão, bife acebolado");
        System.out.println("2 - Arroz, feijão, filé de frango");
        System.out.println("3 - Arroz, feijão, brajola");
        int opcao = scanner.nextInt();

        double valor;
        
        if (opcao == 1) {
            valor = 19.99;
        } else if (opcao == 2) {
            valor = 18.99;
        } else if (opcao == 3) {
            valor = 23.99;
        } else {
            System.out.println("Opção inválida.");
            scanner.close();
            return;
        }

        System.out.print("Digite a quantidade de pessoas: ");
        int quantidade = scanner.nextInt();

        double precoTotal = valor * quantidade;

        System.out.println("Prato escolhido: " + opcao);
        System.out.println("Quantidade de pessoas: " + quantidade);
        System.out.println("Preço total: R$ " + precoTotal);

        scanner.close();
    }
}




