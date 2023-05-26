package Prova_1.Questao_6;

public class ListaEncadeada {
    
    private No inicio;
    private No ultimo;

    
    public ListaEncadeada(){
        this.inicio = null;
        this.ultimo = null;
    }

  
    public void addInicio(int element){
        No celula = new No(element);
        if(inicio == null){
            inicio = celula;
            ultimo = celula;
        } else {
            celula.setProximo(inicio);
            inicio.setAnterior(celula);
            inicio = celula;
        }     
    }

 
    public void addFinal(int element){
        No celula = new No(element);
        if(ultimo == null){
            inicio = celula;
            ultimo = celula;

        } else{
            celula.setAnterior(ultimo);
            ultimo.setProximo(celula);
            ultimo = celula;
        }
    }

    public void addOrdenado(int element) {
        No novoNo = new No(element);
    
        if (inicio == null) {
            inicio = novoNo;
            ultimo = novoNo;
        } else if (element <= inicio.getElement()) {
            novoNo.setProximo(inicio);
            inicio.setAnterior(novoNo);
            inicio = novoNo;
        } else if (element >= ultimo.getElement()) {
            ultimo.setProximo(novoNo);
            novoNo.setAnterior(ultimo);
            ultimo = novoNo;
        } else {
            No atual = inicio;
            while (atual.getProximo() != null && element > atual.getProximo().getElement()) {
                atual = atual.getProximo();
            }
    
            novoNo.setProximo(atual.getProximo());
            novoNo.setAnterior(atual);
            atual.getProximo().setAnterior(novoNo);
            atual.setProximo(novoNo);
        }
    }

    public void imprimirLista() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.getElement() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
    

    
}
