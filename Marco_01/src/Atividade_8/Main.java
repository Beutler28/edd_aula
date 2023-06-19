package Atividade_8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        int tamanhoMaximo = 1000;

        Vetor vetor = new Vetor(tamanhoMaximo);

        Random numeros = new Random();

        for(int i = 0; i<tamanhoMaximo; i++){
            int numeroAleatorio = numeros.nextInt();
            vetor.adiciona(numeroAleatorio);
        }

        int numAleatorio = numeros.nextInt();

        long tempInical = System.nanoTime();
        boolean maximoIterativa = vetor.buscaBinaria(numAleatorio);
        long tempoFinal = System.nanoTime();

        long duracao = tempoFinal - tempInical;
       
       
        System.out.println("Máximo iterativa: " + maximoIterativa + "; Tempo: " + duracao + "ns");
        
        tempInical = System.nanoTime();
        boolean maximoRecursiva = vetor.buscaBinariaRecursiva(numAleatorio);
        tempoFinal = System.nanoTime();
        duracao = tempoFinal - tempInical;
        
        System.out.println("Máximo recursiva: " + maximoRecursiva + "; Tempo: " + duracao + "ns");
        
    }
}