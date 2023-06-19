package Atividade_7;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int tamanhoMaximo = 1000;

        Vetor vetor = new Vetor(tamanhoMaximo);

        Random numeros = new Random();

        for(int i = 0; i<tamanhoMaximo; i++){
            int numeroAleatorio = numeros.nextInt();
            vetor.setElemento(numeroAleatorio);
        }

        long tempInical = System.nanoTime();
        int maximoIterativa = vetor.maiorElementoIterativo();
        long tempoFinal = System.nanoTime();
        long duracao = tempoFinal - tempInical;
       
        System.out.println("Máximo iterativa: " + maximoIterativa + "; Tempo: " + duracao + "ns");
        
        tempInical = System.nanoTime();
        int maximoRecursiva = vetor.maiorElementoIterativo();
        tempoFinal = System.nanoTime();
        duracao = tempoFinal - tempInical;
        
        System.out.println("Máximo recursiva: " + maximoRecursiva + "; Tempo: " + duracao + "ns");

    }

   

}
