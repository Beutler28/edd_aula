package Trabalho_2.Atividade_01;

public class Pilha {
    private No topo;
    private int tamanho;

    public boolean push(Object info) { // empilha
        No novo = new No(info);
        if (this.isEmpty())
            topo = novo;
        else 
            novo.setProx(topo);
        topo = novo;
        tamanho++;
        return true;
    }

    public Object pop() { // desempilha
        Object info = null;
        if (!this.isEmpty()) {
            info = topo.getInfo();
            topo = topo.getProx();
        }
        return info;
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

    public boolean palindromo() {
        Pilha pilha = new Pilha();
        No aux = topo;
    
        // Percorre a pilha original e empilha os elementos
        while (aux != null) {
            pilha.push(aux.getInfo());
            aux = aux.getProx();
        }
    
        aux = topo;
    
        // Percorre novamente a pilha original e compara com os elementos desempilhados
        while (aux != null) {
            if (!aux.getInfo().equals(pilha.pop())) {
                return false; // Encontrou elementos diferentes, não é um palíndromo
            }
            aux = aux.getProx();
        }
    
        return true; // Todos os elementos são iguais, é um palíndromo
    }

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
