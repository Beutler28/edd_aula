package Atividade_9;

public class Vetor {

    private int[] vetor;
    private int tamanho;

    public Vetor(int tamanho) {
        this.vetor = new int[tamanho];
        tamanho = 0;
    }

    public void adiciona(int valor) {
        vetor[tamanho] = valor;
        tamanho++;
    }

    public boolean contem(int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public void bubbleSort() {
        for (int i = 0; i < this.tamanho; i++) {
            for (int j = 0; j < this.tamanho - 1; j++) {
                if (this.vetor[j] > this.vetor[j + 1]) {
                    int aux = this.vetor[j];
                    this.vetor[j] = this.vetor[j + 1];
                    this.vetor[j + 1] = aux;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < this.tamanho; i++) {
            int menor = i;
            for (int j = i + 1; j < this.tamanho; j++) {
                if (this.vetor[j] < this.vetor[menor]) {
                    menor = j;
                    int aux = vetor[i];
                    vetor[i] = vetor[menor];
                    vetor[menor] = aux;
                }
            }
        }
    }

    public void insertionSort() {
        for (int i = 1; i < this.tamanho; i++) {
            int chave = this.vetor[i];
            int j = i - 1;
            while (j >= 0 && chave < this.vetor[j]) {
                this.vetor[j + 1] = this.vetor[j];
                j--;
            }
            this.vetor[j + 1] = chave;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

}