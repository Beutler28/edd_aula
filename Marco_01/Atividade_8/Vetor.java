package Atividade_8;

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

    public int getTamanho() {
        return tamanho;
    }

    public boolean buscaBinaria(int valor) {
        int inicio = 0;
        int fim = tamanho - 1;
        int meio;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (valor < vetor[meio]) {
                fim = meio - 1;
            } else if (valor > vetor[meio]) {
                inicio = meio + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean buscaBinariaRecursiva(int valor) {
        return buscaBinariaRecursiva(valor, 0, tamanho - 1);
    }

    private boolean buscaBinariaRecursiva(int valor, int inicio, int fim) {
        if (inicio > fim) {
            return false;
        }
        int meio = (inicio + fim) / 2;
        if (valor < vetor[meio]) {
            return buscaBinariaRecursiva(valor, inicio, meio - 1);
        } else if (valor > vetor[meio]) {
            return buscaBinariaRecursiva(valor, meio + 1, fim);
        } else {
            return true;
        }

    }

}
