package classes;

import java.util.Scanner;

public class AreaDoCirculo {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escreva o valor do raio");
        double raio = scanner.nextDouble();
        double pi = 3.14;
        double area = pi*raio*raio;
        System.out.println("a area do circulo e" + area);
                
           }
        }
   
