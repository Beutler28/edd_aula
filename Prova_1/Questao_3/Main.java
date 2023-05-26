package Prova_1.Questao_3;

public class Main {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Número do termo desejado na série
        int resultado = fibonacci(n);
        System.out.println("O " + n + "º termo da série de Fibonacci é: " + resultado);
    }
}
