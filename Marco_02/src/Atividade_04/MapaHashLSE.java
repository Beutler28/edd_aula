package Atividade_04;

public class MapaHashLSE {
    private ListaEncadeada lista;
    private int tamanho;
    private int capacidade;

    public MapaHashLSE() {
        this.capacidade = 3;
        this.lista = new ListaEncadeada();
        this.tamanho = 0;
    }

    private int hash(int chave) {
        return chave % this.capacidade;
    }

    private int rehash(int hash, int sondagem) {
        int novoHash = (hash + sondagem) % this.capacidade;
        return novoHash >= 0 ? novoHash : novoHash + this.capacidade;
    }

    private void resize() {
        int novaCapacidade = this.capacidade * 2;
        ListaEncadeada novaLista = new ListaEncadeada();

        for (int i = 0; i < this.capacidade; i++) {
            No atual = lista.getInicio();
            while (atual != null) {
                int chave = ((Aluno) atual.getElement()).getMatricula();
                int sondagem = 0;
                int hash = hash(chave);

                while (novaLista.get(hash) != null) {
                    sondagem++;
                    hash = rehash(hash, sondagem);
                }

                novaLista.addFinal((Aluno) atual.getElement());
                atual = atual.getProximo();
            }
        }

        this.lista = novaLista;
        this.capacidade = novaCapacidade;
    }

    public void put(int chave, Aluno valor) {
        if (this.tamanho >= this.capacidade * 0.75) {
            resize();
        }

        int sondagem = 0;
        int hash = hash(chave);

        No atual = lista.getInicio();
        while (atual != null) {
            if (((Aluno) atual.getElement()).getMatricula() == chave) {
                atual.setElement(valor);
                return;
            }
            atual = atual.getProximo();
        }

        lista.addFinal(valor);
        this.tamanho++;
    }

    public Aluno get(int chave) {
        int sondagem = 0;
        int hash = hash(chave);

        No atual = lista.getInicio();
        while (atual != null) {
            if (((Aluno) atual.getElement()).getMatricula() == chave) {
                return (Aluno) atual.getElement();
            }
            atual = atual.getProximo();
        }

        return null;
    }

    public void remove(int chave) {
        int sondagem = 0;
        int hash = hash(chave);

        No atual = lista.getInicio();
        No anterior = null;

        while (atual != null) {
            if (((Aluno) atual.getElement()).getMatricula() == chave) {
                if (anterior == null) {
                    lista.setInicio(atual.getProximo());
                } else {
                    anterior.setProximo(atual.getProximo());
                }
                tamanho--;
                return;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public void imprimirMapa() {
        for (int i = 0; i < capacidade; i++) {
            System.out.println("Posição " + i + ":");
            imprimirListaEncadeada(lista.get(i));
            System.out.println();
        }
    }

    private void imprimirListaEncadeada(No inicio) {
        No atual = inicio;
        while (atual != null) {
            System.out.println(atual.getElement());
            atual = atual.getProximo();
        }
    }
}