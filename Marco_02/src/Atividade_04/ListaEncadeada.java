package Atividade_04;

public class ListaEncadeada implements IListaEncadeada {

    private No inicio;
    private int tamanho;

    public No getInicio() {
        return this.inicio;
    }

    @Override
    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    @Override
    public void addInicio(Aluno element) {
        No celula = new No(element);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            celula.setProximo(inicio);
            inicio = celula;
        }
        this.tamanho++;
    }

    @Override
    public void addFinal(Aluno element) {
        No celula = new No(element);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            No atual = inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(celula);
        }
        this.tamanho++;
    }

    @Override
    public void imprimirLista() {
        No atual = inicio;
        while (atual != null) {
            System.out.println(atual.getElement());
            atual = atual.getProximo();
        }
    }

    @Override
    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public Aluno get(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        No atual = inicio;
        for (int i = 0; i < index; i++) {
            atual = atual.getProximo();
        }

        return atual.getElement();
    }

}
