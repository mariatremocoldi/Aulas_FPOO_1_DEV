package classes;
import java.util.Scanner;
public class PrecoPassagem {


public class CalculoPrecoPassagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distancia, preco;
        
        System.out.print("Digite a distância da viagem em km: ");
        distancia = scanner.nextDouble();
        
        if (distancia <= 200) {
            preco = distancia * 0.50;
        } else {
            preco = distancia * 0.45;
        }
        
        System.out.println("O preço da passagem é: R$" + preco);
    }
}
}
