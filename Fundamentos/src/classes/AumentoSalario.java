package classes;
import java.util.Scanner;
public class AumentoSalario {


public class CalculoAumentoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario, aumento, novoSalario;
        
        System.out.print("Digite o salário do funcionário: ");
        salario = scanner.nextDouble();
        
        if (salario > 1350.00) {
            aumento = salario * 0.10;
        } else {
            aumento = salario * 0.15;
        }
        
        novoSalario = salario + aumento;
        
        System.out.println("O valor do aumento é: R$" + aumento);
        System.out.println("O novo salário é: R$" + novoSalario);
    }
}
}
