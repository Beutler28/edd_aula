package Atividade_7;

public class Vetor {
    private int[] elementos;
    private int total;

    public Vetor(int tamanho) {
        this.elementos = new int[tamanho];
        total = 0;
    }

    public void setElemento(int valor) {
        this.elementos[total] = valor;
        total++;
    }

    public int getElemento(int indice) {
        return this.elementos[indice];
    }

    public int getTamanho() {
        return this.elementos.length;
    }

    public int maiorElementoRecursivo() {
        return maiorElementoRecursivo(elementos, 0, total - 1);
    }

    public int maiorElementoRecursivo(int[] elementos, int inicio, int fim) {
        if (inicio == fim) {
            return this.getElemento(inicio);
        } else {
            int meio = (inicio + fim) / 2;
            int maiorEsquerda = this.maiorElementoRecursivo(elementos, inicio, meio);
            int maiorDireita = this.maiorElementoRecursivo(elementos, meio + 1, fim);
            return Math.max(maiorEsquerda, maiorDireita);
        }
    }

    public int maiorElementoIterativo() {
        int maior = this.getElemento(0);
        for (int i = 1; i < this.getTamanho(); i++) {
            if (this.getElemento(i) > maior) {
                maior = this.getElemento(i);
            }
        }
        return maior;
    }
}
