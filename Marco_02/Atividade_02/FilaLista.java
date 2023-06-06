package Marco_02.Atividade_02;

public class FilaLista {
    private No inicio;
    private No fim;
    private int tamanho;

    public FilaLista() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public boolean add(Object info) { // insere
        No novo = new No(info);
        if (this.isEmpty())
            inicio = novo;
        else
            fim.setProx(novo);
        fim = novo;
        tamanho++;
        return true;
    }

    public boolean remove(Object info) { // remove
        if (!isEmpty()) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else
                inicio = inicio.getProx();
                tamanho--;
            return true;
        }
        return false;
    }

    public int size(){
        return this.tamanho;
    }

    public boolean isEmpty(){
        return inicio == null;
    }
}