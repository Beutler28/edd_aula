package Atividade_03;

import static java.util.Objects.hash;

public class Maps {

    private Aluno[] vetor;
    private int tamanho;
    private int capacidade;

    public Maps() {
        this.capacidade = 3;
        this.vetor = new Aluno[capacidade];
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
        Aluno[] novoVetor = new Aluno[novaCapacidade];

        for (int i = 0; i < this.capacidade; i++) {
            if (vetor[i] != null) {
                int chave = vetor[i].getMatricula();
                int sondagem = 0;
                int hash = hash(chave);

                while (novoVetor[hash] != null) {
                    sondagem++;
                    hash = rehash(hash, sondagem);
                }

                novoVetor[hash] = vetor[i];
            }
        }

        this.vetor = novoVetor;
        this.capacidade = novaCapacidade;
    }

    public void put(int chave, Aluno valor) {
        if (this.tamanho >= this.capacidade * 0.75) {
            resize();
        }

        int sondagem = 0;
        int hash = hash(chave);

        while (vetor[hash] != null) {
            if (vetor[hash].getMatricula() == chave) {
                vetor[hash] = valor;
                return;
            }
            sondagem++;
            hash = rehash(hash, sondagem);
            if (hash >= this.capacidade) {
                hash %= this.capacidade;
            }
        }

        vetor[hash] = valor;
        this.tamanho++;
    }


    public Aluno get(int chave) {
        int sondagem = 0;
        int hash = hash(chave);

        while (vetor[hash] != null) {
            if (vetor[hash].getMatricula() == chave) {
                return vetor[hash];
            }
            sondagem++;
            hash = rehash(hash, sondagem);
        }

        return null;
    }



}


