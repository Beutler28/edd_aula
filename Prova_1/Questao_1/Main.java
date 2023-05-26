package Prova_1.Questao_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int tamanho;
        int n = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o tamanho dos vetores");
        tamanho = ler.nextInt();

        Vetor vetor1 = new Vetor(tamanho);
        Vetor vetor2 = new Vetor(tamanho);

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o " + (i + 1) + "o valor do vetor 1: ");
            vetor1.setElemento(i, ler.nextInt());

            System.out.println("Digite o " + (i + 1) + "o valor do vetor 2: ");
            vetor2.setElemento(i, ler.nextInt());
        }
        
        Vetor vetor3 = new Vetor(tamanho);

        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                if(vetor1.getElemento(i) == vetor2.getElemento(j)){
                    vetor3.setElemento(n, vetor1.getElemento(i));
                    n++;
                }
            }
        }

        System.out.println("Interseção");
        for(int i = 0; i < n; i++){
            System.out.println(vetor3.getElemento(i));
        }

    }
}
