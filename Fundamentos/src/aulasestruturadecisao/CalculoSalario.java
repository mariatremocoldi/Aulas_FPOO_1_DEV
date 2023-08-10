package aulasestruturadecisao;

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o cargo do funcionário (Gerente/Supervisor/Técnico/Auxiliar):");
        String cargo = scanner.nextLine();

        double salario, inss, convenio;

        if (cargo.equalsIgnoreCase("gerente")) {
            salario = 5590.00;
            inss = 8.0;
            convenio = 289.00;
        } else if (cargo.equalsIgnoreCase("supervisor")) {
            salario = 4128.00;
            inss = 7.0;
            convenio = 239.00;
        } else if (cargo.equalsIgnoreCase("técnico")) {
            salario = 3789.00;
            inss = 4.0;
            convenio = 189.00;
        } else if (cargo.equalsIgnoreCase("auxiliar")) {
            salario = 2345.00;
            inss = 2.0;
            convenio = 156.00;
        } else {
            System.out.println("Cargo inválido.");
            scanner.close();
            return;
        }

        double descontoINSS = salario * (inss / 100);
        double salarioLiquido = salario - descontoINSS - convenio;

        System.out.println("Cargo: " + cargo);
        System.out.println("Salário bruto: R$ " + salario);
        System.out.println("Desconto INSS: R$ " + descontoINSS);
        System.out.println("Desconto Convênio: R$ " + convenio);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}

