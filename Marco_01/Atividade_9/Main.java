package Atividade_9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int tamanhoMaximo = 1000;

        Vetor vetor = new Vetor(tamanhoMaximo);
        Vetor vetor2 = new Vetor(tamanhoMaximo);
        Vetor vetor3 = new Vetor(tamanhoMaximo);

        Random numeros = new Random();

        for(int i = 0; i<tamanhoMaximo; i++){
            int numeroAleatorio = numeros.nextInt(1000);
            vetor.adiciona(numeroAleatorio);
            vetor2.adiciona(numeroAleatorio);
            vetor3.adiciona(numeroAleatorio);
        }

        long tempoInicial = System.nanoTime();
        vetor.bubbleSort();
        long tempoFinal = System.nanoTime();
        long duracao = tempoFinal - tempoInicial;
        System.out.println("   BubbleSort: " + duracao + "ns");

        tempoInicial = System.nanoTime();
        vetor2.selectionSort();
        tempoFinal = System.nanoTime();
        duracao = tempoFinal - tempoInicial;
        System.out.println("SelectionSort: " + duracao + "ns");

        tempoInicial = System.nanoTime();
        vetor3.insertionSort();
        tempoFinal = System.nanoTime();
        duracao = tempoFinal - tempoInicial;
        System.out.println("InsertionSort: " + duracao + "ns");

    }
}
