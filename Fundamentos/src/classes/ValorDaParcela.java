package classes;

import java.util.Scanner;

public class ValorDaParcela {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor unitário do produto: ");
        double valorUnitario = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = Integer.parseInt(scanner.nextLine());

        double valorTotal = valorUnitario * quantidade;

        System.out.print("Digite a forma de pagamento (D para débito, C para crédito): ");
        String formaPagamento = scanner.nextLine();

        if (formaPagamento.equalsIgnoreCase("D")) {
            double desconto = 0;
            if (valorTotal <= 100) {
                desconto = valorTotal * 0.05;
            } else {
                desconto = valorTotal * 0.03;
            }
            valorTotal -= desconto;
            System.out.println("Valor total com desconto (à vista): R$ " + valorTotal);
        } else if (formaPagamento.equalsIgnoreCase("C")) {
            System.out.print("Digite o número de parcelas: ");
            int numeroParcelas = Integer.parseInt(scanner.nextLine());
            double valorParcela = valorTotal / numeroParcelas;
            System.out.println("Valor da parcela: R$ " + valorParcela);
        } else {
            System.out.println("Forma de pagamento inválida.");
        }

        System.out.println("Informações do produto:");
        System.out.println("Nome: " + nomeProduto);
        System.out.println("Valor unitário: R$ " + valorUnitario);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$ " + (valorTotal));
    }
}

