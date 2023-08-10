package aulasestruturadecisao;

import java.util.Scanner;

public class CalculoEconomia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o item para o qual deseja economizar:");
        System.out.println("1 - Notebook Lenovo");
        System.out.println("2 - Celular MotoG22");
        System.out.println("3 - Carro Hb20");
        System.out.println("4 - Apartamento");
        int opcao = scanner.nextInt();

        double valorTotal;
        double percentualEconomia;

        if (opcao == 1) {
            valorTotal = 3299.00;
            percentualEconomia = 0.05;
        } else if (opcao == 2) {
            valorTotal = 1789.00;
            percentualEconomia = 0.10;
        } else if (opcao == 3) {
            valorTotal = 68000.00;
            percentualEconomia = 0.02;
        } else if (opcao == 4) {
            valorTotal = 180000.00;
            percentualEconomia = 0.01;
        } else {
            System.out.println("Opção inválida.");
            scanner.close();
            return;
        }

        System.out.print("Digite o valor que você pode economizar por mês: R$ ");
        double valorEconomizadoPorMes = scanner.nextDouble();

        int mesesNecessarios = (int) Math.ceil(valorTotal / (valorEconomizadoPorMes * percentualEconomia));

        System.out.println("Item escolhido: " + opcao);
        System.out.println("Valor total do item: R$ " + valorTotal);
        System.out.println("Percentual a economizar por mês: " + (percentualEconomia * 100) + "%");
        System.out.println("Valor economizado por mês: R$ " + valorEconomizadoPorMes);
        System.out.println("Quantidade de meses necessários: " + mesesNecessarios);

        scanner.close();
    }
}




