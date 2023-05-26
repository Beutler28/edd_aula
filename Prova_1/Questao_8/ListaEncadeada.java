package Prova_1.Questao_8;

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

    public void concat(ListaEncadeada l) {
        if (l == null || l.inicio == null) {
            return;
        }

        if (inicio == null) {
            inicio = l.inicio;
            ultimo = l.ultimo;
        } else {
            ultimo.setProximo(l.inicio);
            l.inicio.setAnterior(ultimo);
            ultimo = l.ultimo;
        }
    }

    public No getInicio(){
        return inicio;
    }

}
