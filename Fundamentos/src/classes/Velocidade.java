package classes;
import java.util.Scanner;
public class Velocidade {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade do carro (em km/h): ");
        int velocidade = Integer.parseInt(scanner.nextLine());

        if (velocidade > 80) {
            int kmAcimaLimite = velocidade - 80;
            double multa = kmAcimaLimite * 5.0;
            System.out.println("Você foi multado!");
            System.out.println("Valor da multa: R$ " + multa);
        } else {
            System.out.println("Você está dentro do limite de velocidade.");
        }
    }
}

