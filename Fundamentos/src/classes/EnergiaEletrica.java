package classes;


import java.util.Scanner;

public class EnergiaEletrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de KW/h consumidos: ");
        double quantidadeKWh = scanner.nextDouble();

        System.out.print("Digite o tipo de instalação (R para residência, I para indústria ou C para comércio): ");
        char tipoInstalacao = scanner.next().charAt(0);

        double precoPorKWh = 0.0;

        if (tipoInstalacao == 'R' || tipoInstalacao == 'r') {
            if (quantidadeKWh <= 500) {
                precoPorKWh = 0.40;
            } else {
                precoPorKWh = 0.65;
            }
        } else if (tipoInstalacao == 'I' || tipoInstalacao == 'i') {
            if (quantidadeKWh <= 1000) {
                precoPorKWh = 0.55;
            } else {
                precoPorKWh = 0.60;
            }
        } else if (tipoInstalacao == 'C' || tipoInstalacao == 'c') {
            if (quantidadeKWh <= 5000) {
                precoPorKWh = 0.55;
            } else {
                precoPorKWh = 0.60;
            }
        } else {
            System.out.println("Tipo de instalação inválido. Use R, I ou C.");
            return;
        }

        double precoTotal = quantidadeKWh * precoPorKWh;
        System.out.println("O preço a pagar pelo fornecimento de energia elétrica é: R$" + precoTotal);
    }
}

