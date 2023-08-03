package classes;

import java.util.Scanner;
public class AprovacaoEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da casa a comprar: R$");
        double valorCasa = scanner.nextDouble();
        
        System.out.print("Digite o salário da pessoa: R$");
        double salario = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de anos a pagar: ");
        int anosParaPagar = scanner.nextInt();
        
        double prestacaoMaxima = salario * 0.30;
        double valorPrestacao = valorCasa / (anosParaPagar * 12);
        
        if (valorPrestacao <= prestacaoMaxima) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo reprovado! A prestação excede 30% do salário.");
        }
    }
}

