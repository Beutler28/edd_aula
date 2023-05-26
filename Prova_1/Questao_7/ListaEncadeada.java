package Prova_1.Questao_7;

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

    public void imprime_rec() {
        imprime_rec(inicio);
    }

    public void imprime_rec(No i) {
        if (i != null) {
            System.out.print(i.getElement() + " ");
            imprime_rec(i.getProximo());
        }
    }

    public int getTamanho() {
        return this.tamanho;
    }

}
