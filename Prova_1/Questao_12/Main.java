package Prova_1.Questao_12;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = ler.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = ler.nextInt();

        if(valor1 > valor2) {
            System.out.println("O primeiro valor deve ser menor que o segundo valor");
            ler.close();
            return;
        }

        int resultado = somatorio(valor1, valor2);

        System.out.println("O resultado do somatório é: "+ resultado);
    }

    public static int somatorio(int valor1, int valor2) {
        if (valor2 != valor1) {
            return valor1 + somatorio(valor1 + 1, valor2);
        } else {
            return valor1;
        }
    }

}