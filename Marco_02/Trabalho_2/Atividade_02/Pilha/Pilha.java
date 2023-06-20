package Trabalho_2.Atividade_02.Pilha;

import Trabalho_2.Atividade_02.Aluno.Aluno;

public class Pilha implements IPilha{
    private No topo;
    private int tamanho;

    @Override
    public boolean push(Aluno info) { 
        No novo = new No(info);
        if (this.isEmpty())
            topo = novo;
        else 
            novo.setProx(topo);
        topo = novo;
        return true;
    }

    @Override
    public Aluno pop() { 
        Aluno info = null;
        if (!this.isEmpty()) {
            info = topo.getInfo();
            topo = topo.getProx();
        }
        return info;
    }

    @Override
    public Aluno top() {
        Aluno info = null;

        if(!isEmpty()) {
            info = topo.getInfo();
        }

        return info;

    }

    @Override
    public boolean isEmpty(){
        return topo == null;
    }

    @Override
    public int size() {
        No aux = topo;
        int tamanho = 0;

        if(!isEmpty()){
            while(aux != null){
                aux = aux.getProximo();
                tamanho++;
            }    
        }
        return tamanho;
    }


    @Override
    public void imprimirPilha() {
        if (isEmpty()) {
            System.out.println("Pilha vazia.");
        } else {
            No atual = topo;
            while (atual != null) {
                System.out.println(atual.getInfo());
                atual = atual.getProx();
            }
        }
    }

}
