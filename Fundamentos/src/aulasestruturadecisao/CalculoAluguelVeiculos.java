package aulasestruturadecisao;

import java.util.Scanner;

public class CalculoAluguelVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o veículo para aluguel:");
        System.out.println("1 - Fiat Argo");
        System.out.println("2 - Fiat Mobi");
        System.out.println("3 - Hyundai Hb20");
        int opcao = scanner.nextInt();

        double valorDiaria;
        double valorPorKm;

        if (opcao == 1) {
            valorDiaria = 98.00;
            valorPorKm = 2.39;
        } else if (opcao == 2) {
            valorDiaria = 79.00;
            valorPorKm = 1.99;
        } else if (opcao == 3) {
            valorDiaria = 102.00;
            valorPorKm = 2.99;
        } else {
            System.out.println("Opção inválida.");
            scanner.close();
            return;
        }

        System.out.print("Digite a quantidade de dias de aluguel: ");
        int diasAluguel = scanner.nextInt();

        System.out.print("Digite a quantidade de km rodados: ");
        double kmRodados = scanner.nextDouble();

        double valorTotal = (valorDiaria * diasAluguel) + (valorPorKm * kmRodados);

        System.out.println("Veículo escolhido: " + opcao);
        System.out.println("Valor da diária: R$ " + valorDiaria);
        System.out.println("Valor por km rodado: R$ " + valorPorKm);
        System.out.println("Quantidade de dias de aluguel: " + diasAluguel);
        System.out.println("Quantidade de km rodados: " + kmRodados);
        System.out.println("Valor total do aluguel: R$ " + valorTotal);

        scanner.close();
    }
}


