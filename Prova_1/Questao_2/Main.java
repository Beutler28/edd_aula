package Prova_1.Questao_2;

public class Main {
    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(4);

        vetor.adiciona(2);
        vetor.adiciona(4);
        vetor.adiciona(6);
        vetor.adiciona(1);

        vetor.selectionSort();
        vetor.sort();
    }
}
