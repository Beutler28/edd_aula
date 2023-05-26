package Prova_1.Questao_9;

public class ListaEncadeada {
    private No inicio;
    private No ultimo;
    private int tamanho;

    public ListaEncadeada() {
        this.inicio = null;
        this.ultimo = null;
    }

    public void addInicio(Object element) {
        No celula = new No(element);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            celula.setProximo(inicio);
            inicio = celula;
        }
        this.tamanho++;

    }

    public void addFinal(Object element) {
        No celula = new No(element);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public void bubbleSort() {
        if (this.tamanho <= 1) {
            return; // Não há elementos suficientes para ordenar
        }

        boolean trocaFeita;
        do {
            trocaFeita = false;
            No noAtual = this.inicio;
            No noAnterior = null;

            while (noAtual.getProximo() != null) {
                No proximoNo = noAtual.getProximo();
                int elementoAtual = (int) noAtual.getElement();
                int proximoElemento = (int) proximoNo.getElement();

                if (elementoAtual > proximoElemento) {
                    // Realiza a troca de elementos
                    noAtual.setElement(proximoElemento);
                    proximoNo.setElement(elementoAtual);
                    trocaFeita = true;
                }

                noAnterior = noAtual;
                noAtual = proximoNo;
            }
        } while (trocaFeita);
    }

    public void imprimirLista() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.getElement() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }


    public int getTamanho() {
        return this.tamanho;
    }

}
