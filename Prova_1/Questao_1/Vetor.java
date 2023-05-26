package Prova_1.Questao_1;

public class Vetor {
    private int[] elementos;

    public Vetor(int tamanho) {
        elementos = new int[tamanho];
    }

    public int getElemento(int indice) {
        return elementos[indice];
    }

    public void setElemento(int indice, int valor) {
        elementos[indice] = valor;
    }
}