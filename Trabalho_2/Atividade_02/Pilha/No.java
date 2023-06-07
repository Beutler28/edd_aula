package Trabalho_2.Atividade_02.Pilha;

import Trabalho_2.Atividade_02.Aluno.Aluno;

public class No {
    private Aluno info;
    private No prox;

    public No(Aluno info){
        this.info = info;
        this.prox = null;
    }

    public Aluno getInfo() {
        return info;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No n) {
        this.prox = n;
    }

    public No getProximo() {
        return null;
    }
}
